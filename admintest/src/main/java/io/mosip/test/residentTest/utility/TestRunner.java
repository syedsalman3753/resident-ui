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
		//testNg.set
		MockSMTPListener mockSMTPListener = new MockSMTPListener();
		mockSMTPListener.run();
		String listExcludedGroups=JsonUtil.JsonObjParsing(Commons.getTestData(),"setExcludedGroups");
		testNg.setExcludedGroups(listExcludedGroups);
		testNg.setTestClasses(new Class[] {
				
				
      LoginTest.class,    
       ViewMyHistory.class,
      ManageMyVid.class,
       SecureMyId.class,
       UpdateMyData.class,
       TrackMyRequests.class,
       GetPersonalisedCard.class,
       ShareMyData.class,
       GetMyUIN.class,
       GetInformation.class,
       VerifyPhoneNumberEmailID.class,
//       BookinganAppointment.class
		});
	//	testNg.addListener(tla);
		testNg.run();
		
	}
	

}
