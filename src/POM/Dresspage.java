package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Dresspage extends Basepage{
	@FindBy(xpath="//h2[@data-attribute='Women Long Sleeve T-Shirt Dress Pleated Swing Dress with Pockets']")
	private WebElement dress;
	
	public Dresspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void dressselected()
	{
		dress.click();
	}
}
