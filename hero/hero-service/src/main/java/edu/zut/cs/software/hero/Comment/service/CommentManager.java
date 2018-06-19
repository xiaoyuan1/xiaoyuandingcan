package edu.zut.cs.software.hero.Comment.service;

import java.util.List;

import edu.zut.cs.software.hero.Comment.domain.Comment;
import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.user.domain.User;

public interface CommentManager extends GenericManager<Comment, Long> {
	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Comment> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<Comment> findByFullname(String fullname);
}
