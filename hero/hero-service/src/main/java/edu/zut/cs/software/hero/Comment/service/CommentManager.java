package edu.zut.cs.software.hero.comment.service;

import java.util.List;

import edu.zut.cs.software.hero.comment.domain.Comment;
import edu.zut.cs.software.hero.base.service.GenericManager;

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
