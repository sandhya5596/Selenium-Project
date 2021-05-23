package handling_webElements.Pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup_removeParticularChild {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		System.out.println(child.size());
		
		child.remove(parent);
		System.out.println("removeing the child"+child.size());
		
		String etitle="Cognizant";
		
		for(String allwin:child) {
			driver.switchTo().window(allwin);
		String atitle = driver.getTitle();
		System.out.println(atitle);
		
		if(atitle.equals(etitle)) {
			driver.close();

		}
		
		
		
		driver.quit();
		}
	}

}
