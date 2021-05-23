package handling_webElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosuggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("pythonselen");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class = 'sbct']"));
		System.out.println(options.size());
		
		for(WebElement wb : options)
		{
			System.out.println(wb.getText());
		}
		
		driver.close();
	}

}
