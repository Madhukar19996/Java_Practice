package day22;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com.gr/");
		
		
		//name --> (Attributes/Properties)

		//WebElement Search_Box =driver.findElement(By.name("search"));
		//Search_Box.sendKeys("MacBook");
		//driver.findElement(By.name("search")).sendKeys("MacBook"); //Single-step
		
		
		
		//id --> (Attributes/Properties)
		
		//WebElement Image =driver.findElement(By.id("content"));
		//boolean status=Image.isDisplayed();
		//boolean status=driver.findElement(By.id("content")).isDisplayed();
		//System.out.println("Displayed status:"+status);
		
		
		
		//linkText & partialLinkText -- only for links -->(Attributes/Properties)
		
		//WebElement linktext =driver.findElement(By.linkText("Tablets"));
		//linktext.click();
		//driver.findElement(By.linkText("Contact Us")).click(); // linktext single step //preferable
		//driver.findElement(By.partialLinkText("Tab")).click(); //partialLinkText 
		
		
		//classname --> (Attributes/Properties)
		
		//List<WebElement> headerLinks=driver.findElements(By.className("col-sm-3"));
		//System.out.println(headerLinks.size());//5
		
		
		//Tagname -->(Attributes/Properties)
		
		/*List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());//73
		List<WebElement> Images=driver.findElements(By.tagName("img"));
		System.out.println(Images.size());//29
		*/
		
		//WebElement ele=driver.findElement(By.id("abc")); //NoSuchElementException
		 
		List<WebElement> ele=driver.findElements(By.tagName("abc"));
		System.out.println(ele.size());//0
		
		
		
		

	}

}
