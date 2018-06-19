package edu.zut.cs.software.hero.foot.service;

import java.util.List;


import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.service.GenericManager;

public interface FootManager extends GenericManager<Foot, Long> {
/**
 * Defining logical methods
 * @param product_name
 * @return
 */
	//List<Foot> findAll();
	List<Foot> findByproduct_name(String product_name);
	List<Foot> findByproduct_biaohao(String fullname);
	//Foot findbyFootname(String footname);
}
