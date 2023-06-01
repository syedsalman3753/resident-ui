package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.Commons;
import io.mosip.test.residentTest.utility.JsonUtil;
import io.mosip.test.residentTest.utility.MockSMTPListener;
import io.mosip.test.residentTest.utility.ResidentBaseClass;

@Test(groups = "GMU")
public class GetMyUIN extends ResidentBaseClass{

	//@Test(groups = "GMU")
	public void getMyUIN() throws Exception {
		String tempemail=JsonUtil.JsonObjParsing(Commons.getTestData(),"tempemail");
		String aid=JsonUtil.JsonObjParsing(Commons.getTestData(),"aid");
		
		
		Commons.click(driver, By.xpath("(//mat-card[@class='mat-card'])[4]"));//id
		Commons.enter(driver, By.id("aidValue"), aid);//
		Commons.switchToFrameByIndex(driver, 0);
		Commons.click(driver, By.xpath("//div[@id='rc-anchor-container']"));
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Commons.click(driver, By.id("getUinSendOtpBtn"));
		String otp = MockSMTPListener.getOtp(10, tempemail);
		Commons.enter(driver, By.id("otp-input"), otp);
		   Commons.click(driver, By.xpath("//button[@id='getUinsubmitBtn']"));
		   Commons.click(driver, By.id("confirmmessagepopup"));
		
		
		
	}
	
	public void getMyUINWithoutAID() throws InterruptedException {
		
		Commons.click(driver, By.xpath("(//mat-card[@class='mat-card'])[4]"));//id
		Commons.switchToFrameByIndex(driver, 0);
		Commons.click(driver, By.xpath("//div[@id='rc-anchor-container']"));
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Commons.click(driver, By.id("getUinSendOtpBtn"));
	}
	
	
	public void getMyUINWithInvalidOtp() throws Exception {
		String tempemail=JsonUtil.JsonObjParsing(Commons.getTestData(),"tempemail");
		String aid=JsonUtil.JsonObjParsing(Commons.getTestData(),"aid");
		
		Commons.click(driver, By.xpath("(//mat-card[@class='mat-card'])[4]"));//id
		Commons.enter(driver, By.id("aidValue"), aid);//
		Commons.switchToFrameByIndex(driver, 0);
		Commons.click(driver, By.xpath("//div[@id='rc-anchor-container']"));
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Commons.click(driver, By.id("getUinSendOtpBtn"));
		String otp = MockSMTPListener.getOtp(10, tempemail);
		
		Commons.enter(driver, By.id("otp-input"), otp+"56");
		   Commons.click(driver, By.xpath("//button[@id='getUinsubmitBtn']"));
		   Commons.click(driver, By.id("confirmmessagepopup"));
		
	}
	
	public void getMyUINWithExpiredOtp() throws Exception {
		String tempemail=JsonUtil.JsonObjParsing(Commons.getTestData(),"tempemail");
		String aid=JsonUtil.JsonObjParsing(Commons.getTestData(),"aid");
		Commons.click(driver, By.xpath("(//mat-card[@class='mat-card'])[4]"));//id
		Commons.enter(driver, By.id("aidValue"), aid);//
		Commons.switchToFrameByIndex(driver, 0);
		Commons.click(driver, By.xpath("//div[@id='rc-anchor-container']"));
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Commons.click(driver, By.id("getUinSendOtpBtn"));
		String otp = MockSMTPListener.getOtp(10, tempemail);
		Thread.sleep(180020);
		Commons.enter(driver, By.id("otp-input"), otp);
		   Commons.click(driver, By.xpath("//button[@id='getUinsubmitBtn']"));
		   Commons.click(driver, By.id("confirmmessagepopup"));
		   
	}
	
	
	public void getMyUINWithoutOtp() throws Exception {
		String tempemail=JsonUtil.JsonObjParsing(Commons.getTestData(),"tempemail");
		String aid=JsonUtil.JsonObjParsing(Commons.getTestData(),"aid");
		Commons.click(driver, By.xpath("(//mat-card[@class='mat-card'])[4]"));//id
		Commons.enter(driver, By.id("aidValue"), aid);//
		Commons.switchToFrameByIndex(driver, 0);
		Commons.click(driver, By.xpath("//div[@id='rc-anchor-container']"));
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Commons.click(driver, By.id("getUinSendOtpBtn"));
		   Commons.click(driver, By.xpath("//button[@id='getUinsubmitBtn']"));
		   
	}
}
