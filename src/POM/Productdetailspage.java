package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Productdetailspage   extends Basepage{
	@FindBy(id="add-to-cart-button")
	private WebElement cart;
	
	public Productdetailspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void cartbtn()
	{
		 cart.click();
	}

}
