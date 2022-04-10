package com.sg.stream.assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeyDescription {
	public static void main(String[] args) {
		key1Description();

	}
	
	private static void key1Description()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh3=null;
		Row sh1row=null;
		Row sh3row=null;
		Cell sh1cell=null;
		Cell sh3cell=null;
		try
		{
			fin=new FileInputStream("F:\\EXCEL2\\Book2.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh3=wb.getSheet("Sheet3");
			if(sh3==null)
			{
				sh3=wb.createSheet("Sheet3");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			
			for(int r=0;r<rc;r++)
			{
				sh1row=sh1.getRow(r);
				sh3row=sh3.getRow(r);
				if(sh3row==null)
				{
					sh3row=sh3.createRow(r);
				}
				
				int cc=sh1row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					sh1cell=sh1row.getCell(c);
					sh3cell=sh3row.getCell(c);
					if(sh3cell==null)
					{
						sh3cell=sh3row.createCell(c);
					}
					String data=sh1cell.getStringCellValue();
					sh3cell.setCellValue(data);
				}
			}
			fout=new FileOutputStream("D:\\KartikExcel\\Book2.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}


