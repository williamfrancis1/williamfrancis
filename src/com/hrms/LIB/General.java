package com.hrms.LIB;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class General extends Global {
//all re-usab --fun
	public void openApplication() throws Exception {
		Log.info("*******started execution***********");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver =new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("application opened");
		Thread.sleep(3000);
	}
   
    public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Thread.sleep(10000);
		 Reporter.log("Login Completed");
			Log.info("Login Completed");
	}
	public void logout() {
		driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    System.out.println("Logout completed");
	    Reporter.log("Logout Completed");
		Log.info("Logout Completed");
	}
	public void verifyTitle() {
		//Verify title
		if(driver.getTitle().equals("OrangeHRM")) {
						System.out.println("Title Matched");
						
		}
		else {
		System.out.println("Title Not Matched and the expected title is "+driver.getTitle());
		 Reporter.log("Title Verify");
			Log.info("Title Verify");
			}
	}
	public void verifyText() {
		assertTrue(driver.findElement(By.id("welcome")).getText().matches("Welcome Admin"));
		System.out.println("Text Matched");
		 Reporter.log("Text Verified");
			Log.info("Text Verified");
	}
	
		public void mouseOver() throws Exception {
		ac = new Actions(driver);
		WebElement pimmenu = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		ac.moveToElement(pimmenu).perform();
		System.out.println("mouse over completed");
		Thread.sleep(8000);
		 Reporter.log("MouseOver Completed");
			Log.info("MouseOver Completed");
		
	}
	public void pimSubmenu()throws Exception {

        WebElement pimsub_menu=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]"));
        ac.moveToElement(pimsub_menu).build();
        System.out.println("mouse over 2 completed");
        Thread.sleep(3000);
        Reporter.log("PIM Menu");
		Log.info("PIM Menu");
	}
	public void addEmp() throws Exception{
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("selenium");
		driver.findElement(By.id("lastName")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		Thread.sleep(5000);
		System.out.println("New Emp Added");
		Reporter.log("New Employee added");
		Log.info("New Employee Added");
		
		
	}
	public void searchEmp()throws Exception{
		WebElement pimsub_menu=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		ac.moveToElement(pimsub_menu).build();
	    System.out.println("mouse over 2 completed");
		Thread.sleep(5000);
		Reporter.log("Employee list");
		Log.info("Employee list");
	}
	public void delEmp() throws Exception {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(3000);
		if ( !driver.findElement(By.id("ohrmList_chkSelectRecord_5")).isSelected() )
		{
		     driver.findElement(By.id("ohrmList_chkSelectRecord_5")).click();
		}
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		Thread.sleep(5000);
		Reporter.log("Employee Deleted");
		Log.info("Employee deleted");
	}
	 public void closeApplication() {
	    	driver.quit();
	    	System.out.println("Application closed");
	    	Log.info("Application close successfully");
	    	Log.info("*******End execution***********");
	    }


		
	}
