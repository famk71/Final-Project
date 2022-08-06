package Basic_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Alert_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Driver.findElement(By.name("enter-name")).sendKeys("Batkid");
		
		JavascriptExecutor name= (JavascriptExecutor) Driver;
		name.executeScript("document.getElementById('name').value='Kidcudi'");		//Sending Keys using JavascriptExecutor
		
		Driver.findElement(By.xpath("//input[@id='alertbtn']")).click(); Thread.sleep(3000);
		
		
		WebDriverWait wait= new WebDriverWait(Driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());

		
		Driver.switchTo().alert().accept();
		
		
		Driver.findElement(By.name("enter-name")).sendKeys("SupKid");
		Driver.findElement(By.id("confirmbtn")).click(); Thread.sleep(3000);
		Driver.switchTo().alert().accept(); 
		
		Driver.findElement(By.name("enter-name")).sendKeys("SusKid");
		Driver.findElement(By.id("confirmbtn")).click();
		System.out.println(Driver.switchTo().alert().getText());	Thread.sleep(3100);
		Driver.switchTo().alert().dismiss();
		
		
		Thread.sleep(3000);
		Driver.close();
		
	}

}
