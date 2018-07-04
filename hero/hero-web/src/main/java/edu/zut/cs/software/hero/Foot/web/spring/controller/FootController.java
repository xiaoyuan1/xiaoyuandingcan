package edu.zut.cs.software.hero.Foot.web.spring.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.foot.service.FootManager;

/**
 * hander
 * @author liwenbo
 *
 */

@Controller
@RequestMapping("/foot")
public class FootController extends GenericController<Foot, Long, FootManager> {

	FootManager footManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/foot/index";
		return result;
	}
	@Autowired
	public void setFootManager(FootManager footManager) {
		this.footManager = footManager;
		this.manager = this.footManager;
	}
}
