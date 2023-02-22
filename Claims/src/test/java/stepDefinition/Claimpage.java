package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.pageobject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Claimpage {
	
	WebDriver driver = null;
	@Given("user on the browser")
	public void user_on_the_browser() {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        driver = new ChromeDriver();
	}

	@When("user enter the url {string}")
	public void user_enter_the_url(String string) {
		driver.get("http://20.62.171.46:4200/");
		driver.manage().window().maximize();
	   
	}

	@When("user enter the username")
	public void user_enter_the_username() {
			
		
	}

	@Then("user enter the password")
	public void user_enter_the_password() throws InterruptedException {
	    
		pageobject p = new pageobject(driver);
		p.SignUp();
		Thread.sleep(2000);
		p.enterUsername("rah");
		Thread.sleep(2000);
		p.enterEmail("rahulreddi");
		Thread.sleep(2000);
		p.enterPassword("Reddi");
		Thread.sleep(2000);
		p.enterConfirmPassword("Reddi");
		Thread.sleep(2000);
		p.Reset();
		Thread.sleep(2000);
		p.enterUsername1("reddi");
		Thread.sleep(2000);
		p.enterEmail1("rahulreddi98@gmail.com");
		Thread.sleep(2000);
		p.enterPassword1("Reddi@12345");
		Thread.sleep(2000);
		p.enterConfirmPassword1("Reddi@12345");
		Thread.sleep(2000);
		p.Submit();
		Thread.sleep(2000);
		p.Cancel();
		Thread.sleep(2000);
		p.enterLoginUsername("admin098");
		Thread.sleep(2000);
		p.enterLoginPassword("Admin@12345");
		Thread.sleep(2000);
		p.Login();
		Thread.sleep(2000);
		p.Year();
		Thread.sleep(2000);
		p.YearNone();
		Thread.sleep(2000);
		p.Year1();
		Thread.sleep(2000);
		p.Year2022();
		Thread.sleep(2000);
		p.Year2();
		Thread.sleep(2000);
		p.Year2021();
		Thread.sleep(2000);
		p.Year3();
		Thread.sleep(2000);
		p.Year2020();
		Thread.sleep(2000);
		p.Year4();
		Thread.sleep(2000);
		p.Year2019();
		Thread.sleep(2000);
		p.Year5();
		Thread.sleep(2000);
		p.Year2018();
		Thread.sleep(2000);
		p.Year6();
		Thread.sleep(2000);
		p.Years2021();
		Thread.sleep(2000);
//		p.Facility();
//		Thread.sleep(2000);
//		p.HomenickReilly();
//		Thread.sleep(2000);
		p.menu();
		Thread.sleep(2000);
		p.AddClaims();
		Thread.sleep(2000);
		
		
	}

}
