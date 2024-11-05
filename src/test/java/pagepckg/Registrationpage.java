package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	WebDriver driver;	
	//@FindBy(xpath="//*[@id='page-header']/section/div[2]/div[1]/div[1]/div[1]/button/div/div/span")
	@FindBy(xpath="/html/body/div[8]/header/section/div[2]/div[1]/div[1]/div[1]/button/div/div/span")
	WebElement registerlink;
	@FindBy(xpath="//*[@id=\"root\"]/div/div")
	WebElement frame1;
	
	@FindBy(id="firstName")
	WebElement Firstname;
	@FindBy(xpath="//*[@id='lastName']")
	WebElement Lastname;
	@FindBy(xpath="//*[@id='email']")
	WebElement 	Email;
	@FindBy(xpath="//*[@id='password']")
	WebElement Password;
	@FindBy(xpath="//*[@id='confirmPassword']")
	WebElement ConfirmPassword;
	@FindBy(xpath="//*[@id='email-signup-button']")
	WebElement Submitbutton;

	
	@FindBy(xpath="//*[contains(@class='sc-cwHptR fpPEBz')]")
	//"/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/div[1]/div[2]/span")
	WebElement error1;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/span")
	WebElement error2;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/span")
	WebElement error3;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/div[4]/div[2]/span")
	WebElement error4;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/div[5]/div[2]/span")
	WebElement error5;

	
//	@FindBy(xpath="//*[@id=\"newsLetter\"]")
//	WebElement Checkbox;

	//Other sign up options
	@FindBy(xpath="//*[@id=\"grid2\"]/div[1]/button/div")
	WebElement GoogleSignup;
	@FindBy(xpath="//*[@id='grid2']/div[2]/button/div/div[2]")
	WebElement FacebookSignup;
	@FindBy(xpath="//*[@id='grid2']/div[3]/button/div/div[1]")
	WebElement AppleSignup;
	
	//Already have account Sign In link
	@FindBy(xpath="//*[@id='root']/div/div/div[6]/button/div/div")
	WebElement Alreadyhaveaccount;
	
	public  Registrationpage(WebDriver driver) {		
		this.driver = driver;
		PageFactory.initElements(driver, this); }
	
	public void Registration(String fname,String lname,String email,String pass,String cpass) {
		registerlink.isDisplayed();
		System.out.println(registerlink.getText());
		registerlink.click();
		driver.switchTo().frame(0);
		Firstname.sendKeys(fname);	
		Lastname.sendKeys(lname);
		Email.sendKeys(email);
		Password.sendKeys(pass);
		ConfirmPassword.sendKeys(cpass);
		if(Submitbutton.isEnabled()) { Submitbutton.click(); }
		else { 
			if(error1.isDisplayed()) {System.out.println(error1.getText());}
			if(error2.isDisplayed()) {System.out.println(error2.getText());}
			if(error3.isDisplayed()) {System.out.println(error3.getText());}
			if(error4.isDisplayed()) {System.out.println(error4.getText());}
			if(error5.isDisplayed()) {System.out.println(error5.getText());}
			//driver.navigate().refresh();
		    }
		
		
		
		}
	
	
}
