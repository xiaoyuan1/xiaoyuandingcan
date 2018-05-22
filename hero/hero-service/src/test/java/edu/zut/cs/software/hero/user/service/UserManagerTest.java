package edu.zut.cs.software.hero.user.service;



import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.user.domain.User;

public class UserManagerTest extends GenericGenerator{

	@Autowired
	UserManager userManager;
	@Test
	public void gen_user() {
		for (int i = 0; i < 10; i++) {
			User g = new User();
			g.setUsername("user_" + i);
			this.userManager.save(g);
			for (int j = 0; j < 10; j++) {
				User group = new User();
				group.setUsername("group_" + i + "_" + j);
				g = this.userManager.save(group);
			}
		}
	}

}
