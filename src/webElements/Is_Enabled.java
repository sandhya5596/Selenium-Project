package webElements;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Is_Enabled 
	{
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));

			if(login.isEnabled()) {
				System.out.println("Pass:The login is enabled");
				login.click();
			}
			else
			{
				System.out.println("Fail:the login is not enabled");
			}
		
		driver.close();
		}

	}

