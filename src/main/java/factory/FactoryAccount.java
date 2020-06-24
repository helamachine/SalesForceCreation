package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.PageAccountConstants;

public class FactoryAccount {
	WebDriver driver;
	
	@FindBy (xpath = PageAccountConstants.inputAccount) private WebElement inputAccount;
	@FindBy (xpath = PageAccountConstants.ddMenuRating) private WebElement ddMenuRating;
	@FindBy (xpath = PageAccountConstants.billingStreet) private WebElement billingStreet;
	
	
	
	


	public FactoryAccount(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	//SINGLETON
	/*private static FactoryAccount var;
	public FactoryAccount getVar() {
		if(var!=null) {
			var=new FactoryAccount();
		}
		return var;
	}*/
	
	



	
	public WebElement getInputAccount() {
		return inputAccount;
	}
	public WebElement getDdMenuRating() {
		return ddMenuRating;
	}
	public WebElement getBillingStreet() {
		return billingStreet;
	}

	
	//REPLACEABLE
	public WebElement getDdRating(String rating) {
		WebElement ret = driver.findElement(By.xpath(PageAccountConstants.xpathDdRating.replace("$TitleRating", rating)));
		return ret;
	}
}
