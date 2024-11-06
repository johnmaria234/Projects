package testpackg;

import org.testng.annotations.Test;
import basepackg.Baseclass;
import pagepckg.Homepage;


public class Hometest extends Baseclass{
	

	@Test (enabled= true)
	public void test1home() {
		test = extent.createTest("Test1home");
		Homepage ob1 =new Homepage(driver);
		ob1.linkverifymethod();  
		ob1.titleverification();
		String[] arr = {"flight","hotel","activities"};
		for(int i=0;i<arr.length;i++) {
		ob1.keywordverification(arr[i]); }
		}
	@Test 
	public void test2home() {
	
		test = extent.createTest("Test2windowhandling");
		Homepage ob =new Homepage(driver);	
		//window handle
		try {
	        ob.newtab();}
		catch(Exception e) {
			ob.newtab1();
	        ob.newtab();}
		}
	        
	}
	
	


