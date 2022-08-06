package chrome;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Screenshot {
	
	  WebDriver Driver;
	
	@Test

	    public void ScreenshotMethod1() throws Exception{			

			
	    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    	Driver = new ChromeDriver();

	        //goto URL

	        Driver.get("http://demo.guru99.com/V4/");

	        //Call take screenshot function

	        Screenshot.takeSnapShot(Driver, "C:\\Users\\famk1\\Desktop\\test.png") ;     		//Method 1 (COMPLICATED)

	    }

	    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);
	    }

	

		@Test(invocationCount=3,threadPoolSize=3)				//Invoking 3 time in 4 threads
		public void ScreenshotsMethod2() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Driver= new ChromeDriver();
		Driver.get("http://www.google.com");
	

		File screenshot= ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);						//Method 2 (EASY)
		FileUtils.copyFile(screenshot, new File("C:\\Users\\famk1\\Desktop\\testscreen.png"));
		
	}
		@AfterTest (enabled=false)				//To skip this whole method
		public void SS() throws IOException {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			Driver= new ChromeDriver();
			Driver.get("http://facebook.com");
			
			File SS=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SS, new File("D:\\msdownld.tmp\\SS.jpg"));
			
		}

}
