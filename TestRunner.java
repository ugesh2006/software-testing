package runner;

import java.io.IOException;

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
      //enter you code according to testCase
    }
    @AfterMethod
    void teardown()
    {
        driver.quit();
        reports.flush();
    }
}
