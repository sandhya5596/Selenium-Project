package datadriven_chapter_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class read_from_file {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		
		driver.get(p.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
		
		driver.close();

	}

}