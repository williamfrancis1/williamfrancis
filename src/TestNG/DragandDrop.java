package TestNG;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
public class DragandDrop {
WebDriver driver;
@Test
public void testDragnDrop() throws Exception
{
driver.manage().window().maximize();
driver.get("http://jqueryui.com/droppable/");
Thread.sleep(10000L);
assertEquals("Droppable | jQuery UI",driver.getTitle());
driver.switchTo().frame(0);
Actions a=new Actions(driver);
a.dragAndDrop(driver.findElement(By.id("draggable")),
driver.findElement(By.id("droppable"))).build().perform();
Thread.sleep(6000L);
}
@BeforeMethod
public void setUp() {
System.setProperty("webdriver.gecko.driver",
"/usr/bin/geckodriver");
driver=new FirefoxDriver();
}
@AfterMethod
public void tearDown()
{
driver.quit();
}
}