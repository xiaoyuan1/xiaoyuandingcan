package edu.zut.cs.software.hero.foot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;


import edu.zut.cs.software.hero.Foot.dao.FootDao;
import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.hero.foot.service.FootManager;

@Component
public class FootManagerImpl extends GenericManagerImpl<Foot, Long> implements FootManager {

	FootDao footDao;
/**
 * logical methods realize
 */
	@Override
	public List<Foot> findByProduct_name(String product_name) {

		// 创建查询条件数据对象
		Foot queryObject = new Foot();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setProduct_name(product_name);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
				.withMatcher("product_name", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
		// 创建实例并查询
		Example<Foot> ex = Example.of(queryObject, matcher);
		List<Foot> result = dao.findAll(ex);
		return result;
	}

	@Override
	public List<Foot> findByProduct_bianhao(String product_biaohao) {
		// 创建查询条件数据对象
		Foot queryObject = new Foot();
		queryObject.setProduct_biaohao(product_biaohao);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("product_biaohao", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<Foot> ex = Example.of(queryObject, matcher);
		List<Foot> result = dao.findAll(ex);
		return result;
	}
	@Autowired
	public void setFootDao(FootDao footDao) {
		this.footDao = footDao;
		this.dao = this.footDao;
	}

	@Override
	public int addProduct(String product_bianhao) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
