package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;

public class ViewMyHistory extends BaseClass {

	@Test(groups = "VMH")
	public void viewMyHistory() throws Exception {
		LoginTest.loginTest1(driver);
		//String date = "12/04/2022";
		WebElement calender= driver.findElement(By.id("fromPickertext"));
		
		
		Commons.click(driver, By.className("mat-card-header-text"));
		Commons.click(driver, By.id("serviceType"));
		Commons.click(driver, By.xpath("//span[text()='All']"));
		Commons.click(driver, By.id("searchbtn"));
		Commons.click(driver, By.id("serviceType"));
		Commons.click(driver, By.id("ALL"));
		Commons.click(driver, By.id("serviceType"));
		Commons.click(driver, By.xpath("//span[text()='Authentication Request']"));
		Commons.click(driver, By.id("searchbtn"));
	    Commons.click(driver, By.id("serviceType"));
	    Commons.click(driver, By.id("AUTHENTICATION_REQUEST"));
		Commons.click(driver, By.id("SERVICE_REQUEST"));
		Commons.click(driver, By.id("searchbtn"));
		Commons.click(driver, By.id("serviceType"));
		Commons.click(driver, By.id("SERVICE_REQUEST"));
		Commons.click(driver, By.id("DATA_UPDATE_REQUEST"));
		Commons.click(driver, By.id("searchbtn"));
		Commons.click(driver, By.id("DATA_UPDATE_REQUEST"));
		Commons.click(driver, By.id("ID_MANAGEMENT_REQUEST"));
		Commons.click(driver, By.id("searchbtn"));
		Commons.click(driver, By.id("ID_MANAGEMENT_REQUEST"));
		Commons.click(driver, By.id("DATA_SHARE_REQUEST"));
		Commons.click(driver, By.id("searchbtn"));
		Commons.click(driver, By.id("DATA_SHARE_REQUEST"));
		Commons.click(driver, By.id("ALL"));
		Commons.click(driver, By.id("statusFilter"));
		Commons.click(driver, By.xpath("//span[text()=' Success']"));
		Commons.click(driver, By.id("searchbtn"));
		Commons.click(driver, By.id("Success"));
		Commons.click(driver, By.id("In Progress"));
		Commons.click(driver, By.id("searchbtn"));
		Commons.click(driver, By.id("In Progress"));
		Commons.click(driver, By.id("Failed"));
		Commons.click(driver, By.id("searchbtn"));
		Commons.click(driver, By.id("downloadbtn"));
		Commons.click(driver, By.id("fromPickertext"));
		Commons.explicitWait(driver, calender, 10);
		
		

		
	}
}
