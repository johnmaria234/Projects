package testpackg;


import java.io.IOException;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;


import basepackg.Baseclass;
import pagepckg.Searchboxpage;


public class SearchboxTest extends Baseclass {

    
    @Test(enabled=false)
    public void Test1hotel() throws IOException  {
    	test = extent.createTest("Test1hotel");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	   Searchboxpage ob= new Searchboxpage(driver);
 	         ob.popupclose();
 	               ob.hotels();
 	              // ob.hotelssearchbar("Munnar");
 	               ob.hotelscheckin("December 2024", "9");
 	               ob.hotelscheckout("December 2024", "12");
 	               ob.slots(2,4,1);
 	               ob.searchbutton();

 	               Assert.assertEquals((driver.getCurrentUrl()), "https://www.agoda.com/en-in/activities/search?cityId");
 	                               }
    
    
    @Test(enabled=false)
    public void Test2() throws IOException  { 
    	test = extent.createTest("Test2hotel");
    	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	   Searchboxpage ob= new Searchboxpage(driver);
    	      ob.hotels();
    //        ob.hotelssearchbar("Munnar");
    	      ob.dayusehotel("January 2025", "25");
    	      ob.slots(1, 2, 1);
    	      ob.searchbutton();
    	      Assert.assertEquals((driver.getCurrentUrl()), "https://www.agoda.com/en-in/activities/search?cityId");
    }
    
    @Test
    public void Test3() {
      	test = extent.createTest("Test3Activities");
    	driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	Searchboxpage ob= new Searchboxpage(driver);
    	ob.activities("Delhi");
    	
    }
    
    
    
}
