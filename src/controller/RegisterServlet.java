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
 * @date 2023-11-28 21:04
 * @description :
 */
@WebServlet(name = "/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPut(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        UserDao userDao = new UserDaoImpl();
        if (userDao.register(user)) {
            System.out.println("注册成功");
            // 注册成功，跳转登录页面
            req.getRequestDispatcher("register-success.jsp").forward(req,resp);
        } else {
            System.out.println("注册失败");
            req.setAttribute("message", "注册失败");
            req.getRequestDispatcher("register.jsp").forward(req,resp);
        }

    }
}
