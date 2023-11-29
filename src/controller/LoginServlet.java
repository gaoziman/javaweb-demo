package controller;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-28 21:03
 * @description : 登录Servlet
 */

@WebServlet(name = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        // 获取前端页面传过来的值
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 执行查询数据库逻辑
        UserDao userDao = new UserDaoImpl();
        User user = userDao.login(username, password);

        // 如果根据用户名和密码能查得到值
        if (user != null) {
            req.setAttribute("user", user);
            req.getRequestDispatcher("/success.jsp").forward(req, resp);
        } else {    // 用户名或者密码错误执行以下代码
            req.setAttribute("message", "用户名或者密码错误");
            req.getRequestDispatcher("/defeat.jsp").forward(req, resp);
        }

    }
}
