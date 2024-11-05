package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Hamburgerpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='page-header']/section/div[2]/div[3]/div/span/button")
	WebElement Hamburgermenu;
	@FindBy(xpath="/html/body/div[13]/div/div/div[4]/button")
	WebElement Createaccountlink;
	@FindBy(xpath="/html/body/div[13]/div/div/div[3]/button/div/div/span")
	WebElement Signinlink;
	@FindBy(xpath="/html/body/div[13]/div/div/div[7]/ul/li[1]/div/div/span")
	WebElement Languageselectionlink;
	@FindBy(xpath="/html/body/div[13]/div/div/div[7]/ul/li[2]/div/div/span")
	WebElement  Currencyselectionlink;
	@FindBy(xpath="/html/body/div[15]/div/div/div[8]/a/div[2]")
	WebElement Listplaces;
	
	
	@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div[2]/div/div[2]/div[4]")
	WebElement Selectlanguage;
	@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div[2]/div/div[2]/div[4]")
	WebElement Selectcurrency;
	
	@FindBy(xpath="")
	WebElement Item1;
	@FindBy(xpath="")
	WebElement Item2;
	@FindBy(xpath="")
	WebElement Item3;
	@FindBy(xpath="")
	WebElement Item4;
	@FindBy(xpath="")
	WebElement Item5;
	@FindBy(xpath="")
	WebElement Item6;
	@FindBy(xpath="")
	WebElement Item7;
	@FindBy(xpath="")
	WebElement Item8;
	@FindBy(xpath="")
	WebElement Item9;
	@FindBy(xpath="")
	WebElement Item10;
	
	
	public  Hamburgerpage(WebDriver driver) {		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		                             	}
	public void hamburgersignup() {
		Hamburgermenu.click();
		Signinlink.click();    }	
	
	public void hamburgerregistration() {
		Hamburgermenu.click();
		Createaccountlink.click();    }
	
	public void hamburgerlanguage() {
		Hamburgermenu.click();
		Languageselectionlink.click(); 
		Select select = new Select(Selectlanguage);
		select.selectByVisibleText("English");
		
	}
	
	public void hamburgercurrency() {
		Hamburgermenu.click();
		Currencyselectionlink.click(); 
		Select select = new Select(Selectlanguage);
		select.selectByVisibleText("Rupee");
		
	}

	public void hamburgerlistplaces() {
		Hamburgermenu.click();
		Listplaces.click();    }
	
	
	
	
	
	
	
}
