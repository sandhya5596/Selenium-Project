package webElements;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Get_Attribute_Method 
	{
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			WebElement ele = driver.findElement(By.id("username"));
			System.out.println(ele.getAttribute("id"));
			driver.close();
		}

	}

