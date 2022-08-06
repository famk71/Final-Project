package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSS_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

WebDriver Driver;
/*package classwork;

import org.openqa.selenium.By;

public class CssDemo extends LaunchBase{

	public static void main(String[] args) throws Exception {

		CssDemo obj = new CssDemo();
		obj.launch("Chrome", "http://automationpractice.com/index.php");
		obj.cssUsage();
		obj.quitBrowser();*/

	
	
	public void cssUsage() throws Exception {
		
		String searchCss = "input#search_query_top"; // using id
		String searchCss2 = "input.search_query"; // using class
		String searchCss3 = "input[name='search_query']"; //Using attribute
		String searchCss4 = "input[placeholder='Search'][name='search_query']"; // using multiple attibutes
		
		String submitCss = "button.btn[name='submit_search']"; // using class and attribute
		String contLinkCss = "a[title='Contact Us']";
		
		String srchInputCss = "input[name^=search]"; // using prefix or starts with
		String srchInputCss2 = "input[name$=uery]"; // using suffix or ends with
		String srchInputCss3 = "input[name*=_que]"; // using substring
		
		String btnCss1 = "div > form > button"; // using parent and child
		String btnCss2 = "form button[name='submit_search']"; // using ancestor 
		String srchInputCss4 =  "form > input+input+input+input"; //using sibling traversing
		String srchInputCss5 = "form > input:nth-child(4)"; // using nth-element
		
		Driver.findElement(By.cssSelector(srchInputCss5)).sendKeys("Summer dresses");
		Thread.sleep(4000);
		Driver.findElement(By.cssSelector(btnCss1)).click();
		Thread.sleep(4000);
	

}}
