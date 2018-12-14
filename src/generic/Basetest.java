package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Autoconstant {
	public WebDriver driver;

	@BeforeMethod
	public void openapp() {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.get(Property.getdata(propertyfilepath, "url"));
	}

	@AfterMethod
	public void closeapp(ITestResult r) {
		String t = r.getName();
		int status = r.getStatus();
		if(status==2)
		{
			Photo.getphoto(driver,photopath, t);
		}
		else
		{
			Reporter.log("dnt take photo");
		}
		driver.close();
	}

}
