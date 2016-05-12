package sel_Package;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class textBox{
 public static void main(String[] args) throws InterruptedException{
	 WebDriver driver = new FirefoxDriver();
 // Puts an Implicit wait, Will wait for 10 seconds
// before throwing exception
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 // Launch website
driver.navigate().to("http://www.calculator.net");
//percent-calculator.html");
//Maximize the browser
driver.manage().window().maximize();
// Enter value 10 in the first number of the percent Calculator
driver.findElement(By.cssSelector("#hl3>li:nth-child(3)>a")).click();
driver.findElement(By.id("cpar1")).sendKeys("10");
driver.findElement(By.id("cpar2")).sendKeys("450");
driver.findElement(By.cssSelector(".panel>tbody>tr:nth-child(2)>td>input:nth-child(2)")).click();
Thread.sleep(5000);
// Get the text box from the application
String result =
driver.findElement(By.cssSelector(".verybigtext>font>b")).getAttribute("value");

//Print a Log In message to the screen
System.out.println(" The Result is " + result);

//Close the Browser
driver.close();
}
}