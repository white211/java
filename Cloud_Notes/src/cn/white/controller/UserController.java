package cn.white.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.white.entity.User;
import cn.white.service.UserService;
import cn.white.util.NoteResult;
import cn.white.util.NoteUtil;

@Controller
public class UserController {

	@Resource(name = "userService")
	private UserService userService;

	/*
	 * ע���û�controller 1.��ȡ������ 2.���÷���addUser 3.����ȡ���ݷ���modelAndView�ϴ���ǰ̨
	 */
	@RequestMapping("/user/register.do")
	@ResponseBody
	public NoteResult register(String username, String password) {
		return this.userService.addUser(username, password);
	}

	/*
	 * ��½�û�controller ����checklogin������֤ �������ݴ��ش�noteresult�Ϸ��ظ�ǰ��
	 */
//	@RequestMapping(name = "/user/login.do", method = RequestMethod.POST)
	@RequestMapping(name = "/user/login.do")
	@ResponseBody
	public NoteResult login(String username, String password) {
		return this.userService.checkLogin(username, password);
	}

	/*
	 * �û��޸�����
	 */
	@RequestMapping("/user/update.do")
	public NoteResult update(String password,String lastPassword, String newPassword) {
		NoteResult noteResult = new NoteResult();
		noteResult = userService.modifyPassword(password,lastPassword, newPassword);
		return noteResult;
	}
}












