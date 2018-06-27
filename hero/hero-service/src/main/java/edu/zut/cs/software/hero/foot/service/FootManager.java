package edu.zut.cs.software.hero.foot.service;

import java.util.List;


import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.service.GenericManager;


public interface FootManager extends GenericManager<Foot, Long> {
	/**
	 * 
	 *
	 * @param product_name
	 * @return
	 */
	List<Foot> findByProduct_name(String product_name);

	/**
	 * 
	 * @param product_bianhao
	 * @return
	 */
	List<Foot> findByProduct_bianhao(String product_bianhao);
	/**
	 * 
	 * @param product_bianhao
	 * @return
	 */
	int addProduct(String product_bianhao);
}
