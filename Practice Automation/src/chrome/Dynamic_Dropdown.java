package chrome;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	
	static WebDriver Driver= null;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dynamic_Dropdown auto= new Dynamic_Dropdown();
		auto.suggestions();
	
	}

	public void suggestions() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C://Users//famk1//eclipse-workspace//Page_Object_Model//chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		Driver.findElement(By.id("autosuggest")).sendKeys("in");
		Driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
		String x= Driver.findElement(By.id("autosuggest")).getText();
		System.out.println(x);
		Thread.sleep(3000);
		
		
		 JavascriptExecutor js = (JavascriptExecutor)Driver;
         String str = "return document.getElementById(\"autosuggest\").value;";
             String item =   (String) js.executeScript(str);
             System.out.println(item);
         int i=0;
     while(!item.equals("India")) {
             i++;
             Driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.DOWN);
             Thread.sleep(1000);
             item =  (String) js.executeScript(str);
         System.out.println(item);
             if(i>25) {
             break;
             }
             }
             if(i>25) {
             System.out.println("Item not found.");
             fail("Desired item not found.");
             }else{
             System.out.println("Desire item found.");
             }
             Driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.TAB);
	}
}
