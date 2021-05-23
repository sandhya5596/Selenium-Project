package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector
{

	public static void main(String[] args) 
	{
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("as");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("asdf");
		driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();
		
		driver.close();
		
		//driver.findElement(By.type("submit")).click();

	}

	

}
