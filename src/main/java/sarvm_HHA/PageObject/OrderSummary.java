package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class OrderSummary extends AbstractComponent {
	public WebDriver driver;
	public OrderSummary(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = " //ion-button[text()=' Continue ']")
	 WebElement PickContinueBtn;
	@FindBy(xpath = "//span[contains(text(),'Pay at Pickup')]")
	 WebElement PayAtPickupButton;
	@FindBy(xpath = "//input[@ng-reflect-value='DELIVERY']")
	private WebElement DeliveryRadioBtn;
	@FindBy(xpath = " //ion-button[text()=' Continue ']")
	private WebElement DeliveryContinueBtn;
	@FindBy(xpath = "//span[contains(text(),'Pay at Delivery')]")
	private WebElement PayAtDeliveryButton;
	@FindBy(xpath = "//label[text()='Self Pickup']")
	private WebElement selfPickup;
	
	

	public Submittedorder SelfPickupOrder() throws InterruptedException {
		selfPickup.click();
		PickContinueBtn.click();
		Thread.sleep(2000);
		PayAtPickupButton.click();
		Submittedorder submit=new Submittedorder(driver);
		return submit;
	}
	
	public Submittedorder SelectDeliveryOrder() throws InterruptedException {
		DeliveryRadioBtn.click();
		DeliveryContinueBtn.click();
		Thread.sleep(2000);
		PayAtDeliveryButton.click();
		Submittedorder submit=new Submittedorder(driver);
		return submit;
	}
}

