package dao;

import domain.User;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-28 20:59
 * @description :
 */
public interface UserDao {

    // 登录
    User login(String username, String password);

    // 注册
    Boolean register(User user);
}
