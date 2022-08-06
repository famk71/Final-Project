package chrome;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Dropdown_without_Select {
	


	@Test
	public void Set1() throws InterruptedException {
		// TODO Auto-generated method stub 

		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		//driver.get("http://spicejet.com");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("divpaxinfo")).click();

		  Thread.sleep(1000);

		int i=1;
		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click(); //                      4  times
		i++;
		}


	 
		for(int j=1;j<3;j++)// Execute Line for 2 times

		//{
		           
		driver.findElement(By.id("hrefIncChd")).click();

		//}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		 
		 
	 String ActualResult = driver.findElement(By.id("divpaxinfo")).getText();
	
		
		   // Validation Assert for Adult and Child
		String ExpectedResult = "5 Adult, 2 Child";
		Assert.assertEquals(ActualResult, ExpectedResult);

		System.out.println("What is the actual result?" + ActualResult);
		

		 
		WebElement Button = driver.findElement(By.id("btnclosepaxoption"));
		//Button.click();
		System.out.println("Done Button is Displayed?" + Button.isDisplayed()); //validation1
		System.out.println("Done Button is Selected?" + Button.isSelected()); //validation2
		System.out.println("Done Button is Enabled?" + Button.isEnabled()); //validation3
		System.out.println(driver.findElement(By.id("btnclosepaxoption")).getText()); //validation4

		Button.click();

		Thread.sleep(2000);
		//WebDriverWait Ex =new WebDriverWait(driver, 10);
		
		WebElement Departure =driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/select"));
		Thread.sleep(3000);
		//Ex.until(ExpectedConditions.elementToBeSelected(Departure));
		Departure.click();
		//Select input11 = new Select(Departure);
		//input11.selectByValue("BLR");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//option[@value='BLR']")).click(); // this is the 1st child so doesnt need index.

		/*WebElement Arrival = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
		Arrival.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//option[@value='MAA'])[2]")).click(); //This Is the Index Method By finding the child

		/*   Select Sinput = new Select(Departure);  // This the Select method  and has list of options with value
		Sinput.selectByValue("DAC");

		Arrival.click();

		Select Sinput2 = new Select(Arrival);
		Sinput2.selectByValue("DEL");
		Thread.sleep(2000);
		Departure.click();   */

	}

}
