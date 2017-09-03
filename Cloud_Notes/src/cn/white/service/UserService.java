package cn.white.service;

import javax.servlet.http.HttpSession;

import cn.white.entity.User;
import cn.white.util.NoteResult;

public interface UserService {
	/*
	 * ��֤��½��Ϣ ��������֤���
	 */
	public NoteResult checkLogin(String name, String password);

	/*
	 * ����û���������Ϣ
	 */
	public NoteResult addUser(String name, String password);

	public User findUserByName(String name);

	/*
	 * ͨ���û����޸�����
	 */
	public NoteResult modifyPassword(String password,String lastPassword, String newPassword);

}
