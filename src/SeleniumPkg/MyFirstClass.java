package SeleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
	//	driver.findElement(By.xpath("//button type[@class='button orange wide']")).click();
		
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Cars");

driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();









	}

}
