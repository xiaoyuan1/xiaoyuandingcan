package edu.zut.cs.software.hero.admin.service;

import java.util.List;

import edu.zut.cs.software.hero.admin.domain.Foot;
import edu.zut.cs.software.hero.base.service.GenericManager;

public interface FootManager extends GenericManager<Foot, Long> {

	List<Foot> findAll();

	Foot findbyFootname(String footname);
}
