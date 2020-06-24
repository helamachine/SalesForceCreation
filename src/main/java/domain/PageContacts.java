package domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.FactoryContact;

public class PageContacts extends Page{
	FactoryContact fc;
	WebDriver driver;

	public PageContacts(WebDriver driver) {
		super(driver);
		w = new WebDriverWait(driver, 10);
		this.fc = new FactoryContact(driver);
		this.driver = driver;
	}
}
