package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='page-header']/section/div[2]/div[1]/div[1]/div[2]/button/div/div")
	WebElement Signin;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	@FindBy(xpath="//*[@id='root']/div/div/div/div[2]/div/div[2]/form/div[1]/div[3]/button")
	WebElement Submitbutton;


	public  Loginpage(WebDriver driver) {		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		                             	}
	
	public void login(String mailid,String pass) {
		Signin.click();
		Email.sendKeys(mailid);
		Password.sendKeys(pass);
		Submitbutton.click();
		
	                     }	
	          
	
	
	
}
