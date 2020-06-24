package domain;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.FactoryPage;

public abstract class Page {

	WebDriverWait w;
	FactoryPage fp;
	WebDriver driver;

	public Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		w = new WebDriverWait(driver, 20);
		fp = new FactoryPage(driver);
		this.driver=driver;
	}

	public void goAccount() {
		fp.getAppIcon().click();
		w.until(ExpectedConditions.elementToBeClickable(fp.getAppSearchBox())).sendKeys("Accounts");
		
		w.until(ExpectedConditions.visibilityOf(fp.getNavAccount()));
		fp.getAppSearchBox().sendKeys(Keys.ARROW_DOWN);
		fp.getAppSearchBox().sendKeys(Keys.ENTER);
	}

	public void clickNewBtn() {
		w.until(ExpectedConditions.elementToBeClickable(fp.getButtonNew())).click();
	}

	public void clickTab(String tab) {
		w.until(ExpectedConditions.elementToBeClickable(fp.getXpathTab(tab))).click();
		w.until(ExpectedConditions.visibilityOf(fp.getGenericImg(tab)));
	}
	public void saveAndNew() {
		fp.getBtnSaveAndNew().click();
	}
	
	public void setCalendarData(String date) {
		String[] splitDate = date.split("/");
		for (int i = 0; i < splitDate.length; i++) {
			if (splitDate[i].indexOf("0") == 0) {
				splitDate[i] = splitDate[i].replace("0", "");
			}
		}// day/month/year
		String day=splitDate[0];
		int month=Integer.parseInt(splitDate[1]);
		String year=splitDate[2];
		
		fp.getCalendarDate().click();

		Select s = new Select(fp.getCalendarYear());
		s.selectByValue(year);

		String actualMonth = fp.getCalendarMonth().getText();

		ArrayList<String> months = new ArrayList<String>();
		months.add("january");
		months.add("february");
		months.add("march");
		months.add("april");
		months.add("may");
		months.add("june");
		months.add("july");
		months.add("august");
		months.add("september");
		months.add("october");
		months.add("november");
		months.add("december");

		String monthName=months.get(month-1);
		int indexOfActualMonth = months.indexOf(actualMonth.toLowerCase());
		int indexOfDesiredMonth = months.indexOf(monthName);

		while (!fp.getCalendarMonth().getText().equalsIgnoreCase(monthName)) {
			if (indexOfActualMonth > indexOfDesiredMonth) {
				fp.getBtnCalendarNextMonth().click();
			} else {
				fp.getBtnCalendarPrevMonth().click();
			}
		}

		fp.getXpathCalendarTextDays(day).click();
	}
	public static String[] splitDate(String date) {
		String[] ret = date.split("/");
		for (int i = 0; i < ret.length; i++) {
			if (ret[i].indexOf("0") == 0) {
				ret[i] = ret[i].replace("0", "");
			}
		}
		return ret;
	}
}
