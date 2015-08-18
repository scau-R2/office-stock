package org.scau.r2.officestock.desktop.view.right.top;

import javax.swing.*;
import java.awt.*;
import java.io.UnsupportedEncodingException;

/**
 * 综合指数面板
 * Created by zhengjn on 2015/7/27.
 */
public class CompositeIndexPanel extends JPanel {
    private JLabel szzsText = new JLabel();//上证指数
    private JLabel szczText = new JLabel();//深圳成指
    private JLabel szzsValue = new JLabel();
    private JLabel szczValue = new JLabel();

    public CompositeIndexPanel() {
        super();
        this.init();
    }

    private void init() {
        this.setBackground(Color.BLACK);
        GridLayout gLayout = new GridLayout(1, 6);
        this.setLayout(gLayout);

        JLabel zsmcLabel = createNewLable("指数名称");
        this.add(zsmcLabel);

        JLabel dqzsLabel = createNewLable("当前指数");
        this.add(dqzsLabel);

        JLabel dqjgLabel = createNewLable("当前价格");
        this.add(dqjgLabel);

        JLabel zdlLabel = createNewLable("涨跌");
        this.add(zdlLabel);

        JLabel cjlLabel = createNewLable("成交量（手）");
        this.add(cjlLabel);

        JLabel cjeLabel = createNewLable("成交额（手）");
        this.add(cjeLabel);
    }

    private JLabel createNewLable(String name) {
        JLabel jl = new JLabel();
        jl.setBackground(Color.BLACK);
        jl.setForeground(Color.WHITE);
        try {
            name = new String(name.getBytes("GBK"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        jl.setText(name);
        return jl;
    }
}
