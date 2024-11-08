package testpackg;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import basepackg.Baseclass;
import pagepckg.Homepage;
import pagepckg.Searchboxpage;


public class SearchboxTest extends Baseclass {

    
    @Test(enabled=true)
    public void Test1hotel() throws IOException  {
    	test = extent.createTest("Test1hotel");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	    Searchboxpage ob= new Searchboxpage(driver);
 	         ob.popupclose();    
 	    
 	         ob.hotels("Kochi","December 2024", "24", 1, 2, 1); 
  Assert.assertEquals((driver.getCurrentUrl()), "https://www.agoda.com/search?area=517119&checkIn=2024-12-24&los=1&rooms=1&adults=2&children=1&childages=4&locale=en-us&ckuid=2680bb04-44c3-4cb5-b386-abc81b9a6630&prid=0&currency=INR&correlationId=e7f83283-b4d9-4c6e-8641-86a7f7c796ca&analyticsSessionId=-4274646761998054754&pageTypeId=1&realLanguageId=1&languageId=1&origin=IN&stateCode=KL&cid=-1&userId=2680bb04-44c3-4cb5-b386-abc81b9a6630&whitelabelid=1&loginLvl=0&storefrontId=3&currencyId=27&currencyCode=INR&htmlLanguage=en-us&cultureInfoName=en-us&machineName=sg-pc-6g-acm-web-user-77cc6cc9c6-wrffk&trafficGroupId=4&trafficSubGroupId=4&aid=130243&useFullPageLogin=true&cttp=4&isRealUser=true&mode=production&browserFamily=Chrome&cdnDomain=agoda.net&checkOut=2024-12-25&priceCur=INR&textToSearch=Chinnakanal&productType=-1&travellerType=2&familyMode=off&durationType=dayuse&ds=TtlIUu9BBVhkGGVr");
 	                               }
    
    
    @Test(enabled=false)
    public void Test2hotel() throws IOException  { 
    	test = extent.createTest("Test2hotel");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Homepage ob1= new Homepage(driver);
	    ob1.logobutton();
    	Searchboxpage ob= new Searchboxpage(driver);
    	 ob.popupclose(); 
    	 ob.hotels("Munnar", "December 2024", "9", "December 2024", "13", 2, 6, 1);
    	 String acturl= driver.getCurrentUrl();
    	// if(acturl.contains("https://www.agoda.com/en-in/activities/search?cityId")) {};
    	 
   Assert.assertEquals(acturl , "https://www.agoda.com/activities/search?cityId=17290&cid=1908612");

    }
    
    @Test(enabled=false)
    public void Test3() {
      	test = extent.createTest("Test3Activities");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Homepage ob1= new Homepage(driver);
	    ob1.logobutton();
    	Searchboxpage ob= new Searchboxpage(driver);
    	ob.activities("Delhi");
    	
    }
    
    
    
}
