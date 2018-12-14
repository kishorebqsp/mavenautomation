package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Cartpage  extends Basepage{
	@FindBy(id="hlb-ptc-btn-native")
	private WebElement proceed;
	
	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void proceedbtn()
	{
		proceed.click();
	}


}
