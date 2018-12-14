package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Homepage  extends Basepage {
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement serachbtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public void serachtxtbox(String product)
	{
		search.sendKeys(product);
	}
	
	
	public void searchbutton()
	{
		serachbtn.click();
	}
}
