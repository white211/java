package cn.white.dao;

import cn.white.entity.User;

public interface UserDao {
     /*
      * 通过用户名查找用户信息
       */
     public User findUserByName(String name);
     
     /*
      * 通过密码查找用户
      */
     public User findUserByPassword(String password);
     
     /*
      * 保存用户信息
      * 用户注册信息
      */
     public void saveUser(User user);
     
     /*
      * 通过用户名
      * 修改密码
      */
     public void update(User user);
     
}
