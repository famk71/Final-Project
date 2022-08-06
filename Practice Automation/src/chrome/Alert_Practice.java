package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("X Æ A-12");

		driver.findElement(By.cssSelector("[value='Alert']")).click();
		
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("name")).sendKeys("X Æ A-12");
	
		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
