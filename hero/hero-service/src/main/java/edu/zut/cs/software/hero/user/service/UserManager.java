package edu.zut.cs.software.hero.user.service;

import java.util.List;



import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.user.domain.User;

public interface UserManager extends GenericManager<User, Long> {
	List<User> findAll();
	User findbyUsername(String username);
}
