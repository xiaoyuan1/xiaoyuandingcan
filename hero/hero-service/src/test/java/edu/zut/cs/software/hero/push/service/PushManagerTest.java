package edu.zut.cs.software.hero.push.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.push.domain.Push;


public class PushManagerTest  extends GenericGenerator{
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
		// expected_user.setUsername(username);
		Push push = this.pushManager.findbyPushname(pushname);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(push, expected_push);
	}

}
