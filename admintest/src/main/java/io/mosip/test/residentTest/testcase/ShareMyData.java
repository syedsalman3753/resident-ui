package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;

public class ShareMyData extends BaseClass {

	@Test(groups = "SMD")
	public void shareMyData() throws InterruptedException {
		LoginTest.loginTest1(driver);
		
		
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[6]"));
		
		Commons.click(driver, By.id("Name"));
		Commons.click(driver, By.id("DOB"));
		Commons.click(driver, By.id("UIN"));
		Commons.dropdown(driver, By.id("partnerDetails"));
		Commons.enter(driver, By.id("sharingReasonPlaceholder"), data);
		Commons.click(driver, By.id("shareBtn"));
		Commons.click(driver, By.className("conditions-checkbox"));
		Commons.click(driver, By.xpath("(//span[text()='Share'])[2]"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		//without partner name and purpose
		Thread.sleep(3000);
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[6]"));
		Commons.click(driver, By.id("Name"));
		Commons.click(driver, By.id("DOB"));
		Commons.click(driver, By.id("UIN"));
		Commons.click(driver, By.id("shareBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		System.out.println("1");
		//without partner name
		Thread.sleep(3000);
		Commons.enter(driver, By.id("sharingReasonPlaceholder"), data);
		Commons.click(driver, By.id("shareBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));

		//without purpose
		driver.findElement(By.id("sharingReasonPlaceholder")).clear();
		Commons.click(driver, By.id("shareBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		//all with valid
		
		Commons.click(driver, By.id("Perpetual VID"));
		Commons.click(driver, By.id("Phone Number"));
		Commons.click(driver, By.id("Email ID"));
		Commons.click(driver, By.id("Address"));
		Commons.click(driver, By.id("Gender"));
		Commons.click(driver, By.id("Image"));
		Commons.click(driver, By.id("Mask It2"));
		Commons.click(driver, By.id("Mask It3"));
		Commons.click(driver, By.id("Mask It4"));
		Commons.click(driver, By.id("Mask It5"));
		Commons.dropdown(driver, By.id("partnerDetails"));
		Commons.enter(driver, By.id("sharingReasonPlaceholder"), data);
		Commons.click(driver, By.id("shareBtn"));
		Commons.click(driver, By.className("conditions-checkbox"));
		Commons.click(driver, By.xpath("(//span[text()='Share'])[2]"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		
		//without purpose and partner
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[6]"));
		Commons.click(driver, By.id("Name"));
		Commons.click(driver, By.id("DOB"));
		Commons.click(driver, By.id("UIN"));
		Commons.click(driver, By.id("Perpetual VID"));
		Commons.click(driver, By.id("Phone Number"));
		Commons.click(driver, By.id("Email ID"));
		Commons.click(driver, By.id("Address"));
		Commons.click(driver, By.id("Gender"));
		Commons.click(driver, By.id("Image"));
		Commons.click(driver, By.id("shareBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		
		//without partnername
		Commons.enter(driver, By.id("sharingReasonPlaceholder"), data);
		Commons.click(driver, By.id("shareBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		driver.findElement(By.id("sharingReasonPlaceholder")).clear();
		
		
		//without purpose
		Commons.dropdown(driver, By.id("partnerDetails"));
		Commons.click(driver, By.id("shareBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		
		
	}
}
