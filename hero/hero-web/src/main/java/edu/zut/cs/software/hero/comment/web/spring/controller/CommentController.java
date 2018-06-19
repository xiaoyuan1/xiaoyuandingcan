package edu.zut.cs.software.hero.comment.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.hero.comment.domain.Comment;
import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.comment.service.CommentManager;


@Controller
@RequestMapping("/comment")
public class CommentController extends GenericController<Comment, Long, CommentManager> {
	CommentManager commentManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/comment/index";
		return result;
	}
	@Autowired
	public void setCommentManager(CommentManager commentManager) {
		this.commentManager = commentManager;
		this.manager = this.commentManager;
	}
}