package edu.zut.cs.software.hero.depot.service;

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
import edu.zut.cs.software.hero.depot.domain.Depot;
import edu.zut.cs.software.hero.user.service.UserManagerTest;

public class DepotEntityGenerator extends GenericGenerator {
	List<Depot> depotList;

	DepotManager depotManager;

	@Autowired
	public void setDepotManager(DepotManager depotManager) {
		this.depotManager = depotManager;
	}

	@Before
	public void setUp() throws Exception {
		this.depotList = new ArrayList<Depot>();
		InputStream input = UserManagerTest.class.getResourceAsStream("/hero.depot.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Depot s = new Depot();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					//if(j==0)break;
					if (j == 1)
						s.setCode(value);
					if (j == 2)
						s.setCaipin(value);
					if (j == 3)
						s.setRaw(value);
				}
			}
			this.depotList.add(s);
		}
	}

	@Test
	public void test() {
		this.depotManager.save(this.depotList);
		List<Depot> result = this.depotManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Depot> result=" + result); //$NON-NLS-1$
		}
	}
}
