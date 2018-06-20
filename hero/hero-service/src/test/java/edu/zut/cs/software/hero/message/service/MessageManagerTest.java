package edu.zut.cs.software.hero.message.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.service.GenericManagerTestCase;
import edu.zut.cs.software.hero.message.domain.Message;
import edu.zut.cs.software.hero.message.service.MessageManager;

public class MessageManagerTest extends GenericManagerTestCase<Long, Message, MessageManager> {

	MessageManager messageManager;

	public MessageManagerTest() {
		super(Message.class);
	}

	@Autowired
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
		this.manager = this.messageManager;
	}

	@Before
	public void setUp() throws Exception {
		Message message = new Message();
		message.setFoodname(null);
		message.setProductname(null);
		message.setUsername(null);
		this.entity = this.manager.save(message);
	}

	@Test
	public void testFindByFullname() {
		List<Message> result = this.messageManager.findByFullname(null);
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals(null, result.get(0).getEntityName());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getFoodname();
		List<Message> result = this.messageManager.findByCode(postcode);
		assertEquals(postcode, result.get(0).getFoodname());

	}

}
