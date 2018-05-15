package edu.zut.cs.software.hero.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.admin.dao.PushDao;
import edu.zut.cs.software.hero.admin.domain.Push;
import edu.zut.cs.software.hero.admin.service.PushManager;
import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;

@Component
public class PushManagerImpl extends GenericManagerImpl<Push, Long> implements PushManager{

	PushDao pushDao;

	@Autowired
	public void setFootDao(PushDao pushDao) {
		this.pushDao = pushDao;
		this.dao = this.pushDao;
	}
	@Override
	public Push findbyPushname(String pushname) {
		// TODO Auto-generated method stub
		return null;
	}

}
