package edu.zut.cs.software.hero.Comment.service;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.Comment.domain.Comment;

import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.Comment.service.CommentManager;


public class CommentManagerTest extends GenericGenerator{

	@Autowired
	CommentManager commentManager;

	@Test
	public void gen_foot() {
		for (int i = 0; i < 10; i++) {
			Comment g = new Comment();
			g.setComment("group_" + i);
			this.commentManager.save(g);
			for (int j = 0; j < 10; j++) {
				Comment group = new Comment();
				group.setComment("group_" + i + "_" + j);
				g = this.commentManager.save(group);
			}
		}
	}
}
