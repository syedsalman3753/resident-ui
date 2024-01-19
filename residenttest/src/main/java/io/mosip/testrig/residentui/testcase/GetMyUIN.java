package io.mosip.testrig.residentui.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.mosip.testrig.residentui.kernel.util.ConfigManager;
import io.mosip.testrig.residentui.utility.Commons;
import io.mosip.testrig.residentui.utility.JsonUtil;
import io.mosip.testrig.residentui.utility.MockSMTPListener;
import io.mosip.testrig.residentui.utility.ResidentBaseClass;
import io.mosip.testrig.residentui.utility.TestRunner;

@Test(groups = "GMU",dependsOnGroups="UMD")
public class GetMyUIN extends ResidentBaseClass{
	
	String vid =TestRunner.perpetualVid;
	// @Test(groups = "GMU")
	public void getMyUIN() throws Exception {
		
		String tempemail = ConfigManager.gettempemail();
		test = extent.createTest("getMyUIN", "verify Login");
		Commons.click(test, driver, By.id("getMyUIN"));
		Commons.enter(test, driver, By.id("aidValue"), vid);//
		test.log(Status.INFO, "AID Entered");
		Commons.click(test, driver, By.id("getUinSendOtpBtn"));
		String otp = MockSMTPListener.getOtp(tempemail);
		Thread.sleep(5000);
		Commons.enter(test, driver, By.id("otp-input"), otp);
		Commons.click(test, driver, By.xpath("//button[@id='getUinsubmitBtn']"));
		test.log(Status.INFO, "Click on submit");
		Commons.click(test, driver, By.id("dismissBtn"));
		
		
		
	}
	
	public void getMyUINWithoutAID() throws InterruptedException, IOException {
		test=extent.createTest("get MyUIN Without AID", "verify Login");
		Commons.click(test, driver, By.id("getMyUIN"));
//		Commons.switchToFrameByIndex(test,driver, 0);
//		Commons.click(test,driver, By.xpath("//div[@id='rc-anchor-container']"));
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
		Commons.click(test,driver, By.id("getUinSendOtpBtn"));
	}
	
	
	public void getMyUINWithInvalidOtp() throws Exception {
		String tempemail = ConfigManager.gettempemail();
		
		test=extent.createTest("get My UIN With Invalid Otp", "verify Login");
		Commons.click(test, driver, By.id("getMyUIN"));
		Commons.enter(test,driver, By.id("aidValue"), vid);//
//		Commons.switchToFrameByIndex(test,driver, 0);
//		Commons.click(test,driver, By.xpath("//div[@id='rc-anchor-container']"));
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
		Commons.click(test,driver, By.id("getUinSendOtpBtn"));
		String otp = MockSMTPListener.getOtp(tempemail);
		Thread.sleep(5000);
		Commons.enter(test,driver, By.id("otp-input"), otp+"56");
		   Commons.click(test,driver, By.xpath("//button[@id='getUinsubmitBtn']"));
		   Commons.click(test,driver, By.id("dismissBtn"));
		
	}
	
	public void getMyUINWithExpiredOtp() throws Exception {
		String tempemail = ConfigManager.gettempemail();
		
		test=extent.createTest("get My UIN With Expired Otp", "verify Login");
		Commons.click(test, driver, By.id("getMyUIN"));//id
		Commons.enter(test,driver, By.id("aidValue"), vid);//
	//	Commons.switchToFrameByIndex(test,driver, 0);
//		Commons.click(test,driver, By.xpath("//div[@id='rc-anchor-container']"));
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
		Commons.click(test,driver, By.id("getUinSendOtpBtn"));
		String otp = MockSMTPListener.getOtp(tempemail);
		Thread.sleep(5000);
		Commons.enter(test,driver, By.id("otp-input"), otp);
		   Commons.click(test,driver, By.xpath("//button[@id='getUinsubmitBtn']"));
		   Commons.click(test,driver, By.id("dismissBtn"));
		   
	}
	
	
	public void getMyUINWithoutOtp() throws Exception {
		test=extent.createTest("get My UIN Without Otp", "verify Login");
		Commons.click(test, driver, By.id("getMyUIN"));//id
		Commons.enter(test,driver, By.id("aidValue"), vid);//
//		Commons.switchToFrameByIndex(test,driver, 0);
//		Commons.click(test,driver, By.xpath("//div[@id='rc-anchor-container']"));
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
		Commons.click(test,driver, By.id("getUinSendOtpBtn"));
		Thread.sleep(5000);
		   Commons.click(test,driver, By.xpath("//button[@id='getUinsubmitBtn']"));
		   
	}
}
