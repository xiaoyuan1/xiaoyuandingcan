package edu.zut.cs.software.hero.depot.service;

import java.util.List;

import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.depot.domain.Depot;

public interface DepotManager extends GenericManager<Depot, Long> {
	
	List<Depot> findAll();

	Depot findbyDepotname(String depotname);
}
