package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
Test Case
----------
1) Launch browser (Chrome)
2) Open the URL https://demo.opencart.com.gr/
3) Validate title should be "Your Store"
4) Close the browser

 */



public class FirstTestcase {

	public static void main(String[] args) {
		//1) Launch browser (Chrome)
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		
		//2) Open the URL https://demo.oprncart.com/
		
		driver.get("https://demo.opencart.com.gr/");
		
		//3) Validate title should be "Your Store"
		
		String act_title=driver.getTitle();
		
		if (act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
			
		}
		
		//4) Close the browser
		//driver.close();
		  driver.quit();



	}

}
