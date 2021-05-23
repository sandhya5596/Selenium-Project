package webElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
	if(ele.isSelected()) {
		System.out.println("Pass:element is selected");
	}
	else
	{
		System.out.println("Fail:thh element is not selected");
	}
	driver.close();
	}

}

