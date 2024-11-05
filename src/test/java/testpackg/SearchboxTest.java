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
 	    
 	         ob.hotels("Munnar","December 2024", "24", 1, 2, 1); 
driver.navigate().back();
 	// Assert.assertEquals((driver.getCurrentUrl()), "https://www.agoda.com/en-in/activities/search?cityId");
 	                               }
    
    
    @Test(enabled=true)
    public void Test2hotel() throws IOException  { 
    	test = extent.createTest("Test2hotel");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Homepage ob1= new Homepage(driver);
	    ob1.logobutton();
    	Searchboxpage ob= new Searchboxpage(driver);
    	 ob.popupclose(); 
    	 ob.hotels("Bombay", "December 2024", "9", "December 2024", "13", 2, 6, 1);
   Assert.assertEquals((driver.getCurrentUrl()), "https://www.agoda.com/en-in/activities/search?cityId");
    }
    
    @Test(enabled=true)
    public void Test3() {
      	test = extent.createTest("Test3Activities");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Homepage ob1= new Homepage(driver);
	    ob1.logobutton();
    	Searchboxpage ob= new Searchboxpage(driver);
    	ob.activities("Delhi");
    	
    }
    
    
    
}
