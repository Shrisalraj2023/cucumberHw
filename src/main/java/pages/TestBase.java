package pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;

	
	
	 public static void init() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	 } 
	 
	 
	 public int randomNumber(int i) {
		 Random random = new Random();
			int number= random.nextInt(999);
			return number;
			
	 }

	

	
}
 
