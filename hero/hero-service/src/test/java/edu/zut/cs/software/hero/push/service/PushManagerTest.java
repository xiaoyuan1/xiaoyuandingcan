package edu.zut.cs.software.hero.push.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.push.domain.Push;


public class PushManagerTest  extends GenericGenerator{
	@Autowired
	PushManager pushManager;

	@Test
	public void gen_group10() {
		for (int i = 0; i < 10; i++) {
			Push g = new Push();
			g.setMessage("group_" + i);
			this.pushManager.save(g);
			for (int j = 0; j < 10; j++) {
				Push group = new Push();
				group.setMessage("group_" + i + "_" + j);
				g = this.pushManager.save(group);
			}
		}
	}
}
