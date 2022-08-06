package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver;
		Driver =new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String url1= "D:\\QA Study\\Handler\\framenested1.htm";
		Driver.get(url1);
		
				
				
				
				//driver.switchTo().frame(0);  // By Index number --- Rule 1
				
				//driver.switchTo().frame("iframe3"); // By name of ID attribute value ----	Rule 2
		
		
		
				//Driver.switchTo().frame("iframe1");  	//By WebElement first we switch to frame --- Rule 2+ Rule 3    index 0
				Driver.switchTo().frame("iframe2");  	//index 1
					//index 2
				
				Driver.switchTo().frame("iframe3");	
				//driver.findElement(By.xpath("//iframe[@name='iframe3']")).click();  // Then we write the XPath ---- Rule 3
				
				Driver.findElement(By.name("userName")).sendKeys("Rod");
				Driver.findElement(By.name("usePwd")).sendKeys("charlie111");
				
				
				
				//Driver.switchTo().defaultContent();		//This goes back to the starting frame//  Grandparent // Body
				
				
				
				//Driver.switchTo().parentFrame();		//It's gonna go back to frame 2
				
				Driver.switchTo().parentFrame();
				WebElement Login= Driver.findElement(By.xpath("//button[@name='Login']"));
				
				Login.click();
				
				//Login.isDisplayed();   //Will give us true or false answer
				
				System.out.println(Driver.getCurrentUrl()); //For validation it shows into which Url it's going
				
			
				
				
	}

}
