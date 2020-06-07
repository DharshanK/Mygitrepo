package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	
	public static WebDriver driver;
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"carousel-example-generic\"]/div/div/div/div/div/a")
	public static WebElement joinbutton;
	
	
	static  By Joinnow=By.xpath("//*[@id=\"carousel-example-generic\"]/div/div/div/div/div/a");
	
	static  By radiobutton2=By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input");
	
	static By Autosugsestinput =By.id("autocomplete");
	
	public static Reigisterclass joinbutton()
	{
		
		
		
		Elementclick(joinbutton);
		
		
		return new Reigisterclass(driver);
		
		
		
	}
	
	
	public static void Elementclick(WebElement elememt)
	{
		elememt.click();
	}
	

	
}
