package com.test.web.Servlet;

import com.test.web.Dao.Impl;
import com.test.web.UserInfo.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class registerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String hobbys = req.getParameter("hobbys");
        int phone = Integer.parseInt(req.getParameter("phone"));
        String email = req.getParameter("email");
        String addrs = req.getParameter("addrs");
        Impl impl = new Impl();
        System.out.println(new UserInfo(username,password,sex,hobbys,phone,email,addrs));
        int rows  = impl.addUser(new UserInfo(username,password,sex,hobbys,phone,email,addrs));
        if (rows>0){
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<script type='text/javascript'>alert('注册成功');history.back();</script>");

        }else {
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<script type='text/javascript'>alert('注册失败');history.back();</script>");
        }
    }
}
