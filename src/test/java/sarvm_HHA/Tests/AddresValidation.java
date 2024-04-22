package sarvm_HHA.Tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import sarvm_HHA.PageObject.Address;
import sarvm_HHA.PageObject.Homepage;
import sarvm_HHA.PageObject.Preferance;
import sarvm_HHA.PageObject.Profile;
import sarvm_HHA.PageObject.SignupPage;
import sarvm_HHA.PageObject.VerifyOTP;
import sarvm_HHA.TestComponent.BaseTest;

public class AddresValidation extends BaseTest {

	@Test
	public void addnewotheraddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Address address=home.navigateToAddressList();
		address.addnewotheraddress();
		}
	@Test
	public void addnewhomeaddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Address address=home.navigateToAddressList();
		address.addnewHomeaddress();
		}
	@Test
	public void addnewworkaddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Address address=home.navigateToAddressList();
		address.addnewWorkaddress();
		}
	@Test
	public void editOtheraddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Profile profie = home.navigateToProfile();
		Address address=profie.navigateToaddress();
		address.editotheraddress();
		}
	@Test
	public void editHomeaddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Profile profie = home.navigateToProfile();
		Address address=profie.navigateToaddress();
		address.editHomeaddress();
		}
	@Test
	public void editWorkaddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Profile profie = home.navigateToProfile();
		Address address=profie.navigateToaddress();
		address.editWorkaddress();
		}

	@Test
	public void deleteOtheraddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Profile profie = home.navigateToProfile();
		Address address=profie.navigateToaddress();
		address.deleteOtheraddress();
		}
	@Test
	public void deleteHomeaddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Profile profie = home.navigateToProfile();
		Address address=profie.navigateToaddress();
		address.deleteHomeaddress();
		}
	@Test
	public void deleteWorkaddress() throws InterruptedException  {
		WebElement language = page.languageselection();
		Assert.assertTrue(language.isDisplayed(), "Text 'Select Language' is not present on the webpage");
		SignupPage signup = page.navigateToSignupPage();
		VerifyOTP otp = signup.navigateToVerifyOTPPage("4202244558");
		Preferance pref = otp.verifyOTP();
		Homepage home = pref.navigatetoHomepage();
		Profile profie = home.navigateToProfile();
		Address address=profie.navigateToaddress();
		address.deleteWorkaddress();
		}

	


}