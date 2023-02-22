package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageobject {
	
	public WebDriver ldriver;
  
	
	//Locators
	By txt_Username = By.xpath("username");
	By txt_Email = By.xpath("Email");
	By txt_Password = By.xpath("Password");
	By txt_ConfirmPassword = By.xpath("ConfirmPassword");
	
	//PageFactory
	
	public pageobject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	//Methods
	
	public void SignUp()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='Sign-Up']")).click();
	}
	public void enterUsername(String username)
	{
		
		ldriver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys(username);
	}
	
	public void enterEmail(String Email)
	{
	    ldriver.findElement(By.xpath("//*[@placeholder='pat@example.com']")).sendKeys(Email);
	}
	
	public void enterPassword(String Password)
	{
		ldriver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(Password);
	}
	
	public void enterConfirmPassword(String ConfirmPassword)
	{
		ldriver.findElement(By.xpath("//*[@formcontrolname='confirmPassword']")).sendKeys(ConfirmPassword);
	}
	
	public void Reset()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='Reset']")).click();
	}
	
	public void enterUsername1(String username)
	{
		
		ldriver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys(username);
	}
	
	public void enterEmail1(String Email)
	{
	    ldriver.findElement(By.xpath("//*[@placeholder='pat@example.com']")).sendKeys(Email);
	}
	
	public void enterPassword1(String Password)
	{
		ldriver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(Password);
	}
	
	public void enterConfirmPassword1(String ConfirmPassword)
	{
		ldriver.findElement(By.xpath("//*[@formcontrolname='confirmPassword']")).sendKeys(ConfirmPassword);
	}
	
	public void Submit()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
	}
	
	public void Cancel()
	{
		ldriver.findElement(By.xpath("//span[.='Cancel']")).click();
	}
	
	public void enterLoginUsername(String enterLoginUsername)
	{
		ldriver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys(enterLoginUsername);
	}
	
	public void enterLoginPassword(String enterLoginPassword)
	{
		ldriver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(enterLoginPassword);
	}
	
	public void Login()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
	}
	
	public void Year()
	{
		ldriver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
	}
	
	public void YearNone()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='None']")).click();
	}
	
	public void Year1()
	{
		ldriver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
	}
	
	public void Year2022()
	{
		ldriver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='2022']")).click();
	}
	
	public void Year2()
	{
		ldriver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
	}
	
	public void Year2021()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='2021']")).click();
	}
	
	public void Year3()
	{
		ldriver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
	}
	
	public void Year2020()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='2020']")).click();
	}
	
	public void Year4()
	{
		ldriver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
	}
	
	public void Year2019()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='2019']")).click();
	}
	
	public void Year5()
	{
		ldriver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
	}
	
	public void Year2018() 
	{
		ldriver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='2018']")).click();
	}
	
	public void Year6()
	{
		ldriver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
	}
	
	public void Years2021()
	{
		ldriver.findElement(By.xpath("//span[normalize-space()='2021']")).click();
	}
	
//	public void Facility()
//	{
//		ldriver.findElement(By.xpath("//*span[@class='mat-select-placeholder mat-select-min-line ng-tns-c101-179 ng-star-inserted']")).click();
//	}
//    
//	public void HomenickReilly()
//	{
//		ldriver.findElement(By.xpath("//*span[normalize-space()='Homenick-Reilly']")).click();
//	}
	
	public void menu()
	{
		ldriver.findElement(By.xpath("//*mat-icon[normalize-space()='menu']")).click();
	}
	
	public void AddClaims()
	{
		ldriver.findElement(By.xpath("//*mat-list-item[2]/span[@class='mat-list-item-content']")).click();
	}
}
