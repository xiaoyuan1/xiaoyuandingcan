package edu.zut.cs.software.hero.depot.service;

import java.util.List;

import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.depot.domain.Depot;
import edu.zut.cs.software.hero.user.domain.User;

public interface DepotManager extends GenericManager<Depot, Long> {
	
	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Depot> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<Depot> findByFullname(String fullname);
}
