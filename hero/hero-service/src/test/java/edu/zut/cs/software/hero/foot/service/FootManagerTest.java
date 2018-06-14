package edu.zut.cs.software.hero.foot.service;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.service.GenericManagerTestCase;




public class FootManagerTest extends GenericManagerTestCase<Long, Foot, FootManager>{


	FootManager footManager;

	public FootManagerTest() {
		super(Foot.class);
	}

	@Autowired
	public void setStudentManager(FootManager footManager) {
		this.footManager = footManager;
		this.manager = this.footManager;
	}

	@Before
	public void setUp() throws Exception {
		Foot foot = new Foot();
		foot.setProduct_name("宫保鸡丁");
		foot.setProduct_biaohao("1001");
		this.entity = this.manager.save(foot);
	}

	@Test
	public void testFindByFullname() {
		List<Foot> result = this.footManager.findByproduct_name("宫");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("宫保鸡丁", result.get(0).getProduct_name());
	}

	@Test
	public void testFindByProduct_biaohao() {
		String postcode = this.entity.getProduct_biaohao();
		List<Foot> result = this.footManager.findByproduct_biaohao(postcode);
		assertEquals(postcode, result.get(0).getProduct_biaohao());

	}

}
