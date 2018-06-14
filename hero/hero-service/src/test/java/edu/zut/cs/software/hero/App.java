package edu.zut.cs.software.hero;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import edu.zut.cs.software.hero.user.domain.User;
import edu.zut.cs.software.hero.user.service.UserManager;


@ContextConfiguration(locations = { "classpath:/applicationContextTest-resources.xml",
		"classpath:/applicationContext-dao.xml", "classpath:/applicationContext-service.xml" })
public class App extends AbstractJUnit4SpringContextTests{
	User user = new User();

	UserManager userManager;

	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	// 目标对象有实现接口，spring会自动选择“JDK代理”
	@Test
	public void testApp() {
		this.userManager.save(this.user);
	}
}
