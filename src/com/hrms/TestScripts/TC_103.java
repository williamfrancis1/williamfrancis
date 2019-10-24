package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.LIB.General;

public class TC_103 {
	@Test
	public static void main () throws Exception {
		//test case steps
	General obj = new General();
	obj.openApplication();
	obj.verifyTitle();
	obj.login();
	obj.mouseOver();
	obj.searchEmp();
	obj.delEmp();
	obj.logout();
	obj.closeApplication();
	
	

}
}
