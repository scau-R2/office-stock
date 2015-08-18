package org.scau.r2.officestock.desktop.view.left.top;

import org.apache.commons.lang3.StringUtils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Created by zhengjn on 2015/8/18.
 */
public class InputDocument extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (StringUtils.isBlank(str)) {
            return;
        }
        super.insertString(offs, str, a);
    }
}
