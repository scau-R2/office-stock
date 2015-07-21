package org.scau.r2.officestock.desktop.engine;

import org.scau.r2.officestock.desktop.bean.SinaStockController;
import org.scau.r2.officestock.desktop.context.SpringApplicationContextFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 程序入口
 * Created by zhengjn on 2015/7/21.
 */
public class Main {

    public static void main(String[] args) {
        List<String> stockIds = new ArrayList<String>();
        stockIds.add("sh601003");
        stockIds.add("sh601001");
        System.out.println(SpringApplicationContextFactory.getInstance().getBean("sinaStockController", SinaStockController.class).getDateByStockId(stockIds));
    }

}
