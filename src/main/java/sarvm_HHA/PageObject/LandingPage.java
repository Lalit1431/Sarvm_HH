package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class LandingPage extends AbstractComponent{
public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ion-card-content[text()=' English ']/parent::ion-card")
	WebElement englishlang;
	@FindBy(tagName = "h4")
	WebElement selectlanguagetext;
	@FindBy(xpath = "//ion-button[text()=' Continue ']")
	WebElement continuebtn;
	
	
	
	public WebElement languageselection()  {
		waitForWebElementAppear(englishlang);
		englishlang.click();
		return selectlanguagetext;
	}
	
	public SignupPage navigateToSignupPage() {
		continuebtn.click();
		SignupPage signup=new SignupPage(driver);
		return signup;
	}
	
	public void goTo() {
	driver.get("https://test-user.sarvm.ai/selected-language");
	
	}
}
