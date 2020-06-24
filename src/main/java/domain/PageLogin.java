package domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.FactoryLogin;

public class PageLogin extends Page {
	WebDriverWait wait;
	FactoryLogin lf;
	
	public PageLogin(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 5);
		lf=new FactoryLogin(driver);
	}
	
	public void fillLoginFields(String username, String pass) {
		lf.getInputUsername().sendKeys(username);
		lf.getInputPassword().sendKeys(pass);
		lf.getBtnLogin().click();

	}
}
