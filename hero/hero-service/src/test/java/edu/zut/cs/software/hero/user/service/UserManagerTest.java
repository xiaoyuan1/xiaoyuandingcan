package edu.zut.cs.software.hero.user.service;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;



import edu.zut.cs.software.hero.base.service.GenericManagerTestCase;
import edu.zut.cs.software.hero.user.domain.User;

public class UserManagerTest  extends GenericManagerTestCase<Long, User, UserManager> {

//	@Autowired
//	UserManager userManager;
//	@Test
//	public void gen_user() {
//		for (int i = 0; i < 10; i++) {
//			User g = new User();
//			g.setUsername("user_" + i);
//			this.userManager.save(g);
//			for (int j = 0; j < 10; j++) {
//				User group = new User();
//				group.setUsername("group_" + i + "_" + j);
//				g = this.userManager.save(group);
//			}
//		}
//	}
	
	
	UserManager userManager;

	public UserManagerTest() {
		super(User.class);
	}

	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
		this.manager = this.userManager;
	}

	@Before
	public void setUp() throws Exception {
		User user = new User();
		user.setUsername("张三");
		user.setPassword("199726");
		user.setEmail("450000");
		this.entity = this.manager.save(user);
	}

	@Test
	public void testFindByFullname() {
		List<User> result = this.userManager.findByFullname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getEntityName());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getCode();
		List<User> result = this.userManager.findByCode(postcode);
		assertEquals(postcode, result.get(0).getCode());

	}

}
