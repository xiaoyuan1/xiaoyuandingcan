package edu.zut.cs.software.hero.foot.service;




import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.Foot.domain.Foot;

import edu.zut.cs.software.hero.base.service.GenericGenerator;




public class FootManagerTest extends GenericGenerator{

	@Autowired
	FootManager footManager;

	@Test
	public void gen_foot() {
		for (int i = 0; i < 10; i++) {
			Foot g = new Foot();
			g.setProduct_name("group_" + i);
			this.footManager.save(g);
			for (int j = 0; j < 10; j++) {
				Foot group = new Foot();
				group.setProduct_name("group_" + i + "_" + j);
				g = this.footManager.save(group);
			}
		}
	}

}
