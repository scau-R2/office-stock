package org.scau.r2.officestock.desktop.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private static ObjectMapper objectMapper;
	static{
		objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
	}

	public static String toString(Object bean){
		try {
			return objectMapper.writeValueAsString(bean);
		} catch (JsonProcessingException ex) {
			throw new RuntimeException(ex);
		}
	}

	public static <T> T toBean(String string, Class<T> beanClass){
		try {
			return objectMapper.readValue(string, beanClass);
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex);
		}
	}

	public static <T> T convert(Object value, Class<T> beanClass){
		try {
			return objectMapper.convertValue(value, beanClass);
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex);
		}
	}
}
