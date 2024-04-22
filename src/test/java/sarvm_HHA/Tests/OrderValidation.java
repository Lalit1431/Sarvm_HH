package sarvm_HHA.Tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import sarvm_HHA.PageObject.ActiveOrder;
import sarvm_HHA.PageObject.Homepage;
import sarvm_HHA.PageObject.OrderSummary;
import sarvm_HHA.PageObject.PastOrder;
import sarvm_HHA.PageObject.Preferance;
import sarvm_HHA.PageObject.Profile;
import sarvm_HHA.PageObject.ShopPage;
import sarvm_HHA.PageObject.SignupPage;
import sarvm_HHA.PageObject.Submittedorder;
import sarvm_HHA.PageObject.TrackPage;
import sarvm_HHA.PageObject.VerifyOTP;
import sarvm_HHA.TestComponent.BaseTest;

public class OrderValidation extends BaseTest {
	
	@Test
	public void orderCancel() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Profile profile = home.navigateToProfile();
		ActiveOrder order = profile.navigateToActiveOrders();
		String orderid = order.cancelOrder();
		order.clickOnBackbtn2();
		PastOrder pastorder = profile.navigateToPastOrders();
		WebElement ordercard = pastorder.verifyCancelledOrder(orderid);
		Assert.assertNotNull(ordercard,"Element is not present");
	}
	@Test
	public void makePickupOrder() throws InterruptedException {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		ShopPage shoppage = home.SelectShop();
		OrderSummary ordersummary = shoppage.addproduct();
		Submittedorder submitorder = ordersummary.SelfPickupOrder();
		TrackPage track = submitorder.clickonTrackbtn();
		String expectedorderid = track.getOrderId();
		ActiveOrder active = track.navigateToActiveOrder();
		String actualorderid = active.getorder(expectedorderid);
		Assert.assertEquals(actualorderid, expectedorderid);
		
	}
	
	@Test
	public void makeDeliveryOrder() throws InterruptedException {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		ShopPage shoppage = home.SelectShop();
		OrderSummary ordersummary = shoppage.addproduct();	
		Submittedorder submitorder = ordersummary.SelectDeliveryOrder();
		TrackPage track = submitorder.clickonTrackbtn();
		String expectedorderid = track.getOrderId();
		ActiveOrder active = track.navigateToActiveOrder();
		String actualorderid = active.getorder(expectedorderid);
		Assert.assertEquals(actualorderid, expectedorderid);
	}
	
	@Test
	public void makeMultivendorOrder() throws InterruptedException {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		ShopPage shoppage = home.SelectShop();
		shoppage.addproductformultivendor();
		home.SelectShop2();
		OrderSummary ordersummary = shoppage.addproduct();
		Submittedorder submitorder = ordersummary.SelfPickupOrder();
		TrackPage track = submitorder.clickonTrackbtn1();
		String expectedorderid1 = track.getOrderId();
		ActiveOrder active = track.navigateToActiveOrder();
		String actualorderid1 = active.getorder(expectedorderid1);
		Assert.assertEquals(actualorderid1, expectedorderid1);
		active.clickOnBackbtn4();
		active.clickOnBackbtn5();
		active.clickOnBackbtn3();
		submitorder.clickonTrackbtn2();
		String expectedorderid2 = track.getOrderId();
		track.navigateToActiveOrder();
		String actualorderid2 = active.getorder(expectedorderid2);
		Assert.assertEquals(actualorderid2, expectedorderid2);
		
	}
}
