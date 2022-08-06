package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.com");
System.out.print(driver.getTitle());
	}

}
