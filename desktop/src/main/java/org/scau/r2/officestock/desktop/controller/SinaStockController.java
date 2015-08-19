package org.scau.r2.officestock.desktop.controller;

import org.scau.r2.officestock.desktop.model.CompositeIndexVO;
import org.scau.r2.officestock.desktop.model.StockVO;
import org.scau.r2.officestock.desktop.util.JsonUtil;
import org.scau.r2.officestock.desktop.util.RequestUtil;
import org.scau.r2.officestock.desktop.util.SinaStockInfoAnalyzer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 新浪股票组件
 * Created by zhengjn on 2015/7/21.
 */
@Component
public class SinaStockController {

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
        //使用http get方式向sina股票api接口获取数据
        String hq_str = RequestUtil.HTTP.get(urlSb.toString());
        //把sina返回的数据转成应用bean
        List<Map<String, Object>> respResult = SinaStockInfoAnalyzer.toStockMap(hq_str);
        List<StockVO> result = new ArrayList<StockVO>();
        for (Map<String, Object> map : respResult) {
            StockVO stockVO = JsonUtil.toBean(JsonUtil.toString(map), StockVO.class);
            result.add(stockVO);
        }
        return result;
    }

    public List<CompositeIndexVO> getIndexById(List<String> ids) {
        if (null == ids || ids.isEmpty()) {
            return null;
        }
        StringBuilder urlSb = new StringBuilder(apiUrl);
        for (String id : ids) {
            urlSb.append(id).append(",");
        }
        urlSb.deleteCharAt(urlSb.length() - 1);
        //使用http get方式向sina股票api接口获取数据
        String hq_str = RequestUtil.HTTP.get(urlSb.toString());
        //把sina返回的数据转成应用bean
        List<Map<String, Object>> respResult = SinaStockInfoAnalyzer.toIndexMap(hq_str);
        List<CompositeIndexVO> result = new ArrayList<CompositeIndexVO>();
        for (Map<String, Object> map : respResult) {
            CompositeIndexVO compositeIndexVO = JsonUtil.toBean(JsonUtil.toString(map), CompositeIndexVO.class);
            result.add(compositeIndexVO);
        }
        return result;
    }

}
