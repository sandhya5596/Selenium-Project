package handling_webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.switchTo().frame(0);
WebElement ele = driver.findElement(By.xpath("//div[@id='slider']"));

Actions a=new Actions(driver);
a.dragAndDropBy(ele,200,0).perform();
Thread.sleep(3000);
a.dragAndDropBy(ele,-200,0).perform();
Thread.sleep(3000);
driver.close();

	}
}
