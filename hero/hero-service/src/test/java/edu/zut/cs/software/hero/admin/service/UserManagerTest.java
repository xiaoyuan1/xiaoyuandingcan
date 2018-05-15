package edu.zut.cs.software.hero.admin.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.admin.domain.User;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class UserManagerTest {

	@Autowired
	UserManager userManager;

	@Test
	public void testFindAll() {
		List<User> all = this.userManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String username = "world";
		User expected_user = new User();
		User user = this.userManager.findbyUsername(username);
		assertEquals(user, expected_user);
	}

}
