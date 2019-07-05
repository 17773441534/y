package com.zp.servlet.dao;


import com.zp.servlet.pojo.Pojo;
import com.zp.servlet.util.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class dao extends util {
    public Pojo select(int a) {
        System.out.println("fwe");
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Pojo pojo = new Pojo();
        try {
            conn = getConn();
            String sql = "select * from yiyan limit ?,1 ";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,a);
            rs = ps.executeQuery();
            while (rs.next()) {
                pojo.setName(rs.getString("name"));
                pojo.setId(rs.getInt("id"));
                pojo.setCome(rs.getString("come"));
                pojo.setSentence(rs.getString("sentence"));
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            close(conn, ps, rs);
        }
        System.out.println("查询完毕------------------");
        return pojo;
    }

    public int sum() {//查询总数

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int p =0;
        try {
            conn = getConn();
            String sql = "select COUNT(*) as i from yiyan  ";// 查询用户账号是否存在
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("i"));
                p =rs.getInt("i");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            close(conn, ps, rs);
        }
        Map map = new HashMap();
        return p;
    }
}
