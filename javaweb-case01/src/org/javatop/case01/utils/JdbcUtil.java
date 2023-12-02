package org.javatop.case01.utils;

import java.sql.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-28 20:59
 * @description : 数据库连接工具类
 */
public class JdbcUtil {

    /**
     * 1、获取Connection
     * @return Connection
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");

    }

    /**
     * 2、释放资源
     * @param resultSet resultSet
     * @param statement statement
     * @param connection connection
     */
    public static void release(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
