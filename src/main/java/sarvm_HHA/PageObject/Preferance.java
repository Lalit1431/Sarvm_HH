package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class Preferance extends AbstractComponent {
	public WebDriver driver;
	public Preferance(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Veg']/parent::div")
	WebElement vegbtn;
	
	public Homepage navigatetoHomepage() {
		vegbtn.click();
		Homepage home=new Homepage(driver);
		return home;
	}
	
}
