package com.webapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest3 {

	  WebDriver driver;

	  @BeforeMethod
	  public void launch() {
		  
		  }
	  
	  @Test
	  public void verifyurl() {
		  
		    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.get("https://facebook.com");
		    String x = driver.getCurrentUrl();
		    System.out.println(x);
		    Assert.assertEquals(x, "https://www.facebook.com/");
	  }
	  
	  @Test
	  public void verifytitle() {
		  
		    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.get("https://facebook.com");
	        String a = driver.getTitle();
	        System.out.println(a);
	        Assert.assertEquals(a, "Facebook");
		    //System.out.println("Test Successful.");    
	  }
	  
	  @AfterMethod
	  public void close() {
		  
	  }
}
