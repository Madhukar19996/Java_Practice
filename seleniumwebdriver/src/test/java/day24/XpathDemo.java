package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("MacBook");
		
		//Xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'][@type='text']")).sendKeys("IPhone 16 ");
		
		//Xpath with 'and'  'or' operator
		//driver.findElement(By.xpath("//input[@name='search' and@type='text']")).sendKeys("Dell Laptop");
		//driver.findElement(By.xpath("//input[@name='abc'or@type='text']")).sendKeys("Samsung Tablet");
		
		//Xpath with text()
		//driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		/*
		boolean DisplayStatus =driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
		System.out.println(DisplayStatus);
		
		String value =driver.findElement(By.xpath("//*[text()='Featured']")).getText();
		System.out.println(value);
		*/
		
		//Xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@name,'sea')]")).sendKeys(" Canon Camera");
		 
		//Xpath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@name,'sea')]")).sendKeys(" Canon Camera");
		
		//chained xpath 
		boolean imgagestatus=driver.findElement(By.xpath("//div[@class='image']//a/img")).isDisplayed();
		System.out.println(imgagestatus);
	}

}
