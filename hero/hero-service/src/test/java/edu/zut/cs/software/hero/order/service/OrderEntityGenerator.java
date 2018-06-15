package edu.zut.cs.software.hero.order.service;

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
import edu.zut.cs.software.hero.order.domain.Order;
import edu.zut.cs.software.hero.user.domain.Gender;
import edu.zut.cs.software.hero.user.domain.User;
import edu.zut.cs.software.hero.user.service.UserManager;
import edu.zut.cs.software.hero.user.service.UserManagerTest;

public class OrderEntityGenerator extends GenericGenerator{
	List<Order> orderList;

	OrderManager orderManager;

	@Autowired
	public void setOrderManager(OrderManager orderManager) {
		this.orderManager =orderManager;
	}

	@Before
	public void setUp() throws Exception {
		this.orderList = new ArrayList<Order>();
		InputStream input = OrderManagerTest.class.getResourceAsStream("/hero.order.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Order s = new Order();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					//if(j==0)break;
					if (j == 0)
						s.setOrder_Aprice(value);
					if (j == 1)
						s.setOrder_Acost(value);
					if(j==2)
						s.setOrder_Aprofit(value);
				}
			}
			this.orderList.add(s);
		}
	}

	@Test
	public void test() {
		this.orderManager.save(this.orderList);
		List<Order> result = this.orderManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Order> result=" + result); //$NON-NLS-1$
		}
	}
}