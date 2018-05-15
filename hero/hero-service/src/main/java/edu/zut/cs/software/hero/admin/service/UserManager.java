package edu.zut.cs.software.hero.admin.service;

import java.util.List;


import edu.zut.cs.software.hero.admin.domain.User;
import edu.zut.cs.software.hero.base.service.GenericManager;

public interface UserManager extends GenericManager<User, Long> {
	List<User> findAll();
	User findbyUsername(String username);
}
