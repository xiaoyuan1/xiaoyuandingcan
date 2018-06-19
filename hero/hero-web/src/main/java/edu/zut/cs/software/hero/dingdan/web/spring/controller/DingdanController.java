package edu.zut.cs.software.hero.dingdan.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;
import edu.zut.cs.software.hero.dingdan.service.DingdanManager;

/**
 * 
 * @author zhangyaohui
 *web控制
 */
@Controller
@RequestMapping("/dingdan")
public class DingdanController extends GenericController<Dingdan, Long, DingdanManager> {

	DingdanManager dingdanManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/dingdan/index";
		return result;
	}

	@Autowired
	public void setDingdanManager(DingdanManager dingdanManager) {
		this.dingdanManager = dingdanManager;
		this.manager = this.dingdanManager;
	}

}