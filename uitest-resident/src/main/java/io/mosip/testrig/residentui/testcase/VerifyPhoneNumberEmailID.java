package io.mosip.testrig.residentui.testcase;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.mosip.testrig.residentui.kernel.util.ConfigManager;
import io.mosip.testrig.residentui.utility.Commons;
import io.mosip.testrig.residentui.utility.MockSMTPListener;
import io.mosip.testrig.residentui.utility.ResidentBaseClass;
import io.mosip.testrig.residentui.utility.TestRunner;

public class VerifyPhoneNumberEmailID extends ResidentBaseClass {



	@Test(priority=0)
	public void VerifyEmailIDAndPhoneWIthInvalidVid() throws IOException, InterruptedException {
		Thread.sleep(2000);
		Commons.click(test, driver, By.id("verifyPhoneNumber/EmailID"));
		Commons.click(test, driver, By.id("emailChannelBtn-button"));
		Commons.enter(test, driver, By.id("uin"), "6534906793542111");
		Commons.click(test, driver, By.id("sendOtpBtn"));
		assertFalse(Commons.isDisplayed(driver,By.id("submitOtpBtn")),"Verify submit otp button with invalid otp");
		Commons.click(test, driver, By.id("dismissBtn"));
		Thread.sleep(2000);
		Commons.click(test, driver, By.id("phoneChannelBtn"));
		Commons.enter(test, driver, By.id("uin"), "6534906793542111");
		Commons.click(test, driver, By.id("sendOtpBtn"));
		assertFalse(Commons.isDisplayed(driver,By.id("submitOtpBtn")),"Verify submit otp button with invalid otp");
		Commons.click(test, driver, By.id("dismissBtn"));
		Commons.enter(test, driver, By.id("uin"), "6534906793542111");
		Commons.click(test, driver, By.id("sendOtpBtn"));
		assertFalse(Commons.isDisplayed(driver,By.id("submitOtpBtn")),"Verify submit otp button with invalid otp");
		
	}
	
	@Test(priority=2)
	public void VerifyEmailIDWIthInvalidOtp() throws Exception {
		String externalemail = ConfigManager.getexternalemail();
		Thread.sleep(2000);
		Commons.click(test, driver, By.id("verifyPhoneNumber/EmailID"));
		Commons.click(test, driver, By.id("emailChannelBtn-button"));
		Commons.enter(test, driver, By.id("uin"), TestRunner.perpetualVid);
		Thread.sleep(3000);
		Commons.click(test, driver, By.id("sendOtpBtn"));
		String otp = MockSMTPListener.getOtp(externalemail);
		Thread.sleep(3000);
		Commons.enter(test, driver, By.id("otp-input"), otp + "23");
		Commons.click(test, driver, By.id("submitOtpBtn"));
		Commons.click(test, driver, By.id("dismissBtn"));
		Commons.click(test, driver, By.id("backBtn"));
		Commons.click(test, driver, By.id("emailChannelBtn-button"));
		Commons.enter(test, driver, By.id("uin"), TestRunner.perpetualVid);
		Thread.sleep(3000);
		Commons.click(test, driver, By.id("sendOtpBtn"));
		Commons.click(test, driver, By.id("submitOtpBtn"));
		assertFalse(Commons.isDisplayed(driver,By.id("dismissBtn")),"Verify submit otp button without enter otp");

	}

	@Test(priority=3)
	public void VerifyEmailIDAndPhone() throws Exception {
		String externalemail = ConfigManager.getexternalemail();
		Thread.sleep(2000);
		Commons.click(test, driver, By.id("verifyPhoneNumber/EmailID"));
		Commons.click(test, driver, By.id("emailChannelBtn-button"));
		Commons.enter(test, driver, By.id("uin"), TestRunner.perpetualVid);
		Thread.sleep(3000);
		Commons.click(test, driver, By.id("sendOtpBtn"));
		String otp = MockSMTPListener.getOtp(externalemail);
		Thread.sleep(3000);
		Commons.enter(test, driver, By.id("otp-input"), otp);
		Commons.click(test, driver, By.id("submitOtpBtn"));
		Commons.click(test, driver, By.id("dismissBtn"));
	}
}
