package webElements;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Submit_method 
	{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("manager");
			

		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
		
		}

	}


