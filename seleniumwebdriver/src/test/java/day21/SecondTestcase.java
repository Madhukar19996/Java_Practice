package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

/*
Test Case
----------
1) Launch browser (Edge)
2) Open the URL https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
3) Validate title should be "OrangeHRM"
4) Close the browser

 */



public class SecondTestcase {

	public static void main(String[] args) {
		//1) Launch browser (Chrome)
		//ChromeDriver driver =new ChromeDriver();
		
		//Edge Browser
		WebDriver driver =new EdgeDriver();
		
		
		//2) Open the URL https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//3) Validate title should be "OrangeHRM"
		
		String act_title=driver.getTitle();
		
		if (act_title.equals("OrangeHRM"))
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
