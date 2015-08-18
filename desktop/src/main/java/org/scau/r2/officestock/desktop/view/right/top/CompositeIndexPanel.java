package org.scau.r2.officestock.desktop.view.right.top;

import javax.swing.*;
import java.awt.*;
import java.io.UnsupportedEncodingException;

/**
 * 综合指数面板
 * Created by zhengjn on 2015/7/27.
 */
public class CompositeIndexPanel extends JPanel {
    private JLabel szzsText = new JLabel();
    private JLabel shzsText = new JLabel();
    private JLabel szzsValue = new JLabel();
    private JLabel shzsValue = new JLabel();

    public CompositeIndexPanel() {
        super();
        this.init();
    }

    private void init() {
        this.setBackground(Color.BLACK);
        GridBagLayout gbLayout = new GridBagLayout();
        this.setLayout(gbLayout);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;

        shzsText.setPreferredSize(new Dimension(70, 22));
        shzsText.setBackground(Color.BLACK);
        shzsText.setForeground(Color.WHITE);
        String t1 = null;
        try {
            t1 = new String("上证指数:".getBytes("GBK"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        shzsText.setText(t1);
        c.gridx = 0;
        c.gridy = 0;
        gbLayout.setConstraints(shzsText, c);
        this.add(shzsText);

        shzsValue.setPreferredSize(new Dimension(250, 22));
        shzsValue.setBackground(Color.BLACK);
        shzsValue.setForeground(Color.WHITE);
        String v1 = null;
        try {
            v1 = new String("0".getBytes("GBK"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        shzsValue.setText(v1);
        c.gridx = 1;
        c.gridy = 0;
        gbLayout.setConstraints(shzsValue, c);
        this.add(shzsValue);

        szzsText.setPreferredSize(new Dimension(70, 22));
        szzsText.setBackground(Color.BLACK);
        szzsText.setForeground(Color.WHITE);
        String t2 = null;
        try {
            t2 = new String("深证指数:".getBytes("GBK"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        szzsText.setText(t2);
        c.gridx = 0;
        c.gridy = 1;
        gbLayout.setConstraints(szzsText, c);
        this.add(szzsText);

        szzsValue.setPreferredSize(new Dimension(250, 22));
        szzsValue.setBackground(Color.BLACK);
        szzsValue.setForeground(Color.WHITE);
        String v2 = null;
        try {
            v2 = new String("0".getBytes("GBK"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        szzsValue.setText(v2);
        c.gridx = 1;
        c.gridy = 1;
        gbLayout.setConstraints(szzsValue, c);
        this.add(szzsValue);
    }
}
