package io.mosip.testrig.residentui.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import io.mosip.testrig.residentui.fw.util.AdminTestUtil;
import io.mosip.testrig.residentui.kernel.util.ConfigManager;
import io.mosip.testrig.residentui.kernel.util.KeycloakUserManager;
import io.mosip.testrig.residentui.service.BaseTestCase;
import io.mosip.testrig.residentui.testcase.*;


public class TestRunner {
	static TestListenerAdapter tla = new TestListenerAdapter();

	public static String jarUrl = TestRunner.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	public static String uin="";
	public static String perpetualVid="";
	public static String onetimeuseVid="";
	public static String temporaryVid="";

	static TestNG testNg;

	public static void main(String[] args) throws Exception {
		AdminTestUtil.initialize();
		String identityGenManual=JsonUtil.JsonObjParsing(Commons.getTestData(),"identityGenManual");
		if(identityGenManual.equals("yes")) {
			uin=JsonUtil.JsonObjParsing(Commons.getTestData(),"UIN");
			perpetualVid=JsonUtil.JsonObjParsing(Commons.getTestData(),"perpetualvid");
			onetimeuseVid=JsonUtil.JsonObjParsing(Commons.getTestData(),"onetimevid");
			temporaryVid=JsonUtil.JsonObjParsing(Commons.getTestData(),"temporaryvid");
		}else {
			uin = AdminTestUtil.generateUIN();

			if (uin != null) {
				perpetualVid = AdminTestUtil.generateVID(uin, "perpetual");
				onetimeuseVid = AdminTestUtil.generateVID(uin, "onetimeuse");
				temporaryVid= AdminTestUtil.generateVID(uin, "temporary");
			}
		}

		startTestRunner();
	}



	public static void startTestRunner() throws Exception {
		
		
		
		
		
		
		
		File homeDir = null;
		TestNG runner = new TestNG();
		List<String> suitefiles = new ArrayList<String>();
		String os = System.getProperty("os.name");
		
		if (checkRunType().contains("IDE") || os.toLowerCase().contains("windows") == true) {
			homeDir = new File(getResourcePath() + "/testngFile");
//			LOGGER.info("IDE Home Dir=" + homeDir);
		} else {
			homeDir = new File(getResourcePath() + "/testngFile");
//			LOGGER.info("Jar Home Dir=" + homeDir);
		}

		for (File file : homeDir.listFiles()) {
			if (file.getName().toLowerCase() != null) {
				suitefiles.add(file.getAbsolutePath());
			}
		}
//		String listExcludedGroups=JsonUtil.JsonObjParsing(Commons.getTestData(),"setExcludedGroups");
//		runner.setExcludedGroups(listExcludedGroups);		
//		runner.setTestClasses(new Class[] {
//				LoginTest.class,    
//				ViewMyHistory.class,
//				ManageMyVid.class,
//				SecureMyId.class,
//				UpdateMyData.class,
//				TrackMyRequests.class,
//				GetPersonalisedCard.class,
//				ShareMyData.class,
//				GetMyUIN.class,
//				GetInformation.class,
//				VerifyPhoneNumberEmailID.class
//
//		});
		runner.setTestSuites(suitefiles);
		
	
		String langid=JsonUtil.JsonObjParsing(Commons.getTestData(),"language");
		String language=JsonUtil.JsonObjParsing(Commons.getTestData(),"loginlang");
		
			if(language.equals("sin")) {
				langid="";
			}
		System.getProperties().setProperty("testng.outpur.dir", "testng-report");
		runner.setOutputDirectory("testng-report");
		System.getProperties().setProperty("emailable.report2.name", "RESIDENT-" + BaseTestCase.environment + "-"
				+ langid + "-run-" + System.currentTimeMillis() + "-report.html");
		
		
		runner.run();
		
		MockSMTPListener mockSMTPListener = new MockSMTPListener();
		mockSMTPListener.bTerminate = true;

		System.exit(0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		File homeDir = null;
//		List<String> suitefiles = new ArrayList<String>();
//		String os = System.getProperty("os.name");
//		testNg=new TestNG();
//		testNg.setDefaultSuiteName("resident");
//		MockSMTPListener mockSMTPListener = new MockSMTPListener();
//		mockSMTPListener.run();
//		String listExcludedGroups=JsonUtil.JsonObjParsing(Commons.getTestData(),"setExcludedGroups");
//		testNg.setExcludedGroups(listExcludedGroups);		
//		testNg.setTestClasses(new Class[] {
//				LoginTest.class,    
//				ViewMyHistory.class,
//				ManageMyVid.class,
//				SecureMyId.class,
//				UpdateMyData.class,
//				TrackMyRequests.class,
//				GetPersonalisedCard.class,
//				ShareMyData.class,
//				GetMyUIN.class,
//				GetInformation.class,
//				VerifyPhoneNumberEmailID.class
//
//		});
//		if (checkRunType().contains("IDE") || os.toLowerCase().contains("windows") == true) {
//			homeDir = new File(getResourcePath() + "/testngFile");
////			LOGGER.info("IDE Home Dir=" + homeDir);
//		} else {
////			homeDir = new File(System.getProperty("user.dir") + "/"+resourceTestFolderName + "/" + TestResources.resourceFolderName +"/testngFile");
////			LOGGER.info("Jar Home Dir=" + homeDir);
//		}
//
//		for (File file : homeDir.listFiles()) {
//			if (file.getName().toLowerCase() != null) {
//				suitefiles.add(file.getAbsolutePath());
//			}
//		}
//		testNg.setTestSuites(suitefiles);
//		String langid=JsonUtil.JsonObjParsing(Commons.getTestData(),"language");
//		String language=JsonUtil.JsonObjParsing(Commons.getTestData(),"loginlang");
//		
//			if(language.equals("sin")) {
//				langid="";
//			}
//		
//		System.getProperties().setProperty("testng.outpur.dir", "testng-report");
//		testNg.setOutputDirectory("testng-report");
//		System.getProperties().setProperty("emailable.report2.name", "ResidentUI" + "-"
//				+ System.getProperty("env.user")+ "-"+langid+"-"+ System.currentTimeMillis() + "-report.html");
//
//
//		testNg.run();
//		System.exit(0);
	}

public static String getGlobalResourcePath() {
		if (checkRunType().equalsIgnoreCase("JAR")) {
			return new File(jarUrl).getParentFile().getAbsolutePath().toString();
		} else if (checkRunType().equalsIgnoreCase("IDE")) {
			String path = new File(TestRunner.class.getClassLoader().getResource("").getPath()).getAbsolutePath()
					.toString();
			if (path.contains("test-classes"))
				path = path.replace("test-classes", "classes");
			return path;
		}
		return "Global Resource File Path Not Found";
	}

	public static String getResourcePath() {
		if (checkRunType().equalsIgnoreCase("JAR")) {
			return new File(jarUrl).getParentFile().getAbsolutePath().toString()+"/resources/";
		} else if (checkRunType().equalsIgnoreCase("IDE")) {
			String path = System.getProperty("user.dir") +  System.getProperty("path.config");

			//	String path = new File(TestRunner.class.getClassLoader().getResource("").getPath()).getAbsolutePath()
			//				.toString();
			if (path.contains("test-classes"))
				path = path.replace("test-classes", "classes");
			return path;
		}
		return "Global Resource File Path Not Found";
	}

	public static String checkRunType() {
		if (TestRunner.class.getResource("TestRunner.class").getPath().toString().contains(".jar"))
			return "JAR";
		else
			return "IDE";
	}
	public static String GetKernalFilename(){
		String path = System.getProperty("env.user");
		String kernalpath=null;
		if(System.getProperty("env.user")==null) {
			kernalpath="Kernel.properties";

		}else {
			kernalpath="Kernel_"+path+".properties";
		}
		return kernalpath;
	}

}
