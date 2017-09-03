package cn.white.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.white.dao.UserDao;
import cn.white.entity.User;
import cn.white.util.NoteResult;
import cn.white.util.NoteUtil;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/*
	 * 验证登陆信息 用户名 与密码 返回验证结果
	 */
	@Override
	public NoteResult checkLogin(String name, String password) {
		NoteResult noteResult = new NoteResult();
		if (name == null || "".equals(name)) {
			noteResult.setStatus(1);
			noteResult.setMsg("用户名不能为空！");
			return noteResult;
		}
		if (password == null || "".equals(password)) {
			noteResult.setStatus(1);
			noteResult.setMsg("密码不能为空");
			return noteResult;
		}
		User user = userDao.findUserByName(name);
		if (user == null) {
			noteResult.setStatus(1);
			noteResult.setMsg("用户名不存在");
			return noteResult;
		}
		try {
			// String md5_password = NoteUtil.md5(password);
			if (!user.getCn_user_password().equals(password)) {
				noteResult.setStatus(2);
				noteResult.setMsg("密码错误");
				return noteResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
			noteResult.setStatus(1);
			noteResult.setMsg("登录失败！信息：" + e.getMessage());
			return noteResult;
		}
		noteResult.setStatus(0);
		noteResult.setMsg("登录成功");
		noteResult.setData(user);
		return noteResult;
	}

	/*
	 * 进行验证 添加用户信息阶段
	 */
	@Override
	public NoteResult addUser(String name, String password) {
		NoteResult noteResult = new NoteResult();
		if (name == null || "".equals(name)) {
			noteResult.setStatus(1);
			noteResult.setMsg("用户名不能为空！");
			return noteResult;
		}
		if (password == null || "".equals(password)) {
			noteResult.setStatus(1);
			noteResult.setMsg("密码不能为空");
			return noteResult;
		}
		// 判断用户名是否已经存
		User user = userDao.findUserByName(name);
		if (user != null) {
			noteResult.setStatus(1);
			noteResult.setMsg("用户名已经存在！");
			return noteResult;
		}
		// 注册功能的
		user = new User();
		user.setCn_user_name(name);
		try {
			// 对密码进行md5加密
			// String md5_password = NoteUtil.md5(password);
			user.setCn_user_password(password);
			// 获取随机的UUID
			// String userId = NoteUtil.createId();
			// user.setCn_user_id(userId);
			userDao.saveUser(user);
			noteResult.setStatus(0);
			noteResult.setMsg("注册成功");
			return noteResult;
		} catch (Exception e) {
			e.printStackTrace();
			noteResult.setStatus(1);
			noteResult.setMsg("注册失败！信息：" + e.getMessage());
			return noteResult;
		}
	}

	/*
	 * 修改密码
	 */
	public NoteResult modifyPassword(String password, String lastPassword, String newPassword) {
		NoteResult noteResult = new NoteResult();
		User user = userDao.findUserByPassword(password);

		if (password.equals(lastPassword)) {
			user.setCn_user_password(newPassword);
			userDao.update(user);
			noteResult.setStatus(0);
			noteResult.setMsg("修改成功");
			return noteResult;
		} else {
			user.setCn_user_password(newPassword);
			noteResult.setStatus(1);
			noteResult.setMsg("原密码输入有误");
			return noteResult;
		}
	}

	@Override
	public User findUserByName(String name) {
		return userDao.findUserByName(name);
	}
}
