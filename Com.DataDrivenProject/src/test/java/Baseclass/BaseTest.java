package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	
	public static WebDriver driver;
	public static Properties config =new Properties();
	public static Properties OR =new Properties();
	public static FileInputStream fis;
	
	@BeforeSuite
	public void Setup()
	{
		if (driver==null)
		{
			try {
				fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\config.properties");
				config.load(fis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}
			
			try {
				fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\OR.properties");
				OR.load(fis);
			} catch (Exception T) {
				// TODO Auto-generated catch block
				T.printStackTrace();
			}
			
			String browser=config.getProperty("Browser");
			if(browser.equalsIgnoreCase("chrome"))
			{
				
				//C:\Users\DHARSAN K\eclipse-workspace\Com.DataDrivenProject\src\test\resources\Executables\chromedriver.exe
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
				 driver=new ChromeDriver();
				
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				
				//C:\Users\DHARSAN K\eclipse-workspace\Com.DataDrivenProject\src\test\resources\Executables\chromedriver.exe
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
				 driver=new FirefoxDriver();
				
			}
			
			driver.get(config.getProperty("SiteURL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	
	public static void manualclick(String Xpath)
	{
		driver.findElement(By.xpath(Xpath)).click();
	}
	
@AfterSuite
	public void Teardown()
	{
		driver.quit();
	}
}
