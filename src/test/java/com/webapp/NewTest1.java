package com.webapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
	  @Test
	  public void gmail() {
		  
		    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.get("https://gmail.com");
		    //String x = driver.getCurrentUrl();
		    //System.out.println(x);
		    //Assert.assertEquals(x, "https://www.facebook.com/");
	  }
}
