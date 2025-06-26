package CRM;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnersClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("success");
		
	}

//	@Override
//	public void onTestFailure(ITestResult result) {
//		// TODO Auto-generated method stub
		@Override
		public void onTestFailure(ITestResult result) {
		    System.out.println("Test Failed: " + result.getName());

		    Object testClassInstance = result.getInstance();

		    WebDriver driver = null;

		    try {
		        // Use reflection to get the 'driver' field from BaseClass
		        Field driverField = testClassInstance.getClass().getSuperclass().getDeclaredField("driver");
		        driverField.setAccessible(true);
		        driver = (WebDriver) driverField.get(testClassInstance);
		    } catch (Exception e) {
		        System.out.println("Failed to retrieve WebDriver via reflection: " + e.getMessage());
		    }

		    if (driver != null) {
		        try {
		            Thread.sleep(1000); // Wait for page to stabilize

		            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		            String screenshotName = result.getName() + "_" + timestamp + ".png";

		            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		            File folder = new File("screenshots");
		            if (!folder.exists()) folder.mkdir();

		            File dest = new File(folder + File.separator + screenshotName);
		            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

		            System.out.println("Screenshot saved at: " + dest.getAbsolutePath());
		        } catch (Exception e) {
		            System.out.println("Error taking screenshot: " + e.getMessage());
		        }
		    } else {
		        System.out.println("WebDriver is null. Screenshot not captured.");
		    }
		}

		
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Finished");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
