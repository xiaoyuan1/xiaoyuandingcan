package edu.zut.cs.software.hero.foot.service;

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


import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.user.service.UserManagerTest;

/**
 *  Entity Generator for teach package.
 * @author liwenbo
 *
 */
public class FootEntityGenerator extends GenericGenerator {

	List<Foot> footList;

	FootManager footManager;

	@Autowired
	public void setFootManager(FootManager footManager) {
		this.footManager = footManager;
	}

	@Before
	public void setUp() throws Exception {
		this.footList = new ArrayList<Foot>();
		InputStream input = UserManagerTest.class.getResourceAsStream("/hero_foot.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Foot s = new Foot();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 1)
						s.setShop_id(Integer.parseInt(value));
					/*if (j == 2)
						s.setShop_id(Integer.parseInt(value));*/
					if (j == 2)
						s.setProduct_name(value);
					if (j == 3)
						s.setProduct_price(value);
					if (j == 4)
						s.setProduct_introduce(value);
					if (j == 5)
						s.setProduct_state(Boolean.parseBoolean(value));
					if (j == 6)
						s.setProduct_volume(value);
					if (j == 7)
						s.setProduct_biaohao(value);
				}
			}
			this.footList.add(s);
		}
	}

	@Test
	public void test() {
		this.footManager.save(this.footList);
		List<Foot> result = this.footManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Foot> result=" + result); //$NON-NLS-1$
			
		}
	}

}
