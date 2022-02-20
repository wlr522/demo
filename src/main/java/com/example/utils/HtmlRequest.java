package com.example.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HtmlRequest {

    public static void main(String[] args) throws IOException {




     /*   URL url = new URL("http://www.cwl.gov.cn/ygkj/kjgg/");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        InputStream inputStream = conn.getInputStream();   //通过输入流获得网站数据
        byte[] getData = readInputStream(inputStream);     //获得网站的二进制数据
        String data = new String(getData, "gb2312");
        System.out.println(data);*/

    }

    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }

        bos.close();
        return bos.toByteArray();
    }

}