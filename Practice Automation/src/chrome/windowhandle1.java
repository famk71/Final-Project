package chrome;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowhandle1 {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	String url1 = "D:\\QA Study\\Handler\\MultiWindows.html";

	driver.get(url1);

	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	//WebDriverWait Ex =new WebDriverWait(driver, 5);			//Wait method

	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@id='nwindow1' and @onclick='myFunction()']")).click();
	
	String parent = driver.getWindowHandle();


           Set<String> set1 = driver.getWindowHandles();
           Iterator<String> iterator1 = set1.iterator();
           while (iterator1.hasNext())
        	   
           {
               String child_window = iterator1.next();
               
               
               if(!parent.equals(child_window))
             
               {    
                   
                       // Switching to Child window
              driver.switchTo().window(child_window);
              Thread.sleep(5000);
               }}
           
         driver.close();
         
         driver.switchTo().window(parent);
         
         driver.findElement(By.xpath("//button[@id='nwindow1']")).click();
         
         
        
         
         
         
         
         
         
         
         
         
         while(iterator1.hasNext())
             
         {
             String child_window1 = iterator1.next();
             
             if(!parent.equals(child_window1))
           
             {    
                 
                     // Switching to Child window
            driver.switchTo().window(child_window1);     
           
          WebDriverWait wait = new WebDriverWait(driver, 3);
           wait.until(ExpectedConditions.titleContains("IT Online Courses with Certificates | IT Online Training - H2kinfosys"));
            
           Thread.sleep(3000);
         
             }}
         set1.remove(parent);
      
         //driver.findElement(By.className("btn btn-primary font-600")).click();
         Thread.sleep(5000);
         driver.close();
         
         //driver.switchTo().window("child_window1");
         
         //driver.close();
   }

}


