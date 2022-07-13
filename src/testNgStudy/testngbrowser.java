package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngbrowser {
  @Test
  public void testng() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
  }
}


