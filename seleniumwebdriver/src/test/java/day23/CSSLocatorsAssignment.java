package day23;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		//tag class  tag.classname
		
		//driver.findElement(By.cssSelector(".form-control ")).sendKeys("IPhone 16");
		
		//tag id  tag#id
		driver.findElement(By.cssSelector("#form-currency")).click();
		Thread.sleep(3000);
		
		//tag attribute   tag[attribute='value']
		driver.findElement(By.cssSelector("button.currency-select[name='USD']")).click();
		
		
		//tag attribute   tag[attribute='value']
		driver.findElement(By.cssSelector("[data-loading-text='Loading...']")).click();
		
		

	}

}
