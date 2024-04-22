package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class SignupPage  extends AbstractComponent{

	public WebDriver driver;
	public SignupPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
	WebElement mobilenumberfld;
	@FindBy(xpath="//ion-button[text()='Get OTP']")
	WebElement getotpbtn;
	
	public VerifyOTP navigateToVerifyOTPPage(String number) {
		mobilenumberfld.sendKeys(number);
		getotpbtn.click();
		VerifyOTP otp=new VerifyOTP(driver);
		return otp;
		
	}
}
