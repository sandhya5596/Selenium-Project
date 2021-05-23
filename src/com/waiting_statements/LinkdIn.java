package com.waiting_statements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdIn 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("LinkedIn: Log In or Sign Up"))
		{
			System.out.println("Pass: Home page displayed");
		}
		else
		{
			System.out.println("Fail: Home page not displayed");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("session_key")).sendKeys("sandhya.bhoomika@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("ambi@1994");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class = 'global-nav__primary-link-text'])[6]")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("div[id = 'ember45']")).click();
		Thread.sleep(5000);

		//driver.close();

	}

}
