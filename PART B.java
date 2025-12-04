package runner;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
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
	ExtentReports reports = report.generateExtentReport("report");
	ExtentTest test = null;
	@BeforeMethod
	void lauch() throws MalformedURLException
    {
        openBrowser();
    }
    @Test
    void test() throws IOException
    {
        
        Screenshot.getScreenShot(driver,"gapfactory_screenshot");
        //test.addScreenCaptureFromPath("/home/coder/project/workspace/Project/screenshots/gapfactory_screenshot2025.12.03.16.05.52.png");//path will be different

		driver.findElement(By.xpath("(//a[@href=\"https://fairfield.marriott.com/locations/\"])[1]")).click();
		driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-896\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.fairfieldstore.com/index.aspx?utm_source=fairfield-site&utm_medium=main-navigation&utm_term=text-primary&utm_content=evergreen&utm_campaign=evergreen\"]")).click();
		
        // help.hoverOverElement(By.xpath("xpath");//to hover on a element
        // help.javascriptScroll(By.xpath("xpath"));//to scroll on a element

        
    }
    @AfterMethod
    void teardown()
    {
        driver.quit();
        reports.flush();
}
}
