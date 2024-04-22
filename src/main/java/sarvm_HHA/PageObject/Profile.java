package sarvm_HHA.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class Profile extends AbstractComponent {

	public WebDriver driver;
	public Profile(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Favourites']/parent::ion-col")
	WebElement favourites;
	@FindBy(xpath="//p[text()='My Address']/parent::ion-col")
	WebElement myaddress;
	@FindBy(xpath="(//ion-accordion)[1]")
	WebElement activeOrder;
	@FindBy(xpath="(//ion-accordion)[2]")
	WebElement pastorder;
	@FindBy(xpath="(//ion-accordion)[1]//p[text()=' View More Orders ']")
	WebElement moreActiveOrder;
	@FindBy(xpath="(//p[@class='moreorder'])[2]")
	WebElement test;
	@FindBy(xpath = "//div[@class='logout']")
	WebElement logout;
	
	
	public Favourites navigateToFavourites() {
		favourites.click();
		Favourites fav=new Favourites(driver);
		return fav;
	}
	
	public Address navigateToaddress() {
		myaddress.click();
		Address address=new Address(driver);
		return address;
	}
	public ActiveOrder navigateToActiveOrders() throws InterruptedException {
		activeOrder.click();
		Actions act=new Actions(driver);
		Thread.sleep(4000);
		act.moveToElement(moreActiveOrder).sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(4000);
		moreActiveOrder.click();
		Thread.sleep(4000);
		ActiveOrder order=new ActiveOrder(driver);
		return order;
	}
	public PastOrder navigateToPastOrders() throws InterruptedException {
		
		Actions act=new Actions(driver);
		//act.moveToElement(pastorder).sendKeys(Keys.ARROW_UP).perform();
		act.click(pastorder).perform();
		Thread.sleep(4000);
		//act.moveToElement(test).sendKeys(Keys.ARROW_UP).perform();
		act.click(test).perform();
		Thread.sleep(4000);
		PastOrder order=new PastOrder(driver);
		return order;
	}
	
	
}
