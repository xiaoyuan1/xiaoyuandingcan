package edu.zut.cs.software.hero.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.admin.dao.FootDao;
import edu.zut.cs.software.hero.admin.domain.Foot;
import edu.zut.cs.software.hero.admin.service.FootManager;
import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;

@Component
public class FootManagerImpl extends GenericManagerImpl<Foot, Long> implements FootManager {

	FootDao footDao;

	@Autowired
	public void setFootDao(FootDao footDao) {
		this.footDao = footDao;
		this.dao = this.footDao;
	}

	@Override
	public Foot findbyFootname(String footname) {
		// TODO Auto-generated method stub
		return null;
	}

}
