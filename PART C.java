package runner;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.*;


class TestRunner extends Base
{
WebDriverHelper help=new WebDriverHelper(driver);
Reporter report = new Reporter();
ExtentReports reports = Reporter.generateExtentReport("report");
ExtentTest test = null;
@BeforeMethod
void lauch() throws MalformedURLException
{
openBrowser();
}
@Test
void test() throws IOException
{
test=reports.createTest("sampletest");
for(int i=0;i<300;i++)
{
LoggerHandler.logInfo("click on signin");
test.pass("click");
}
Screenshot.getScreenShot(driver,"sleepyowl_screenshot");
//test.addScreenCaptureFromPath("/home/coder/project/workspace/Project/screenshots/gapfactory_screenshot2025.12.03.16.05.52.png");//path will be different
driver.manage().window().maximize();

driver.findElement(By.xpath("(//a[@data-entry-id=\"4sziGSV1mx8jbwCte7m4r5\"])[1]")).click();
driver.findElement(By.xpath("//a[@id=\"790nM5AU3yP6mzhwOOjDuR\"]")).click();
driver.findElement(By.xpath("//a[@id=\"33o0EuvX1NkTgLLQ2ftB2n\"]")).click();




}
@AfterMethod
void teardown()
{
driver.quit();
reports.flush();
}
}
