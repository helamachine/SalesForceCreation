package constants;import org.openqa.selenium.support.FindBy;

public class PageConstants {
	
	public static final String inputSearchAppBox = "//*[@class = 'slds-input']";
	
	
	public static final String navAccount = "//*[@id='Account']";
	
	//BUTTONS
	public static final String btnCancel = "//div[contains(@class,'button-container-inner')]/button/span[text()='Cancel']/parent::button";
	public static final String btnSaveAndNew = "//div[contains(@class,'button-container-inner')]/button/span[text()='Save & New']/parent::button";
	public static final String btnSearchAppBox = "*[class = 'slds-icon-waffle']";
	
	public static final String btnNewAccount = "//*[@title = 'New']";
	//CALENDAR
	public static final String calendarDate = "//a[contains(@class, 'datePicker')]";
	public static final String calendarYear = "//select[contains(@class,'slds-select')]";
	public static final String btnCalendarNextMonth="//a[@title='Go to next month']";
	public static final String calendarMonth = "//h2[@class='monthYear']";
	public static final String btnCalendarPrevMonth="//a[@title='Go to previous month']";
	public static final String breadCrumbs = "//span[contains(@class, 'forceBreadCrumbItem')]";
	
	//REPLACEABLE
	public static final String xpathCalendarTextDays = "//td[@class='uiDayInMonthCell']/span[text()='$DayText']";
	public static final String xpathTab="//header[@id='oneHeader']/div[@class='bBottom']/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[@data-id='$tab']";


	public static final String xpathImg = "//img[contains(@title,'$title')]";


	
	
}
