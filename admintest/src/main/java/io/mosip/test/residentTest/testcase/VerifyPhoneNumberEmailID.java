package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.Commons;
import io.mosip.test.residentTest.utility.JsonUtil;
import io.mosip.test.residentTest.utility.MockSMTPListener;
import io.mosip.test.residentTest.utility.ResidentBaseClass;
@Test(groups = "VPNEEI")
public class VerifyPhoneNumberEmailID extends ResidentBaseClass {
	
	
	public void VerifyEmailID() throws Exception {
		String externalemail=JsonUtil.JsonObjParsing(Commons.getTestData(),"externalemail");
		
		
    Commons.click(driver, By.id("dashboardCard4"));
    Commons.click(driver, By.id("emailChannelBtn-button"));
    Commons.enter(driver, By.id("uin"), vid);
    Commons.switchToFrameByIndex(driver, 0);
    Commons.click(driver, By.id("recaptcha-anchor"));
    driver.switchTo().parentFrame();
    Thread.sleep(3000);
    Commons.click(driver, By.id("sendOtpBtn"));
   // Commons.click(driver, By.xpath("//button[text()='Get OTP']")); 
   String otp = MockSMTPListener.getOtp(10, externalemail);
    
   Commons.enter(driver, By.id("otp-input"), otp);
   Commons.click(driver, By.id("submitOtpBtn"));
   Commons.click(driver, By.id("confirmmessagepopup"));
	}

	
	public void VerifyEmailIDWIthInvalidVid() {
		Commons.click(driver, By.id("dashboardCard4"));
		Commons.click(driver, By.id("emailChannelBtn-button"));
		Commons.enter(driver, By.id("uin"), data);
		Commons.switchToFrameByIndex(driver, 0);
		Commons.click(driver, By.id("recaptcha-anchor"));
		driver.switchTo().parentFrame();
		Commons.click(driver, By.id("sendOtpBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
	}
	
	public void VerifyPhoneWIthInvalidVid() {
		
		Commons.click(driver, By.id("dashboardCard4"));
		Commons.click(driver, By.id("phoneChannelBtn"));
		Commons.enter(driver, By.id("uin"), data);
		Commons.switchToFrameByIndex(driver, 0);
		Commons.click(driver, By.id("recaptcha-anchor"));
		driver.switchTo().parentFrame();
		Commons.click(driver, By.id("sendOtpBtn"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
	}
	
	public void VerifyEmailIDWIthInvalidOtp() throws Exception {
		String externalemail=JsonUtil.JsonObjParsing(Commons.getTestData(),"externalemail");
		 Commons.click(driver, By.id("dashboardCard4"));
		    Commons.click(driver, By.id("emailChannelBtn-button"));
		    Commons.enter(driver, By.id("uin"), vid);
		    Commons.switchToFrameByIndex(driver, 0);
		    Commons.click(driver, By.id("recaptcha-anchor"));
		    driver.switchTo().parentFrame();
		    Thread.sleep(3000);
		    Commons.click(driver, By.id("sendOtpBtn"));
		   // Commons.click(driver, By.xpath("//button[text()='Get OTP']")); 
		   String otp = MockSMTPListener.getOtp(10, externalemail);
		    
		   Commons.enter(driver, By.id("otp-input"), otp+"23");
		   Commons.click(driver, By.id("submitOtpBtn"));
		   Commons.click(driver, By.id("confirmmessagepopup"));
	}
	
	
	public void VerifyEmailIDWIthoutOtp() throws Exception {
		String externalemail=JsonUtil.JsonObjParsing(Commons.getTestData(),"externalemail");
		 Commons.click(driver, By.id("dashboardCard4"));
		    Commons.click(driver, By.id("emailChannelBtn-button"));
		    Commons.enter(driver, By.id("uin"), vid);
		    Commons.switchToFrameByIndex(driver, 0);
		    Commons.click(driver, By.id("recaptcha-anchor"));
		    driver.switchTo().parentFrame();
		    Thread.sleep(3000);
		    Commons.click(driver, By.id("sendOtpBtn"));
		   // Commons.click(driver, By.xpath("//button[text()='Get OTP']")); 
		 
		   Commons.click(driver, By.id("submitOtpBtn"));
		  
	}
}
