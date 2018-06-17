package edu.zut.cs.software.hero.message.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.message.domain.Message;
import edu.zut.cs.software.hero.message.service.MessageManager;
import edu.zut.cs.software.hero.user.domain.Gender;
import edu.zut.cs.software.hero.user.domain.User;
import edu.zut.cs.software.hero.user.service.UserManager;
import edu.zut.cs.software.hero.user.service.UserManagerTest;

public class MessageEntityGenerator extends GenericGenerator {
	List<Message> messageList;

	MessageManager messageManager;

	@Autowired
	public void setStudentManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}

	@Before
	public void setUp() throws Exception {
		this.messageList = new ArrayList<Message>();
		InputStream input = MessageManagerTest.class.getResourceAsStream("/hero.message.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Message s = new Message();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					//if(j==0)break;
					if (j == 1)
						s.setUsername(value);
					if (j == 2)
						s.setFoodname(value);
					if (j == 3)
						s.setProductname(value);
				}
			}
			this.messageList.add(s);
		}
	}

	@Test
	public void test() {
		this.messageManager.save(this.messageList);
		List<Message> result = this.messageManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Message> result=" + result); //$NON-NLS-1$
		}
	}
}
