package Testcases;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Baseclass.BaseTest;
import pageobjects.Homepage;
import pageobjects.Practisepage;
import pageobjects.Reigisterclass;

public class practicePageLanding extends BaseTest {

	@Test
	public void landingPage() throws InterruptedException {

		Practisepage pg = new Practisepage(driver);


		Homepage hp=pg.homebutton();
		
		//Homepage hp= new Homepage(driver);
		
	 Thread.sleep(5000);
		Reigisterclass rc=hp.joinbutton();
		
	
		
	
		
	

		
		
		
		
		

		

	}

}
