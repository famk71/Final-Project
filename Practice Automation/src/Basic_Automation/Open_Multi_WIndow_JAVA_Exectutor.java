package Basic_Automation;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Multi_WIndow_JAVA_Exectutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver;
		Driver= new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		
		JavascriptExecutor JS= (JavascriptExecutor) Driver;
		
		Driver.get("https://www.tutorialspoint.com/sdlc/index.htm"); 												//index0
		JS.executeScript("window.open('https://www.netflix.com/')"); 					 Thread.sleep(3000);		//index3
		JS.executeScript("window.open('https://www.guru99.com/software-testing.html')"); Thread.sleep(3000);		//index2
		JS.executeScript("window.open('https://music.youtube.com/')");												//index1

	
		ArrayList<String> window= new ArrayList<String>(Driver.getWindowHandles());
		Driver.switchTo().window(window.get(0)); 	Thread.sleep(2000);
		Driver.switchTo().window(window.get(3));	Thread.sleep(2000);
		Driver.switchTo().window(window.get(1));	Thread.sleep(2000);
		Driver.switchTo().window(window.get(2));	Thread.sleep(2000);
	
	}
}