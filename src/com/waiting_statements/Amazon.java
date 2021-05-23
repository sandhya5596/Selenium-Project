package com.waiting_statements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("sandhya.bhoomika@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("sandhya5596");
		driver.findElement(By.id("signInSubmit")).click();
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Amazon"))
		{
			System.out.println("Pass : Home page displayed");
		}
		else
		{
			System.out.println("Fail : Home page not displayed");
		}
		driver.close();

	}

}
