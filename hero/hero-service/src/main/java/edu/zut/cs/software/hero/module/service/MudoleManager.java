package edu.zut.cs.software.hero.module.service;

import java.util.List;

import edu.zut.cs.software.hero.module.domain.Module;

public interface MudoleManager {

	List<Module> findByName(String module_name);
}
