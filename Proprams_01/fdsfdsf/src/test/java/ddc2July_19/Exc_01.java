package ddc2July_19;

import java.io.File;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exc_01 {
  @Test
  public void f() throws IOException   {
	  
	  XSSFWorkbook workbook =        new XSSFWorkbook();
	  FileOutputStream out = new FileOutputStream( new File("Selenium TOC05.xlsx"));
	  workbook.write(out);
//	  workbook.wri
//	  out.close();
	  System.out.println("writing success");
  }
}
