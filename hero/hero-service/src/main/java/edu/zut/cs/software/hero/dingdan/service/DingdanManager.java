package edu.zut.cs.software.hero.dingdan.service;


import java.util.List;

import edu.zut.cs.software.hero.base.service.GenericTreeManager;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;

/**
 * 
 * @author zhangyaohui
 *
 */
public interface DingdanManager extends GenericTreeManager<Dingdan,Long>{

	/**
	 * get dingdan list by given orderid
	 *
	 * @param orderid
	 * @return
	 */
	List<Dingdan> findByOrderid(String orderxinxi);

	/**
	 * 
	 * @param orderxinxi
	 * @return
	 */
	List<Dingdan> findByOrderxinxi(String orderxinxi);
}
