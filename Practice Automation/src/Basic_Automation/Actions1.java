package Basic_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions1 {
	WebDriver Driver;
	@Test
	  public void actionbuilder() {
		  String baseUrl = "http://www.facebook.com/"; 
		 Driver= new ChromeDriver();

		  Driver.get(baseUrl);
		  WebElement txtUsername = Driver.findElement(By.id("email"));

		  Actions builder = new Actions(Driver);
		  Action seriesOfActions = builder
		  	.moveToElement(txtUsername)
		  	.click()
		  	.keyDown(txtUsername, Keys.SHIFT)
		  	.sendKeys(txtUsername, "hello")
		  	.keyUp(txtUsername, Keys.SHIFT)
		  	.doubleClick(txtUsername)
		  	.contextClick()
		  	.build();
		  	
		  seriesOfActions.perform() ;
	}
	
	
	@Test (priority=5)
	public void uppercase() {
		Driver.get("http://www.facebook.com/");
		WebElement Name= Driver.findElement(By.id("email"));
		Name.sendKeys(Keys.chord(Keys.SHIFT,"Donald"), Keys.TAB);

		//Name.sendKeys(naming);
		
	}
}
