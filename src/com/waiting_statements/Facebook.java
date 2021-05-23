package com.waiting_statements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("9740041118");
		driver.findElement(By.id("pass")).sendKeys("Ambi@1994");
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Pass: Home page displayed");
		}
		else 
		{
		System.out.println("Fail: Home page not displayed");	
		}
		
		driver.findElement(By.name("login")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@role = 'button'])[3]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[contains(@class, 'gs1a9yip ow4ym5g4 auili1gw rq0escxv j83agx80 cbu4d94t buofh1pr g5gj957u i1fnvgqd oygrvhab cxmmr5t8 hcukyx3x kvgmc6g5 tgvbjcpo hpfvmrgz rz4wbd8a a8nywdso l9j0dhe7 du4w35lb rj1gh0hx pybr56ya f10w8fjw')])[6]")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
