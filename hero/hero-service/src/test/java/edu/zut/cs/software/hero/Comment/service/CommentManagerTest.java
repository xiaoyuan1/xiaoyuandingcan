package edu.zut.cs.software.hero.comment.service;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.comment.domain.Comment;

import edu.zut.cs.software.hero.base.service.GenericManagerTestCase;
import edu.zut.cs.software.hero.comment.service.CommentManager;

public class CommentManagerTest extends GenericManagerTestCase<Long, Comment, CommentManager>{

	CommentManager commentManager;

	public CommentManagerTest() {
		super(Comment.class);
	}

	@Autowired
	public void setCommentManager(CommentManager commentManager) {
		this.commentManager = commentManager;
		this.manager = this.commentManager;
	}

	@Before
	public void setUp() throws Exception {
		Comment comment = new Comment();
		comment.setComment("123");
		this.entity = this.manager.save(comment);
	}

	@Test
	public void testFindByFullname() {
		List<Comment> result = this.commentManager.findByFullname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getEntityName());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getComment();
		List<Comment> result = this.commentManager.findByCode(postcode);
		assertEquals(postcode, result.get(0).getComment());

	}
}
