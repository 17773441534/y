package com.zp.servlet;

import com.zp.servlet.dao.dao;
import com.zp.servlet.pojo.Pojo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@javax.servlet.annotation.WebServlet(name = "YServlet")
public class YServlet extends javax.servlet.http.HttpServlet {
    Random random = new Random();
    int a = new dao().sum();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int i = random.nextInt(a+1);
        System.out.println("随机数"+i);
        Pojo map = new dao().select(i);
        Map map1 = new HashMap();
        map1.put("data",map);
        PrintWriter writer = response.getWriter();
        System.out.println(map1.get("data"));
       writer.write(map1.toString());


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
