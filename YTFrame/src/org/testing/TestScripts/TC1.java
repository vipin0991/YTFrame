package org.testing.TestScripts;


import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC1 extends BaseClass {
	
  @Test
  public void trending() throws InterruptedException{
	  
	  Login login = new Login(driver, pr);
	  login.signin("testingdata98720", "Test987(*&");
	  
	  HomePage hp = new HomePage(driver, pr);
	  hp.clickTrending();
	  	  
	  LogOut logout = new LogOut(driver,pr);
	  logout.signout();
	  
  }

}
