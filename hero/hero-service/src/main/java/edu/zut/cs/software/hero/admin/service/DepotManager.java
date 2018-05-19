package edu.zut.cs.software.hero.admin.service;

import java.util.List;

import edu.zut.cs.software.hero.admin.domain.Depot;
import edu.zut.cs.software.hero.base.service.GenericManager;

public interface DepotManager extends GenericManager<Depot, Long> {
	
	List<Depot> findAll();

	Depot findbyDepotname(String depotname);
}
