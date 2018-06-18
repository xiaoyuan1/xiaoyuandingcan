package edu.zut.cs.software.hero.user.service;

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
import edu.zut.cs.software.hero.user.domain.Gender;
import edu.zut.cs.software.hero.user.domain.User;
/**
 * @author wanghongfei
 * 向数据库中写入数据
 * 
 * */
public class UserEntityGenerator extends GenericGenerator{
	List<User> userList;

	UserManager userManager;

	@Autowired
	public void setStudentManager(UserManager userManager) {
		this.userManager = userManager;
	}

	@Before
	public void setUp() throws Exception {
		this.userList = new ArrayList<User>();
		InputStream input = UserManagerTest.class.getResourceAsStream("/javaee_student_software.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			User s = new User();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					//if(j==0)break;
					if (j == 1)
						s.setGrade(value);
					if (j == 2)
						s.setMajor(value);
					if (j == 3)
						s.setClazz(value);
					if (j == 5)
						s.setCode(value);
					if (j == 6)
						s.setFullName(value);
					if (j == 7)
						if (StringUtils.equalsIgnoreCase("男", value)) {
							s.setGender(Gender.Male);
						} else if (StringUtils.equalsIgnoreCase("女", value)) {
							s.setGender(Gender.Female);
						}
				}
			}
			this.userList.add(s);
		}
	}

	@Test
	public void test() {
		this.userManager.save(this.userList);
		List<User> result = this.userManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<User> result=" + result); //$NON-NLS-1$
		}
	}
}
