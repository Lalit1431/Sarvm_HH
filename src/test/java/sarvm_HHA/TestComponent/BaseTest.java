package sarvm_HHA.TestComponent;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import sarvm_HHA.PageObject.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage page;
	
	public WebDriver intializeDriver() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;	
	}
	
	@BeforeMethod(alwaysRun = true)
	public LandingPage launchApplication() {
		driver=intializeDriver();
		page=new LandingPage(driver);
		page.goTo();
		return page;
	}
	
	@AfterMethod(alwaysRun = false)
	public void closeapplication() {
		driver.quit();
	}
	
	public String getScreenshot(String testcasename, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"//reports//"+testcasename+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//"+testcasename+".png";
		
	}
	
	
}
