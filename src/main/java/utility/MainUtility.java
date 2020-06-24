package utility;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainUtility {
	public static ChromeOptions setOptions() {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		options.setExperimentalOption("prefs", prefs);

		return options;
	}

	public static void scrollToViewElement(WebDriver driver, WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			System.out.println("Error while scrolling to view element info");
			e.printStackTrace();
		}
	}

	public static String getMonthName(int month) {
		String ret=null;
		switch(month) {
		case 1:
			ret="January";
			break;
		case 2:
			ret="February";
			break;
		case 3:
			ret="March";
			break;
		case 4:
			ret="April";
			break;
		case 5:
			ret="May";
			break;
		case 6:
			ret="June";
			break;
		case 7:
			ret="July";
			break;
		case 8:
			ret="August";
			break;
		case 9:
			ret="September";
			break;
		case 10:
			ret="October";
			break;
		case 11:
			ret="November";
			break;
		case 12:
			ret="December";
			break;
		}
		return ret;
	}
}
