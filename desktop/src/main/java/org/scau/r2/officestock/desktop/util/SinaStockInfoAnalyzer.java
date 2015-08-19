package org.scau.r2.officestock.desktop.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 新浪股票信息解析器
 * Created by zhengjn on 2015/7/21.
 */
public class SinaStockInfoAnalyzer {

    public static List<Map<String, Object>> toStockMap(String hq_str) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        //根据分号划分字符串
        String[] split1 = hq_str.split(";");
        for (String str : split1) {
            try {
                Map<String, Object> stockMap = new HashMap<String, Object>();
                //根据等号划分字符串
                String[] split2 = str.split("=");

                //根据下划线划分split2[0]
                String[] split3 = split2[0].split("_");
                stockMap.put("stockId", split3[split3.length - 1]);

                //根据逗号划分split2[1]
                String[] split4 = split2[1].split(",");
                stockMap.put("name", split4[0].replace("\"", ""));
                stockMap.put("openningPrice", split4[1]);
                stockMap.put("closingPrice", split4[2]);
                stockMap.put("currentPrice", split4[3]);
                stockMap.put("hPrice", split4[4]);
                stockMap.put("lPrice", split4[5]);
                stockMap.put("competitivePrice", split4[6]);
                stockMap.put("auctionPrice", split4[7]);
                stockMap.put("totalNumber", split4[8]);
                stockMap.put("turnover", split4[9]);
                stockMap.put("buyOne", split4[10]);
                stockMap.put("buyOnePrice", split4[11]);
                stockMap.put("buyTwo", split4[12]);
                stockMap.put("buyTwoPrice", split4[13]);
                stockMap.put("buyThree", split4[14]);
                stockMap.put("buyThreePrice", split4[15]);
                stockMap.put("buyFour", split4[16]);
                stockMap.put("buyFourPrice", split4[17]);
                stockMap.put("buyFive", split4[18]);
                stockMap.put("buyFivePrice", split4[19]);
                stockMap.put("sellOne", split4[20]);
                stockMap.put("sellOnePrice", split4[21]);
                stockMap.put("sellTwo", split4[22]);
                stockMap.put("sellTwoPrice", split4[23]);
                stockMap.put("sellThree", split4[24]);
                stockMap.put("sellThreePrice", split4[25]);
                stockMap.put("sellFour", split4[26]);
                stockMap.put("sellFourPrice", split4[27]);
                stockMap.put("sellFive", split4[28]);
                stockMap.put("sellFivePrice", split4[29]);
                stockMap.put("date", split4[30]);
                stockMap.put("time", split4[31].replace("\"", ""));

                result.add(stockMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static List<Map<String, Object>> toIndexMap(String hq_str) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        //根据分号划分字符串
        String[] split1 = hq_str.split(";");
        for (String str : split1) {
            try {
                Map<String, Object> stockMap = new HashMap<String, Object>();
                //根据等号划分字符串
                String[] split2 = str.split("=");

                //根据下划线划分split2[0]
                String[] split3 = split2[0].split("_");
                stockMap.put("indexId", split3[split3.length - 1]);

                //根据逗号划分split2[1]
                String[] split4 = split2[1].split(",");
                stockMap.put("indexName", split4[0].replace("\"", ""));
                stockMap.put("currentPoint", split4[1]);
                stockMap.put("currentPrice", split4[2]);
                stockMap.put("upDownRate", split4[3]);
                stockMap.put("dealVolume", split4[4]);
                stockMap.put("dealTurn", split4[5].replace("\"", ""));

                result.add(stockMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
