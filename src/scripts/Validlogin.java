package scripts;


import org.testng.annotations.Test;

import POM.Cartpage;
import POM.Dresspage;
import POM.Homepage;
import POM.Loginpage;
import POM.Productdetailspage;
import generic.Autoconstant;
import generic.Basetest;
import generic.Property;

public class Validlogin extends Basetest{

	@Test(priority=2)
	public void valid(){
		
		Loginpage l=new Loginpage(driver);
		l.signbutton();
		l.emailaddresstb(Property.getdata(propertyfilepath,"emailaddress"));
		l.passwordtb(Property.getdata(propertyfilepath,"password"));
		l.loginbutton();
		
		Homepage h=new Homepage(driver);
		h.serachtxtbox(Property.getdata(propertyfilepath,"product"));
		h.searchbutton();
		
		Dresspage d=new Dresspage(driver);
		d.dressselected();
		
		Productdetailspage p=new Productdetailspage(driver);
		p.cartbtn();
		
		Cartpage c=new Cartpage(driver);
		c.proceedbtn();
		

	}

}
