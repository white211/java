package cn.white.service;

import javax.servlet.http.HttpSession;

import cn.white.entity.User;
import cn.white.util.NoteResult;

public interface UserService {
	/*
	 * 验证登陆信息 并返会验证结果
	 */
	public NoteResult checkLogin(String name, String password);

	/*
	 * 添加用户并返回信息
	 */
	public NoteResult addUser(String name, String password);

	public User findUserByName(String name);

	/*
	 * 通过用户名修改密码
	 */
	public NoteResult modifyPassword(String password,String lastPassword, String newPassword);

}
