package edu.zut.cs.software.hero.message.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.hero.message.dao.MessageDao;
import edu.zut.cs.software.hero.message.domain.Message;
import edu.zut.cs.software.hero.message.service.MessageManager;

@Component
public class MessageManagerImpl extends GenericManagerImpl<Message, Long> implements MessageManager{
	MessageDao messageDao;

	@Override
	public List<Message> findByCode(String postcode) {

		// 创建查询条件数据对象
		Message queryObject = new Message();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setProductname(postcode);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
				.withMatcher("postcode", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
		// 创建实例并查询
		Example<Message> ex = Example.of(queryObject, matcher);
		List<Message> result = dao.findAll(ex);
		return result;
	}

	@Override
	public List<Message> findByFullname(String fullname) {
		// 创建查询条件数据对象
		Message queryObject = new Message();
		queryObject.setFoodname(fullname);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("fullname", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<Message> ex = Example.of(queryObject, matcher);
		List<Message> result = dao.findAll(ex);
		return result;
	}

	@Autowired
	public void setStudentDao(MessageDao messageDao) {
		this.messageDao = messageDao;
		this.dao = this.messageDao;
	}
}
