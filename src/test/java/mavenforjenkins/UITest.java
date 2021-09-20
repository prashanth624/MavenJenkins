package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest 
{

	@Parameters("Browser")
	@Test
	public void startBrowser(String browserName)
	{
		System.out.println("Parameter value is "+browserName);
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prashanth_a1\\eclipse_workspace_old\\chromedriver_win32\\chromedriver.exe"); 
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prashanth_a1\\eclipse_workspace_old\\SeleniumGecko\\geckodriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
		driver.quit();
	}
	
	
	/*@Test
	public void startBrowser()
	{
		
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prashanth_a1\\eclipse_workspace_old\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
		driver.quit();
		
		System.out.println("hello");
		
	}*/
	
	
	
	
	
}
