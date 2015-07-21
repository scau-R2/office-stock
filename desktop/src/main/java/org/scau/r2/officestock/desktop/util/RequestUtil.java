package org.scau.r2.officestock.desktop.util;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by zhengjn on 2015/7/21.
 */
public enum RequestUtil {

    HTTPS {
        public String post(String urlPath) {
            return null;
        }

        public String get(String urlPath) {
            return null;
        }

    },

    HTTP {
        public String post(String urlPath) {
            return null;
        }

        public String get(String urlPath) {
            StringBuilder respSb = new StringBuilder();
            URL url = null;
            URLConnection urlConnection = null;
            Scanner scanner = null;
            try {
                url = new URL(urlPath);
                urlConnection = url.openConnection();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                scanner = new Scanner(httpURLConnection.getInputStream(), "GBK");
                while (scanner.hasNext()) {
                    String tempStr = scanner.nextLine().trim();
                    respSb.append(tempStr);
                }
                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            return respSb.toString();
        }

    };

    /**
     * post请求
     * 参数有待定义
     */
    public abstract String post(String urlPath);

    /**
     * get请求
     *
     * @param urlPath 请求url
     * @return
     */
    public abstract String get(String urlPath);
}
