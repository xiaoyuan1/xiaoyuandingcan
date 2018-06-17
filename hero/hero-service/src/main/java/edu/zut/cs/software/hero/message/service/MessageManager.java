package edu.zut.cs.software.hero.message.service;


import java.util.List;
import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.message.domain.Message;
public interface MessageManager  extends GenericManager<Message, Long> {
	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Message> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<Message> findByFullname(String fullname);
}