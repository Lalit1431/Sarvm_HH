package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class TrackPage extends AbstractComponent {

	
	public WebDriver driver;
	public TrackPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//p[contains(text(),'Order ID 0')])[1]")
	 WebElement trackOrderId;
	
	@FindBy(xpath = "(//div[@class='active_order'])[2]")
	private WebElement ViewActiveOrderBtn;
	
	public String getOrderId() {
	String OrderIdStr = trackOrderId.getText();
	System.out.println(OrderIdStr);
	String ExpectedOrderId = OrderIdStr.replaceAll("[^0-9]", "");
	System.out.println(ExpectedOrderId);
	return ExpectedOrderId;
	}
	public ActiveOrder navigateToActiveOrder() {
		ViewActiveOrderBtn.click();
		ActiveOrder active=new ActiveOrder(driver);
		return active;
	}
}
