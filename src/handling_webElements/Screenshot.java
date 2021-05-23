package handling_webElements;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	//Step:1 Typecasting from webdriver to takescreenshot interface
		TakesScreenshot ts=(TakesScreenshot) driver;
	//Step:2 access the method and store in RAM location
		File src = ts.getScreenshotAs(OutputType.FILE);
	//Step:3 Specify the Required LOcation
		File dest=new File("./photo/myntra.png");
	//Step:4 Copy the file src to dest location
		FileUtils.copyFile(src, dest);
	
	driver.close();
	}

}
