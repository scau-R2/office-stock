package org.scau.r2.officestock.desktop.model;

import java.io.Serializable;

/**
 * Created by zhengjn on 2015/7/21.
 */
public class StockVO implements Serializable {

    /**
     * 个股id代码
     */
    private String stockId;
    /**
     * 个股名称
     */
    private String name;
    /**
     * 今日开盘价
     */
    private String openningPrice;
    /**
     * 昨日收盘价
     */
    private String closingPrice;
    /**
     * 当前价格
     */
    private String currentPrice;
    /**
     * 今日最高价
     */
    private String hPrice;
    /**
     * 今日最低价
     */
    private String lPrice;
    /**
     * 买一报价
     */
    private String competitivePrice;
    /**
     * 卖一报价
     */
    private String auctionPrice;
    /**
     * 成交的股票数
     */
    private String totalNumber;
    /**
     * 成交额，以元为单位
     */
    private String turnover;
    /**
     * 买一
     */
    private String buyOne;
    /**
     * 买一价格
     */
    private String buyOnePrice;
    /**
     * 买二
     */
    private String buyTwo;
    /**
     * 买二价格
     */
    private String buyTwoPrice;
    /**
     * 买三
     */
    private String buyThree;
    /**
     * 买三价格
     */
    private String buyThreePrice;
    /**
     * 买四
     */
    private String buyFour;
    /**
     * 买四价格
     */
    private String buyFourPrice;
    /**
     * 买五
     */
    private String buyFive;
    /**
     * 买五价格
     */
    private String buyFivePrice;
    /**
     * 卖一
     */
    private String sellOne;
    /**
     * 卖一价格
     */
    private String sellOnePrice;
    /**
     * 卖二
     */
    private String sellTwo;
    /**
     * 卖二价格
     */
    private String sellTwoPrice;
    /**
     * 卖三
     */
    private String sellThree;
    /**
     * 卖三价格
     */
    private String sellThreePrice;
    /**
     * 卖四
     */
    private String sellFour;
    /**
     * 卖四价格
     */
    private String sellFourPrice;
    /**
     * 卖五
     */
    private String sellFive;
    /**
     * 卖五价格
     */
    private String sellFivePrice;
    /**
     * 当前显示股票信息的日期
     */
    private String date;
    /**
     * 具体时间
     */
    private String time;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpenningPrice() {
        return openningPrice;
    }

    public void setOpenningPrice(String openningPrice) {
        this.openningPrice = openningPrice;
    }

    public String getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(String closingPrice) {
        this.closingPrice = closingPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String gethPrice() {
        return hPrice;
    }

    public void sethPrice(String hPrice) {
        this.hPrice = hPrice;
    }

    public String getlPrice() {
        return lPrice;
    }

    public void setlPrice(String lPrice) {
        this.lPrice = lPrice;
    }

    public String getCompetitivePrice() {
        return competitivePrice;
    }

    public void setCompetitivePrice(String competitivePrice) {
        this.competitivePrice = competitivePrice;
    }

    public String getAuctionPrice() {
        return auctionPrice;
    }

    public void setAuctionPrice(String auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    public String getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(String totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover;
    }

    public String getBuyOne() {
        return buyOne;
    }

    public void setBuyOne(String buyOne) {
        this.buyOne = buyOne;
    }

    public String getBuyOnePrice() {
        return buyOnePrice;
    }

    public void setBuyOnePrice(String buyOnePrice) {
        this.buyOnePrice = buyOnePrice;
    }

    public String getBuyTwo() {
        return buyTwo;
    }

    public void setBuyTwo(String buyTwo) {
        this.buyTwo = buyTwo;
    }

    public String getBuyTwoPrice() {
        return buyTwoPrice;
    }

    public void setBuyTwoPrice(String buyTwoPrice) {
        this.buyTwoPrice = buyTwoPrice;
    }

    public String getBuyThree() {
        return buyThree;
    }

    public void setBuyThree(String buyThree) {
        this.buyThree = buyThree;
    }

    public String getBuyThreePrice() {
        return buyThreePrice;
    }

    public void setBuyThreePrice(String buyThreePrice) {
        this.buyThreePrice = buyThreePrice;
    }

    public String getBuyFour() {
        return buyFour;
    }

    public void setBuyFour(String buyFour) {
        this.buyFour = buyFour;
    }

    public String getBuyFourPrice() {
        return buyFourPrice;
    }

    public void setBuyFourPrice(String buyFourPrice) {
        this.buyFourPrice = buyFourPrice;
    }

    public String getBuyFive() {
        return buyFive;
    }

    public void setBuyFive(String buyFive) {
        this.buyFive = buyFive;
    }

    public String getBuyFivePrice() {
        return buyFivePrice;
    }

    public void setBuyFivePrice(String buyFivePrice) {
        this.buyFivePrice = buyFivePrice;
    }

    public String getSellOne() {
        return sellOne;
    }

    public void setSellOne(String sellOne) {
        this.sellOne = sellOne;
    }

    public String getSellOnePrice() {
        return sellOnePrice;
    }

    public void setSellOnePrice(String sellOnePrice) {
        this.sellOnePrice = sellOnePrice;
    }

    public String getSellTwo() {
        return sellTwo;
    }

    public void setSellTwo(String sellTwo) {
        this.sellTwo = sellTwo;
    }

    public String getSellTwoPrice() {
        return sellTwoPrice;
    }

    public void setSellTwoPrice(String sellTwoPrice) {
        this.sellTwoPrice = sellTwoPrice;
    }

    public String getSellThree() {
        return sellThree;
    }

    public void setSellThree(String sellThree) {
        this.sellThree = sellThree;
    }

    public String getSellThreePrice() {
        return sellThreePrice;
    }

    public void setSellThreePrice(String sellThreePrice) {
        this.sellThreePrice = sellThreePrice;
    }

    public String getSellFour() {
        return sellFour;
    }

    public void setSellFour(String sellFour) {
        this.sellFour = sellFour;
    }

    public String getSellFourPrice() {
        return sellFourPrice;
    }

    public void setSellFourPrice(String sellFourPrice) {
        this.sellFourPrice = sellFourPrice;
    }

    public String getSellFive() {
        return sellFive;
    }

    public void setSellFive(String sellFive) {
        this.sellFive = sellFive;
    }

    public String getSellFivePrice() {
        return sellFivePrice;
    }

    public void setSellFivePrice(String sellFivePrice) {
        this.sellFivePrice = sellFivePrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
