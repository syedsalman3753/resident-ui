package io.mosip.testrig.residentui.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.mosip.testrig.residentui.utility.BaseClass;
import io.mosip.testrig.residentui.utility.Commons;
import io.mosip.testrig.residentui.utility.JsonUtil;
import io.mosip.testrig.residentui.utility.MockSMTPListener;

public class UpdateMyData extends BaseClass {
	@Test(groups = "UMD")
	public void updateMyData() throws Exception {
		String tempemail1 = JsonUtil.JsonObjParsing(Commons.getTestData(), "tempemail1");
		LoginTest.loginTest();
		test = extent.createTest("updateMyData Test ", "verify Login");
		Commons.clickWebelement(test, driver, By.id("uinservices/updatedemographic"));
		Commons.enter(test, driver, By.id("fullNameeng"), data);
		Commons.dropdown(test, driver, By.id("gender"));
		test.log(Status.INFO, "Click on gender");
		Commons.enter(test, driver, By.id("proofOfIdentityvalue"), data);
		Commons.dropdown(test, driver, By.id("proofOfIdentity"));
		Commons.enter(test, driver, By.id("fileDropRef"),
				System.getProperty("user.dir") + "\\src\\main\\resources\\BulkUploadFiles\\tonyId.png");
		Commons.clickWebelement(test, driver, By.id("previewBtn"));

		test.log(Status.INFO, "Click on submit");
		
		Commons.clickWebelement(test, driver, By.id("submitBtn"));
		Commons.clickWebelement(test, driver, By.id("confirmUpdateData"));
    	Commons.clickWebelement(test, driver, By.id("updateMyDataBtn"));
		
		test.log(Status.INFO, "Click on Submit");
		Commons.clickWebelement(test, driver, By.id("dismissBtn"));
		Thread.sleep(3000);

		test.log(Status.INFO, "Update Address");
		Commons.clickWebelement(test, driver, By.id("uinservices/updatedemographic"));
		// Commons.click(test,driver, By.xpath("//span[text()='Demographic Data']"));
		Commons.clickWebelement(test, driver, By.id("mat-tab-label-0-1"));
		
		
		Commons.enter(test, driver, By.id("addressLine1eng"), data);
		Commons.dropdown(test, driver, By.id("Regioneng"));
		Commons.dropdown(test, driver, By.id("Provinceeng"));
		Commons.dropdown(test, driver, By.id("Cityeng"));
		Commons.dropdown(test, driver, By.id("Zoneeng"));
		Commons.dropdown(test, driver, By.id("Postal Code"));
		Commons.dropdown(test, driver, By.id("proofOfAddress"));
		Commons.enter(test, driver, By.id("proofOfAddressvalue"), data);
		Commons.enter(test, driver, By.id("fileAddRef"),
				System.getProperty("user.dir") + "\\BulkUploadFiles\\tonyId.png");
		test.log(Status.INFO, "file Uploaded");
		Commons.clickWebelement(test, driver, By.id("previewBtn"));
		
		
		Commons.clickWebelement(test, driver, By.id("submitBtn"));
		Commons.clickWebelement(test, driver, By.id("confirmUpdateData"));
    	Commons.clickWebelement(test, driver, By.id("updateMyDataBtn"));
		test.log(Status.INFO, "Click on Submit");
		Commons.clickWebelement(test, driver, By.id("dismissBtn"));

		test.log(Status.INFO, "Update Email");
		Commons.click(test, driver, By.id("uinservices/updatedemographic"));
		// Commons.click(test,driver, By.xpath("//span[text()='Demographic Data']"));
		Commons.clickWebelement(test, driver, By.id("mat-tab-label-0-2"));

		Commons.enter(test, driver, By.id("email"), tempemail1);
		
		Commons.clickWebelement(test, driver, By.id("sendOTPemail"));
		String otp = MockSMTPListener.getOtp(tempemail1);
		System.out.println(otp);
//		    for(int i=0;i<=otp.length()-1;i++) {
//		    Commons.enter(driver, By.xpath("//*[@class=\"pincode-input-text\"]["+(i+1)+"]"), Character.toString(otp.charAt(i)));}

		Commons.enter(test, driver, By.id("otp-input"), otp);
		Commons.clickWebelement(test, driver, By.id("submitOtpBtn"));
		Commons.clickWebelement(test, driver, By.id("dismissBtn"));

		// Lang prefrence
		test.log(Status.INFO, "Select Language Preference");
		Commons.click(test, driver, By.id("uinservices/updatedemographic"));
		// Commons.click(test,driver, By.xpath("//span[text()='Demographic Data']"));
		Commons.clickWebelement(test, driver, By.id("mat-tab-label-0-3"));
		Commons.dropdown(test, driver, By.id("preferredLang"));
		Commons.clickWebelement(test, driver, By.id("submit"));

//		without selecting doc type
//		Commons.click(test,driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[7]"));
//		Commons.click(test,driver, By.xpath("//span[text()='Demographic Data']"));
//	    Commons.enter(driver, By.id("fullName"), data);
//		Commons.dropdown(driver, By.id("gender"));
//		Commons.enter(driver, By.id("proofOfIdentityvalue"), "photoId");
//		Commons.enter(driver, By.id("fileDropRef"), "D:\\GItAuto\\resident\\resident-ui\\admintest\\BulkUploadFiles\\tonyId.png");
//		Commons.click(test,driver, By.id("submit"));
//		Commons.click(test,driver, By.xpath("//div[@class='preview']"));
//		Commons.click(test,driver, By.xpath("//span[text()='Update']"));
//		Commons.click(test,driver, By.xpath("//input[@type='checkbox']"));
//		Commons.click(test,driver, By.xpath("//span[text()='Submit']"));
//		Commons.click(test,driver, By.id("confirmmessagepopup"));
//		
//		Thread.sleep(3000);
//		Commons.click(test,driver, By.xpath("//span[text()='Demographic Data']"));
		// Female

//		
	}

	public void UpdateDataWithNameAndDOB() throws Exception {
		LoginTest.loginTest();
		test = extent.createTest("UpdateDataWithNameAndDOB ", "verify Login");
		Commons.clickWebelement(test, driver, By.id("uinservices/updatedemographic"));
		Commons.enter(test, driver, By.id("fullNameeng"), data);
		Commons.clickWebelement(test, driver, By.id("dateOfBirth"));
		Commons.clickWebelement(test, driver,
				By.xpath("//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[2]"));
		Commons.clickWebelement(test, driver,
				By.xpath("//*[@id='mat-datepicker-6']/mat-calendar-header/div/div/button[2]"));
		Commons.enter(test, driver, By.id("proofOfIdentityvalue"), data);
		Commons.dropdown(test, driver, By.id("proofOfIdentity"));
		test.log(Status.INFO, "Select ProofOfIdentity");
		Commons.enter(test, driver, By.id("fileDropRef"),
				System.getProperty("user.dir") + "\\src\\main\\resources\\BulkUploadFiles\\tonyId.png");
		Commons.clickWebelement(test, driver, By.id("previewBtn"));

		test.log(Status.INFO, "Click on submit");
		
		Commons.clickWebelement(test, driver, By.id("submitBtn"));
		Commons.clickWebelement(test, driver, By.id("confirmUpdateData"));
    	Commons.clickWebelement(test, driver, By.id("updateMyDataBtn"));
	}

	public void UpdateDataWithNameAndGender() throws Exception {
		LoginTest.loginTest();
		test = extent.createTest("UpdateDataWithNameAndGender ", "verify Login");
		Commons.clickWebelement(test, driver, By.id("uinservices/updatedemographic"));
		Commons.enter(test, driver, By.id("fullNameeng"), data);
		Commons.dropdown(test, driver, By.id("gender"));
		test.log(Status.INFO, "Click on gender");
		Commons.enter(test, driver, By.id("proofOfIdentityvalue"), data);
		Commons.dropdown(test, driver, By.id("proofOfIdentity"));
		Commons.enter(test, driver, By.id("fileDropRef"),
				System.getProperty("user.dir") + "\\src\\main\\resources\\BulkUploadFiles\\tonyId.png");
		Commons.clickWebelement(test, driver, By.id("previewBtn"));

		test.log(Status.INFO, "Click on submit");
		
		Commons.clickWebelement(test, driver, By.id("submitBtn"));
		Commons.clickWebelement(test, driver, By.id("confirmUpdateData"));
    	Commons.clickWebelement(test, driver, By.id("updateMyDataBtn"));
	}

	public void UpdateDataWithoutAddressLine() throws Exception {
		LoginTest.loginTest();
		test = extent.createTest("UpdateDataWithoutAddressLine ", "verify Login");
		Commons.clickWebelement(test, driver, By.id("uinservices/updatedemographic"));
		Commons.clickWebelement(test, driver, By.id("mat-tab-label-0-1"));
		Commons.dropdown(test, driver, By.id("Regioneng"));
		Commons.dropdown(test, driver, By.id("Provinceeng"));
		Commons.dropdown(test, driver, By.id("Cityeng"));
		Commons.dropdown(test, driver, By.id("Zoneeng"));
		Commons.dropdown(test, driver, By.id("Postal Code"));
		Commons.dropdown(test, driver, By.id("proofOfAddress"));
		Commons.enter(test, driver, By.id("proofOfAddressvalue"), data);
		Commons.enter(test, driver, By.id("fileDropRef"),
				System.getProperty("user.dir") + "\\src\\main\\resources\\BulkUploadFiles\\tonyId.png");
		test.log(Status.INFO, "file Uploaded");
		Commons.clickWebelement(test, driver, By.id("previewBtn"));
		
		
		Commons.clickWebelement(test, driver, By.id("submitBtn"));
		Commons.clickWebelement(test, driver, By.id("confirmUpdateData"));
    	Commons.clickWebelement(test, driver, By.id("updateMyDataBtn"));
		test.log(Status.INFO, "Click on Submit");
		Commons.clickWebelement(test, driver, By.id("dismissBtn"));
		
	}

}
