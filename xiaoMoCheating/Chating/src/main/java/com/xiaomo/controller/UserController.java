package com.xiaomo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaomo.entity.User;
import com.xiaomo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		User resUser=userService.searchByNameAndPassword(user.getName(), user.getPassword());
		if(resUser==null){
			String error="用户名或密码有误!";
			request.setAttribute("error", error);
			return "chating/userlogin";
		}else{
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", resUser);
			return "chating/webchat";
		}
	}
	
	@RequestMapping("/register")
	public String register(User user,HttpServletRequest request) {
		User resUser=userService.searchByName(user.getName());
		if(resUser!=null) {
			String error="用户名已存在!";
			request.setAttribute("error", error);
			return "chating/userregister";
		}else {
			user.setIs_present(true);
			user.setStatus(1);
			userService.saveUser(user);
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", user);
			return "chating/webchat";
		}
	}
	
	@RequestMapping("/regiindex")
	public String regiindex() {
		return "chating/userregister";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "chating/userlogin";
	}
}
