package edu.zut.cs.software.hero.user.service;

import java.util.List;

import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.user.domain.User;

public interface UserManager extends GenericManager<User, Long> {
	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<User> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<User> findByFullname(String fullname);
}
