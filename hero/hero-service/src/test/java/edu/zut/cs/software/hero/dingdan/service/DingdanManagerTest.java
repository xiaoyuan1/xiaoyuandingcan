package edu.zut.cs.software.hero.dingdan.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.service.GenericManagerTestCase;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;

/*import org.junit.Test;
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
				group.setParent(g);
				g = this.groupManager.save(group);
			}
		}
	}

}*/
/**
 * 
 * @author zhangyaohui
 *测试Manager
 */
public class DingdanManagerTest extends GenericManagerTestCase<Long, Dingdan, DingdanManager> {

	DingdanManager dingdanManager;

	public DingdanManagerTest() {
		super(Dingdan.class);
	}

	@Autowired
	public void setDingdanManager(DingdanManager dingdanManager) {
		this.dingdanManager = dingdanManager;
		this.manager = this.dingdanManager;
	}

	@Before
	public void setUp() throws Exception {
		Dingdan dingdan = new Dingdan();
		dingdan.setOrderxinxi("水煮肉片一份");
		dingdan.setOrdertime("2016.01.22");
		dingdan.setOrderid("450007");
		this.entity = this.manager.save(dingdan);
	}

	@Test
	public void testFindByOrderxinxi() {
		List<Dingdan> result = this.dingdanManager.findByOrderxinxi("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("水煮肉片一份", result.get(0).getOrderxinxi());
	}

	@Test
	public void testFindByOrderid() {
		String postorderid = this.entity.getOrderid();
		List<Dingdan> result = this.dingdanManager.findByOrderid(postorderid);
		assertEquals(postorderid, result.get(0).getOrderid());

	}

}
