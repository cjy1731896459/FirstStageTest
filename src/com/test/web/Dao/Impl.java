package com.test.web.Dao;

import com.test.web.UserInfo.UserInfo;
import com.test.web.Utils.DBUtils;

import java.sql.*;


public class Impl implements IDao {

    @Override
    public UserInfo findByuser(UserInfo userinfo)  {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pre = null;
        DBUtils dbUtils = new DBUtils();
        //获得数据库链接
        try {
            conn = dbUtils.getConnection();
            pre = conn.prepareStatement("select * from user where username=? and password=?");
            pre.setString(1,userinfo.getUsername());
            pre.setString(2,userinfo.getPassword());
            rs = pre.executeQuery();
            if(rs.next()){
                UserInfo userInfo = new UserInfo();
                userInfo.setUsername(rs.getString("username"));
                userInfo.setPassword(rs.getString("password"));
                return userInfo;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 3、关闭资源
            dbUtils.closeAll(conn, pre, rs);
        }
        return null;

    }

    @Override
    public int addUser(UserInfo userInfo) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pre = null;
        //获得数据库链接
        conn = new DBUtils().getConnection();
        try {
            pre = conn.prepareStatement("INSERT INTO user (id,username,password,sex,hobbys,phone,email,addrs,flag) VALUES (null,?,?,?,?,?,?,?,1)");
            pre.setString(1,userInfo.getUsername());
            pre.setString(2,userInfo.getPassword());
            pre.setString(3,userInfo.getSex());
            pre.setString(4,userInfo.getHobbys());
            pre.setInt(5,userInfo.getPhone());
            pre.setString(6,userInfo.getEmail());
            pre.setString(7,userInfo.getAddrs());
            int rows = pre.executeUpdate();
            return rows;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DBUtils.closeAll(conn, pre, rs);
        }

        return 0;
    }
}
