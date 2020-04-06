package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class CreateLeads extends OpentapsWrappers  {

	public CreateLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not CREATE LEAD Page", "FAIL");
		}
	}
	
	public CreateLeads entercompany(String company){
		enterByXpath("(//input[@name='companyName'])[2]", company);
		return this; 
	}
	public CreateLeads enterfirstname(String firstn){
		enterByXpath("(//input[@name='firstName'])[3]", firstn);
		return this; 
	}
	public CreateLeads enterlastname(String lastn){
		enterByXpath("(//input[@name='lastName'])[3]", lastn);
		return this; 
	}
	public ViewLead clicksubmit(){
		clickByClassName("smallSubmit");
		return new ViewLead(driver, test); 
	}
	
	
}
