package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		
		//title the application
		String title = driver.getTitle();
        System.out.println(title);
        
       
        //get the url from the application
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        driver.close();
	}

}
