package CRM;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
@DataProvider(name="credentials")
	
	public static String[][] getData()
	{
		String[][]arr= {{"venkatesh.prasad@techcanopy.com","Manuvenky7#"}};
		
		return arr;
		
	}

}
