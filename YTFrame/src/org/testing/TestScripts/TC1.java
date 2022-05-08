package org.testing.TestScripts;


import java.io.IOException;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

public class TC1 extends BaseClass {
	
  @Test
  public void trending() throws InterruptedException, IOException{
	  
	  Login login = new Login(driver, pr);
	  login.signin("testingdata98720", "Test987(*&");
	  
	 /* Calendar c = Calendar.getInstance();
	  Date d = c.getTime();
	  Integer hr = d.getHours();
	  System.out.println(hr.toString());*/
	  
	  Thread.sleep(2000);
	  Screenshot.takeScreenshot(driver, "E://screenshots//TC1_Login.jpg");
	  
	  HomePage hp = new HomePage(driver, pr);
	  hp.clickTrending();
	  	  
	  Thread.sleep(2000);
	  Screenshot.takeScreenshot(driver, "E://screenshots//TC1_Trending.jpg");
	  
	  LogOut logout = new LogOut(driver,pr);
	  logout.signout();
	  
  }

}
