package org.QAfoxProjectGenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This Class Provide reusable methods to perform CRUD in excelfile
 * @author Suneetha
 */

public class ExcelFileLibrary 
{
	
	private static final int Column = (Integer) null;
	private static final int Row = 0;
	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;
	DataFormatter df;

	
	
	/**
	 * This Method used to fetch the single Cell data from excel file
	 * @param sheet
	 */
	public String readSingleCellData(String sheet) 
	{

		return wb.getSheet("BasicData").getRow(Row).getCell(Column).getStringCellValue();
	}
	
	
	
	
	

	/**
	 * this method used to fetch the specific column
	 * @param sheet
	 * @param column
	 */
	public ArrayList<Object> readSpecificColumnData(String sheet, int column) 
	{

		// Fetch all data from one specific column-----------from excel file
		int lastrow = wb.getSheet(sheet).getLastRowNum();

		ArrayList<Object> value = new ArrayList<Object>();

		for (int i = 0; i <= lastrow; i++) 
		{
			String Data3 = wb.getSheet(sheet).getRow(i).getCell(1).getStringCellValue();
			value.add(Data3);
		}

		return value;

	}

	
	
	
	/*
	 * this method used to fetch the specific row Data
	 * @param sheet
	 * @param row
	 * @return
	 */
	public ArrayList<Object> readSpecificSingleRowData(String sheet, int row) 
	{
		
		// Fetch all the data from one specific row----from excel file
		int lastcolumn = wb.getSheet(sheet).getRow(row).getLastCellNum();

		ArrayList<Object> value = new ArrayList<Object>();

		for (int j = 0; j < lastcolumn - 1; j++) 
		{
			String data4 = wb.getSheet(sheet).getRow(0).getCell(j).getStringCellValue();
			value.add(data4);
		}

		return value;

	  }
	
	
	
	
	/*
	 * this method used to fetch the specific row Data
	 * @param sheet
	 * @param expectedTestName
	 * @return
	 */
	public Map<String, String> readMultipleRecords(String sheet, String expectedTestName) 
	{

		Map<String, String> map = new HashMap<>();

		Sheet sh = wb.getSheet(sheet);

		for (int i = 0; i <= sh.getLastRowNum(); i++) 
		{
			if (df.formatCellValue(sh.getRow(i).getCell(1)).equals(expectedTestName)) 
			{
				for (int j = i; j < sh.getLastRowNum(); j++) 
				{
					String key = df.formatCellValue(sh.getRow(j).getCell(2));
					String value = df.formatCellValue(sh.getRow(j).getCell(3));
					map.put(key, value);
					if (key.equals("#####"))
						;
					break;
				}
				break;
			}
		}

		return map;
	  }
	
	
	
	
	

	/*
	 * this method used to fetch the display multiple records
	 * @param sheet
	 * @param row
	 * @param column
	 */
	public void displayMultipleRecords(String sheet, int row, int column) 
	{
		int lastrow = wb.getSheet(sheet).getLastRowNum();

		ArrayList<Object> value = new ArrayList<Object>();

		for (int i = 1; i <= lastrow; i++) 
		{
			int lastcolumn = wb.getSheet(sheet).getRow(row).getLastCellNum();
			for (int j = 0; j < lastcolumn; j++) 
			{
				String data5 = wb.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
				System.out.print(data5 + "\t");
				// value.add(data5);
				// System.out.println("Multiple Data");
			}
		}
	}

	
	
	
	
	
	/*
	 * this method used to initializes excel
	 */
	public void initExcel(String excelPath) {

		// Convert The physical file into java undersatble
		try 
		{
			fis = new FileInputStream(PathConstant.EXCELPATH);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2.Create an workbook using workbook factory
		try 
		{
			wb = WorkbookFactory.create(fis);
		} 
		catch (EncryptedDocumentException | IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		//Initialized data formatter
		df=new DataFormatter();
	}
	
	
	
	
	
	/*
	 * this method used to close excel
	 */
	public void closeExcel() {
		try 
		{
			wb.close();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * this method used to write data into one cell into newly created row the cell
	 * @param sheet
	 * @param row
	 * @param column
	 * @param data
	 */
	public void writeSingleData_NewRow(String sheet, int row, int column, String data) 
	{
		//Create new row and create data
		wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);	
		
		//Write data
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * this method used to update cell data into already existing row
	 * in the expected and actual data passed failed, skipped right to update those also we can use this
	 * @param sheet
	 * @param row
	 * @param column
	 * @param data
	 */
    public void updateSingleData_existingRow(String sheet, int row, int column, String data) 
    {
		//Get Row and update data into the cell
		wb.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);
		
		//Write Data
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	
}
