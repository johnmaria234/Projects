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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Searchboxpage {
	     WebDriver driver;	

			public  Searchboxpage(WebDriver driver) {		
				this.driver = driver;
				PageFactory.initElements(driver, this);	               	} 
	  
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
		
		//HOMES AND APARTMNTS SEARCHBAR
		//FLIGTHS AND HOTELS SEARCHBAR
		//AIRPORTTRANSFER  SEARCHBAR

		
		

		
	  
		
		

	//DATEPICKER
		@FindBy(xpath="//div[@id='DatePicker__Accessible']/div/div[2]/div/div")
		WebElement monthdetails;
		@FindBy(xpath="//div[@id=\"DatePicker__Accessible\"]/div/div[1]/div[2]/button")
		WebElement nextbutton;
		@FindBy(xpath="//div[@id=\"DatePicker__Accessible\"]/div/div[2]/div[1]/div[3]/div/div")
		 List<WebElement> datelist;

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
		
		

	
		
		
	     //popup
	    @FindBy(xpath="//*[@id=\"home-react-root\"]/main/div/div[1]/div/div[1]/button")
		WebElement popup;
	    
		public void popupclose() {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(popup));
			popup.click();		}

		  //SearchBar
			@FindBy(xpath="//*[@id=\"SearchBoxContainer\"]/div[1]/div/div[2]/div/div/div[5]/div/div/ul/li[5]")
			 WebElement searchlist1;
			@FindBy(xpath="//*[@id=\"textInput\"]")
			 WebElement search;
			@FindBy(xpath="//div[@id='SearchBoxContainer']/div[1]/div/div[2]/div/div/div[6]/div/div/ul/li[1]")
			WebElement  searchlist;
			//*[@id="SearchBoxContainer"]/div[1]/div/div[2]/div/div/div[5]/div/div/ul/li[1]
			//*[@id="SearchBoxContainer"]/div[1]/div/div[2]/div/div/div[5]/div/div/ul/li[5]
			//*[@id="textInput"]
		
			
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
		//NumberSelectbutton
		@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div[1]/div[1]/div[2]/div[2]/div/button")
		WebElement room;
		@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div/div[2]/div[2]/button[2]")
		WebElement person;
		@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div[1]/div[3]/div[2]/button[2]")
		WebElement children;
		@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div[2]/ul/div/li/div/select")
		WebElement childage;
		@FindBy(xpath="//*[@id=\"FocusTrap\"]/div/div[2]/div[2]/ul/div/div/div/div/div/div/div[1]/div/div/button/div[1]")
		WebElement  ageofchild;
		@FindBy(xpath="//*[@id=\"SearchBoxContainer\"]/div[1]/div/div[2]/div/div/div[5]/div/div")
		WebElement  agepane;
		

		public void hotels(String place,String month1,String date1,String month2,String date2,int rn,int pn,int cn) 
		{WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			Hotelstab.click(); 
			Overnightstays.click();
		   search.sendKeys(place);
		   wait.until(ExpectedConditions.elementToBeClickable(searchlist));
		      Actions act = new Actions(driver);
              act.keyDown(searchlist,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
              act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
                act.perform(); 	
                datepicker(month1,date1);
                datepicker(month2,date2);
               	
   
        		wait.until(ExpectedConditions.elementToBeClickable(room));
        		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,400)");
        			  while(rn>1) { room.click();rn--; }
        		      while(pn>2) { person.click(); pn--; }	           
        		      wait.until(ExpectedConditions.elementToBeClickable(children));
        		      while(cn>0) { 
        		      children.click(); cn--;}  
        		     
        		      
        		  //    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", childage);
        		   //   wait.until(ExpectedConditions.elementToBeClickable(childage));
        		     //childage.click();
        		      Select age = new Select(childage);
        		      age.selectByIndex(5);
        		       //wait.until(ExpectedConditions.elementToBeClickable(Noofpersonandrooms));
        		      // Noofpersonandrooms.click(); 
        		       Searchbutton.click();  
        		      
        		       }
		
		public void hotels(String place,String month1,String date1,int rn,int pn,int cn) 
		{WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			Hotelstab.click(); 
			 Dayusestays.click();
		   search.sendKeys(place);
		   wait.until(ExpectedConditions.elementToBeClickable(searchlist1));
		      Actions act = new Actions(driver);
              act.keyDown(searchlist1,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
              act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
                act.perform(); 	
                datepicker(month1,date1);
    
        		wait.until(ExpectedConditions.elementToBeClickable(room));
       		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,200)");
       			  while(rn>1) { room.click();rn--; }
       		      while(pn>2) { person.click(); pn--; }	           
       		      wait.until(ExpectedConditions.elementToBeClickable(children));
       		      while(cn>0) { 
       		      children.click(); cn--;}  
       		     
       		   Actions dragger = new Actions(driver);
       		dragger.moveToElement(agepane).clickAndHold().moveByOffset(0,100).release().perform();
       		
       		      Select age = new Select(childage);
       		      age.selectByIndex(5);
       		       //wait.until(ExpectedConditions.elementToBeClickable(Noofpersonandrooms));
       		      // Noofpersonandrooms.click(); 
       		       Searchbutton.click();    }
		
		

		
		//ACTIVITIES  SEARCHBAR
		@FindBy(xpath="//*[@id=\"Tabs-Container\"]/button")
		WebElement Searchbuttonact;
		@FindBy(xpath="//*[@id=\"activities-search-input\"]")
		WebElement activitiessearch;
		@FindBy(xpath="//*[@id=\"autocompleteSearch\"]/div/div/ul/li[1]")
		WebElement searchsuggestionact;
		
		
	     public void activities(String placeoractivity) {
		   Activitiestab.click();
		   activitiessearch.sendKeys(placeoractivity);
		   Actions act = new Actions(driver);
           act.keyDown(searchsuggestionact,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
           act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
           act.perform(); 
           Searchbuttonact.click();    
           }
			
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
			@FindBy(xpath="//*[@id=\"autocompleteSearch-origin\"]/div/div/ul/li[1]/ul/li")
			WebElement searchitem1;
	     
	     public void flights(String from,String to,String month,String date) {
	    	 Flightstab.click();
	    	 oneway.click();
	    	 flyingfrom.sendKeys(from);
	    	 Actions act = new Actions(driver);
	           act.keyDown(flyingfrom,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
	           act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
	           flyingto.sendKeys(to);
	           act.keyDown(flyingto,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
	           act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
	           act.perform(); 
	           departure.click();
	           datepicker(month,date);
	    	 
	     }
	     //not complete
	     public void flights(String from,String to,String month,String date,String from1) {
	    	 Flightstab.click();
	    	 roundtrip.click();
	    	 flyingfrom.sendKeys(from);
	    	 Actions act = new Actions(driver);
	           act.keyDown(flyingfrom,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
	           act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
	           flyingto.sendKeys(to);
	           act.keyDown(flyingto,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN); 
	           act.keyDown(Keys.ENTER).keyUp(Keys.ENTER); 
	           act.perform(); 
	           departure.click();
	           datepicker(month,date);
	           
	     }
	
}
		


