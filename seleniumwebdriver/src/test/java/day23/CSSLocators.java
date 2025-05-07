package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {   
		 
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize(); // maximize the browser window
		
		//tag id  tag#id
		
	    //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Shoes");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Shoes");
		  
		  
		//tag class  tag.classname
		  
		//driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("Dell Laptop");
		
		
		//tag attribute   tag[attribute='value']
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("Mac Book");
		
		
		//tag class attribute    tag.classname[attribute='value']
		
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("IPhone 16");
		driver.findElement(By.cssSelector("button.button-1[type=\"submit\"]")).click();
		 
		
		

	}

}
