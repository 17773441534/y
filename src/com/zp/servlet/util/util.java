package com.zp.servlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class  util  {
	static String url = null;
	static String name  = null;
	static String pass= null;
	static Connection conn= null;
	  {
		Boolean f = false; 
	
		
		
		
		 url = "jdbc:mysql://127.0.0.1/zp";
		 name = "root";
		 pass = "root";
		
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConn()throws SQLException {
		
		return DriverManager.getConnection(url, name, pass);
	}
	public static void Closeconn(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void Closest(PreparedStatement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void Closers(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(Connection conn,PreparedStatement st,ResultSet rs) {
		Closers(rs);
		Closest(st);
		Closeconn(conn);
	}
	

}
