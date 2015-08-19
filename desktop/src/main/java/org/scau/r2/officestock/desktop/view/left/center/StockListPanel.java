package org.scau.r2.officestock.desktop.view.left.center;

import org.scau.r2.officestock.desktop.model.cache.CodeCache;
import org.scau.r2.officestock.desktop.view.right.center.StockInfoPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 选定股票列表面板
 * Created by zhengjn on 2015/7/27.
 */
public class StockListPanel extends JPanel {
    private final JPanel mainPanel = new JPanel();

    public StockListPanel() {
        super();
        this.init();
    }

    private void init() {
        this.setBackground(Color.BLACK);

        BorderLayout bl = new BorderLayout(0, 0);
        this.setLayout(bl);
        mainPanel.setBackground(Color.BLACK);
        this.add(mainPanel, BorderLayout.PAGE_START);

        final GridLayout gl = new GridLayout(0, 1);
        mainPanel.setLayout(gl);

        new Thread(new Runnable() {
            @Override
            public void run() {
                List<JLabel> lList = new ArrayList<>();
                while (true) {
                    List<String> codeList = CodeCache.getCodes();
                    if (codeList.isEmpty()) {
                        gl.setRows(0);
                        for (JLabel label : lList) {
                            mainPanel.remove(label);
                        }
                        lList.clear();
                    } else {
                        for (JLabel label : lList) {
                            mainPanel.remove(label);
                        }
                        lList.clear();
                        gl.setRows(codeList.size());
                        for (String code : codeList) {
                            JLabel j = createNewLable(code);
                            mainPanel.add(j);
                            lList.add(j);
                        }
                    }
                    mainPanel.updateUI();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
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
