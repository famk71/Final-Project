package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		      WebDriver driver= new ChromeDriver();
		      
		      String url1= ("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
		      
		      driver.get(url1);
		      
		      //Rule 1       //tag[contains(@Att, 'value')]
		      
		      //driver.findElement(By.xpath("//img[contains(@src,'/img/avatars/Original-Facebook-Geek-Profile-Avatar-5.jpg')]"));
		      driver.findElement(By.xpath("//img[starts-with(@src, '/img/avatars')]"));
		      
		      //Rule2        //tag[starts-with(@Attrb, 'value')]      ---- Using Start with
		      //Rule 3 form/child::button
              //Rule 4 Double Slash starts anywhere
	}

}
