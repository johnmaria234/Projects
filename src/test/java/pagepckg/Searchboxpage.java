package pagepckg;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Searchboxpage {
	     WebDriver driver;	   
	    @FindBy(xpath="//*[@id=\"home-react-root\"]/main/div/div[1]/div/div[1]/button")
		WebElement popup;	  
	   //SEARCHBOX
		@FindBy(xpath="//*[@id='tab-all-rooms-tab']/div/div")
		WebElement Hotelstab;
		@FindBy(xpath="//*[@id='tab-home']/div/div")
		WebElement HomesAptstab;
		@FindBy(xpath="//*[@id='tab-packages-tab']/div[2]/div")
		WebElement FlightsHotelstab;
		@FindBy(xpath="//*[@id='tab-flight-tab']/div/div")
		WebElement Flightstab;
		@FindBy(xpath="//*[@id=\"tab-activities-tab\"]/div[1]")
		WebElement Activitiestab;
		@FindBy(xpath="")
		WebElement Airporttransfertab;
		
		//HOTELS SEARCHBAR
		@FindBy(xpath="//*[@id=\"funnel-toggles-container\"]/div[1]")
		WebElement Overnightstays;
		@FindBy(xpath="//*[@id=\"funnel-toggles-container\"]/div[2]")
		WebElement Dayusestays;
		@FindBy(xpath="//*[@id=\"autocomplete-box\"]")
		WebElement searchbar;
		@FindBy(xpath="//div[@id=\"check-in-box\"]")
		WebElement Checkin;
		@FindBy(xpath="//*[@id=\"check-out-box\"]")
		WebElement Checkout;
		@FindBy(xpath="//*[@id=\"occupancy-box\"]/div/div/div/div[1]")
		WebElement Noofpersonandrooms;
		@FindBy(xpath="//*[@id=\"SearchBoxContainer\"]/div[2]")
		WebElement Searchbutton;
		
	
		
		//HOMES AND APARTMNTS SEARCHBAR
		//FLIGTHS AND HOTELS SEARCHBAR
		//AIRPORTTRANSFER  SEARCHBAR
		
		//FLIGTHS  SEARCHBAR
		@FindBy(xpath="//*[@id=\"tabpanel-flight-tab\"]/div[1]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/button")
		WebElement oneway;
		@FindBy(xpath="//*[@id=\"tabpanel-flight-tab\"]/div[1]/div/div[1]/div/div[1]/div[1]/div/div/div[2]/button")
		WebElement roundtrip;
		@FindBy(xpath="//*[@id=\"flight-origin-text-search\"]/div")
		WebElement flyingfrom;
		@FindBy(xpath="//*[@id=\"flight-destination-search-input\"]")
		WebElement flyingto;
		@FindBy(xpath="//*[@id=\"flight-departure\"]/div/div/div/div")
		WebElement departure;
		@FindBy(xpath=" ")
		WebElement arrival;
		@FindBy(xpath="//*[@id=\"flight-occupancy\"]/div/div/div")
		WebElement passangereconomy;
		@FindBy(xpath="//*[@id=\"Tabs-Container\"]/button/div")
		WebElement searchbarf;
		
		
		//ACTIVITIES  SEARCHBAR
		@FindBy(xpath="//*[@id=\"Tabs-Container\"]/button")
		WebElement Searchbuttonact;
		@FindBy(xpath="//*[@id=\"activities-search-input\"]")
		WebElement activitiessearch;
		@FindBy(xpath="//*[@id=\"autocompleteSearch\"]/div/div/ul/li[1]")
		WebElement searchsuggestionact;
		
	  
		
		
	  //SearchBar
		@FindBy(xpath="//*[@id=\"textInput\"]")
		 WebElement search;
		@FindBy(xpath="//*[@id=\"home-react-root\"]/main/section/section")
		 WebElement clickoutofbox;
		@FindBy(xpath="//div[@id='SearchBoxContainer']/div/div/div[2]/div/div/div[6]/div/div/ul/li")
		WebElement  searchlist;
		

	//DATEPICKER
		@FindBy(xpath="//div[@id='DatePicker__Accessible']/div/div[2]/div/div")
		WebElement monthdetails;
		@FindBy(xpath="//div[@id=\"DatePicker__Accessible\"]/div/div[1]/div[2]/button")
		WebElement nextbutton;
		@FindBy(xpath="//div[@id=\"DatePicker__Accessible\"]/div/div[2]/div[1]/div[3]/div/div")
		 List<WebElement> datelist;

		//NumberSelectbutton
		@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div[1]/div[1]/div[2]/div[2]/div/button")
		WebElement room;
		@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div/div[2]/div[2]/button[2]")
		WebElement person;
		@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div[1]/div[3]/div[2]/button[2]")
		WebElement children;

	
		
		public  Searchboxpage(WebDriver driver) {		
			this.driver = driver;
			PageFactory.initElements(driver, this);	               	}
		
		
		public void popupclose() {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(popup));
			popup.click();		}
		
		
		public void hotels()  { Hotelstab.click(); }
		
		public void hotelssearchbar(String place) {
            search.sendKeys(place);
  			      Actions act = new Actions(driver);
             act.keyDown(searchlist,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
             act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
             act.perform(); 	}
		
		public void hotelscheckin(String expmonth,String expdate) {
              datepicker(expmonth,expdate);  }
		public void hotelscheckout(String expmonth,String expdate) {
              datepicker(expmonth,expdate);  }
		
		public void slots(int rn,int pn,int cn) {	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));	
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			  while(rn>1) { room.click();rn--; }
		      while(pn>2) { person.click(); pn--; }	           
		      wait.until(ExpectedConditions.elementToBeClickable(children));
		      while(cn>0) { 
		      children.click(); cn--;}  
		       wait.until(ExpectedConditions.elementToBeClickable(Noofpersonandrooms));
		       Noofpersonandrooms.click();   	}
			   
		public void searchbutton() { Searchbutton.click(); }
		
		public void dayusehotel(String expmonth,String expdate) {  Dayusestays.click();
			   Checkin.click();
			   datepicker(expmonth,expdate);    }

		public  void datepicker(String expmonth,String expdate) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				while(true) {
			    String actualmonth = monthdetails.getText();
			    if(actualmonth.equalsIgnoreCase(expmonth)) {System.out.println(actualmonth);break; }
			    else {   wait.until(ExpectedConditions.elementToBeClickable(nextbutton));
			    nextbutton.click(); }        }        
			   for(WebElement ele:datelist) {			   
				String actdate =ele.getText();
				if(actdate.equals(expdate)) {ele.click();break;} }  	}
		
		
	     public void activities(String placeoractivity) {
		   Activitiestab.click();
		   activitiessearch.sendKeys(placeoractivity);
		   Actions act = new Actions(driver);
           act.keyDown(searchsuggestionact,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
           act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
           act.perform(); 
           Searchbuttonact.click();    }
	     
	     
	     public void flights() {
	    	 Flightstab.click();
	    	 
	    	 
	     }
	     
	
	
}
		


