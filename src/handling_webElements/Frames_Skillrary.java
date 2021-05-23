package handling_webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Skillrary {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		
		driver.findElement(By.id("image-3")).click();
		
		driver.switchTo().frame(0);
		WebElement play = driver.findElement(By.xpath("//div[@class = 'play-icon']"));
		play.click();
		
		WebElement pause = driver.findElement(By.xpath("//div[@class = 'pause-icon']"));
		pause.click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text() = ' TAKE THIS COURSE ']")).click();
		
		driver.close();
		
		
	}

}
