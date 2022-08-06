package Basic_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uplaoding_file {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement Uploadfile= Driver.findElement(By.xpath("//input[@name='uploadfile_0']"));		//Locating the Uploadfile button
		
		Uploadfile.sendKeys("D:\\QA Study\\chromedriver.exe");		//Sending key means uploading file
		
		Thread.sleep(3000);
		Driver.quit();
	}

}
