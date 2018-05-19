package edu.zut.cs.software.hero.foot.service;

import java.util.List;

import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.service.GenericManager;

public interface FootManager extends GenericManager<Foot, Long> {

	List<Foot> findAll();

	Foot findbyFootname(String footname);
}
