package com.smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static void setup() {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.smarttechqa.com/login ");
		
        driver.findElement(By.id("email")).sendKeys("yeagereren@email.com");
		//driver.findElement(By.id("password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234567");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   System.out.println( driver.getTitle());
		//driver.quit();
	   
	   System.out.println("craete Automation Project");
	   
	   
	}
	
public static void main(String[] args) {
	
	BaseClass.setup();
	
	
}	
	

}
