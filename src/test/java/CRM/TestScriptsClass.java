package CRM;




import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;






@Listeners(CRM.ListnersClass.class)

public class TestScriptsClass extends BaseClass {
	
	
    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)
    
    public void TC1_loginTest(String username, String password) {
        driver.get("https://qa.ifaclick.com/login");
        
        
        driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");
		
		driver.findElement(By.id("password")).sendKeys("Manuvenky7#");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
    }
		
		
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)
		
		public void TC2_AnalyticsReports(String username, String password) throws InterruptedException
		{
			
			driver.get("https://qa.ifaclick.com/login");
			
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");
			
			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//Analytics and reports
			
			driver.findElement(By.xpath("//span[text()='Analytics & Reports']")).click();
			
			
		}
		
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)

		public void TC3_Leads(String username, String password) throws InterruptedException
		{
			

			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();


	        //Leads
	       

	        driver.findElement(By.xpath("//span[text()='Leads']")).click();
	        
		}
	    
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)


		public void TC4_Tasks(String username, String password) throws InterruptedException
		{
			
			driver.get("https://qa.ifaclick.com/login");

			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();


	        //Tasks
	       

	        driver.findElement(By.xpath("//span[text()='Tasks']")).click();
	        
		}
	    
	    
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)

		public void TC5_Documents(String username, String password) throws InterruptedException
		{
			
	    	
	    	

			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();


	        //Documents
	       

	        driver.findElement(By.xpath("//span[text()='Documents']")).click();
	        

		}
		
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)

		public void TC6_CreationOfLead(String username, String password)
		{
			
			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();


	       

	        driver.findElement(By.xpath("//span[text()='Leads']")).click();
	        
	        
	        //creation of lead
	        
	        driver.findElement(By.xpath("//button[text()=' Add Lead']")).click();
	        
	        
	        driver.findElement(By.id("name")).sendKeys("Test lead 5");
	        driver.findElement(By.id("email")).sendKeys("Testlead5@gmail.com");
	        driver.findElement(By.id("phone")).sendKeys("9988746655");
	        
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	    
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)

		public void TC7_TaskToLead(String username, String password)
		{
			

			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();


	        //Assigning Task to lead
	       

	        driver.findElement(By.xpath("//span[text()='Tasks']")).click();
	        
	        driver.findElement(By.xpath("//button[@class='inline-flex items-center justify-center gap-2 whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 [&_svg]:pointer-events-none [&_svg]:size-4 [&_svg]:shrink-0 text-primary-foreground h-10 px-4 py-2 bg-[#0047AB] hover:bg-[#0047AB]/90']")).click();
	        
	        driver.findElement(By.id("task-title")).sendKeys("Follow up with client");
	        
	        driver.findElement(By.id("description")).sendKeys("Notification regardingFollow up with mail");
	        
	        driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.TAB, Keys.TAB,"26/11/2025");
	        
	        driver.findElement(By.id("task-related-to")).click();
	        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,"Test lead 1", Keys.ENTER);
	        
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	    
	    
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)

		public void TC8_sales_pipeline_stage(String username, String password) throws InterruptedException
		{
			
			
			
			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.findElement(By.xpath("//span[text()='Leads']")).click();
			
			//Pushing the sales pipeline stage status
			
			
			
			driver.findElement(By.xpath("//p[text()='Test lead 14']")).click();
			
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			
			
			
			driver.findElement(By.xpath("//button[text()='Move to Next']")).click();
			
			
	
		}
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)

		public void TC9_UploadDocument(String username, String password) throws InterruptedException
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("https://qa.ifaclick.com/login");
			driver.findElementById("email").sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElementById("password").sendKeys("Manuvenky7#");

			driver.findElementByXPath("//button[@type='submit']").click();


			//Documents


			driver.findElementByXPath("//span[text()='Documents']").click();


			driver.findElementByXPath("//button[text()='Upload Document']").click();




			// Upload file by giving the document path
			driver.findElement(By.id("file")).sendKeys("/home/venkatesh/Downloads/SamplePDFDoc (1).pdf");
			
			Thread.sleep(2000);
			//selecting the category        

			driver.findElementByXPath("//button[@id='category']").click();
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);


			//selecting the document type
			driver.findElementByXPath("//button[@id='document-type']").click();

			driver.switchTo().activeElement().sendKeys(Keys.ENTER);



			//Assigned to

			driver.findElementByXPath("//button[@id='assigned-to']").click();

			driver.switchTo().activeElement().sendKeys(Keys.ENTER);


			driver.findElementByXPath("//button[text()='Upload']").click();
		}
	    
	    
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)
		public void TC10_DocumentDownload(String username, String password)
		{
			
			
			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();


	        //Document download
	       

	        driver.findElement(By.xpath("//span[text()='Documents']")).click();	
	        
	        driver.findElement(By.xpath("//span[text()='SamplePDFDoc (1).pdf']")).click();
	        driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ENTER);
	        
		}
	    
	    
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)

		public void TC11_Generating_Analytical_Rep(String username, String password) throws InterruptedException
		{
			
			
			
			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			//Generating the analytic report
			
			driver.findElement(By.xpath("//span[text()='Analytics & Reports']")).click();
			
			
			
			//selecting the dropdown as This month
			driver.findElement(By.xpath("//button[text()='This Week']")).click();
			
			driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
			
			
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			
			
			
			//clicking on download button
			
			driver.findElement(By.xpath("//button[text()=' Export']")).click();
			
			
		}
	    
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)
		public void TC12_Filter_LeadTags(String username, String password) throws InterruptedException
		{
			
			
			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");
			
			//defect seeding in password

			driver.findElement(By.id("password")).sendKeys("Manuvenky97#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
	        driver.findElement(By.xpath("//span[text()='Leads']")).click();
	        
	        
	        Thread.sleep(2000);
	        
	        
	        
	        //Filtering Lead tags(lead, cold lead, prospect, hot lead, client, lost, hibernation)
	        

	        
	        driver.findElement(By.xpath("//span[normalize-space()='Lead Tags']")).click();
	        
	        
	        
	        
	        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
	        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
	        
	        Thread.sleep(2000);
	        
	        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	        
		}
	    
	    
	    @Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)
		public void TC13_Filter_LeadSource(String username, String password) throws InterruptedException
		{
			
			
			driver.get("https://qa.ifaclick.com/login");
			driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");

			driver.findElement(By.id("password")).sendKeys("Manuvenky7#");

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
	        driver.findElement(By.xpath("//span[text()='Leads']")).click();
	        
	        
	        Thread.sleep(2000);
	        
	        
	        //Filtering lead source(facebook, LinkedIn etc)
	        
	        driver.findElement(By.xpath("//span[normalize-space()='Lead Sources']")).click();
	        
	        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
	        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
	        
	        Thread.sleep(2000);
	        
	        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	        
	        

	        
		
	    
	        
	        
	        
	        
	        
	  






	    
		}
	    

}