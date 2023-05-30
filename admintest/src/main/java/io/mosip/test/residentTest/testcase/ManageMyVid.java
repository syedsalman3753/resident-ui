package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;

public class ManageMyVid extends BaseClass {
	
	@Test(groups = "mv")	
public void manageMyVid() throws Exception {
		LoginTest.loginTest1(driver);
		
		
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[2]"));
	    Commons.click(driver, By.id("Perpetual"));
	    
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.xpath("(//img[@id='download0'])[1]"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("Temporary"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("confirmmessagepopup"));    
	    Commons.click(driver, By.xpath("(//mat-icon[@id='delete0'])[2]"));
	    Commons.click(driver, By.xpath("//span[text()=' Delete ']"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Thread.sleep(3000);
	    Commons.click(driver, By.xpath("(//img[@id='download0'])[2]"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("OneTimeUse"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.xpath("(//mat-icon[@id='delete0'])[3]"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.xpath("(//img[@id='download0'])[3]"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.id("confirmmessagepopup"));
	    Commons.click(driver, By.className("mat-card-header-text"));
}
		
		
		
		
		
	

	
}
