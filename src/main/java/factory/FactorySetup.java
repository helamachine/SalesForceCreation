package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.PageSetupConstants;

public class FactorySetup {
	@FindBy (xpath = PageSetupConstants.firstImg) private WebElement firstImg;

	public FactorySetup(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getFirstImg() {
		return firstImg;
	}
	
}
