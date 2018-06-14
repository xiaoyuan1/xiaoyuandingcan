package edu.zut.cs.software.hero.user.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.user.domain.User;
import edu.zut.cs.software.hero.user.service.UserManager;
@Controller
@RequestMapping("/student")
public class UserController extends GenericController<User, Long, UserManager> {
	UserManager userManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/student/index";
		return result;
	}

	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
		this.manager = this.userManager;
	}
}
