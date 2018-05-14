package edu.zut.cs.software.hero.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.admin.domain.Foot;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class FootManagerTest {

	@Autowired
	FootManager footManager;

	@Test
	public void testFindAll() {
		List<Foot> all = this.footManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyFootname() {
		String footname = "world";
		Foot expected_foot = new Foot();
		// expected_user.setUsername(username);
		Foot foot = this.footManager.findbyFootname(footname);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(foot, expected_foot);
	}

}
