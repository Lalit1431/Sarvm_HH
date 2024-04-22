package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class Homepage extends AbstractComponent {
	public WebDriver driver;
	public Homepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='box full-width-card'])[2]//ion-label")
	WebElement favShopName;
	@FindBy(xpath="(//div[@class='box full-width-card'])[2]//div[@class='heart']")
	WebElement favoriteicon;
	@FindBy(xpath="(//div[@class='box full-width-card'])[1]//ion-label")
	WebElement favShopName1;
	@FindBy(xpath="//ion-item[@routerlink=\"/address-list\"]")
	WebElement addressList;
	
	
	@FindBy(xpath = "//ion-label[contains(text(),'Besht Kacchi Dabheli')]")
	WebElement ShopSelectionEl;
	
	@FindBy(xpath = "//ion-label[contains(text(),'The Cake Celebration')]")
	WebElement shop2;
	
	public String clickOnFavIcon() {
		favoriteicon.click();
		return favShopName.getText();
	}
	public String getshopname1() throws InterruptedException {
		Thread.sleep(10000);
		return favShopName1.getText();
	}
	public Address navigateToAddressList()	{
		addressList.click();
		Address address=new Address(driver);
		return address;
	}
	public ShopPage SelectShop() {
		Actions act=new Actions(driver);
		act.moveToElement(ShopSelectionEl);
		ShopSelectionEl.click();
		ShopPage shoppage=new ShopPage(driver);
		return shoppage;
	}
	public ShopPage SelectShop2() {
		Actions act=new Actions(driver);
		act.moveToElement(shop2);
		shop2.click();
		ShopPage shoppage=new ShopPage(driver);
		return shoppage;
	}



}

