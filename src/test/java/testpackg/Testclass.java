package testpackg;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import basepackg.Baseclass;
import pagepckg.Loginpage;
import pagepckg.Registrationpage;
import utilities.Excelutils;

public class Testclass extends Baseclass {

	
       @Test (enabled=false)
   	public void test2() {
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	   // REGISTRATION
    	   Registrationpage ob = new Registrationpage(driver);  
    	   String xl = "C:\\Users\\Maria-Eldho\\Desktop\\Registrn.xlsx";
   		   String sheet = "Sheet1";
   		int rowcount = Excelutils.getRowCount(xl, sheet);
   		System.out.println(rowcount);
   		for(int i=1;i<=rowcount;i++) {
   			String name1 = Excelutils.getCellValue(xl, sheet, i, 0);
   	 	    String name2 = Excelutils.getCellValue(xl, sheet, i, 1);
   		    String mail = Excelutils.getCellValue(xl, sheet, i, 2);
   		    String passw = Excelutils.getCellValue(xl, sheet, i, 3);
   		    String cpassw = Excelutils.getCellValue(xl, sheet, i, 4);
   			//passing parameters
   		  ob.Registration(name1, name2, mail, passw, cpassw);
   		driver.navigate().refresh();  
   		}
   		                               }
       
       @Test (enabled= false)
      	public void test3() {
    	  //LOGIN
    		test = extent.createTest("LOGIN");
    	   Loginpage l = new Loginpage(driver);  
    	   String xl = "C:\\Users\\Maria-Eldho\\Desktop\\Logn.xlsx";
   		   String sheet = "Sheet1";
   		int rowcount = Excelutils.getRowCount(xl, sheet);
   		System.out.println(rowcount);
   		for(int i=1;i<=rowcount;i++) {
   		
   		    String maile = Excelutils.getCellValue(xl, sheet, i, 0);
   		    String passw = Excelutils.getCellValue(xl, sheet, i, 1);
   		 
   			//passing parameters
   		  l.login(maile, passw);
   		driver.navigate().refresh(); 
   		  }
   		                               }
 
       @Test(enabled= true)
       public void test4() {
    		test = extent.createTest("sample test regis");
    	   WebElement registerlink= driver.findElement(By.xpath("//header[@id=\"page-header\"]/section/div[2]/div[1]/div[1]/div[1]/button/div/div"));
    		registerlink.click();
    		driver.switchTo().frame(0);
    		
    		WebElement Firstname= driver.findElement(By.xpath("//input[@id='firstName']"));
    		Firstname.click();
    		WebElement Lastname= driver.findElement(By.xpath("//input[@id='lastName']"));
    		Lastname.click();
    	   WebElement error1=  driver.findElement(By.xpath("//*[contains(@class,'sc-cwHptR fpPEBz')]"));
    		//"/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/div[1]/div[2]/span")
    		error1.isDisplayed();
    		System.out.println(error1.getText());
    		
    		
       }
      
       
       
       
       
    	   
       }


