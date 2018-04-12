package edu.zut.cs.software.hero.user;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ServiceConfig.class)
public class UserManagerTest {

	@Autowired
	UserManager uesrmanager;
	@Test
	public void testGetAll() {
		List<Object> expected=new ArrayList<Object>();
		List<Object> result=this.uesrmanager.getAll();
		assertEquals(expected, result);
	}

}
