package sarvm_HHA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sarvm_HHA.AbstactComponent.AbstractComponent;

public class Submittedorder extends  AbstractComponent {
	public WebDriver driver;
	public Submittedorder(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='card'])[5]")
	 WebElement trackDropDownEle;
	@FindBy(xpath = "(//div[@class='card'])[6]")
	 WebElement trackDropDownEle1;

	
	@FindBy(xpath = "//ion-button[text()=' Track ']")
	 WebElement TrackBtn;
	@FindBy(xpath = "(//ion-button[text()=' Track '])[1]")
	 WebElement TrackBtn1;
	@FindBy(xpath = "(//ion-button[text()=' Track '])[2]")
	 WebElement TrackBtn2;
	public TrackPage clickonTrackbtn() {
		trackDropDownEle.click();
		TrackBtn.click();
		TrackPage track=new TrackPage(driver);
		return track;
	}
	public TrackPage clickonTrackbtn1() {
		trackDropDownEle.click();
		TrackBtn1.click();
		TrackPage track=new TrackPage(driver);
		return track;
	}
	public TrackPage clickonTrackbtn2() {
		trackDropDownEle.click();
		Actions act=new Actions(driver);
		act.moveToElement(trackDropDownEle1).perform();
		trackDropDownEle1.click();
		TrackBtn1.click();
		TrackPage track=new TrackPage(driver);
		return track;
	}
}
