package signUpExpectedChild;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class MobileAndPin extends StoryScreen {

	@Test(priority = 4)
	public void checkNumberPickPopup() throws InterruptedException {

		// Click on none of the above
		explicitwait1();
		try {
			if (driver.findElementById("com.google.android.gms:id/credential_picker_layout").isDisplayed()) {
				driver.findElementById("com.google.android.gms:id/cancel").click();
			}
		} catch (Exception e) {
			System.out.println("Popup Not Found");
		}

	}

	@Test(priority = 5)
	public void emptyMobileNumValidation() throws InterruptedException {
		explicitwait1();

		// Click on Continue button
		driver.findElementByXPath("//android.widget.Button[@index='5']").click();

		explicitwait1();
		
		String validation= driver.findElementByAccessibilityId("Enter your mobile number to continue.").getAttribute("content-desc");

		// Check validation
		Assert.assertEquals(validation, "Enter your mobile number to continue.");

	}

	@Test(priority = 6)
	public void clickOnTCandPP() throws InterruptedException {

		explicitwait();

		//Change it to Xpath	
		driver.findElementByAccessibilityId("Terms & Conditions").click();

		explicitwait();

		driver.navigate().back();

		//Change it to Xpath
		driver.findElementByAccessibilityId("Privacy Policy").click();

		explicitwait();

		driver.navigate().back();

	}

	@Test(priority = 7)
	public void clickonGoogle() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='7']").click();

		explicitwait1();

		driver.navigate().back();

	}

	@Test(priority = 8)
	public void clickOnCountryCode() throws IOException, InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("+91").click();

		implicitwait();

		driver.findElementByAccessibilityId("Argentina").click();

		implicitwait();

		driver.findElementByAccessibilityId("+54").click();

		implicitwait();

		driver.findElementByAccessibilityId("India").click();

		implicitwait();
	}

	@Test(priority = 9)
	public void addMobileNumber() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.EditText[@index='4']").click();
		driver.findElementByXPath("//android.widget.EditText[@index='4']").sendKeys("8485844269");
		driver.findElementByXPath("//android.widget.EditText[@index='4']").clear();

		driver.hideKeyboard();
	}

	@Test(priority = 10)
	public void selectMobileNumberfromPopup() throws InterruptedException {

		implicitwait();

		// Back story screen
		driver.navigate().back();

		explicitwait1();
		driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();

		// Select mobile number form mobile picker
		explicitwait1();
		try {
			if (driver.findElementById("com.google.android.gms:id/credential_picker_layout").isDisplayed()) {
				driver.findElementById("com.google.android.gms:id/credential_primary_label").click();
			}
		} catch (Exception e) {
			System.out.println("Popup Not Found");
		}

		explicitwait1();

		driver.findElementByXPath("//android.widget.Button[@index='5']").click();

	}

	@Test(priority = 11)
	public void emptyOTPValidation() throws InterruptedException {

		driver.findElementByXPath("//android.widget.Button[@index='7']").click();

		explicitwait1();
		
		String validation= driver.findElementByAccessibilityId("Please enter the OTP").getAttribute("content-desc");
		
		Assert.assertEquals(validation, "Please enter the OTP");
	}

	@Test(priority = 12) //abhi mat kar isko
	public void invalidOTP() throws InterruptedException {

		explicitwait1();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(298, 1360)).release().perform();
		implicitwait();

		click_One();

//		driver.hideKeyboard();

		explicitwait();
//		driver.findElementByXPath("//android.widget.Button[@index='7']").click();

		clear_pin();
		
	}

	@Test(priority = 13)
	public void clickandEnterOTP() throws InterruptedException {

		explicitwait1();

		// Enter otp
		AndroidTouchAction touch = new AndroidTouchAction(driver);
	//	touch.press(PointOption.point(298, 1360)).release().perform();
		// explicitwait1();

		click_Zero();

		driver.hideKeyboard();

		implicitwait();
	//	driver.findElementByXPath("//android.widget.Button[@index='7']").click();

		// driver.quit();
	}

	@Test(priority = 14)
	public void emptyPinValidation() throws InterruptedException {
		//Continue button click
		driver.findElementByXPath("//android.widget.Button[@index='7']").click();

		explicitwait1();

		String validation= driver.findElementByAccessibilityId(" Please enter your 4-digit PIN").getAttribute("content-desc");
		
		Assert.assertEquals(validation, " Please enter your 4-digit PIN");
	}

	@Test(priority = 15)
	public void pinNotMatchedValidation() throws InterruptedException {

		explicitwait();

		// Enter Pin in first block
		AndroidTouchAction touch = new AndroidTouchAction(driver);

		touch.press(PointOption.point(298, 1335)).release().perform();
		click_One();
		explicitwait1();
		driver.hideKeyboard();

		explicitwait1();

		// Enter Pin in second block
		touch.press(PointOption.point(303, 1618)).release().perform();
		click_Zero();
		explicitwait1();

		// Click on Continue
		driver.findElementByXPath("//android.widget.Button[@index='7']").click();

		explicitwait1();

		// Match the validation message
		String validation = driver
				.findElementByAccessibilityId("Oh, the pins dont match up! Can you enter the pin once again?")
				.getAttribute("content-desc");

		
		Assert.assertEquals(validation, "Oh, the pins dont match up! Can you enter the pin once again?");
		
	}
	
	@Test(priority = 16)
	public void addvalidConfimpin() throws InterruptedException {
		
		explicitwait1();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		// Clear confirm pin block
		touch.press(PointOption.point(817, 1636)).release().perform();
		for (int i = 0; i <= 3; i++) {
			Thread.sleep(500);
			touch.press(PointOption.point(948, 1621)).release().perform();
		}

		explicitwait1();

		// Enter pin in second block again

		// touch.press(PointOption.point(303, 1618)).release().perform();
		click_One();

		// Click on Continue button again
		driver.findElementByXPath("//android.widget.Button[@index='7']").click();

	}

//-----------------------------------------------------------------------------------------------------------------------------------------	

	public void click_One() throws InterruptedException {
		AndroidTouchAction touch = new AndroidTouchAction(driver);

		for (int i = 0; i <= 3; i++) {
			Thread.sleep(500);
			touch.press(PointOption.point(144, 1623)).release().perform();
		}

	}

	public void click_Zero() throws InterruptedException {
		AndroidTouchAction touch = new AndroidTouchAction(driver);

		for (int i = 0; i <= 3; i++) {
			Thread.sleep(500);
			touch.press(PointOption.point(409, 2175)).release().perform();
		}

	}

	public void clear_pin() throws InterruptedException {
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		for (int i = 1; i <= 4; i++) {
			Thread.sleep(500);
			touch.press(PointOption.point(943, 1634)).release().perform();
		}
	}

	public void implicitwait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void explicitwait() throws InterruptedException {

		Thread.sleep(5000);

	}

	public void explicitwait1() throws InterruptedException {

		Thread.sleep(2000);

	}

}
