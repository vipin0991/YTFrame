package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

public class TC3 extends BaseClass {
	
  @Test
  public void subscription() throws InterruptedException, IOException{
	  Login login = new Login(driver, pr);
	  login.signin("testingdata98720", "Test987(*&");
	  
	  HomePage homepage = new HomePage(driver,pr);
	  homepage.clickSubscription();
	  
	  Thread.sleep(2000);
	  Screenshot.takeScreenshot(driver, "E://screenshots//TC3_Subscription.jpg");
	  
	  LogOut logout = new LogOut(driver,pr);
	  logout.signout();
	  
  }

}
