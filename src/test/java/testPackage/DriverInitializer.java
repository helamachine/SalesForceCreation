package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import domain.PageLogin;
import utility.MainUtility;

public class DriverInitializer {
	
	
	public static WebDriver getDriverInitializer() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Martin\\Documents\\PROGRAMACION\\SELENIUM\\ExeBrowser\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver(MainUtility.setOptions());
		return driver;
	}
}
