package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Locators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.findElement(By.id("email")).sendKeys("qwertyoiuo");
		Thread.sleep(3000);

		driver.findElement(By.name("pass")).sendKeys("ghfgagh");
		Thread.sleep(3000);
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		Thread.sleep(3000);
		
		driver.close();
	}


}
