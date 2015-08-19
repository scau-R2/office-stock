package org.scau.r2.officestock.desktop.view.right.top;

import org.scau.r2.officestock.desktop.context.SpringApplicationContextFactory;
import org.scau.r2.officestock.desktop.controller.SinaStockController;
import org.scau.r2.officestock.desktop.model.CompositeIndexVO;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 综合指数面板
 * Created by zhengjn on 2015/7/27.
 */
public class CompositeIndexPanel extends JPanel {

    private List<JLabel>[] labelListArray = new ArrayList[2];

    public CompositeIndexPanel() {
        super();
        for (int i = 0; i < 2; i++) {
            labelListArray[i] = new ArrayList<JLabel>();
            for (int j = 0; j < 6; j++) {
                JLabel label = createNewLable("null");
                labelListArray[i].add(label);
            }
        }
        this.init();
    }

    private void init() {
        this.setBackground(Color.BLACK);
        GridLayout gLayout = new GridLayout(3, 6);
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

        JLabel cjeLabel = createNewLable("成交额（万）");
        this.add(cjeLabel);

        for (List<JLabel> labelList : labelListArray) {
            for (JLabel label : labelList) {
                this.add(label);
            }
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                SinaStockController c = SpringApplicationContextFactory.getInstance().getBean("sinaStockController", SinaStockController.class);
                List<String> ids = new ArrayList<String>();
                ids.add("s_sh000001");
                ids.add("s_sz399001");
                while (true) {
                    List<CompositeIndexVO> list = c.getIndexById(ids);
                    if (list.isEmpty()) {
                        continue;
                    }
                    for (int i = 0; i < 2; i++) {
                        setLabelText(labelListArray[i].get(0), list.get(i).getIndexName());
                        setLabelText(labelListArray[i].get(1), list.get(i).getCurrentPoint());
                        setLabelText(labelListArray[i].get(2), list.get(i).getCurrentPrice());
                        setLabelText(labelListArray[i].get(3), list.get(i).getUpDownRate());
                        setLabelText(labelListArray[i].get(4), list.get(i).getDealVolume());
                        setLabelText(labelListArray[i].get(5), list.get(i).getDealTurn());
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
