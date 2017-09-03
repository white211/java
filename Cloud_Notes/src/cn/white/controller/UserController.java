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
	 * 注册用户controller 1.获取表单数据 2.调用方法addUser 3.将获取数据放在modelAndView上传回前台
	 */
	@RequestMapping("/user/register.do")
	@ResponseBody
	public NoteResult register(String username, String password) {
		return this.userService.addUser(username, password);
	}

	/*
	 * 登陆用户controller 调用checklogin进行验证 并将数据搭载打noteresult上返回给前端
	 */
//	@RequestMapping(name = "/user/login.do", method = RequestMethod.POST)
	@RequestMapping(name = "/user/login.do")
	@ResponseBody
	public NoteResult login(String username, String password) {
		return this.userService.checkLogin(username, password);
	}

	/*
	 * 用户修改密码
	 */
	@RequestMapping("/user/update.do")
	public NoteResult update(String password,String lastPassword, String newPassword) {
		NoteResult noteResult = new NoteResult();
		noteResult = userService.modifyPassword(password,lastPassword, newPassword);
		return noteResult;
	}
}












