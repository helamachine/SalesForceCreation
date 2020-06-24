package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FactoryContact {
	
	public FactoryContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
