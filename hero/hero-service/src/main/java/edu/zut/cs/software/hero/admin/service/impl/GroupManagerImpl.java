package edu.zut.cs.software.hero.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.software.hero.admin.dao.GroupDao;
import edu.zut.cs.software.hero.admin.domain.Group;
import edu.zut.cs.software.hero.admin.service.GroupManager;
import edu.zut.cs.software.hero.base.service.impl.GenericTreeManagerImpl;

@Service("groupManager")
@Transactional
public class GroupManagerImpl extends GenericTreeManagerImpl<Group, Long> implements GroupManager {

	GroupDao groupDao;

	@Autowired
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
		this.treeDao = this.groupDao;
		this.dao = this.treeDao;
	}

}
