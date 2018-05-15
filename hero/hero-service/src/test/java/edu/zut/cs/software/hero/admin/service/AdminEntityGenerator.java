package edu.zut.cs.software.hero.admin.service;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.admin.domain.Foot;
import edu.zut.cs.software.hero.admin.domain.Group;
import edu.zut.cs.software.hero.admin.domain.User;
import edu.zut.cs.software.hero.base.service.GenericGenerator;

public class AdminEntityGenerator extends GenericGenerator {
	@Autowired
	GroupManager groupManager;

	@Autowired
	UserManager userManager;
	
	@Autowired
	FootManager footManager;

	@Test
	public void gen_group() {
		for (int i = 0; i < 10; i++) {
			Group g = new Group();
			g.setName("group_" + i);
			this.groupManager.save(g);
			for (int j = 0; j < 10; j++) {
				Group group = new Group();
				group.setName("group_" + i + "_" + j);
				group.setParent(g);
				g = this.groupManager.save(group);
				this.gen_foot(g);
			}
		}
	}
	public void gen_foot(Group g) {
		for (int i = 0; i < 10; i++) {
			Foot u = new Foot();
			u.setProduct_name("footname_" + i);
			//u.setPassword("password_" + i);
			u.setGroup(g);
			this.footManager.save(u);
		}
	}
	@Test
	public void gen_group1() {
		for (int i = 0; i < 10; i++) {
			Group g = new Group();
			g.setName("group_" + i);
			this.groupManager.save(g);
			for (int j = 0; j < 10; j++) {
				Group group = new Group();
				group.setName("group_" + i + "_" + j);
				group.setParent(g);
				g = this.groupManager.save(group);
				this.gen_user(g);
			}
		}
	}
	public void gen_user(Group g) {
		for (int i = 0; i < 10; i++) {
			User u = new User();
			u.setUsername("username_" + i);
			u.setPassword("password_" + i);
			u.setGroup(g);
			this.userManager.save(u);
		}
	}
}
