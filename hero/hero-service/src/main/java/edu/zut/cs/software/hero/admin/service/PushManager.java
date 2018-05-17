package edu.zut.cs.software.hero.admin.service;

import java.util.List;

import edu.zut.cs.software.hero.admin.domain.Push;
import edu.zut.cs.software.hero.base.service.GenericManager;

public interface PushManager extends GenericManager<Push, Long> {
	List<Push> findAll();

	Push findbyPushname(String pushname);
}
