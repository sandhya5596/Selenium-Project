package handling_webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_dropdown_skillrary {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("cars"));

		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("199");
	//	s.selectByVisibleText("Free ( 90 ) ");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) {
			Thread.sleep(2000);
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("199");
			Thread.sleep(2000);
		//	s.deselectByVisibleText("Free ( 90 ) ");
		}
		Thread.sleep(2000);
		driver.close();

		
	}

}
