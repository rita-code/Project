package excel_Read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_call {
public static FileInputStream a;
public static XSSFWorkbook b;
public static XSSFSheet c;
public static String getStringData(int x,int y) throws IOException {
	a= new FileInputStream("C:\\Users\\jones\\Downloads\\Sal_DET.xlsx");
	b=new XSSFWorkbook(a);
	c=b.getSheet("Sheet1");
	XSSFRow r=c.getRow(x);
	XSSFCell c=r.getCell(y);
	return c.getStringCellValue();
}
	public static String getStringData1(int x, int z) throws IOException
	{
		a=new FileInputStream("C:\\Users\\jones\\Downloads\\Sal_DET.xlsx");
		b=new XSSFWorkbook(a);
		c=b.getSheet("Sheet1");
		XSSFRow r=c.getRow(x);
		XSSFCell c=r.getCell(z);
		return c.getStringCellValue();
		
		}
	
	public static String getintData1(int x, int v) throws IOException
	{
		a=new FileInputStream("C:\\Users\\jones\\Downloads\\Sal_DET.xlsx");
		b=new XSSFWorkbook(a);
		c=b.getSheet("Sheet1");
		XSSFRow r=c.getRow(x);
		XSSFCell c=r.getCell(v);
		int u=(int) c.getNumericCellValue();
		return String.valueOf(u);
		
	
		
		
	}
}	








