package org.scau.r2.officestock.desktop.view.right.center;

import org.scau.r2.officestock.desktop.context.SpringApplicationContextFactory;
import org.scau.r2.officestock.desktop.controller.SinaStockController;
import org.scau.r2.officestock.desktop.model.StockVO;
import org.scau.r2.officestock.desktop.model.cache.CodeCache;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 股票信息面板
 * Created by zhengjn on 2015/7/27.
 */
public class StockInfoPanel extends JPanel {
    private final JPanel mainPanel = new JPanel();

    public StockInfoPanel() {
        super();
        this.init();
    }

    private void init() {
        this.setBackground(Color.BLACK);

        BorderLayout bl = new BorderLayout(0, 0);
        this.setLayout(bl);
        mainPanel.setBackground(Color.BLACK);
        this.add(mainPanel, BorderLayout.PAGE_START);

        final GridLayout gl = new GridLayout(1, 7);
        mainPanel.setLayout(gl);

        JLabel j1 = createNewLable("个股代码");
        mainPanel.add(j1);
        JLabel j2 = createNewLable("个股名称");
        mainPanel.add(j2);
        JLabel j3 = createNewLable("今开盘价");
        mainPanel.add(j3);
        JLabel j4 = createNewLable("昨收盘价");
        mainPanel.add(j4);
        JLabel j5 = createNewLable("当前价格");
        mainPanel.add(j5);
        JLabel j6 = createNewLable("今最高价");
        mainPanel.add(j6);
        JLabel j7 = createNewLable("今最低价");
        mainPanel.add(j7);

        new Thread(new Runnable() {
            @Override
            public void run() {
                List<JLabel> lList = new ArrayList<>();
                SinaStockController c = SpringApplicationContextFactory.getInstance().getBean("sinaStockController", SinaStockController.class);
                while (true) {
                    List<String> stockIds = CodeCache.getCodes();
                    if (stockIds.isEmpty()) {
                        continue;
                    }
                    List<StockVO> stocks = c.getDateByStockId(stockIds);
                    if (stocks.isEmpty()) {
                        gl.setRows(1);
                        for (JLabel label : lList) {
                            mainPanel.remove(label);
                        }
                        lList.clear();
                    } else {
                        for (JLabel label : lList) {
                            mainPanel.remove(label);
                        }
                        lList.clear();
                        gl.setRows(stocks.size() + 1);
                        for (StockVO stock : stocks) {
                            JLabel l1 = createNewLable(stock.getStockId());
                            mainPanel.add(l1);
                            lList.add(l1);
                            JLabel l2 = createNewLable(stock.getName());
                            mainPanel.add(l2);
                            lList.add(l2);
                            JLabel l3 = createNewLable(stock.getOpenningPrice());
                            mainPanel.add(l3);
                            lList.add(l3);
                            JLabel l4 = createNewLable(stock.getClosingPrice());
                            mainPanel.add(l4);
                            lList.add(l4);
                            JLabel l5 = createNewLable(stock.getCurrentPrice());
                            mainPanel.add(l5);
                            lList.add(l5);
                            JLabel l6 = createNewLable(stock.gethPrice());
                            mainPanel.add(l6);
                            lList.add(l6);
                            JLabel l7 = createNewLable(stock.getlPrice());
                            mainPanel.add(l7);
                            lList.add(l7);
                        }
                    }
                    mainPanel.updateUI();
                }
            }
        }).start();
    }

    private JLabel createNewLable(String name) {
        JLabel jl = new JLabel();
        jl.setBackground(Color.BLACK);
        jl.setForeground(Color.WHITE);
        jl.setText(name);
        return jl;
    }

    private void setLabelText(JLabel label, String text) {
        label.setText(text);
    }
}
