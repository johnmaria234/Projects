package pagepckg;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {

	WebDriver driver;
	int countfail=0,countsucess=0;
	@FindBy(xpath="//*[@id='page-header']/section/div[1]/nav/div[1]")
	WebElement logohomebutton;
	
	//PAGE HEADERS
	@FindBy(xpath="//*[@id='page-header']/section/div[1]/nav/div[2]/div[1]/div/a")
	WebElement Flighthotelpageheader;
	@FindBy(xpath="//*[@id='page-header']/section/div[1]/nav/div[2]/div[2]/div/a")
	WebElement Hotelhomespageheader;
	@FindBy(xpath="//*[@id='page-header']/section/div[1]/nav/div[2]/div[3]/div/div[2]/div/div/a")
	WebElement Transportdropdown;
	@FindBy(xpath="//*[@id='page-header']/section/div[1]/nav/div[2]/div[4]/div/a")
	WebElement Activitiespageheader;
	@FindBy(xpath="//*[@id='page-header']/section/div[1]/nav/div[2]/div[5]/div/a")
	WebElement Couponsdealspageheader;
	@FindBy(xpath="//*[@id='page-header']/section/div[1]/nav/div[2]/div[9]/div/div[1]")
	WebElement Morepageheader;
	@FindBy(xpath="//*[@id='page-header']/section/div[2]/div[1]/div[1]/div[2]/div/button")
	WebElement Signinbuttonpageheader;
	@FindBy(xpath="//*[@id='page-header']/section/div[2]/div[1]/div[1]/div[1]/div/button")
	WebElement Createaccountbuttonph;
	@FindBy(xpath="//*[@id='page-header']/section/div[2]/div[2]/div/button")
	WebElement Cartbuttonpageheader;
	
	
	//SAVE MORE ON APP
	@FindBy(xpath="//*[@id=\"home-react-root\"]/main/div/div[1]/div/div[1]")
	WebElement Savemoreapp;
	@FindBy(xpath="//*[@id=\"home-react-root\"]/main/div/div[1]/div/div[1]/button")
	WebElement Closebuttn;
	
	public  Homepage(WebDriver driver) {		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		                             	}
	
                                  
	public void linkverifymethod() {
		List<WebElement> li =  driver.findElements(By.tagName("a"));
		System.out.println("count of links= "+li.size());
		for(WebElement ele:li) {
			String link= ele.getAttribute("href");
			verifylink(link);}System.out.println(countfail);}
	
		public void verifylink(String link) 
		 {  try {
				URI ob = new URI(link);
				HttpURLConnection  c =	(HttpURLConnection)ob.toURL().openConnection();
			if(c.getResponseCode()==200) {countsucess++;
				//System.out.println("sucessful; response code 200 "+link); 
				}
			else if(c.getResponseCode()==404) {countfail++;
			//System.out.println("sucessful; response code 404 "+link);
			}
		 		}catch(Exception e){e.getMessage();}
								         }
		
		public void titleverification() {
			  String actualtitle = driver.getTitle();
			  System.out.println(actualtitle);
				String expectedtitle = "Agoda";
				if(expectedtitle.equals(actualtitle)) {System.out.println("Title verification:pass");}
				else {System.out.println("Tiltle verification: fail");}}
		
		
		
		 public void keywordverification(String keyword ) {
				String src =driver.getPageSource();
				if(src.contains(keyword)) {System.out.println("text contains "+keyword);}
				else {System.out.println("text doesnt contain "+keyword);}
				}
		 
		 
		 public void newtab() {
			 String parentwindow =driver.getWindowHandle();
			 Couponsdealspageheader.click();
			 Set<String> allWindowHandles = driver.getWindowHandles();
				for(String handle : allWindowHandles) {
					
					if(!handle.equalsIgnoreCase(parentwindow)) {				
						driver.switchTo().window(handle);
						keywordverification("Today's deals");
						//driver.close();  
						}
					    driver.switchTo().window(parentwindow);     
				}
		 }
	
}


	