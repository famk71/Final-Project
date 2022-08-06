package Basic_Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get("http://demo.guru99.com/popup.php ");
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Dimension DM= new Dimension(1740,1260);				//Setting window determining exact Dimension
		Driver.manage().window().setSize(DM);
		
		Driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		
		String Parent= Driver.getWindowHandle();			//Handling Main/Parent window, Return type is String
		
		Set <String> s1= Driver.getWindowHandles();			//Creating a set for both Parent/Child window
		 Iterator<String> i1= s1.iterator();				//Declaring there Iterator between 2
		
		 while (i1.hasNext())								//Condition saying Iterator have to have next
		 {
			 String Child=i1.next();						//Child window will be the "Next" window
		 	
			 if(!Parent.equals(Child))						//If parent is not equals Child
			 {
				 Driver.switchTo().window(Child);	 		//Switching to Child window
				 Thread.sleep(3000);
				 
				 Driver.switchTo().window(Parent);			//Switching back to Parent window
				 Thread.sleep(3000);
				 
				 Driver.close();							//Closing Parent window
				 
				 Thread.sleep(3000);
				 
				 Driver.quit();								//Closing whole Browser
			 }
		 }}}