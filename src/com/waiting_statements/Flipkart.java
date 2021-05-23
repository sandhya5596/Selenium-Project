package com.waiting_statements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class= '_2IX_2- VJZDxU']")).sendKeys("sandhya.bhoomika@gmail.com");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("sandhya5596");
		driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("Pass : Home page displayed");
		}
		else
		{
			System.out.println("Fail :  Home page not displayed");
		}
		
		WebElement dropdown = driver.findElement(By.xpath("(//div[@class = 'exehdJ'])[1]"));
		Select s = new Select(dropdown);
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		
		for (WebElement allOptions:option)
		{
			System.out.println(allOptions.getText());
		}
		s.selectByIndex(9);
		
		
		
		//driver.close();
		

	}

}
