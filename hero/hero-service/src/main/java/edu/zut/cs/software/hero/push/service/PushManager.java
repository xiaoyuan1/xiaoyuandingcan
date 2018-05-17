package edu.zut.cs.software.hero.push.service;

import java.util.List;

import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.push.domain.Push;

public interface PushManager extends GenericManager<Push, Long> {
	List<Push> findAll();

	Push findbyPushname(String pushname);
}
