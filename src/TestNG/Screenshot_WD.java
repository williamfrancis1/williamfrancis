package TestNG;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screenshot_WD {
	
WebDriver driver;

@BeforeMethod

public void SetUp() {

System.setProperty("webdriver.gecko.driver", "E:\\TESTING TOOLS\\Softwares\\Firefox\\geckodriver.exe");
    driver = new FirefoxDriver();

}

@AfterMethod

public void tearDown() {

	driver.quit();
	
}

@Test

public void screenshot() throws Exception {

try {

driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(3000);
		
	WebElement element = driver.findElement(By.linkText("PIM"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
		 Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(4000);
		System.out.println("clicked on submenu");
}

catch(Exception e) {

File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("/home/william/Document/TestNg Reports/TestResults.png"));

}
driver.quit();
		
}
	
}