package org.scau.r2.officestock.desktop.view;

import org.scau.r2.officestock.desktop.view.left.center.StockListPanel;
import org.scau.r2.officestock.desktop.view.left.top.InputStockCodePanel;
import org.scau.r2.officestock.desktop.view.right.center.StockInfoPanel;
import org.scau.r2.officestock.desktop.view.right.top.CompositeIndexPanel;

import javax.swing.*;
import java.awt.*;

/**
 * 程序主界面
 * Created by zhengjn on 2015/7/27.
 */
public class MainFrame extends JFrame {
    //建议下面的panel后期封装成代理模式
    //输入股票代码区域
    private InputStockCodePanel inputStockCodePanel = new InputStockCodePanel();
    //显示选定的股票区域
    private StockListPanel stockListPanel = new StockListPanel();
    //显示证券综合指数区域
    private CompositeIndexPanel compositeIndexPanel = new CompositeIndexPanel();
    //显示选定股票今日涨跌信息区域
    private StockInfoPanel stockInfoPanel = new StockInfoPanel();

    public MainFrame() {
        super();
        this.init();
    }

    private void init() {
        //设置窗体基本属性
        //窗体默认大小
        this.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 3, Toolkit.getDefaultToolkit().getScreenSize().height / 2));
        //窗体颜色
        this.setBackground(Color.BLACK);
        //窗体默认居中
        int w = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
        int h = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;
        this.setLocation(w, h);

        //窗体标题栏以及边框处理
        this.setExtendedState(JFrame.NORMAL);

        //布局
        Container containerPane = this.getContentPane();
        containerPane.setLayout(new BorderLayout(0, 0));
        //布局左边面板
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout(0, 0));
        leftPanel.add(BorderLayout.NORTH, inputStockCodePanel);
        leftPanel.add(BorderLayout.CENTER, stockListPanel);
        containerPane.add(BorderLayout.WEST, leftPanel);
        //布局右边面板
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout(0, 0));
        rightPanel.add(BorderLayout.NORTH, compositeIndexPanel);
        rightPanel.add(BorderLayout.CENTER, stockInfoPanel);
        containerPane.add(BorderLayout.CENTER, rightPanel);
    }

}
