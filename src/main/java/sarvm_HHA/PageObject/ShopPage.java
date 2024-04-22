package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class ShopPage extends AbstractComponent {
	public WebDriver driver;

	public ShopPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[text()='Add'])[1]")
	WebElement AddBtn;
	@FindBy(xpath = "//p[contains(text(),'Tomorrow ')]/ancestor::ion-card")
	WebElement SheduleDeliveryBtn2;
	@FindBy(xpath = "//div[@class='cart']")
	WebElement ViewCartBtn;
	@FindBy(xpath = "//p[contains(text(),'Today')]/ancestor::ion-card")
	private WebElement SheduleDeliveryBtn;

	public OrderSummary addproduct() throws InterruptedException {
		Thread.sleep(3000);
		AddBtn.click();
		Thread.sleep(3000);
		SheduleDeliveryBtn.click();
		Thread.sleep(3000);
		ViewCartBtn.click();
		OrderSummary ordersummary=new OrderSummary(driver);
		return ordersummary;
	}
	public Homepage addproductformultivendor() throws InterruptedException {
		Thread.sleep(3000);
		AddBtn.click();
		Thread.sleep(3000);
		SheduleDeliveryBtn.click();
		Thread.sleep(3000);
		clickOnBackbtn();
		Homepage home=new Homepage(driver);
		return home;
	}

	
	

}
