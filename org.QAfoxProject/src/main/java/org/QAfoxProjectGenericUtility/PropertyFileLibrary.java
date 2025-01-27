package org.QAfoxProjectGenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import com.google.j2objc.annotations.Property;



/*
 * this class provides reusable method to perform CURD in property file
 */
public class PropertyFileLibrary {
	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;
	Properties property;
	
	
	public void initPropertyFile(String propertyFilePath) 
	{

		// Convert The physical file into java undersatble
		try 
		{
			fis = new FileInputStream(PathConstant.Property_path);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		property = new Properties();
		
		try {
			property.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public String readData(String key)
	{
		return property.getProperty(key);
		
	}
	
	
	
	
	public void writeData(String key, String value)
	{
		//enter the data
		property.put(key, value);
		
		//create instance for fileoutputstreamclass
		try {
			fos=new FileOutputStream(PathConstant.Property_path);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		//store the data
		try {
			fos=new FileOutputStream("Update the new key-value successfully");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public void displayProperty(String key)
	{
	     String data = property.getProperty(key);
	     
	     //Display the data
	     Reporter.log(key+":"+data,true);
	}
	
	
	
	
	public void updateData(String key, String value) 
	{
		//Enter the data
		
		property.put(key, value);
		
		//Create instance for FileOutputStream class
		
		try {
			fos = new FileOutputStream(PathConstant.Property_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Store the data
		try {
			property.store(fos, "Update the New Key - Value Sucessfully ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
}
