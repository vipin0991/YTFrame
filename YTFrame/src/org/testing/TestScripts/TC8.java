package org.testing.TestScripts;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC8 extends BaseClass {
	  
  @Test
  public void library() throws InterruptedException{
	  
	  Login login = new Login(driver,pr);
	  login.signin("testingdata98720", "Test987(*&");
	  
	  HomePage homepage = new HomePage(driver,pr);
	  homepage.clicklibrary();
	  
	  LogOut logout = new LogOut(driver,pr);
	  logout.signout();
  }
  

}
