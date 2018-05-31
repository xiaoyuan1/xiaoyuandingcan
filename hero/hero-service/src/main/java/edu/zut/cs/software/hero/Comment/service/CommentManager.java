package edu.zut.cs.software.hero.Comment.service;

import java.util.List;

import edu.zut.cs.software.hero.Comment.domain.Comment;

import edu.zut.cs.software.hero.base.service.GenericManager;

public interface CommentManager  extends GenericManager<Comment,Long>{
	List<Comment> findAll();

	Comment findbyCommentname(String commentname);
}
