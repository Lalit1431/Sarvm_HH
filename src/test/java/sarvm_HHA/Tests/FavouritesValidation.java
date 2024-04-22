package sarvm_HHA.Tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import sarvm_HHA.PageObject.Favourites;
import sarvm_HHA.PageObject.Homepage;
import sarvm_HHA.PageObject.Preferance;
import sarvm_HHA.PageObject.Profile;
import sarvm_HHA.PageObject.SignupPage;
import sarvm_HHA.PageObject.VerifyOTP;
import sarvm_HHA.TestComponent.BaseTest;

public class FavouritesValidation extends BaseTest{
	
	@Test
	public void makeShopFavorite() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		String shopname = home.clickOnFavIcon();
		Profile profile = home.navigateToProfile();
		Favourites fav = profile.navigateToFavourites();
		WebElement favShop = fav.checkFavouritesShop(shopname);
		Assert.assertNotNull(favShop, "Element is not present");
	}
	
	@Test(dependsOnMethods = "makeShopFavorite")
	public void makeShopUnfavorite() throws InterruptedException {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		//home.navigateToProfile();
		Profile profile = home.navigateToProfile();
		Favourites fav = profile.navigateToFavourites();
		String shopname = fav.unselectShopFavIcon();
		String shopname1=home.getshopname1();
		Assert.assertNotEquals(shopname, shopname1, "Strings are not correct.");
		   
	}

}
