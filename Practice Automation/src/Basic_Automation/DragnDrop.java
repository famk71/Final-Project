package Basic_Automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragnDrop {
	
	WebDriver Driver;
	
	@BeforeTest
	public void setup() {
	//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\famk1\\eclipse-workspace\\Practice Automation\\chromedriver\\chromedriver.exe");
	Driver = new ChromeDriver();
	//driver = new FirefoxDriver();
	Driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	Driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	
		public void DraganDdrop() {
		String URL = "https://demoqa.com/droppable/";
		Driver.get(URL);



		//Actions class method to drag and drop
		
		
		//Actions builder = new Actions(Driver); 	//Action does mimic the mouse and keyboard. Comes from interactions.

		WebElement from = Driver.findElement(By.id("draggable"));
		WebElement to = Driver.findElement(By.id("droppable"));

					//Perform drag and drop//
		//builder.dragAndDrop(from, to).build().perform();		//Building the action, "move the mouse, click on button" -these are the actions ;; Perform performs that action
		
		//Second Rule [Doesn't use Drag and Drop]
		
		Actions builder = new Actions(Driver);
		builder.clickAndHold(from).moveToElement(to).release(to)
		.build().perform();
		

		
		//verify text changed in to 'Drop here' box
		String textTo = to.getText(); 
		if(textTo.equals("Dropped!")) {
		System.out.println("PASS: File is dropped to target as expected");
		}else {
		System.out.println("FAIL: File couldn't be dropped to target as expected");
		}
	}
	@Test(priority=4)
	  public void actionbuilder() throws InterruptedException {
		  String baseUrl = "https://demoqa.com/droppable/"; 
		  Driver.get(baseUrl);
		  Driver.manage().window().maximize();
		  //WebElement txtUsername = driver.findElement(By.id("email"));
		  
		  WebElement from = Driver.findElement(By.id("draggable"));
			WebElement to = Driver.findElement(By.id("droppable"));
			
		  Actions builder = new Actions(Driver);
		  Action seriesOfActions = builder
		  	.moveToElement(from)
		  	.clickAndHold()
		   //	.keyDown(txtUsername, Keys.SHIFT)
		  //	.sendKeys(txtUsername, "hello")
		 // 	.keyUp(txtUsername, Keys.SHIFT)
		//		 DoubleClick(txtUsername)
	   //  		.contextClick()
			.moveToElement(to)
			.release()
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
