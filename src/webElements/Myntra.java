package webElements;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Myntra 
	{
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			WebElement ele = driver.findElement(By.linkText("Home & Living"));
			System.out.println(ele.getText());
			
			WebElement serach = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	Point loc = serach.getLocation();
	System.out.println(loc.getX());
	System.out.println(loc.getY());

	Dimension s = serach.getSize();
	System.out.println(s.getHeight());
	System.out.println(s.getWidth());

	WebElement offer = driver.findElement(By.xpath("//a[text()='Offers']"));
	System.out.println(offer.getAttribute("class"));
	driver.close();
		}

	}

