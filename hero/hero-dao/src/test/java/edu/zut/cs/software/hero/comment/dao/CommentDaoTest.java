package edu.zut.cs.software.hero.comment.dao;



import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.comment.domain.Comment;
import edu.zut.cs.software.hero.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.hero.comment.dao.CommentDao;

public class CommentDaoTest extends GenericDaoTestCase<Long, Comment, CommentDao>{


	@Autowired
	CommentDao commentDao;
	
	@Test
	public void test() {
		Comment r = new Comment();
		r.setComment("test_Comment");
		Comment test_Comment = this.commentDao.save(r);
		assertEquals(r, test_Comment);

		List<Comment> all = this.commentDao.findAll();
		
	}

}
