package edu.zut.cs.software.hero.depot.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.depot.domain.Depot;
import edu.zut.cs.software.hero.depot.service.DepotManager;

@Controller
@RequestMapping("/depot")
public class DepotController extends GenericController<Depot, Long, DepotManager> {
	DepotManager depotManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/depot/index";
		return result;
	}

	@Autowired
	public void setDepotManager(DepotManager depotManager) {
		this.depotManager = depotManager;
		this.manager = this.depotManager;
	}
}