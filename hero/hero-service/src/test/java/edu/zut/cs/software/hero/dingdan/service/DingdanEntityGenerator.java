package edu.zut.cs.software.hero.dingdan.service;

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
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;

public class DingdanEntityGenerator extends GenericGenerator {

	List<Dingdan> dingdanList;

	DingdanManager dingdanManager;

	@Autowired
	public void setDingdanManager(DingdanManager dingdanManager) {
		this.dingdanManager = dingdanManager;
	}

	@Before
	public void setUp() throws Exception {
		this.dingdanList = new ArrayList<Dingdan>();
		InputStream input = DingdanManagerTest.class.getResourceAsStream("/javaee_dingdan_software.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Dingdan s = new Dingdan();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 0)
						s.setOrderid(value);
					if (j == 1)
						s.setOrdertime(value);
					if (j == 2)
						s.setOrderxinxi(value);
					if (j == 3)
						s.setOrderjiage(value);
					if (j == 4)
						s.setOrderlianxiren(value);
					/*if (j == 7)
						if (StringUtils.equalsIgnoreCase("男", value)) {
							s.setGender(Gender.Male);
						} else if (StringUtils.equalsIgnoreCase("女", value)) {
							s.setGender(Gender.Female);
						}*/
				}
			}
			this.dingdanList.add(s);
		}
	}

	@Test
	public void test() {
		this.dingdanManager.save(this.dingdanList);
		List<Dingdan> result = this.dingdanManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Dingdan> result=" + result); //$NON-NLS-1$
		}
	}

}
