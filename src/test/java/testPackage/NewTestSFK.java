package testPackage;
import org.testng.annotations.Test;
import domain.*;
import utility.ExcelUtils;
import utility.MainUtility;
import utility.ReadObject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTestSFK {
	WebDriver driver;
	PageAccount pa;
	PageLogin pl;
	PageSetup ps;
	Properties prop;
	
	@BeforeClass
	public void setLoginKeys() {
		
		this.driver=DriverInitializer.getDriverInitializer();
		pa=new PageAccount(driver);
		pl=new PageLogin(driver);
		ps=new PageSetup(driver);
		prop=ReadObject.getProperties();
		driver.get(prop.getProperty("WebSite"));
	}
	@AfterClass
	public void afterClass() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Test(priority = 0)
	public void testStandardUser() {
		pl.fillLoginFields(prop.getProperty("emailStandardUser"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void testClickNewAccountButton() {
		pa.clickNewBtn();
	}
	
	@Test(priority = 2, dataProvider = "dataProvider")
	public void testCreateAccount(String accountName, String rating, String billingStreet, String calendar) {
		
		
		pa.fillFields(accountName, rating, billingStreet, calendar);
		pa.saveAndNew();
		
	}
	

	@DataProvider(name="dataProvider")
	public Object[][] excelData() {
		ExcelUtils excel=new ExcelUtils("AccountData");
		return excel.getSheetData();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		
	}

	
	
	@BeforeMethod
	public void beforeMethod() {
		
	}
	
	

}
