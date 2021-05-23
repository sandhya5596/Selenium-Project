package handling_webElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Amazon 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		
		for(WebElement alloptions:option)
		{
			System.out.println(alloptions.getText());
		}
		
		s.selectByIndex(3);
		
		s.selectByValue("search-alias=deals-intl-ship");
		
		s.selectByVisibleText("Kindle Store");
		
		driver.close();
	}

}
