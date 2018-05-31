package edu.zut.cs.software.hero.Comment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.Comment.dao.CommentDao;
import edu.zut.cs.software.hero.Comment.domain.Comment;
import edu.zut.cs.software.hero.Comment.service.CommentManager;

import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;

@Component
public class CommentManagerImpl extends GenericManagerImpl<Comment, Long> implements CommentManager{

	CommentDao commentDao;

	@Autowired
	public void setFootDao(CommentDao commentDao) {
		this.commentDao = commentDao;
		this.dao = this.commentDao;
	}

	@Override
	public Comment findbyCommentname(String commentname) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
