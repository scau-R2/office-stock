package org.scau.r2.officestock.desktop.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 唯一ApplicationContext工厂
 * Created by zhengjn on 2015/7/21.
 */
public class SpringApplicationContextFactory {

    private static final SpringApplicationContextFactory SPRING_APPLICATION_CONTEXT_FACTORY = new SpringApplicationContextFactory();

    private SpringApplicationContextFactory() {
        applicationContext = new ClassPathXmlApplicationContext("spring/spring-application.xml");
    }

    public static SpringApplicationContextFactory getInstance() {
        return SPRING_APPLICATION_CONTEXT_FACTORY;
    }

    private ApplicationContext applicationContext;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public Object getBean(String beanId) {
        return applicationContext.getBean(beanId);
    }

    public <T> T getBean(String beanId, Class<T> clazz) {
        return applicationContext.getBean(beanId, clazz);
    }
}
