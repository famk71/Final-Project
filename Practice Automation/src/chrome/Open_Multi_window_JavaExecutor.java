package chrome;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Multi_window_JavaExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\\\QA Study\\\\Selenium\\\\Driverexes\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		
		JavascriptExecutor Jexecutor = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(5	, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //index 0
		Jexecutor.executeScript("window.open('https://www.google.com/?gws_rd=ssl')"); Thread.sleep(10000);  //index3
		Jexecutor.executeScript("window.open('https://www.usa.gov/how-to-vote')");   Thread.sleep(10000);  //index2
		Jexecutor.executeScript("window.open('https://mpjtechsolutioninc.my.webex.com/webappng/sites/mpjtechsolutioninc.my/dashboard/landing?siteurl=mpjtechsolutioninc.my&type=Attendee')");	//index1
		
		
		ArrayList<String> tab1 = new ArrayList<String>(driver.getWindowHandles());
	
		driver.switchTo().window(tab1.get(0));  Thread.sleep(3000);
		
		driver.switchTo().window(tab1.get(1)); Thread.sleep(3000);
		//driver.close(); Thread.sleep(2000);
		
		driver.switchTo().window(tab1.get(2));
		
		driver.manage().window().maximize(); Thread.sleep(3000);	
		
		driver.quit();
		
	}

}
