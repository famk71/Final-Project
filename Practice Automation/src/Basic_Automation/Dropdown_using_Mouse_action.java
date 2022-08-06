package Basic_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown_using_Mouse_action {

	
	WebDriver Driver;
		
		@BeforeTest public void Setup() {
			
			//WebDriver Driver;
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			Driver= new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		}
			
		
		 @Test public void Mouse_action() throws InterruptedException {
			Driver.findElement(By.className("paxinfo")).click();
			Thread.sleep(1000);
			
			int i=1;
			while (i<5)			//	Will click 4 times on Adult
			
			{
			Driver.findElement(By.id("hrefIncAdt")).click();
			i++;				// 1+4 =5 Adults
			}
			
			
			for(int j=1; j<5; j++)				//Will click 4 times on Child				
			Driver.findElement(By.id("hrefIncChd")).click();		//0+4= 4 Child
				
			System.out.println(Driver.findElement(By.className("paxinfo")).getText());
			}
		 }
	


