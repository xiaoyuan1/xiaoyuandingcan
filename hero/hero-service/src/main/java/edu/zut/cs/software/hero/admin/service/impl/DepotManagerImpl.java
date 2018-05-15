package edu.zut.cs.software.hero.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.admin.dao.DepotDao;
import edu.zut.cs.software.hero.admin.domain.Depot;
import edu.zut.cs.software.hero.admin.service.DepotManager;
import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;

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
