package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;

public class SecureMyId extends BaseClass{

	
	@Test(groups = "SMI")
	public void SecureMyId() {
		LoginTest.loginTest1(driver);
		
		
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[3]"));
		Commons.click(driver, By.id("setAuthlockStatus1"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		Commons.click(driver, By.id("setAuthlockStatus1"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
	
		Commons.click(driver, By.id("setAuthlockStatus2"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
	
		Commons.click(driver, By.id("setAuthlockStatus2"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		

		Commons.click(driver, By.id("setAuthlockStatus3"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup")); 
		

		Commons.click(driver, By.id("setAuthlockStatus3"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
	

		Commons.click(driver, By.id("setAuthlockStatus4"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		

		Commons.click(driver, By.id("setAuthlockStatus4"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		

		Commons.click(driver, By.id("setAuthlockStatus5"));
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		

		Commons.click(driver, By.id("setAuthlockStatus5"));	
		Commons.click(driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		
}
}