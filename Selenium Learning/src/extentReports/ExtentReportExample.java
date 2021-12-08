package extentReports;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportExample {

	WebDriver driver;
	ExtentReports extentReport;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testcase;

	@Test
	public void openGoogle() throws IOException {
		testcase = extentReport.createTest("Verify Google Title");
		testcase.log(Status.INFO, "Navigating to Google");
		driver.get("http://www.google.co.in");
		String title = driver.getTitle();
		testcase.log(Status.INFO, "Actual title : " + title);
		testcase.log(Status.INFO, "Expected Title : " + "Google");
		testcase.log(Status.INFO, "Verification of Actual and Expected Title");
		if (title.equals("Google")) {
			testcase.log(Status.PASS, "Actual title and Expected title are Equal");
		} else {
			testcase.log(Status.FAIL, "Actual title and Expected title are NOT Equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File("google.png");
			FileHandler.copy(sourceFile, destinationFile);
			testcase.addScreenCaptureFromPath("google.png");

		}
	}

	@Test
	public void openBing() throws IOException {
		testcase = extentReport.createTest("Verify Bing Title");
		testcase.log(Status.INFO, "Navigating to Bing");
		driver.get("http://www.bing.com");
		String title = driver.getTitle();
		testcase.log(Status.INFO, "Actual title : " + title);
		testcase.log(Status.INFO, "Expected Title : " + "Bing");
		testcase.log(Status.INFO, "Verification of Actual and Expected Title");
		if (title.equals("bing")) {
			testcase.log(Status.PASS, "Actual title and Expected title are Equal");
		} else {
			testcase.log(Status.FAIL, "Actual title and Expected title are NOT Equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File("bing.png");
			FileHandler.copy(sourceFile, destinationFile);
			testcase.addScreenCaptureFromPath("bing.png");
		}
	}

	@Test
	public void openWikipedia() throws IOException {
		testcase = extentReport.createTest("Verify Wikipedia Title");
		testcase.log(Status.INFO, "Navigating to Wikipedia");
		driver.get("http://www.wikipedia.org");
		String title = driver.getTitle();
		testcase.log(Status.INFO, "Actual title : " + title);
		testcase.log(Status.INFO, "Expected Title : " + "Wikipedia");
		testcase.log(Status.INFO, "Verification of Actual and Expected Title");
		if (title.equals("Wikipedia")) {
			testcase.log(Status.PASS, "Actual title and Expected title are Equal");
		} else {
			testcase.log(Status.FAIL, "Actual title and Expected title are NOT Equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File("wiki.png");
			FileHandler.copy(sourceFile, destinationFile);
			testcase.addScreenCaptureFromPath("wiki.png");
		}
	}

	@BeforeSuite
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91737\\Desktop\\Selenium Jars\\chromedriver.exe");
		extentReport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extentReport.attachReporter(htmlReporter);
		driver = new ChromeDriver();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		extentReport.flush();
	}

}
