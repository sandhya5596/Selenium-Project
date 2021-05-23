package handling_webElements.Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/account/createaccount");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("userType")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("D:\\softwares\\oracel sql\\doc\\server.102\\b14196.pdf");
		
		driver.close();
	}

}
