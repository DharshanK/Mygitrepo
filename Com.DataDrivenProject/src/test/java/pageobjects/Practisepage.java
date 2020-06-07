package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practisepage {

	public static WebDriver driver;
	
	
	public Practisepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="/html/body/header/div/a/button")
	public static WebElement homebutton;
	
	@FindBy(id="autocomplete")
	public static WebElement Autosugsestinput;
	
	//static  By homebutton=By.xpath("/html/body/header/div/a/button");
	
	static  By radiobutton2=By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input");
	
	//static By Autosugsestinput =By.id("autocomplete");
	
	public static Homepage homebutton()
	{
		
		
		homebutton.click();
		
		return new Homepage(driver);
		
	
		
	}
	
	
	}
	


