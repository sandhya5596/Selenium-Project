package com.waiting_statements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("sandhya.bhoomika@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sandhya5596");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))
		{
			System.out.println("Pass: Home page displayed");
		}
		else
		{
			System.out.println("Fail: Home page not displayed");
		}
		driver.findElement(By.xpath("(//div[@class = '                     Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '])[1]")).click();
		driver.findElement(By.xpath("//img[@class = '_6q-tv']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()= 'Log Out']")).click();
		Thread.sleep(5000);
		
		
		driver.close();
	
		
		

	}

}
