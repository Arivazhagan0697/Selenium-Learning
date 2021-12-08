package extentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpenHRM_With_ExtentReport {

	WebDriver driver;
	ExtentReports extentReport;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testcases;

	@BeforeSuite
	public void lanuchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91737\\Desktop\\Selenium Jars\\chromedriver.exe");
		extentReport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("OrangeHRMExtentReport.html");
		extentReport.attachReporter(htmlReporter);
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		testcases = extentReport.createTest("Launching the Browser");

	}

	@Test
	public void Login() {
		testcases.log(Status.INFO, "Navigating to OrangeHRM");
		testcases = extentReport.createTest("Opens the OrangeHRM Application");
		testcases.log(Status.INFO, "Entering UserName");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		testcases.log(Status.INFO, "Entering passWord");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		testcases.log(Status.INFO, "Clicking the Login Button");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void logoPresence() {
		testcases = extentReport.createTest("Check Logo Present");
		WebElement disStatus = driver.findElement(By.xpath("//*[@id=\'branding\']/a[1]/img"));
		//Assert.assertEquals(disStatus, true);
		if(disStatus.isDisplayed()) {
			testcases.log(Status.PASS, "The Logo is present");
		}else {
			testcases.log(Status.FAIL, "The Logo is not present");
		}
	}

	@Test
	public void Logout() {
		testcases = extentReport.createTest("Clicking the Logout Button");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		testcases.log(Status.INFO, "User Sucessfully LoggedOut the Application");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		extentReport.flush();

	}
}
