package domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import factory.FactorySetup;

public class PageSetup extends Page{

	FactorySetup fs;
	public PageSetup(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		fs=new FactorySetup(driver);
	}
	
	public void waitForImageToLoad() {
		w.until(ExpectedConditions.visibilityOf(fs.getFirstImg()));
	}

}
