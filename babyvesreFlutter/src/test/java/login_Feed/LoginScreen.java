package login_Feed;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class LoginScreen extends StoryScreen {

//	@Test(priority = 3, testName = "Country Code")
	public void clickOnCountryCode() throws IOException, InterruptedException {

		explicitwait();

		driver.findElementByAccessibilityId("+91").click();

		implicitwait();

		driver.findElementByAccessibilityId("Argentina").click();

		implicitwait();

		driver.findElementByAccessibilityId("+54").click();

		implicitwait();

		driver.findElementByAccessibilityId("India").click();

	}

//	@Test(priority = 4, testName = "Click on Google")
	public void clickonGoogle() throws InterruptedException {

		explicitwait();

		driver.findElementByXPath("//android.widget.ImageView[@index='7']").click();

		explicitwait();

		driver.navigate().back();

	}

//	@Test(priority = 5, testName = "Click on T&C")
	public void clickOnTCandPP() throws InterruptedException {

		explicitwait();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(338, 2079)).release().perform();

		// driver.findElementByAccessibilityId("Terms & Conditions").click();

//		List<WebElement> tc = (List<WebElement>) driver.findElementByXPath("//android.widget.Button[@index='1']");
//		System.out.println(tc.size());

		explicitwait();

		driver.navigate().back();

		// driver.findElementByAccessibilityId("Privacy Policy").click();

		driver.findElementByXPath("//android.widget.Button[@index='3']").click();

		explicitwait();

		driver.navigate().back();

	}

//	@Test(priority = 6)
	public void mobileemptyValidation() throws InterruptedException {

		explicitwait();

		WebElement continuebutton = driver.findElementByAccessibilityId("Continue");
		continuebutton.click();

		implicitwait();

		String validation = driver.findElementByAccessibilityId("Enter your mobile number to continue.")
				.getAttribute("content-desc");
		// System.out.println(validation);

		if (validation.equals("Enter your mobile number to continue.")) {
			System.out.println("Empty Mobile number validation Matched");
		} else {
			System.out.println("Empty Mobile number validation not Matched");
		}

	}

	@Test(priority = 3)
	public void clickOnMobileNumber() throws InterruptedException {

		explicitwait();

		// Select mobile number form mobile picker
		try {
			if (driver.findElementById("com.google.android.gms:id/credential_picker_layout").isDisplayed()) {
				driver.findElementById("com.google.android.gms:id/credential_primary_label").click();
			}
		} catch (Exception e) {
			System.out.println("Popup Not Found");
		}
		implicitwait();

		driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();

	}

	@Test(priority = 4)
	public void pinemptyValidation() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.Button[@index='9']").click();

		implicitwait();

		String validation = driver.findElementByAccessibilityId(" Please enter your 4-digit PIN")
				.getAttribute("content-desc");
//		System.out.println(validation);
//		if (validation.equals(" Please enter your 4-digit PIN")) {
//			System.out.println("Empty PIN validation Matched");
//		} else {
//			System.out.println("Empty PIN validation not Matched");
//		}

		Assert.assertEquals(validation, " Please enter your 4-digit PIN");
		
	}

	@Test(priority = 5)
	public void pinnotMatchValidation() throws InterruptedException {
		explicitwait();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(301, 1499)).release().perform();
		explicitwait();
		for (int i = 1; i < 5; i++) {
			Thread.sleep(500);
			touch.press(PointOption.point(407, 2167)).release().perform();
		}

		explicitwait();

		driver.findElementByXPath("//android.widget.Button[@index='9']").click();

		implicitwait();

		String validation = driver
				.findElementByAccessibilityId("Hmm, the pin doesn't match. Want to try out the pin once again?")
				.getAttribute("content-desc");
		System.out.println(validation);
		if (validation.equals("Hmm, the pin doesn't match. Want to try out the pin once again?")) {
			System.out.println("Wrong PIN validation Matched");
		} else {
			System.out.println("Wrong PIN validation not Matched");
		}
		
		Assert.assertEquals(validation, "Hmm, the pin doesn't match. Want to try out the pin once again?");

		explicitwait1();
		driver.findElementByAccessibilityId("OK").click();
		
		explicitwait1();
		//Show and Hide
		driver.findElementByXPath("//android.view.View[@index='7']").click();
		
		explicitwait1();
		touch.press(PointOption.point(301, 1499)).release().perform();
		explicitwait1();
		for (int i = 1; i < 5; i++) {
			Thread.sleep(500);
			touch.press(PointOption.point(935, 1631)).release().perform();
		}

	//	driver.hideKeyboard();
		// driver.quit();
	}

	@Test(priority = 6)
	public void validLoginPin() throws InterruptedException {

		explicitwait();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		//touch.press(PointOption.point(301, 1499)).release().perform();
	//	Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			touch.press(PointOption.point(144, 1623)).release().perform();
		}

		implicitwait();

		driver.findElementByXPath("//android.widget.Button[@index='9']").click();

		Thread.sleep(5000);

	}

//------------------------------------------------------------------------------------------------------------------
	public void click_One() throws InterruptedException {

		AndroidTouchAction touch = new AndroidTouchAction(driver);

		for (int i = 1; i <= 4; i++) {
			Thread.sleep(500);
			touch.press(PointOption.point(144, 1623)).release().perform();
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
