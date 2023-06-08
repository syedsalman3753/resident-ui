package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;

public class ShareMyData extends BaseClass {

	@Test(groups = "SMD")
	public void shareMyData() throws Exception {
		LoginTest.loginTest();
		
		test=extent.createTest("shareMyData Test", "verify shareMyData");
		Commons.click(test,driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[6]"));
		
		Commons.click(test,driver, By.id("Name"));
		Commons.click(test,driver, By.id("DOB"));
		Commons.click(test,driver, By.id("UIN"));
		Commons.dropdown(test,driver, By.id("partnerDetails"));
		test.log(Status.INFO, "Select Dropdown PartnerDetails");
		Commons.enter(test,driver, By.id("sharingReasonPlaceholder"), data);
		Commons.click(test,driver, By.id("shareBtn"));
		Commons.click(test,driver, By.className("conditions-checkbox"));
		Commons.click(test,driver, By.xpath("(//span[text()='Share'])[2]"));
		test.log(Status.INFO, "Click On Share");
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		
		//without partner name and purpose
		Thread.sleep(3000);
		test.log(Status.INFO, "Click On Share without partner name and purpose");
		Commons.click(test,driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[6]"));
		Commons.click(test,driver, By.id("Name"));
		Commons.click(test,driver, By.id("DOB"));
		Commons.click(test,driver, By.id("UIN"));
		Commons.click(test,driver, By.id("shareBtn"));
		test.log(Status.INFO, "Click On Share");
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		
		//without partner name
		Thread.sleep(3000);
		test.log(Status.INFO, "Click On Share without partner name");
		Commons.enter(test,driver, By.id("sharingReasonPlaceholder"), data);
		Commons.click(test,driver, By.id("shareBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));

		//without purpose
		test.log(Status.INFO, "Click On without purpose");
		driver.findElement(By.id("sharingReasonPlaceholder")).clear();
		Commons.click(test,driver, By.id("shareBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		
		//all with valid
		test.log(Status.INFO, "all with valid");
		Commons.click(test,driver, By.id("Perpetual VID"));
		Commons.click(test,driver, By.id("Phone Number"));
		Commons.click(test,driver, By.id("Email ID"));
		Commons.click(test,driver, By.id("Address"));
		Commons.click(test,driver, By.id("Gender"));
		Commons.click(test,driver, By.id("Image"));
		Commons.click(test,driver, By.id("Mask It2"));
		Commons.click(test,driver, By.id("Mask It3"));
		Commons.click(test,driver, By.id("Mask It4"));
		Commons.click(test,driver, By.id("Mask It5"));
		test.log(Status.INFO, "Click on Mask");
		Commons.dropdown(test,driver, By.id("partnerDetails"));
		test.log(Status.INFO, "Select Dropdown");
		Commons.enter(test,driver, By.id("sharingReasonPlaceholder"), data);
		Commons.click(test,driver, By.id("shareBtn"));
		Commons.click(test,driver, By.className("conditions-checkbox"));
		Commons.click(test,driver, By.xpath("(//span[text()='Share'])[2]"));
		test.log(Status.INFO, "Click Share");
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		
		
		//without purpose and partner
		test.log(Status.INFO, "Share My Data without purpose and partner");
		Commons.click(test,driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[6]"));
		Commons.click(test,driver, By.id("Name"));
		Commons.click(test,driver, By.id("DOB"));
		Commons.click(test,driver, By.id("UIN"));
		Commons.click(test,driver, By.id("Perpetual VID"));
		Commons.click(test,driver, By.id("Phone Number"));
		Commons.click(test,driver, By.id("Email ID"));
		Commons.click(test,driver, By.id("Address"));
		Commons.click(test,driver, By.id("Gender"));
		Commons.click(test,driver, By.id("Image"));
		Commons.click(test,driver, By.id("shareBtn"));
		test.log(Status.INFO, "Click Share");
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		
		
		//without partnername
		test.log(Status.INFO, "Share My Data without partnername");
		Commons.enter(test,driver, By.id("sharingReasonPlaceholder"), data);
		Commons.click(test,driver, By.id("shareBtn"));
		test.log(Status.INFO, "Click Share");
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		driver.findElement(By.id("sharingReasonPlaceholder")).clear();
		
		
		//without purpose
		test.log(Status.INFO, "Share My Data without purpose");
		Commons.dropdown(test,driver, By.id("partnerDetails"));
		Commons.click(test,driver, By.id("shareBtn"));
		test.log(Status.INFO, "Click Share");
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		
		
		
	}
}
