package Basic_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GURU99_Bank_Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\famk1\\\\eclipse-workspace\\\\Practice Automation\\\\chromedriver\\\\chromedriver.exe");
		WebDriver Driver;
		Driver= new ChromeDriver();
		String GTPL= "http://demo.guru99.com/V4/";
		Driver.get(GTPL);
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		Driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr307827");

		Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sUgYgen");
		
		Driver.findElement(By.name("btnLogin")).click();
		
		Driver.findElement(By.linkText("New Customer")).click();    		//Using link text 	<a href="addcustomerpage.php">New Customer</a>
		
		JavascriptExecutor js= (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0, 250)");							//Scroll down 250 pixel
		Thread.sleep(5000);
		
		
		Driver.findElement(By.xpath("//input[@onkeyup='validatecustomername();']")).sendKeys("Emma Chamberlain");
		Driver.findElement(By.xpath("//input[@value='f']")).click();			//Clicking FEMALE rad
		
		JavascriptExecutor JS= (JavascriptExecutor) Driver;
		JS.executeScript("document.getElementById('dob').value='2001-05-22'");		//DOB filling with JAVA executor
		
		WebElement home = Driver.findElement(By.xpath("//a[@href='Managerhomepage.php']"));
		js.executeScript("arguments[0].scrollIntoView();", home);				//Scrolling down to a specific element "home"
		Thread.sleep(5000
				
				);
		Driver.findElement(By.name("addr")).sendKeys("29566 Rose St");
		Driver.findElement(By.name("city")).sendKeys("Orange");
		Driver.findElement(By.xpath("//input[@onkeyup='validateState();']")).sendKeys("California");
		Driver.findElement(By.name("pinno")).sendKeys("1234");
		Driver.findElement(By.name("telephoneno")).sendKeys("524-339-1234");
		Driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("labrie@gmail.com");
		Driver.findElement(By.name("password")).sendKeys("labrie1234");	Thread.sleep(3000);
		
		Driver.quit();
}

}
