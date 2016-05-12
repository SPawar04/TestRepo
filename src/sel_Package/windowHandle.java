package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandle {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("http://demoqa.com/frames-and-windows/");
		 driver.manage().window().maximize();
		 String parent  = driver.getWindowHandle();
		 WebElement newTab = driver.findElement(By.cssSelector("div#tabs-1 div p a"));
		 //newTab.click();
		 String new1 = null;
		 for (String each: driver.getWindowHandles()){
			 new1 = each;
			 System.out.println(each);
		 }
		 
		 //driver.switchTo().window(new1);
		 System.out.println(driver.getWindowHandle());
		 driver.close();
		 driver.get("http://demoqa.com/frames-and-windows/");
		 //driver.switchTo().window(parent);
		 //System.out.println(driver.getWindowHandle());
		 driver.quit();
	}

}
