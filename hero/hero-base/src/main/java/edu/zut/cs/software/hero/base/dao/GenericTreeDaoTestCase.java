package edu.zut.cs.software.hero.base.dao;

import java.io.Serializable;

import edu.zut.cs.software.hero.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.hero.base.dao.GenericTreeDao;
import edu.zut.cs.software.hero.base.domain.BaseTreeEntity;

public class GenericTreeDaoTestCase <PK extends Serializable, T extends BaseTreeEntity<T>, M extends GenericTreeDao<T, PK>>
extends GenericDaoTestCase<PK, T, M>{

}
