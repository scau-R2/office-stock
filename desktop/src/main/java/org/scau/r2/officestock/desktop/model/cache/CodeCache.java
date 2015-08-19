package org.scau.r2.officestock.desktop.model.cache;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by zhengjn on 2015/8/19.
 */
public class CodeCache {
    //线程安全，并且在该系统中，读比写频繁（最终一致性，本来考虑使用CopyOnWriteArraySet来做不重复的，但是考虑到要有顺序）
    private static List<String> codeList = new CopyOnWriteArrayList<>();

    public static void remove(String code) {
        codeList.remove(code);
    }

    public static void add(String code) {
        //重复检查
        if (!codeList.contains(code)) {
            codeList.add(code);
        }
    }

    public static List<String> getCodes() {
        return codeList;
    }
}
