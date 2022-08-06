package chrome;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Authentication {
	 WebDriver Driver;

	@BeforeTest ()
	public void Setup() {
		
	
	System.setProperty("webdriver.gecko.driver", "D:\\QA Study\\Selenium\\Driverexes\\geckodriver.exe");
	Driver= new FirefoxDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
}
	
	
	@Test

	public void Authenticating(String fname) throws InterruptedException {
	
	
		Driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String message=Driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(message);
		
		Thread.sleep(3000);
		
		
		
		
	}
	}




