package com.waiting_statements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime_explicit 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		WebDriverWait w=new WebDriverWait(driver,5);
		
		
		WebElement element = driver.findElement(By.id("username"));
		
		w.until(ExpectedConditions.visibilityOf(element)).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));
		//to waiting untill the element is clicked
w.until(ExpectedConditions.elementToBeClickable(ele)).click();
//to check the visibility of the element before performing operaion
w.until(ExpectedConditions.visibilityOf(element)).sendKeys("admin");
	
	}
}
