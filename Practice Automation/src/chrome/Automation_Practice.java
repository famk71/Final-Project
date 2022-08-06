package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Automation_Practice {
public WebDriver driver;
	@BeforeTest
	public void Setup() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		driver=new ChromeDriver();
	
		String URL1 = ("http://automationpractice.com/index.php");
		driver.get(URL1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
}
	

@Test(priority=0)
public void Login() {
		//XPath Rule1=//"tag[@attribute='Value']"  - xpath using one attribute
		driver.findElement(By.xpath("//a[@class='login']")).click();
}
@Test(priority=1)
	public void Email() {
		//XPath Rule2= "//tag[@attribute='value'][@attribute='value']" - using 2 attributes
		driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control'][@data-validate='isEmail']")).sendKeys("tortoise29@gmail.com");
	}
@Test(priority=2)
		public void loginclick() {
		//XPath Rule3= //tag[contains(@attribute,'Value')] - using contains
		driver.findElement(By.xpath("//i[contains(@class, '-user left')]")).click();
}
@Test(priority=3)
		public void Gender() {
		driver.findElement(By.id("id_gender1")).click();																	//Gender_radio_button
		Boolean gender= driver.findElement(By.id("id_gender1")).isSelected();
		System.out.println("Is gender clicked?=  "+ gender);
		}
		
@Test(priority=4)
		public void Fname() {
		//XPath RUle4= //tag[starts-with(@attribute,'val')] - using starts-with
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'customer_firstn')]")).sendKeys("Akash");     				  //First_Name
		String Actual= driver.findElement(By.xpath("//input[starts-with(@id, 'customer_firstn')]")).getAttribute("value");
		String Expected= "Akash";
		Assert.assertEquals(Actual, Expected);
		System.out.println(Actual);
		
		}
		
@Test(priority=5)
		public void Lname() {
		
		//XPath Rule 5= "//tag[@atrribute1='Value1' and @attribute2='Value2']" - using AND
		
		driver.findElement(By.xpath("//input[@name='customer_lastname' and @id='customer_lastname']")).sendKeys("Batash");    //Last_Name
		String Actual= driver.findElement(By.xpath("//input[@name='customer_lastname' and @id='customer_lastname']")).getAttribute("value");
		String Expected= "Batash";
		Assert.assertEquals(Actual, Expected);
		System.out.println(Actual);
		}
		
@Test(priority=6)
		public void password() {
		//XPath Rule 5= "//tag[@atrribute1='Value1' or @attribute2='Value2']"     using OR
		
		driver.findElement(By.xpath("//input[@data-validate='isPasswd' or @id= 'passwd']")).sendKeys("Meghh");				//Password
		String Actual= driver.findElement(By.xpath("//input[@data-validate='isPasswd' or @id= 'passwd']")).getAttribute("value");
		String Expected= "Meghh";
		Assert.assertEquals(Actual, Expected);
		System.out.println(Actual);
		}
		
@Test(priority=7)
		public void Day() {
		//XPath Rule 6--- Using both "And OR"
		
		
		        // WebElement Days = driver.findElement(By.xpath("//select[@class='form-control' or @name='days' and @id='days']"));    //Day
		
		Select Day= new Select(driver.findElement(By.xpath("//select[@class='form-control' or @name='days' and @id='days']")));
		Day.selectByValue("23");
		String dayselected= Day.getFirstSelectedOption().getAttribute("value");
		Assert.assertEquals(dayselected ,"23" );
		System.out.println(dayselected);
						}
		
@Test(priority=8)
		public void Month(){
		
		//XPAth Rule 7 ---- Using Not & AND
		
				Select Months= new Select (driver.findElement(By.xpath("//select[not(@id='days') and (@name='months')]")));       //Months
				Months.selectByValue("4");
				String monthselected=  Months.getFirstSelectedOption().getText();
				Assert.assertEquals(monthselected, "April ");
				System.out.println(monthselected);
		}
		
		 
@Test(priority=9)
public void Years() {
		 //Using AND
	
				Select Years= new Select(driver.findElement(By.xpath("//select[@id='years' and @name='years']")));   						  //Year
				Years.selectByValue("1971");
				String yearselect= Years.getFirstSelectedOption().getAttribute("value");
				Assert.assertEquals(yearselect, "1971");
				System.out.println(yearselect);
}


@Test(priority=10)
public void spoffer() {
	
	//Using AND
	
	 			driver.findElement(By.xpath("//input[@type='checkbox' and @name='optin']")).click();									//SpecialOff
}


@Test(priority=11)
public void company() {
	
	//Using NOT and AND
				driver.findElement(By.xpath("//input[not(@name='office') and (@id='company')]")).sendKeys("Citizen Bank");
				String Actual= driver.findElement(By.xpath("//input[not(@name='office') and (@id='company')]")).getAttribute("value");
				String Expected= "Citizen Bank";
				Assert.assertEquals(Actual, Expected);
				System.out.println(Actual);
}
 @Test(priority=12)
	 public void address() {
		 
		 
		 //Using Starts with
		 			driver.findElement(By.xpath("//input[starts-with(@id, 'addre')]")).sendKeys("1800 fulton road");
		 			String Actual= driver.findElement(By.xpath("//input[starts-with(@id, 'addre')]")).getAttribute("value");
		 			String Expected= "1800 fulton road";
		 			Assert.assertEquals(Actual, Expected);
		 			System.out.println(Actual);


}

 @Test (priority=13)
public void city() {
		 
	 //Using AND
	 	WebElement City= driver.findElement(By.xpath("//input[@id='city' and @class='form-control']"));
		 City.click();
		 City.sendKeys("Shrine");
		 String Actual1= City.getAttribute("value");
		 Assert.assertEquals(Actual1, "Shrine");
		 System.out.println(Actual1);
	 }
 @Test(priority=14)
public void State() {
	
	 //Using Contains
				Select State= new Select(driver.findElement(By.xpath("//select[contains(@id, 'id_sta')]")));
				State.selectByValue("49");
				String selectedstate= State.getFirstSelectedOption().getText();
				Assert.assertEquals(selectedstate, "Wisconsin");
				System.out.println(selectedstate);
					
}
 
 @Test (priority=15)
 public void Zip() throws InterruptedException {
	 
	 //Using XPath
	 			driver.findElement(By.xpath("//input[@id= 'postcode']")).sendKeys("221166");
	 			String Expected = "221166";
	 			String Actual= driver.findElement(By.xpath("//input[@id= 'postcode']")).getAttribute("value");
	 			Assert.assertEquals(Actual, Expected);
	 			System.out.println(Actual);
	 			
 }
 
 @Test(priority=16)
 public void Country() {
	 
	 //Using Contains
	 
	 Select Country= new Select(driver.findElement(By.xpath("//select[contains(@id, 'd_coun')]")));
	 Country.selectByValue("21");
	 String selectedcountry= Country.getFirstSelectedOption().getText();
	 Assert.assertEquals(selectedcountry, "United States");
	 System.out.println(selectedcountry);
	  }
 
 
 @Test (priority=17)
 public void additional() {
	 
	 //Using AND
	 		driver.findElement(By.xpath("//textarea[@name= 'other' and @rows='3']")).sendKeys("Batunderthecave");
	 		String Actual= driver.findElement(By.xpath("//textarea[@name= 'other' and @rows='3']")).getAttribute("value");
	 		String Expected= "Batunderthecave";
	 		Assert.assertEquals(Actual, Expected);
	 		System.out.println(Actual);
	 
 }
 @Test (priority=18)
 public void Phone() {
	 
	 driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("+99523655485");
	 String Actual= driver.findElement(By.xpath("//input[@name='phone_mobile']")).getAttribute("value");
				String Expected= "+99523655485";
				Assert.assertEquals(Actual, Expected);
				System.out.println(Actual);

 }
@Test (priority=19)
public void FutureRef() {
	driver.findElement(By.xpath("//input[not(@id=Fahim) and (@name='alias')]")).clear();
	driver.findElement(By.xpath("//input[not(@id=Fahim) and (@name='alias')]")).sendKeys("Ghost Town");
	String Actual= driver.findElement(By.xpath("//input[not(@id=Fahim) and (@name='alias')]")).getAttribute("value");
			Assert.assertEquals(Actual, "Ghost Town");
			System.out.println(Actual);

}
@Test (priority=20)
public void Title() {
	driver.getTitle();
}
		@AfterTest
		public void Sleep() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		}
		}
		

