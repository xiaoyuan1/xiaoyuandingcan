package edu.zut.cs.software.hero.message.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.message.domain.Message;
import edu.zut.cs.software.hero.message.service.MessageManager;


@Controller
@RequestMapping("/message")
public class MessageController extends GenericController<Message, Long, MessageManager> {
	MessageManager messageManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/message/index";
		return result;
	}

	@Autowired
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
		this.manager = this.messageManager;
	}
}