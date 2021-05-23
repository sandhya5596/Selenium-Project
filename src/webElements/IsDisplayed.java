package webElements;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class IsDisplayed 
	{
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			WebElement ele = driver.findElement(By.id("username"));
	if(ele.isDisplayed()) {
		System.out.println("Pass:element is dispalyed");
		ele.sendKeys("admin");
	}
	else
	{
		System.out.println("Fail:element is not dispalyed");
	}
	driver.close();
		
		}

	}

