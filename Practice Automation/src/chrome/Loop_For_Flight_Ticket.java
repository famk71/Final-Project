package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Loop_For_Flight_Ticket {


		@Test
		public void actionset1() throws InterruptedException {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("divpaxinfo")).click();

		 Thread.sleep(2000);

		  /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}*/
		 

		for(int i=1;i<5;i++)// Execute Line for 5 times

		{
		           
		driver.findElement(By.id("hrefIncAdt")).click();

		}

		for( int c=1; c<3;c++)
			
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		
		WebElement Donebtn = driver.findElement(By.className("buttonN"));
		System.out.println("Is done button Displayed?" + Donebtn.isDisplayed());
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		// Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText() ,"5 Adult");

		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}
}
