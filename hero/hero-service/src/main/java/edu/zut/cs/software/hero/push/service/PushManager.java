package edu.zut.cs.software.hero.push.service;

import java.util.List;

import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.push.domain.Push;

public interface PushManager extends GenericManager<Push, Long> {
	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Push> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<Push> findByFullname(String fullname);
}
