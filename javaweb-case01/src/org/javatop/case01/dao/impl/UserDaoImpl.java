package org.javatop.case01.dao.impl;


import org.javatop.case01.dao.UserDao;
import org.javatop.case01.domain.User;
import org.javatop.case01.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-28 21:01
 * @description :
 */
public class UserDaoImpl  implements UserDao {
    @Override
    public User login(String username, String password) {
        User user = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtil.getConnection();
            String sql = "select * from user where username = ? and password= ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setPhone(resultSet.getString("phone"));
                System.out.println("登录成功" + user.toString());
            } else {
                System.out.println("用户名或者密码错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(resultSet, preparedStatement, connection);
        }
        return user;
    }

    @Override
    public Boolean register(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int result = 0;

        try {
            connection = JdbcUtil.getConnection();
            String sql = "insert into user(username, password) values (?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            result = preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(resultSet, preparedStatement, connection);
        }
        // 三目表达式，result等1则人会true，否则返回false
        return result == 1 ? true:false;
    }
}
