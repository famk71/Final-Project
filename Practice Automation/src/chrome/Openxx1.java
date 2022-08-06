package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openxx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).click();
		driver.findElement(By.name("uid")).sendKeys("mngr289453");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("ybEgUgU");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		//By.xpath("//*[@id='loginbtn']")
		driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
		//driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("Fahim");
		//driver.findElement(By.name("dob")).click();
	    //driver.findElement(By.name("dob")).sendKeys("1998-05-06");
		
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("document.getElementById('dob').value='1999-01-02'");
	    
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@rows='5']")).click();
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys("Va, US");
		driver.findElement(By.name("city")).click();
		driver.findElement(By.name("city")).sendKeys("Woodbridge");
		driver.findElement(By.name("state")).click();
		driver.findElement(By.name("state")).sendKeys("Virginia");
		driver.findElement(By.name("pinno")).click();
		driver.findElement(By.name("pinno")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@onkeyup='validateTelephone();']")).click();
		driver.findElement(By.xpath("//input[@onkeyup='validateTelephone();']")).sendKeys("92912341234");
		driver.findElement(By.name("emailid")).click();
		driver.findElement(By.name("emailid")).sendKeys("famk17@yahoo.com");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(3000);
		//driver.close();
		
		
	
	}

}
