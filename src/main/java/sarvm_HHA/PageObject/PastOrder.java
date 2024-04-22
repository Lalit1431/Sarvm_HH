package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class PastOrder extends AbstractComponent {

	public WebDriver driver;
	public PastOrder(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ion-label[text()='Cancelled']/parent::div/parent::div")
	WebElement Cancelledtab;
	@FindBy(xpath="(//input[@aria-label='search text'])[2]")
	WebElement searchfield;
	@FindBy(xpath="(//ion-card)[5]")
	WebElement ordercard;
	
	
	public WebElement verifyCancelledOrder(String orderid) {
		Cancelledtab.click();
		searchfield.sendKeys(orderid);
		return ordercard;
		
	}
}
