package edu.zut.cs.software.hero.push.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.push.domain.Push;
import edu.zut.cs.software.hero.user.service.UserManagerTest;
/**
 * @author zengzexing
 * 向数据库中写入数据
 * 
 * */

public class PushEntityGenerator extends GenericGenerator {

	List<Push> pushList;

	PushManager pushManager;

	@Autowired
	public void setPushManager(PushManager pushManager) {
		this.pushManager = pushManager;
	}

	@Before
	public void setUp() throws Exception {
		this.pushList = new ArrayList<Push>();
		InputStream input = UserManagerTest.class.getResourceAsStream("/hero.push.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Push s = new Push();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
				String value = row.getCell(j).getStringCellValue().trim();
					/*if(j==0)
						s.setDate(value);*/
					if (j ==1)
						s.setFood(value);
					if (j == 2)
						s.setMessage(value);
					if (j == 3)
						s.setLucky(value);
				}
			}
			this.pushList.add(s);
		}
	}

	@Test
	public void test() {
		this.pushManager.save(this.pushList);
		List<Push> result = this.pushManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Push> result=" + result); 
		}
	}

}
