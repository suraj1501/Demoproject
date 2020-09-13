package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Logintest {
  @Test
  public void Testfirefox() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

	  //hgjgj
		
	  driver.get("https://www.google.com/");	
	  driver.get("https://www.google.com/");	
	  driver.quit();
  }
}
