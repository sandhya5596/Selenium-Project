package handling_webElements.Pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup_removeChild {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		child.remove(parent);
		System.out.println("after removing parent form child");
		
		System.out.println(child.size());
		for(String b : child)
		{
			driver.switchTo().window(b);
			System.out.println(driver.getTitle());
			driver.close();
			
		}
		
		
		
		driver.quit();
	}

}
