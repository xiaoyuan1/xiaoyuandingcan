package edu.zut.cs.software.hero.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.software.hero.admin.domain.Foot;
import edu.zut.cs.software.hero.admin.service.FootManager;
import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/user")
public class FootController extends GenericController<Foot, Long, FootManager> {

	FootManager footManager;

	@Autowired
	public void setUserManager(FootManager footManager) {
		this.footManager = footManager;
		this.manager = this.footManager;
	}

	@RequestMapping("/index")
	public String index() {
		return "user/index";
	}
}