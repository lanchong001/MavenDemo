package com.lym.javademo.Java_Network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * 获取远程文件大小
 * 查看主机指定文件的最后修改时间
 * 网页抓取
 * 获取URL响应头的日期信息
 * 获取 URL响应头信息
 * 解析 URL
 * Created by lym on 2016/7/17.
 */
public class URLEmp {
    public static void main(String[] args) throws Exception {
        //如何获取远程文件的大小
        int size;
        URL url = new URL("http://www.w3cschool.cc/wp-content/themes/w3cschool.cc/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if(size < 0)
        {
            System.out.println("无法获取文件大小");
        }
        else
        {
            System.out.println("文件大小为: " + size + " bytes");
            conn.getInputStream().close();
        }

        System.out.println();
        //查看主机指定文件的最后修改时间
        URL u = new URL("http://localhost:8080/201110001.jpg");
        URLConnection uc = u.openConnection();
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println("java.bmp 文件最后修改时间 :"+ sdf.format(new Date(timestamp)));

        System.out.println();
        //如何使用 net.URL 类的 URL() 构造函数来抓取网页 乱码
        URL cUrl = new URL("http://www.w3cschool.cc");
        BufferedReader reader = new BufferedReader(new InputStreamReader(cUrl.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(new String(line.getBytes("UTF-8")));
            writer.newLine();
        }
        reader.close();
        writer.close();

        System.out.println();
        //如何使用 HttpURLConnection 的 httpCon.getDate() 方法来获取 URL响应头的日期信息
        URL url2 = new URL("http://www.w3cschool.cc");
        HttpURLConnection httpCon = (HttpURLConnection) url2.openConnection();
        long date = httpCon.getDate();  //URL响应头的日期信息
        if (date == 0)
            System.out.println("无法获取信息。");
        else
            System.out.println("Date: " + new Date(date));

        System.out.println();
        //获取 URL 响应头信息
        URLConnection conn1 = url.openConnection();
        Map headers = conn1.getHeaderFields();  //获取 URL 的响应头信息;
        Set<String> keys = headers.keySet();
        for( String key : keys ){
            String val = conn.getHeaderField(key);
            System.out.println(key + "    " + val);
        }
        System.out.println( conn.getLastModified() );

        System.out.println();
        //如何使用 net.URL 类的 url.getProtocol() ,url.getFile() 等方法来解析 URL 地址
        URL url3 = new URL("http://www.w3cschool.cc/html/html-tutorial.html");
        System.out.println("URL 是 " + url3.toString());
        System.out.println("协议是 " + url3.getProtocol());
        System.out.println("文件名是 " + url3.getFile());
        System.out.println("主机是 " + url3.getHost());
        System.out.println("路径是 " + url3.getPath());
        System.out.println("端口号是 " + url3.getPort());
        System.out.println("默认端口号是 " + url3.getDefaultPort());
    }
}
