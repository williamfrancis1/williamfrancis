package com.hrms.LIB;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class Global {
//var
	
	public WebDriver driver;
	public String url ="https://opensource-demo.orangehrmlive.com/";
	public String un = "Admin";
	public String pw = "admin123";
	public Actions ac ;
	
	
//obj
	
	public String txt_loginname ="txtUsername";
	public String txt_Password="txtPassword";
	public String btn_login="Submit";
	public String link_logout ="Logout";

}
