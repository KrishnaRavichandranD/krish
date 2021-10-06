package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

private void emp() {
	System.out.println("tuyguh");
}
	private void emp2() {
		System.out.println("gfgh");}

	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\mariv\\eclipse-workspace\\SeleniumTask1\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	WebElement n = driver.findElement(By.id("username"));
	
	n.sendKeys("Krishna");
	
	WebElement p = driver.findElement(By.id("password"));

	p.sendKeys("123456");
	
	

	
	
		

		
		
		
	}

}
