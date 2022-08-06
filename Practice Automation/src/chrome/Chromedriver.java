package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		
 WebDriver driver= new ChromeDriver();
  driver.get("https://demo.guru99.com/V1/index.php");
  /*driver.findElement(By.id("name")).click();
  driver.findElement(By.name("enter-name")).sendKeys("Hello");
  //driver.findElement(By.className("class1")).click();
  driver.findElement(By.xpath("//*[@id='openwindow']")).click();*/
	driver.manage().window().maximize();
	driver.findElement(By.id("details-button")).click();
	Thread.sleep(5000);
	//driver.findElement(By.id("proceed-link")).click();
	//driver.findElement(By.linkText("Proceed to demo.guru99.com (unsafe)")).click();
	driver.findElement(By.partialLinkText("(unsafe)")).click();
	driver.findElement(By.name("uid")).click();
	driver.findElement(By.name("uid")).sendKeys("mngr283584");
	driver.findElement(By.name("password")).click();
	driver.findElement(By.name("password")).sendKeys("hAbYjEv");
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}
	}

