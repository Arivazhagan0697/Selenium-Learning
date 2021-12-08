package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Desktop\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Bishop heber trichy");
	}

	// This method will take the screenshot
	private static void takeScreenshot() throws IOException {

		//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// The below method will save the screenshot in d drive with name
		// "screenshot.png"
        //FileUtils.copyFile(scrFile, new File("Desktop:\\snap.png"));
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("Desktop:\\google.png");
		FileHandler.copy(sourceFile, destinationFile);
	}

}
