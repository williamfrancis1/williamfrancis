package com.hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.LIB.*;

public class TC_101 {
	@Test
public static void main () throws Exception {
	//test case steps
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.verifyTitle();
	obj.login();
	obj.verifyText();
	obj.logout();
	obj.closeApplication();
}
}
