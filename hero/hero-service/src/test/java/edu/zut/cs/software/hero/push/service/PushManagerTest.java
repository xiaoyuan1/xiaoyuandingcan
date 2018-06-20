package edu.zut.cs.software.hero.push.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.service.GenericManagerTestCase;
import edu.zut.cs.software.hero.push.domain.Push;

/**
 * @author zengzexing
 * 测试Manager
 * */

public class PushManagerTest  extends GenericManagerTestCase<Long,Push, PushManager>{
	PushManager pushManager;

	public PushManagerTest() {
		super(Push.class);
	}

	@Autowired
	public void setPushManager(PushManager pushManager) {
		this.pushManager = pushManager;
		this.manager = this.pushManager;
	}

	@Before
	public void setUp() throws Exception {
		Push push = new Push();
		push.setFood("手撕包菜");
		push.setMessage("今日XXX活动，本店开展XXX活动，菜品一律XX折，并赠送XXX！！");
		push.setLucky("101");
		this.entity = this.manager.save(push);
	}

	@Test
	public void testFindByFullname() {
		List<Push> result = this.pushManager.findByFullname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getEntityName());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getCode();
		List<Push> result = this.pushManager.findByCode(postcode);
		assertEquals(postcode, result.get(0).getCode());

	}
}
