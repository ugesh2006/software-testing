package runner;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.*;


class Testrunner extends Base
{ Reporter report = new Reporter();
    ExtentReports reports = report.generateExtentReport("report");
    ExtentTest test = null;
    @BeforeMethod
    void lauch()
    {
        openBrowser();
    }
    @Test
    void test()
    {
      test = reports.createTest("click on Blog");
      LoggerHandler.info("click on signin");
      test.pass("click");
      for(int i=0;i<300;i++)
      {
        LoggerHandler.info("click on signin");
        test.pass("click");
      }
      Screenshot.captureScreenShot("agronetto_screenshot");
      test.addScreenCaptureFromPath("/home/coder/project/workspace/Project/screenshots/agronetto_screenshot2025.08.25.03.53.54.png");
      WebDriverHelper helper = new WebDriverHelper(driver);
      // helper.clickOnElement(By.xpath("(//div[@data-hrf=\"https://agroline.com/login/\"])[1]"));
      // helper.clickOnElement(By.xpath("(//div[@class=\"example-companies\"]/a)[1]"));
      // helper.switchToNewWindow();
      // helper.clickOnElement(By.xpath("//a[@class='verified-dealer-title js-link-into-dialog']"));
      // helper.clickOnElement(By.xpath("//a[@class='contact-with-dealer-button']"));
      // driver.navigate().to("https://agronetto.com/");
      // helper.javascriptScroll(By.xpath("(//a[@href='https://agroline.com/blog/'])[1]"));
      // helper.clickOnElement(By.xpath("(//a[@href='https://agroline.com/blog/'])[1]"));
      // helper.hoverOverElement(By.xpath("(//div[@class='projects-menu'])[1]"));
      // helper.clickOnElement(By.xpath("(//ul[@class=\"project-list\"]/li)[2]"));
      // helper.switchToNewWindow();
      // driver.navigate().to("https://agronetto.com/");
      // helper.clickOnElement(By.xpath("//div[@data-id='spares']"));
      // helper.sendKeys(By.xpath("//input[@name='spcid']"), "37178");
      // helper.enterAction(By.xpath("//input[@name='spcid']"));
      // helper.clickOnElement(By.xpath("//span[@class='current sl-orders-select__current']"));
      // helper.clickOnElement(By.xpath("(//div[@class='sl-orders-select-dropdown']/span)[3]"));

      
    }
    @AfterMethod
    void teardown()
    {
        driver.quit();
    }
    @AfterClass
    void report()
    {
        reports.flush();
    }
}














package runner;
 
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.events.EventFiringDecorator;

import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.Base;
import utils.EventHandler;
import utils.Reporter;
 
public class TestSample extends Base {
  Reporter report = new Reporter();
    ExtentReports reports = report.generateExtentReport("report");
    ExtentTest test = null;
 
   @BeforeMethod

public void launchBrowser(){
 
  //launch the browser by using openbrowser method.
  try {
    openBrowser();
  } catch (MalformedURLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
}
 
 
@Test

public void testOne(){

// write your scripts here
driver.findElement(By.xpath("//button[@data-event-copy='Sunglasses']")).click();
driver.findElement(By.xpath("//a[@href='/sunglasses/progressive']")).click();
//driver.navigate().to("https://www.warbyparker.com/sunglasses/progressive?sortBy=Price+desc&bridgeFit=lowBridge");
//driver.findElement(By.xpath("//a[@href='/sunglasses/esme-lbf/crystal?w=medium' and @class='c-jsqlab']")).click();



}
@Test
public void testtwo(){
  driver.get("https://www.warbyparker.com/sunglasses/esme-lbf/crystal?w=medium");
driver.findElement(By.xpath("//button[@data-testid='select-lenses-and-buy']")).click();



Reporter rp=new Reporter();
test = reports.createTest("click on Blog");
test.pass("click");
for(int i=0;i<300;i++)
{
  test.pass("click");
}
Reporter.captureScreenshotAsBase64(driver,"warbyparker_screenshot");
test.addScreenCaptureFromPath("/home/coder/project/workspace/Project/reports/errorScreenshots/warbyparker_screenshot_2025-08-25_15-30-53.png");
}
 
@AfterMethod

public void teardown(){

//quit ur browser here
if(driver!=null){
  driver.quit();
}

}
 
 
}























driver.navigate().refresh();





executiontype = remote
browser = chrome
gridurl = http://localhost:4444
url = https://www.expedia.co.in/

