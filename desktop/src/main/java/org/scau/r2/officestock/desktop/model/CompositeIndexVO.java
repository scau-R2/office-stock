package org.scau.r2.officestock.desktop.model;

import java.io.Serializable;

/**
 * Created by zhengjn on 2015/8/19.
 */
public class CompositeIndexVO implements Serializable {

    /**
     * 指数代码
     */
    private String indexId;

    /**
     * 指数名称
     */
    private String indexName;

    /**
     * 当前点数
     */
    private String currentPoint;

    /**
     * 当前价格
     */
    private String currentPrice;

    /**
     * 涨跌率
     */
    private String upDownRate;

    /**
     * 成交量
     */
    private String dealVolume;

    /**
     * 成交额
     */
    private String dealTurn;

    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(String currentPoint) {
        this.currentPoint = currentPoint;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getUpDownRate() {
        return upDownRate;
    }

    public void setUpDownRate(String upDownRate) {
        this.upDownRate = upDownRate;
    }

    public String getDealVolume() {
        return dealVolume;
    }

    public void setDealVolume(String dealVolume) {
        this.dealVolume = dealVolume;
    }

    public String getDealTurn() {
        return dealTurn;
    }

    public void setDealTurn(String dealTurn) {
        this.dealTurn = dealTurn;
    }
}
