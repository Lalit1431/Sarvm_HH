package sarvm_HHA.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class VerifyOTP extends AbstractComponent{
	public WebDriver driver;
	public VerifyOTP(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ion-input[@type='tel']//input")
	WebElement OTPField;
	@FindBy(xpath="//ion-button[text()=' Verify ']")
	WebElement verifybtn;
	
	public Preferance verifyOTP() throws InterruptedException {
		Thread.sleep(1000);
		waitForWebElementAppear(OTPField);
		OTPField.sendKeys("7777"+Keys.ENTER);
		//Actions act=new Actions(driver);
		//act.click(verifybtn).perform();
		Preferance pref=new Preferance(driver);
		return pref;
	}
	

}
