package scripts;

import org.testng.annotations.Test;

import POM.Loginpage;
import generic.Basetest;

public class invalidlogin extends Basetest{
	
	@Test(priority=1)
	public void invalid()
	{
		Loginpage l=new Loginpage(driver);
		l.signbutton();
		l.emailaddresstb(fgehfyugfjjh);
	}
	
	

}

