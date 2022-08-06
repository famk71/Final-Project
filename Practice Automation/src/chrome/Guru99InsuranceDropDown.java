package chrome;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99InsuranceDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA Study\\Selenium\\Driverexes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		//driver.findElement(By.id("user_title")).click();
		//Select input= new Select(driver.findElement(By.id("user_title")));
		//input.selectByValue("Squadron Leader");
		WebElement Title= driver.findElement(By.cssSelector("select#user_title"));
		Select T=new Select (Title);
		T.selectByValue("Professor");
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("Fahim");
		driver.findElement(By.id("user_surname")).sendKeys("Khan");
		driver.findElement(By.name("phone")).sendKeys("9176584563");
		driver.findElement(By.name("year"));
		Select input1= new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		input1.selectByValue("1971");
		driver.findElement(By.id("user_dateofbirth_2i"));
		Select input2= new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		input2.selectByValue("12");
		driver.findElement(By.name("date"));
		Select input3=new Select(driver.findElement(By.name("date")));
		input3.selectByValue("16");
		driver.findElement(By.id("licencetype_f")).click();
		driver.findElement(By.id("user_licenceperiod"));
		Select input4= new Select(driver.findElement(By.id("user_licenceperiod")));
		input4.selectByValue("4");
		driver.findElement(By.name("occupation"));
		Select input5=new Select(driver.findElement(By.id("user_occupation_id")));
		input5.selectByValue("27");
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("1843 Offroad");
		driver.findElement(By.name("city")).sendKeys("Dhaka");
		driver.findElement(By.xpath("//input[@id='user_address_attributes_county']")).sendKeys("Bangladesh");
		driver.findElement(By.xpath("//input[@placeholder='sy24 5be']")).sendKeys("1219");
		driver.findElement(By.name("email")).sendKeys("famk17@bazinga.com");
		driver.findElement(By.name("password")).sendKeys("ImUnderYourBed");
		driver.findElement(By.name("c_password")).sendKeys("ImUnderYourBed");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
