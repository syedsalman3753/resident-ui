package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;
import io.mosip.test.residentTest.utility.JsonUtil;
 //  @Test(groups = "TMR")
   public class TrackMyRequests extends BaseClass{
	@Test(groups = "TMR",priority = 1)
	public void trackMyRequest() throws Exception {
		 String Eid="";
		 
		//(//span[text()='Event ID : '])[1]
		LoginTest.loginTest1(driver);
		
//		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[4]"));
//		Commons.enter(driver, By.id("appIdValue"),Eid );
//		Commons.click(driver, By.id("getEIDStatusbtn"));
//		Commons.click(driver, By.id("downloadAcknowledgementbtn"));
		//String eid=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])")).getText();
//		Commons.click(driver, By.className("mat-card-header-text"));
//		String eid=driver.findElement(By.xpath("//span[text()='Event ID : ']")).getText();
//		System.out.println(eid);
		Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[2]"));
		 Commons.click(driver, By.id("Temporary"));
		 Commons.click(driver, By.id("confirmmessagepopup"));
	     String eid	= driver.findElement(By.className("pop-up-header")).getText();
		 System.out.println(eid);
		  Eid = eid.replaceAll("[^0-9]", "");
		 System.out.println(Eid);
		 Commons.click(driver, By.id("confirmmessagepopup"));
		 Commons.click(driver, By.xpath("//a[text()]"));
		 Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[4]"));
		 Commons.enter(driver, By.id("appIdValue"), Eid);
		 Commons.click(driver, By.id("getEIDStatusbtn"));
		 Commons.click(driver, By.id("downloadAcknowledgementbtn"));
	}

	
	public void TrackMyRequestsInvalidEId() {
		LoginTest.loginTest1(driver);
		 Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[4]"));
		 Commons.enter(driver, By.id("appIdValue"), data+"345");
		 Commons.click(driver, By.id("getEIDStatusbtn"));
		 Commons.click(driver, By.id("confirmmessagepopup"));
	}
	
	public void TrackMyRequestsWithDiffEId() throws Exception {
		String tempEID=JsonUtil.JsonObjParsing(Commons.getTestData(),"tempEID");
		LoginTest.loginTest1(driver);
		 Commons.click(driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[4]"));
		 Commons.enter(driver, By.id("appIdValue"), tempEID);
		 Commons.click(driver, By.id("getEIDStatusbtn"));
		 Commons.click(driver, By.id("confirmmessagepopup"));
	}
}
