package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;
import io.mosip.test.residentTest.utility.JsonUtil;
import io.mosip.test.residentTest.utility.ResidentBaseClass;
@Test(groups = "GI")
public class GetInformation extends ResidentBaseClass{
 
	
	public void getInformation() throws Exception {
		String country=JsonUtil.JsonObjParsing(Commons.getTestData(),"country");
		String region=JsonUtil.JsonObjParsing(Commons.getTestData(),"region");
		String province=JsonUtil.JsonObjParsing(Commons.getTestData(),"province");
		String city=JsonUtil.JsonObjParsing(Commons.getTestData(),"city");
		String zone=JsonUtil.JsonObjParsing(Commons.getTestData(),"zone");
		String postalcode=JsonUtil.JsonObjParsing(Commons.getTestData(),"postalcode");
		
        Commons.click(driver, By.id("dashboardCard2"));
		Commons.click(driver, By.id("downloadAcknowledgementbtn"));
		Commons.click(driver, By.id("mat-tab-label-0-0"));
		//Commons.dropdown(driver, By.id("mat-select-0"));
		
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[6]"));//connect with arvind
		
//		MyCountry
		Commons.dropdown(driver, By.id("mat-select-0"), By.id("mat-option-0"));
		Commons.enter(driver, By.xpath("//input[@type='search']"), country);//take from testdata
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));//connect with arvind
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[8]"));//connect with arvind
		
		//region
		Commons.dropdown(driver, By.id("mat-select-0"), By.id("mat-option-1"));
		Commons.enter(driver, By.xpath("//input[@type='search']"), region);
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[8]"));
		
		
		//Commons.dropdown(driver, By.id("mat-select-0"), " Region ");
		//Commons.enter(driver, By.xpath("//input[@type='search']"), "10104");
		//Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
		//Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[8]"));
		
		//province
		Commons.dropdown(driver, By.id("mat-select-0"), " Province ");
		Commons.enter(driver, By.xpath("//input[@type='search']"), province);
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[8]"));
		
		 //City
		Commons.dropdown(driver, By.id("mat-select-0"), " City ");
		Commons.enter(driver, By.xpath("//input[@type='search']"), city);
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[8]"));
		
		// Zone 
		Commons.dropdown(driver, By.id("mat-select-0"), " Zone ");
		Commons.enter(driver, By.xpath("//input[@type='search']"), zone);
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[8]"));
		
		// Postal Code 
		Commons.dropdown(driver, By.id("mat-select-0"), " Postal Code ");
		Commons.enter(driver, By.xpath("//input[@type='search']"), postalcode);
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[8]"));
		 
		//Commons.enter(driver, By.className("search-input ng-pristine ng-valid ng-touched"), "CST");
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("CST");
	
	}
	     
           public void GetInformationWithInvalidcountry() throws Exception {
        	   String postalcode=JsonUtil.JsonObjParsing(Commons.getTestData(),"postalcode");
	    	 Commons.click(driver, By.id("dashboardCard2"));  
       		Commons.click(driver, By.id("mat-tab-label-0-0"));
       		Commons.dropdown(driver, By.id("mat-select-0"), " Country ");
       		Commons.enter(driver, By.xpath("//input[@type='search']"), postalcode);
       		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));   		
   }	
	     
           
	     public void GetInformationWithInvalidProvince() throws Exception {
	    	 String postalcode=JsonUtil.JsonObjParsing(Commons.getTestData(),"postalcode");
        	    Commons.click(driver, By.id("dashboardCard2"));
          		Commons.click(driver, By.id("mat-tab-label-0-0"));
	    	    Commons.dropdown(driver, By.id("mat-select-0"), " Province ");
	 		    Commons.enter(driver, By.xpath("//input[@type='search']"), postalcode);
	 		    Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
	 		    
	     }
	    
           public void GetInformationWithInvalidRegion() throws Exception {
        	   String postalcode=JsonUtil.JsonObjParsing(Commons.getTestData(),"postalcode");
        	Commons.click(driver, By.id("dashboardCard2"));
         	Commons.click(driver, By.id("mat-tab-label-0-0"));
	    	Commons.dropdown(driver, By.id("mat-select-0"), " Region ");
	 		Commons.enter(driver, By.xpath("//input[@type='search']"), postalcode);
	 		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
	 		
           }
           
           
	        public void GetInformationWithInvalidCity() throws Exception {
	        	 String postalcode=JsonUtil.JsonObjParsing(Commons.getTestData(),"postalcode");
        	Commons.click(driver, By.id("dashboardCard2"));
            Commons.click(driver, By.id("mat-tab-label-0-0"));
	    	Commons.dropdown(driver, By.id("mat-select-0"), " City ");
	 		Commons.enter(driver, By.xpath("//input[@type='search']"), postalcode);
	 		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
	 		
	     }
	       
           public void GetInformationWithInvalidZone() throws Exception {
        	   String postalcode=JsonUtil.JsonObjParsing(Commons.getTestData(),"postalcode");
        	Commons.click(driver, By.id("dashboardCard2"));
            Commons.click(driver, By.id("mat-tab-label-0-0"));
   	    	Commons.dropdown(driver, By.id("mat-select-0"), " Zone ");
   	 		Commons.enter(driver, By.xpath("//input[@type='search']"), postalcode);
   	 		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
           }
           
	        public void GetInformationWithInvalidPostalCode() {
	        	Commons.click(driver, By.id("dashboardCard2"));
	            Commons.click(driver, By.id("mat-tab-label-0-0"));
	        	Commons.dropdown(driver, By.id("mat-select-0"), " Postal Code ");
	    		Commons.enter(driver, By.xpath("//input[@type='search']"), data);
	    		Commons.click(driver, By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
	        }
}
