package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;

public class GetPersonalisedCard extends BaseClass {
	
	@Test(groups = "GPC")
	public void GetPersonalisedCard() throws InterruptedException {
		LoginTest.loginTest1(driver);
		
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[5]"));
		
		Commons.click(driver, By.xpath("//span[text()='Name']"));
		Commons.click(driver, By.xpath("//span[text()='DOB']"));
		Commons.click(driver, By.xpath("//span[text()='UIN']"));
		
		Commons.click(driver, By.id("downloadFileBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));

		
		Commons.click(driver, By.xpath("//span[text()='Name']"));
		Commons.click(driver, By.xpath("//span[text()='DOB']"));
		Commons.click(driver, By.xpath("//span[text()='Perpetual VID']"));
		Commons.click(driver, By.xpath("//span[text()='Phone Number']"));
		
		Commons.click(driver, By.id("Mask It2"));
		Commons.click(driver, By.id("Mask It3"));
		Commons.click(driver, By.id("Mask It4"));
		Commons.click(driver, By.id("downloadFileBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		
		Commons.click(driver, By.xpath("//span[text()='Name']"));
		Commons.click(driver, By.xpath("//span[text()='DOB']"));
		
		Commons.click(driver, By.id("downloadFileBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Thread.sleep(3000);

		Commons.click(driver, By.id("Mask It2"));
		Commons.click(driver, By.id("Mask It3"));
		Commons.click(driver, By.id("Mask It4"));
		Commons.click(driver, By.id("downloadFileBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));

		Commons.click(driver, By.xpath("//span[text()='Email ID']"));
		Commons.click(driver, By.xpath("//span[text()='Address']"));
		Commons.click(driver, By.xpath("//span[text()='Gender']"));
		Commons.click(driver, By.xpath("//span[text()='Image']"));
		Commons.click(driver, By.id("downloadFileBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
//		
		Commons.click(driver, By.id("Mask It2"));
		Commons.click(driver, By.id("Mask It3"));
		Commons.click(driver, By.id("Mask It4"));
		Commons.click(driver, By.id("Mask It5"));
		Commons.click(driver, By.id("downloadFileBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
	}
	

}
