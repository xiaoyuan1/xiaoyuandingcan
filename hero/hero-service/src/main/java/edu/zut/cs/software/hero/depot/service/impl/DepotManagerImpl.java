package edu.zut.cs.software.hero.depot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.hero.depot.dao.DepotDao;
import edu.zut.cs.software.hero.depot.domain.Depot;
import edu.zut.cs.software.hero.depot.service.DepotManager;

@Component
public class DepotManagerImpl extends GenericManagerImpl<Depot, Long> implements DepotManager {
	DepotDao depotDao;

	@Autowired
	public void setDepotDao(DepotDao depotDao) {
		this.depotDao = depotDao;
		this.dao = this.depotDao;
	}

	@Override
	public Depot findbyDepotname(String depotname) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
