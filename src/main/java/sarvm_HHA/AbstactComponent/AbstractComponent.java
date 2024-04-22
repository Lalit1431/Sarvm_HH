package sarvm_HHA.AbstactComponent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sarvm_HHA.PageObject.Profile;

public class AbstractComponent {


	public WebDriver driver;
	
	
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//ion-button[@routerlink='/profile']")
	WebElement profile;
	@FindBy(tagName = "ion-back-button")
	WebElement backbtn;
	@FindBy(xpath =  "(//ion-back-button)[2]")
	WebElement backbtn2;
	@FindBy(xpath =  "(//ion-back-button)[4]")
	WebElement backbtn3;
	@FindBy(xpath =  "(//ion-back-button)[6]")
	WebElement backbtn4;
	@FindBy(xpath =  "(//ion-back-button)[5]")
	WebElement backbtn5;
	
	public Profile navigateToProfile() {
		profile.click();
		Profile profile=new Profile(driver);
		return profile;
	}
	
	public void clickOnBackbtn() {
		backbtn.click();
	}
	public void clickOnBackbtn2() throws InterruptedException {
		Thread.sleep(4000);
		backbtn2.click();
	}
	public void clickOnBackbtn3() throws InterruptedException {
		Thread.sleep(4000);
		backbtn3.click();
	}
	public void clickOnBackbtn4() throws InterruptedException {
		Thread.sleep(4000);
		backbtn4.click();
	}
	public void clickOnBackbtn5() throws InterruptedException {
		Thread.sleep(4000);
		backbtn5.click();
	}
	public void waitForWebElementAppear(WebElement Findby) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(Findby));
	}
}
