package webElements;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Get_Location_Method 
	{
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			WebElement ele = driver.findElement(By.id("username"));
			Point loc = ele.getLocation();
			System.out.println("The x-cordinates "+loc.x);
			System.out.println("The y-coedinates "+loc.y);
			driver.close();
		}

	}


