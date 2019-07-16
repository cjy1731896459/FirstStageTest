package com.test.web.Utils;

import java.sql.*;

public class DBUtils {
private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
private static final String url = "jdbc:mysql://localhost:3306/work?characterEncoding=utf8&useSSL=false&serverTimezone=CST&rewriteBatchedStatements=true";
private static final String username = "root";
private static final String password = "root";

//数据库链接
public Connection getConnection(){
   try {
        Class.forName(DRIVER_CLASS);
        return DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    return null;
}
// 4、关闭资源
public static void closeAll(Connection conn, Statement sta, ResultSet rs){

    // 关闭规则：从里向外关
    try {
        // 查询有结果集
        if(rs!=null){
            rs.close();
            System.out.println("关闭rs");
        }
        // 查询和更新都要关闭
        if(sta!=null){
            sta.close();
            System.out.println("关闭sta");
        }
        if(conn!=null){
            conn.close();
            System.out.println("关闭conn");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
}
