package edu.zut.cs.software.hero.dingdan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.software.hero.dingdan.dao.DingdanDao;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;
import edu.zut.cs.software.hero.dingdan.service.DingdanManager;

/*import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.software.hero.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.software.hero.dingdan.dao.DingdanDao;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;
import edu.zut.cs.software.hero.dingdan.service.DingdanManager;


@Service("dingdanManager")
@Transactional
public class DingdanManagerimpl extends GenericTreeManagerImpl<Dingdan, Long> implements DingdanManager {

	DingdanDao dingdanDao;

	@Autowired
	public void setGroupDao(DingdanDao groupDao) {
		this.dingdanDao = groupDao;
		this.treeDao = this.dingdanDao;
		this.dao = this.treeDao;
	}


}*/

@Component
public  class DingdanManagerimpl extends GenericTreeManagerImpl<Dingdan, Long> implements DingdanManager {

	DingdanDao dingdanDao;

	@Override
	public List<Dingdan> findByOrderid(String postorderid) {

		// 创建查询条件数据对象
		Dingdan queryObject = new Dingdan();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setOrderid(postorderid);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
				.withMatcher("postorderid", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
		// 创建实例并查询
		Example<Dingdan> ex = Example.of(queryObject, matcher);
		List<Dingdan> result = dao.findAll(ex);
		return result;
	}

	@Override
	public List<Dingdan> findByOrderxinxi(String orderxinxi) {
		// 创建查询条件数据对象
		Dingdan queryObject = new Dingdan();
		queryObject.setOrderxinxi(orderxinxi);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("orderxinxi", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<Dingdan> ex = Example.of(queryObject, matcher);
		List<Dingdan> result = dao.findAll(ex);
		return result;
	}

	@Autowired
	public void setStudentDao(DingdanDao dingdanDao) {
		this.dingdanDao = dingdanDao;
		this.dao = this.dingdanDao;
	}

}
