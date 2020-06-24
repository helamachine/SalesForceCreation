package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.PageLoginConstants;

public class FactoryLogin {
	@FindBy (xpath = PageLoginConstants.inputUsername) private WebElement inputUsername;
	@FindBy (xpath = PageLoginConstants.btnLogin) private WebElement btnLogin;
	@FindBy(xpath = PageLoginConstants.inputPassword) private WebElement inputPassword;
	
	public FactoryLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	/*
	private static FactoryLogin var;
	public FactoryLogin getVar() {
		if(var!=null) {
			var=new FactoryLogin();
		}
		return var;
	}*/
	
	public WebElement getInputUsername() {
		return inputUsername;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}
	
}
