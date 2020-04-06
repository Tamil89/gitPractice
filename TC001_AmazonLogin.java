package testcases;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AmazonBuyMobile;
import pages.AmazonLogin;
import wrappers.OpentapsWrappers;

public class TC001_AmazonLogin extends OpentapsWrappers {
	
	
	@BeforeClass
	public void setData(){
		
		testCaseName="Login";
		testDescription="Login To Amazon";
		browserName="chrome";
		dataSheetName="TC001_AmazonLogin";
		category="Smoke";
		authors="Tamil";
		authors="Selvan";
	}
	@Test(dataProvider="fetchData")
	public void Search(String searchItem, String sortValue, String zipCode){
		
		new AmazonLogin(driver, test)
			.enterSearchItem(searchItem)
			.clickSearch()
			.sortItem(sortValue)
			//.searchMobile()
			//.switchWindow()
			.verifytheText(searchItem);
//		new AmazonBuyMobile(driver, test)
//		
//		.changeZipCodeAdd()
//		.enterZipCode(zipCode);
//		
		
		
		
		
	}

}
