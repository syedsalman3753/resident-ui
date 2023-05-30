package io.mosip.test.residentTest.utility;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import io.mosip.test.residentTest.testcase.*;


public class TestRunner {
	static TestListenerAdapter tla = new TestListenerAdapter();

	
	static TestNG testNg;
	
	public static void main(String[] args) throws Exception {
	
		testNg=new TestNG();
		
		String listExcludedGroups=JsonUtil.JsonObjParsing(Commons.getTestData(),"setExcludedGroups");
		testNg.setExcludedGroups(listExcludedGroups);
		testNg.setTestClasses(new Class[] {
				
   LoginTest.class,ManageMyVid.class,ViewMyHistory.class
		
		});
	//	testNg.addListener(tla);
		testNg.run();
		
	}
	

}
