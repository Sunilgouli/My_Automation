package com.sg.stream.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColourNamesin10thRow {
	public static void main(String[] args) {
		writeColournames();

	}
	private static void writeColournames()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet("colourssheet");
			row=sh.createRow(9);
			for(int i=0;i<20;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue("colour"+i);
				fout=new FileOutputStream("f:\\EXCEL2\\Colour.xlsx");
				wb.write(fout);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

