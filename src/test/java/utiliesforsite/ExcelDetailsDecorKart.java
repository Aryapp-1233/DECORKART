package utiliesforsite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDetailsDecorKart
{
	public static String getCellValue(String xl,String sheet,int r,int c)
	{
		try
		{
		   FileInputStream file=new FileInputStream(xl);
		   XSSFWorkbook workbookDk=new XSSFWorkbook(file);
		   XSSFCell cell=workbookDk.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
			
		catch (Exception e) 
		{
		   return "";
		}
		
	}
	public static int getrowcount(String xl,String sheet)
	{
		try
		{
			
			FileInputStream file= new FileInputStream(xl);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			return workbook.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e)
		{
			return 0;
		}
    }
}
