package pagepckg;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Somecommonmethods {
	WebDriver driver;
	
	
	//constructor
	public  Somecommonmethods(WebDriver driver) {		
		this.driver = driver;  }
	
	

	
	
		
		

		
		

		


public void screenshot(String location) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File(location));
}




}
