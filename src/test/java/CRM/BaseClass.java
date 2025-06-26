package CRM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 protected WebDriver driver;

	    @BeforeMethod
		
		
	    public void setUp() {
	        WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        
	        

	        


	        System.out.println("Browser launched successfully");
	    }

	    @AfterMethod
	    public void tearDown() {
	        try {
	            Thread.sleep(2000); // wait for screenshot to finish
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser closed");
	        }
	    }}

