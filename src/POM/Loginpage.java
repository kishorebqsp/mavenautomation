package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Loginpage   extends Basepage{
	
	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement signinbtn;
	
	
	@FindBy(id="ap_email")
	private WebElement emailaddress;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	
	@FindBy(id="signInSubmit")
	private WebElement loginbtn;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void signbutton()
	{
		signinbtn.click();
	}
	
	public void emailaddresstb(String email)
	{
		emailaddress.sendKeys(email);
	}

	public void passwordtb(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void loginbutton()
	{
		loginbtn.click();
	}
}
