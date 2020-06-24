package testPackage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import domain.PageLogin;
import utility.ReadObject;

public class Base {
	WebDriver driver;
	PageLogin pl;
	Properties prop;
	
	public Base() {
		this.driver=DriverInitializer.getDriverInitializer();
		pl=new PageLogin(driver);
		prop=ReadObject.getProperties();
		
	}
	
	public void login() {
		pl.fillLoginFields(prop.getProperty("emailStandardUser"), prop.getProperty("password"));
		
	}
	
}
