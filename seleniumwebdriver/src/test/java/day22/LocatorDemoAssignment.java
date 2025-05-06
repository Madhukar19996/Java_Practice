package day22;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemoAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		
		//Tagname -->(Attributes/Properties)
		
		/*
		 List<WebElement> image =driver.findElements(By.tagName("img"));
		 
		System.out.println(image.size());//5
		
		List<WebElement> Links =driver.findElements(By.tagName("a"));
		System.out.println(Links.size());//15
		
		
		//classname --> (Attributes/Properties)
		
	   List<WebElement> headerLinks=driver.findElements(By.className("nav-item"));
	   System.out.println(headerLinks.size());//8
	   */
	   
	 //linkText & partialLinkText -- only for links -->(Attributes/Properties)
	   
		//WebElement Links =driver.findElement(By.linkText("Contact"));
		// Links.click(); // linktext single step //preferable 
		
		WebElement PartialLink =driver.findElement(By.partialLinkText("art"));
		PartialLink.click(); // PartialLink
		
		
	 //driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]']")).click();//NoSuchElementException
	}

}
