package sarvm_HHA.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class Address extends AbstractComponent {
	public WebDriver driver;
	public Address(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-button[text()=' Add New Address ']")
	WebElement addnewadrresbtn;
	@FindBy(xpath="//input[@name='streetAddress']")
	WebElement houseno;
	@FindBy(xpath="//input[@name='locality']")
	WebElement apartment;
	@FindBy(xpath="//input[@name='landmark']")
	WebElement landmark;
	@FindBy(xpath="//ion-label[text()='Other']/parent::ion-chip")
	WebElement otherbtn;
	@FindBy(xpath="//ion-label[text()='Work']/parent::ion-chip")
	WebElement workbtn;
	@FindBy(xpath="//ion-label[text()='Home']/parent::ion-chip")
	WebElement homebtn;
	@FindBy(xpath="//ion-button[text()='Save and Proceed']")
	WebElement saveAddressbtn;
	@FindBy(xpath="//span[text()='Home']/parent::ion-label/parent::div/parent::ion-card//ion-button[text()=' Edit ']")
	WebElement editHomebtn;
	@FindBy(xpath="//span[text()='Work']/parent::ion-label/parent::div/parent::ion-card//ion-button[text()=' Edit ']")
	WebElement editWorkbtn;
	@FindBy(xpath="//span[text()='Other']/parent::ion-label/parent::div/parent::ion-card//ion-button[text()=' Edit ']")
	WebElement editOtherbtn;
	@FindBy(xpath="//span[text()='Home']/parent::ion-label/parent::div/parent::ion-card//ion-button[text()=' Delete ']")
	WebElement deleteHomebtn;
	@FindBy(xpath="//span[text()='Work']/parent::ion-label/parent::div/parent::ion-card//ion-button[text()=' Delete ']")
	WebElement deleteWorkbtn;
	@FindBy(xpath="//span[text()='Other']/parent::ion-label/parent::div/parent::ion-card//ion-button[text()=' Delete ']")
	WebElement deleteOtherbtn;
	@FindBy(xpath="//ion-button[text()='Yes']")
	WebElement Yesbtn;
	
	
	
	
	
	public void addnewotheraddress() {
		addnewadrresbtn.click();
		houseno.sendKeys("350");
		// Create Actions object
        Actions actions = new Actions(driver);
        // Simulate pressing the PAGE_UP key
        actions.moveToElement(saveAddressbtn).sendKeys(Keys.ARROW_UP).perform();
		apartment.sendKeys("Bijapur");
		landmark.sendKeys("Talikoti");
		otherbtn.click();
		saveAddressbtn.click();
	}
	public void addnewHomeaddress() {
		addnewadrresbtn.click();
		houseno.sendKeys("350");
		// Create Actions object
        Actions actions = new Actions(driver);
        // Simulate pressing the PAGE_UP key
        actions.moveToElement(saveAddressbtn).sendKeys(Keys.ARROW_UP).perform();
		apartment.sendKeys("Bijapur");
		landmark.sendKeys("Talikoti");
		homebtn.click();
		saveAddressbtn.click();
	}
	public void addnewWorkaddress() {
		addnewadrresbtn.click();
		houseno.sendKeys("350");
		// Create Actions object
        Actions actions = new Actions(driver);
        // Simulate pressing the PAGE_UP key
        actions.moveToElement(saveAddressbtn).sendKeys(Keys.ARROW_UP).perform();
		apartment.sendKeys("Bijapur");
		landmark.sendKeys("Talikoti");
		workbtn.click();
		saveAddressbtn.click();
	}
	public void editotheraddress() {
		editOtherbtn.click();
		houseno.clear();
		houseno.sendKeys("350");
		// Create Actions object
        Actions actions = new Actions(driver);
        // Simulate pressing the PAGE_UP key
        actions.moveToElement(saveAddressbtn).sendKeys(Keys.ARROW_UP).perform();
        apartment.clear();
		apartment.sendKeys("Bijapur");
		landmark.clear();
		landmark.sendKeys("Talikoti");
		saveAddressbtn.click();
	}
	public void editHomeaddress() {
		editHomebtn.click();
		houseno.clear();
		houseno.sendKeys("350");
		// Create Actions object
        Actions actions = new Actions(driver);
        // Simulate pressing the PAGE_UP key
        actions.moveToElement(saveAddressbtn).sendKeys(Keys.ARROW_UP).perform();
        apartment.clear();
		apartment.sendKeys("Bijapur");
		landmark.clear();
		landmark.sendKeys("Talikoti");
		saveAddressbtn.click();
	}
	public void editWorkaddress() {
		editWorkbtn.click();
		houseno.clear();
		houseno.sendKeys("350");
		// Create Actions object
        Actions actions = new Actions(driver);
        // Simulate pressing the PAGE_UP key
        actions.moveToElement(saveAddressbtn).sendKeys(Keys.ARROW_UP).perform();
        apartment.clear();
		apartment.sendKeys("Bijapur");
		landmark.clear();
		landmark.sendKeys("Talikoti");
		saveAddressbtn.click();
	}
	
	public void deleteOtheraddress() {
		deleteOtherbtn.click();
		Yesbtn.click();
	}
	public void deleteHomeaddress() {
		deleteHomebtn.click();
		Yesbtn.click();
	}
	public void deleteWorkaddress() {
		deleteWorkbtn.click();
		Yesbtn.click();
	}
	
}
