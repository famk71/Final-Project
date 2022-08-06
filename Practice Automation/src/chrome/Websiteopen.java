package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websiteopen {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("http://demo.guru99.com/V1/index.php");
		Driver.manage().window().maximize();
		Driver.findElement(By.name("uid")).click();
		Driver.findElement(By.name("uid")).sendKeys("mngr283584");
		Driver.findElement(By.name("password")).click();
		Driver.findElement(By.name("password")).sendKeys("hAbYjEv");
		Driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		//By.xpath("//*[@id='loginbtn']")
		Driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
		Thread.sleep(1000);
	}


}

