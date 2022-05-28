package org.testing.TestScripts;


import java.io.IOException;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC1 extends BaseClass {
	
  @Test
  public void trending() throws InterruptedException, IOException{
	  
	  Login login = new Login(driver, pr);
	  login.signin("testingdata98720", "Test987(*&");
	  //Will call Utilities LogsCapture class method using classname.method name since methods are static in Utilities package classes
	  LogsCapture.takeLogs("TC1", "Login Successful for TC1");
	  
	  
	 /* Calendar c = Calendar.getInstance();
	  Date d = c.getTime();
	  Integer hr = d.getHours();
	  System.out.println(hr.toString());*/
	  
	  Thread.sleep(2000);
	  //Will call Utilities screenshot class method using classname.method name since methods are static in Utilities package classes
	  Screenshot.takeScreenshot(driver, "E://screenshots//TC1_Login.jpg");
	  
	  HomePage hp = new HomePage(driver, pr);
	  hp.clickTrending();
	  
	  String actUrl = driver.getCurrentUrl();
	  
	  //Hard Assertion Use.
	  Assert.assertEquals(actUrl, "https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl"," Hard Assertion failed");
	  	  
	  Thread.sleep(2000);
	  Screenshot.takeScreenshot(driver, "E://screenshots//TC1_Trending.jpg");
	  
	  LogOut logout = new LogOut(driver,pr);
	  logout.signout();
	  
  }

}
