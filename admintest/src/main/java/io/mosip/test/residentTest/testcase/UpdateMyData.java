package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;
import io.mosip.test.residentTest.utility.JsonUtil;
import io.mosip.test.residentTest.utility.MockSMTPListener;
 @Test(groups = "UMD")
public class UpdateMyData extends BaseClass {
	
	public void updateMyData() throws Exception {
		String tempemail1=JsonUtil.JsonObjParsing(Commons.getTestData(),"tempemail1");
    LoginTest.loginTest1(driver);
		
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[7]"));
		Commons.enter(driver, By.id("fullName"), data);
		Commons.dropdown(driver, By.id("gender"));
		Commons.enter(driver, By.id("proofOfIdentityvalue"), data);
		Commons.dropdown(driver, By.id("proofOfIdentity"));
		Commons.enter(driver, By.id("fileDropRef"), System.getProperty("user.dir")+"\\BulkUploadFiles\\tonyId.png");
		Commons.click(driver, By.id("submit"));
		Commons.click(driver, By.xpath("//div[@class='preview']"));
		Commons.click(driver, By.xpath("//span[text()='Update']"));
		Commons.click(driver, By.xpath("//input[@type='checkbox']"));
		Commons.click(driver, By.xpath("//span[text()='Submit']"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		Thread.sleep(3000);
		
		
		Commons.click(driver, By.xpath("//span[text()='Demographic Data']"));
		Commons.click(driver, By.xpath("//div[text()='Address']"));
		Commons.enter(driver, By.id("addressLine1"), data);
		Commons.dropdown(driver, By.id("Region"));
		Commons.dropdown(driver, By.id("Province"));
		Commons.dropdown(driver, By.id("City"));
		Commons.dropdown(driver, By.id("Zone"));
		Commons.dropdown(driver, By.id("Postal Code"));
		Commons.dropdown(driver, By.id("proofOfAddress"));
		Commons.enter(driver, By.xpath("//input[@id='proofOfAddress']"), data);
		Commons.enter(driver, By.id("fileAddRef"), System.getProperty("user.dir")+"\\BulkUploadFiles\\tonyId.png");
		
		Commons.click(driver, By.xpath("//div[@class='preview']"));
		Commons.click(driver, By.id("submit"));
		Commons.click(driver, By.xpath("//span[text()='Update']"));
		Commons.click(driver, By.xpath("//input[@type='checkbox']"));
		Commons.click(driver, By.xpath("//span[text()='Submit']"));
		Commons.click(driver, By.id("confirmmessagepopup"));
		
		
		
		Commons.click(driver, By.xpath("//span[text()='Demographic Data']"));
		Commons.click(driver, By.xpath("//div[text()='Contact']"));
		
		Commons.enter(driver, By.id("email"), tempemail1);
		Commons.enter(driver, By.id("confirmemail"), tempemail1);
		Commons.click(driver, By.id("sendOTPemail"));
		String otp = MockSMTPListener.getOtp(10, tempemail1);
		    System.out.println(otp);
//		    for(int i=0;i<=otp.length()-1;i++) {
//		    Commons.enter(driver, By.xpath("//*[@class=\"pincode-input-text\"]["+(i+1)+"]"), Character.toString(otp.charAt(i)));}
	
		    Commons.enter(driver, By.id("otp-input"), otp);
		    Commons.click(driver, By.xpath("(//button[@class='button mat-button'])[2]"));
		    Commons.click(driver, By.id("confirmmessagepopup"));
		    
		    //Lang prefrence
		  
		    Commons.click(driver, By.xpath("//span[text()='Demographic Data']"));
		    Commons.click(driver, By.xpath("//div[text()='Language Preference']"));
		    Commons.dropdown(driver, By.id("preferredLang"));
		    Commons.click(driver, By.id("submit"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		without selecting doc type
//		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[7]"));
//		Commons.click(driver, By.xpath("//span[text()='Demographic Data']"));
//	    Commons.enter(driver, By.id("fullName"), data);
//		Commons.dropdown(driver, By.id("gender"));
//		Commons.enter(driver, By.id("proofOfIdentityvalue"), "photoId");
//		Commons.enter(driver, By.id("fileDropRef"), "D:\\GItAuto\\resident\\resident-ui\\admintest\\BulkUploadFiles\\tonyId.png");
//		Commons.click(driver, By.id("submit"));
//		Commons.click(driver, By.xpath("//div[@class='preview']"));
//		Commons.click(driver, By.xpath("//span[text()='Update']"));
//		Commons.click(driver, By.xpath("//input[@type='checkbox']"));
//		Commons.click(driver, By.xpath("//span[text()='Submit']"));
//		Commons.click(driver, By.id("confirmmessagepopup"));
//		
//		Thread.sleep(3000);
//		Commons.click(driver, By.xpath("//span[text()='Demographic Data']"));
		//Female
		
			
		
//		
	}
	
	
     public void UpdateDataWithNameAndDOB() {
	      LoginTest.loginTest1(driver);
	      Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[7]"));
	      Commons.enter(driver, By.id("fullName"), data);
	      Commons.click(driver, By.id("dateOfBirth"));
	      Commons.click(driver, By.xpath("//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[2]"));
		  Commons.click(driver, By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[4]/td[6]/div"));
		  Commons.dropdown(driver, By.id("proofOfIdentity"));
		  Commons.enter(driver, By.id("fileDropRef"), System.getProperty("user.dir")+"\\BulkUploadFiles\\tonyId.png");
		  Commons.click(driver, By.xpath("//div[@class='preview']"));
		  Commons.click(driver, By.id("submit"));
	
}
	
	public void UpdateDataWithNameAndGender() {
		 LoginTest.loginTest1(driver);
		  Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[7]"));
	      Commons.enter(driver, By.id("fullName"), data);
		  Commons.dropdown(driver, By.id("gender"), "Female");
		  Commons.dropdown(driver, By.id("proofOfIdentity"));
		  Commons.enter(driver, By.id("fileDropRef"), System.getProperty("user.dir")+"\\BulkUploadFiles\\tonyId.png");
		  Commons.click(driver, By.xpath("//div[@class='preview']"));
		  Commons.click(driver, By.id("submit"));
	}
	
	public void UpdateDataWithoutAddressLine() {
		LoginTest.loginTest1(driver);
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[7]"));
		Commons.click(driver, By.xpath("//div[text()='Address']"));
		Commons.dropdown(driver, By.id("Region"));
		//Commons.dropdown(driver, By.id("Province"));
		Commons.dropdown(driver, By.id("Province"), " Rabat ");
		Commons.dropdown(driver, By.id("City"), " Rabat ");
		//Commons.dropdown(driver, By.id("City"));
		// Agdal 
		Commons.dropdown(driver, By.id("Zone"), " Agdal ");
		//Commons.dropdown(driver, By.id("Zone"));
		//Commons.dropdown(driver, By.id("Postal Code"));
		Commons.dropdown(driver, By.id("Postal Code"), " 10106 ");
		Commons.dropdown(driver, By.id("proofOfAddress"));
		Commons.enter(driver, By.xpath("//input[@id='proofOfAddress']"), data);
		Commons.enter(driver, By.id("fileAddRef"), System.getProperty("user.dir")+"\\BulkUploadFiles\\tonyId.png");
		 Commons.click(driver, By.xpath("//div[@class='preview']"));
		  Commons.click(driver, By.id("submit"));
		}
	
	 
	
}
