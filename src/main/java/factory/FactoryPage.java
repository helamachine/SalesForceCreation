package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.PageConstants;

public class FactoryPage {
	WebDriver driver;
	@FindBy(css = PageConstants.btnSearchAppBox) private WebElement appIcon;
	@FindBy(xpath = PageConstants.inputSearchAppBox) private WebElement appSearchBox;
	@FindBy(xpath = PageConstants.btnNewAccount) private WebElement buttonNew;
	@FindBy(xpath = PageConstants.navAccount) private WebElement navAccount;
	@FindBy(xpath = PageConstants.calendarDate) private WebElement calendarDate;
	@FindBy(xpath = PageConstants.calendarYear) private WebElement calendarYear;
	@FindBy(xpath = PageConstants.calendarMonth) private WebElement calendarMonth;
	@FindBy(xpath = PageConstants.btnCalendarNextMonth) private WebElement btnCalendarNextMonth;
	@FindBy(xpath = PageConstants.btnCalendarPrevMonth) private WebElement btnCalendarPrevMonth;
	@FindBy(xpath = PageConstants.btnCancel) private WebElement btnCancel;
	@FindBy(xpath = PageConstants.btnSaveAndNew) private WebElement btnSaveAndNew;
	@FindBy(xpath = PageConstants.breadCrumbs) private WebElement breadCrumbs;
	
	public FactoryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	public WebElement getBtnSaveAndNew() {
		return btnSaveAndNew;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCalendarDate() {
		return calendarDate;
	}
	public WebElement getCalendarYear() {
		return calendarYear;
	}
	public WebElement getCalendarMonth() {
		return calendarMonth;
	}
	public WebElement getBtnCalendarNextMonth() {
		return btnCalendarNextMonth;
	}
	public WebElement getBtnCalendarPrevMonth() {
		return btnCalendarPrevMonth;
	}
	public WebElement getAppIcon() {
		return appIcon;
	}
	public WebElement getAppSearchBox() {
		return appSearchBox;
	}
	public WebElement getButtonNew() {
		return buttonNew;
	}
	public WebElement getNavAccount() {
		
		return navAccount;
	}
	public WebElement getBreadCrumbs() {
		return breadCrumbs;
	}
	
	//REPLACEABLE
	
	public WebElement getXpathCalendarTextDays(String day) {
		WebElement ret=driver.findElement(By.xpath(PageConstants.xpathCalendarTextDays.replace("$DayText", day)));
		return ret;
	}
	public WebElement getXpathTab(String tab) {
		WebElement ret=driver.findElement(By.xpath(PageConstants.xpathTab.replace("$tab", tab)));
		return ret;
	}
	public WebElement getGenericImg(String tab) {
		WebElement ret=driver.findElement(By.xpath(PageConstants.xpathImg.replace("$title", tab)));
		return ret;
	}
	
}
