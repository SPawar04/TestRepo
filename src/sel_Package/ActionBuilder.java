package sel_Package;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ActionBuilder{
 public static void main(String[] args) throws InterruptedException{
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://demoqa.com/droppable/");
	 driver.manage().window().maximize();
	 WebElement accept = driver.findElement(By.cssSelector("div#tabs ul li:nth-child(2) a"));
	 WebElement drag = driver.findElement(By.id("draggableaccept"));
	 WebElement drop = driver.findElement(By.id("droppableaccept"));
	 WebElement dropnv = driver.findElement(By.id("draggable-nonvalid"));
	 accept.click();
	 Actions builder = new Actions(driver);
	 Action doAction = builder.moveToElement(dropnv).clickAndHold().moveToElement(drop).release().build();
	 doAction.perform();
	 Action doAction1 = builder.moveToElement(drag).clickAndHold().release(drop).build();
	 doAction1.perform();
	 driver.quit();
}
}