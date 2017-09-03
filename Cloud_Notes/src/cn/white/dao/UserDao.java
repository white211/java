package cn.white.dao;

import cn.white.entity.User;

public interface UserDao {
     /*
      * ͨ���û��������û���Ϣ
       */
     public User findUserByName(String name);
     
     /*
      * ͨ����������û�
      */
     public User findUserByPassword(String password);
     
     /*
      * �����û���Ϣ
      * �û�ע����Ϣ
      */
     public void saveUser(User user);
     
     /*
      * ͨ���û���
      * �޸�����
      */
     public void update(User user);
     
}
