package com.waiting_statements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapchat 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.snapchat.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Log In • Snapchat"))
		{
			System.out.println("Pass: Home page displayed");
		}
		else
		{
			System.out.println("Fail: Home page not displayed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("username")).sendKeys("sandhyabhumi");
		driver.findElement(By.id("password")).sendKeys("sandhya5596");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		driver.findElement(By.xpath("//img[@src = '/accounts/static/images/navigation/menu.svg']")).click();
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.close();
		
	}

}
