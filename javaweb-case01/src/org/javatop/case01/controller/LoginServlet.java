package org.javatop.case01.controller;

import org.javatop.case01.dao.UserDao;
import org.javatop.case01.dao.impl.UserDaoImpl;
import org.javatop.case01.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-02 14:34
 * @description :
 */
@WebServlet(name = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 获取前端页面传过来的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 执行查询数据库逻辑
        UserDao userDao = new UserDaoImpl();
        User user = userDao.login(username, password);

        // 如果根据用户名和密码能查得到值
        if (user != null) {
            request.setAttribute("user", user);
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        } else {    // 用户名或者密码错误执行以下代码
            request.setAttribute("message", "用户名或者密码错误");
            request.getRequestDispatcher("/defeat.jsp").forward(request, response);
        }
    }
}
