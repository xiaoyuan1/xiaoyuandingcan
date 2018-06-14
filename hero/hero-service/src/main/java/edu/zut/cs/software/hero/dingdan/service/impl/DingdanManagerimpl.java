package edu.zut.cs.software.hero.dingdan.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.hero.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.software.hero.dingdan.dao.DingdanDao;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;
import edu.zut.cs.software.hero.dingdan.service.DingdanManager;


@Service("dingdanManager")
@Transactional
public class DingdanManagerimpl extends GenericManagerImpl<Dingdan, Long> implements DingdanManager {

	DingdanDao dingdanDao;

	@Autowired
	public void setGroupDao(DingdanDao groupDao) {
		this.dingdanDao = groupDao;
		this.dao = this.dingdanDao;
	}


}
