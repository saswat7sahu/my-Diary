package com.my.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.model.UserLogin;

@Controller
public class LoginController {
	@RequestMapping("log")
	public ModelAndView log(UserLogin login,ModelAndView mv) {
		mv.addObject("username",login.getUname());
		mv.addObject("password",login.getPassword());
		mv.setViewName("home.jsp");

		return mv;
	}
}
