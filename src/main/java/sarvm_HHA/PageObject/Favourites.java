package sarvm_HHA.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class Favourites extends AbstractComponent {


	public WebDriver driver;
	public Favourites(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='main']//ion-label")
	WebElement shopname;
	@FindBy(xpath="//div[@class='main']//div[@class='heart']")
	WebElement favicon;
	@FindBy(xpath="(//ion-back-button)[2]")
	WebElement backbtn;
	
	
	
	public WebElement checkFavouritesShop(String shopname) {
		WebElement favshop = driver.findElement(By.xpath("//ion-label[contains(.,'"+shopname+"')]"));
		return favshop;
	}
	
	public String unselectShopFavIcon() {
		String shopName=shopname.getText();
		System.out.println(shopName);
		favicon.click();
		backbtn.click();
		clickOnBackbtn();
		return shopName;
	}
	

	

}
