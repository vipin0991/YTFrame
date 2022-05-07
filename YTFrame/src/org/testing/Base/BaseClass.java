package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public ChromeDriver driver;
	public Properties pr;
	
	  @BeforeMethod
	  public void launch() throws IOException{
		  System.setProperty("webdriver.chrome.driver", "../YTFrame/chromedriver.exe");
		  
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  driver = new ChromeDriver();
		  driver.get("https://www.youtube.com/");
		  driver.manage().window().maximize();
		  
		  File f = new File("../YTFrame/Object.properties");
		  //FileInputStream fr = new FileInputStream(f); this can be used too instead of below line
		  FileReader fr = new FileReader(f);
		  pr = new Properties();
		  pr.load(fr);
	  }
	  
	  
	  @AfterMethod
	  public void close() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.close();
	  }

}
