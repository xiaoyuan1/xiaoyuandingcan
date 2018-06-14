package edu.zut.cs.software.hero.dingdan.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;

public class DingdanManagerTest extends GenericGenerator{
	
	@Autowired
	DingdanManager groupManager;
	@Test
	public void gen_Dingdn() {
		for (int i = 0; i < 10; i++) {
			Dingdan g = new Dingdan();
			g.setOrderid("dingdan_" + i);
			this.groupManager.save(g);
			for (int j = 0; j < 10; j++) {
				Dingdan group = new Dingdan();
				group.setOrderid("dingdan_" + i + "_" + j);
				//group.setParent(g);
				g = this.groupManager.save(group);
			}
		}
	}

}
