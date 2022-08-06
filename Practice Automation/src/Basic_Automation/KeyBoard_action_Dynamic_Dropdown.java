package Basic_Automation;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class KeyBoard_action_Dynamic_Dropdown {
	
	
		
	
		public static void main(String[] args)throws Exception { 
		
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		Driver.findElement(By.id("autosuggest")).sendKeys("in");
		Driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
		String print= Driver.findElement(By.id("autosuggest")).getText();
		System.out.println(print);
		Thread.sleep(3000);
		
		
		JavascriptExecutor JS= (JavascriptExecutor) Driver;
		String element= "return document.getElementById('autosuggest').value";
		String value =(String) JS.executeScript(element);
		System.out.println(value);
		
		int i=1;
		while(!value.equals("India")) {
		Driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
		i++;
		Thread.sleep(3000);
		
		value =(String) JS.executeScript(element);
		System.out.println(value);
		if(i>17) {
			break;
		}
		}
		if (i>17) {
			System.out.println("item not found");
			//fail("Desired item not found");
		} else {
			System.out.println("Desired item found");
		}
		
		Driver.findElement(By.id("autosuggest")).sendKeys(Keys.TAB);
		
		
		
		
		
	}

}
