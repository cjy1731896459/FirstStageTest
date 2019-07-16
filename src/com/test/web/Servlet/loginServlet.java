package com.test.web.Servlet;

import com.test.web.Dao.Impl;
import com.test.web.UserInfo.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        Impl impl = new Impl();
        UserInfo userInfo = new UserInfo(username, password);
        System.out.println(userInfo);
        UserInfo userInfo1 = impl.findByuser(userInfo);
        if (userInfo1!=null||"".equals(userInfo1)){
            HttpSession session = req.getSession();
            session.setAttribute("username",username);
            session.setAttribute("password",password);
            resp.sendRedirect("index.jsp");
        }else {
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<script type='text/javascript'>alert('登录失败');history.back();</script>");
        }


    }
}
