package edu.zut.cs.software.hero.push.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.push.domain.Push;
import edu.zut.cs.software.hero.push.service.PushManager;
@Controller
@RequestMapping("/push")
public class PushController extends GenericController<Push, Long, PushManager> {
	PushManager pushManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/push/index";
		return result;
	}

	@Autowired
	public void setUserManager(PushManager pushManager) {
		this.pushManager = pushManager;
		this.manager = this.pushManager;
	}
}
