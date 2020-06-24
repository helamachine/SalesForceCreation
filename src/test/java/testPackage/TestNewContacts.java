package testPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import domain.PageContacts;
import utility.ExcelUtils;

public class TestNewContacts extends Base{
	
	PageContacts pc;
	@BeforeClass
	public void beforeClass() {
		
		pc= new PageContacts(driver);
		driver.get(prop.getProperty("url"));
		
		login();
	}
	
	@Test(priority=0)
	public void moveToContactsTab() {
		pc.clickTab("Contact");
		pc.clickNewBtn();
	}
	@Test(dependsOnMethods={"moveToContactsTab"}, dataProvider = "getData")
	public void createContacts() {
		
	}
	
	@DataProvider (name="getData")
	public Object[][] getData() {
		ExcelUtils excel=new ExcelUtils("ContactData");
		return excel.getSheetData();
	}
}
