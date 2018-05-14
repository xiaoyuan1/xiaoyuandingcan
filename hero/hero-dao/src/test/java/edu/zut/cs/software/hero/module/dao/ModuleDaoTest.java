package edu.zut.cs.software.hero.module.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.dao.GenericTreeDaoTestCase;
import edu.zut.cs.software.hero.module.domain.Module;;

public class ModuleDaoTest extends GenericTreeDaoTestCase<Long, Module, ModuleDao> {

	@Autowired
	ModuleDao moduleDao;

	@Test
	public void testGetRoot() {
		int root_size = 10;
		for (int i = 0; i < root_size; i++) {
			Module module = new Module();
			module.setEntityName("module" + i);
			for (int j = 0; j < 10; j++) {
				Module m = new Module();
				m.setEntityName("module" + i + "_" + j);
				m.setParent(module);
			}
			this.moduleDao.save(module);
		}
		List<Module> roots = this.moduleDao.getRoot();
		assertEquals(root_size, roots.size());
		if (logger.isInfoEnabled()) {
			logger.info("testGetRoot() - List<Module> roots=" + roots); //$NON-NLS-1$
		}

	}
}
