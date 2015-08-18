package org.scau.r2.officestock.desktop.view.left.top;

import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.UnsupportedEncodingException;

/**
 * 股票code输入面板
 * Created by zhengjn on 2015/7/27.
 */
public class InputStockCodePanel extends JPanel {
    private JLabel iscLabel = new JLabel();
    private JTextField iscTextField = new JTextField();
    private JButton iscButton = new JButton();

    public InputStockCodePanel() {
        super();
        this.init();
    }

    private void init(){
        this.setBackground(Color.BLACK);
        GridBagLayout gbLayout = new GridBagLayout();
        this.setLayout(gbLayout);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        iscLabel.setPreferredSize(new Dimension(200, 22));
        iscLabel.setBackground(Color.BLACK);
        iscLabel.setForeground(Color.WHITE);
        String t1 = null;
        try {
            t1 = new String("在下方输入股票代码：".getBytes("GBK"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        iscLabel.setText(t1);
        c.gridx = 0;
        c.gridy = 0;
        gbLayout.setConstraints(iscLabel, c);
        this.add(iscLabel);

        iscTextField.setPreferredSize(new Dimension(140, 22));
        iscTextField.setBackground(Color.BLACK);
        iscTextField.setForeground(Color.WHITE);
        iscTextField.setCaretColor(Color.WHITE);
        iscTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        c.gridx = 0;
        c.gridy = 1;
        gbLayout.setConstraints(iscTextField, c);
        this.add(iscTextField);

        iscButton.setPreferredSize(new Dimension(60, 22));
        iscButton.setBackground(Color.BLACK);
        iscButton.setForeground(Color.WHITE);
        iscButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        String t2 = null;
        try {
            t2 = new String("添加".getBytes("GBK"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        iscButton.setText(t2);
        c.gridx = 1;
        c.gridy = 1;
        gbLayout.setConstraints(iscButton, c);
        this.add(iscButton);

        iscTextField.setDocument(new InputDocument());

        iscTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String code = iscTextField.getText();
                    if (StringUtils.isBlank(code)) {
                        return;
                    }
                    code = StringUtils.trim(code);
                    System.out.println(code);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        iscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = iscTextField.getText();
                if (StringUtils.isBlank(code)) {
                    return;
                }
                code = StringUtils.trim(code);
                System.out.println(code);
            }
        });
    }
}
