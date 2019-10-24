package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class WebDriverTestng {
private WebDriver driver;
@BeforeClass
public void Startup(){
	
	System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
driver = new FirefoxDriver();
}
@Test (description="OrangeHRM Login")
public void Login() throws Exception{
Reporter.log("Test case steps");
driver.get("https://opensource-demo.orangehrmlive.com/");
Reporter.log("1.Application opened");
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
Reporter.log("2.typing user name");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
Reporter.log("3.Typing password");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
Reporter.log("4.login completed");
driver.findElement(By.id("welcome")).click();
driver.findElement(By.linkText("Logout")).click();
 System.out.println("Logout completed");
 Reporter.log("5.Logout completed");
}
@AfterClass
public void teardown(){
driver.quit();
}
}
