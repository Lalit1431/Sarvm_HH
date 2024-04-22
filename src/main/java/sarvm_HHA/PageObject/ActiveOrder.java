package sarvm_HHA.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class ActiveOrder extends AbstractComponent {

	public WebDriver driver;
	public ActiveOrder(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='day-navbar']/following-sibling::div)[1]//ion-button[text()=' Details ']")
	WebElement firstOrder;
	@FindBy(xpath="(//p[@id='info'])[1]")
	WebElement orderId;
	@FindBy(xpath="//ion-button[text()=' Cancel Order']")
	WebElement cancelOrderbtn;
	@FindBy(xpath="//ion-button[text()='Yes']")
	WebElement yesbtn;
	@FindBy(xpath = "//input[@placeholder='order or shop']")
	WebElement SearchIDfield;
	
	public String cancelOrder() throws InterruptedException {
		firstOrder.click();
		String orderid=orderId.getText();
		System.out.println(orderId.getText());
		Actions act=new Actions(driver);
		act.moveToElement(cancelOrderbtn).sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(4000);
		cancelOrderbtn.click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		yesbtn.click();
		return orderid;
	}
	
	public String getorder(String orderid) throws InterruptedException {
		SearchIDfield.sendKeys(orderid);
		Thread.sleep(4000);
		firstOrder.click();
		return orderId.getText();
	}
	public String getorder2(String orderid) {
		SearchIDfield.clear();
		SearchIDfield.sendKeys(orderid);
		firstOrder.click();
		return orderId.getText();
	}
}
