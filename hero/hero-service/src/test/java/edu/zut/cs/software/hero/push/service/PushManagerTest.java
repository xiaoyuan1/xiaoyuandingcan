package edu.zut.cs.software.hero.push.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.admin.service.AdminServiceConfig;
import edu.zut.cs.software.hero.push.domain.Push;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class PushManagerTest {
	@Autowired
	PushManager pushManager;
	@Test
	public void testFindAll() {
		List<Push> all = this.pushManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyPushname() {
		String pushname = "world";
		Push expected_push = new Push();
		Push push = this.pushManager.findbyPushname(pushname);
		assertEquals(push, expected_push);
	}

}
