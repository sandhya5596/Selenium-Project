package handling_webElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement create_account = driver.findElement(By.xpath("(//a[@role = 'button'])[2]"));
		create_account.click();
		
		WebElement year = driver.findElement(By.id("year"));
		Select s = new Select(year);
		s.selectByIndex(4);
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		 List<WebElement> options = s2.getOptions();
		 
		 ArrayList a = new ArrayList();
		 
		 for(WebElement allOptions:options)
		 {
			 String text = allOptions.getText();
			 System.out.println(text);
			 a.add(text);
		 }
		 
		 System.out.println("After sorting :");
		 
		 Collections.sort(a);
		 
		 for(Object sortedoption:a)
		 {
			 System.out.println(sortedoption);
		 }
		 
		 driver.close();
		 
		 
		 
		 
		

	}

}
