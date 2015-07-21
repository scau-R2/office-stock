package org.scau.r2.officestock.desktop.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.scau.r2.officestock.desktop.model.StockVO;
import org.scau.r2.officestock.desktop.util.RequestUtil;
import org.scau.r2.officestock.desktop.util.SinaStockInfoAnalyzer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 新浪股票组件
 * Created by zhengjn on 2015/7/21.
 */
@Component
public class SinaStockController {

    private ObjectMapper mapper = new ObjectMapper();

    @Value("${sina.stock.api.list.url}")
    private String apiUrl = null;
    @Value("${sina.stock.api.image.url}")
    private String imageUrl = null;

    /**
     * 根据股票Id获取股票信息
     *
     * @param stockIds
     * @return
     */
    public List<StockVO> getDateByStockId(List<String> stockIds) {
        if (null == stockIds || stockIds.isEmpty()) return null;
        StringBuilder urlSb = new StringBuilder(apiUrl);
        for (String stockId : stockIds) {
            urlSb.append(stockId).append(",");
        }
        urlSb.deleteCharAt(urlSb.length() - 1);
        String hq_str = RequestUtil.HTTP.get(urlSb.toString());
        List<Map<String, Object>> respResult = SinaStockInfoAnalyzer.toMap(hq_str);
        List<StockVO> result = new ArrayList<StockVO>();
        for(Map<String, Object> map : respResult) {
            StockVO stockVO = null;
            try {
                String tempStr = mapper.writeValueAsString(map);
                stockVO = mapper.readValue(tempStr, StockVO.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            result.add(stockVO);
        }
        return result;
    }

}
