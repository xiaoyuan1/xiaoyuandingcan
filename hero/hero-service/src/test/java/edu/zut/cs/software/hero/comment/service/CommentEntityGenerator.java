package edu.zut.cs.software.hero.comment.service;

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

import edu.zut.cs.software.hero.comment.domain.Comment;
import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.comment.service.CommentManager;
import edu.zut.cs.software.hero.user.service.UserManagerTest;

public class CommentEntityGenerator extends GenericGenerator {
	List<Comment> commentList;

	CommentManager commentManager;

	@Autowired
	public void setCommentManager(CommentManager commentManager) {
		this.commentManager = commentManager;
	}

	@Before
	public void setUp() throws Exception {
		this.commentList = new ArrayList<Comment>();
		InputStream input = UserManagerTest.class.getResourceAsStream("/hero.comment.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Comment s = new Comment();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					//if(j==0)break;
					if (j == 1)
					s.setComment(value);
				}
			}
			this.commentList.add(s);
		}
	}
	@Test
	public void test() {
		this.commentManager.save(this.commentList);
		List<Comment> result = this.commentManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Comment> result=" + result); //$NON-NLS-1$
		}
	}
}
