package edu.zut.cs.software.hero.order.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.order.domain.Order;
import edu.zut.cs.software.hero.order.service.OrderManager;


	@Controller
	@RequestMapping("/order")
	public class OrderController extends GenericController<Order, Long, OrderManager> {
		OrderManager orderManager;

		@RequestMapping(method = RequestMethod.GET, value = "/index.html")
		public String index() {
			String result = "/order/index";
			return result;
		}

		@Autowired
		public void setStudentManager(OrderManager orderManager) {
			this.orderManager = orderManager;
			this.manager = this.orderManager;
		}
}

