package domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import factory.FactoryAccount;
import utility.MainUtility;

public class PageAccount extends Page {

	FactoryAccount af;
	WebDriver driver;

	public PageAccount(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		w = new WebDriverWait(driver, 10);
		this.af = new FactoryAccount(driver);
		this.driver = driver;
	}

	public void fillFields(String accountName, String rating, String billingStreet, String date) {
		w.until(ExpectedConditions.visibilityOf(af.getInputAccount())).sendKeys(accountName);

		af.getDdMenuRating().click();
		af.getDdRating(rating).click();

		MainUtility.scrollToViewElement(driver, af.getBillingStreet());
		af.getBillingStreet().sendKeys(billingStreet);
		setCalendarData(date);
		try {
			Thread.sleep(4000);
		} catch (Exception ex) {
			System.out.println("Error al esperar");
		}
	}

}
