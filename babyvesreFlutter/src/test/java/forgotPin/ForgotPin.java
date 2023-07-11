package forgotPin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ForgotPin extends StoryScreen {

	@Test(priority = 2, testName = "Enter Mobile Number and Continue")
	public void loginScreen() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.EditText[@index='4']").click();
		driver.findElementByXPath("//android.widget.EditText[@index='4']").sendKeys("8485844269");

		driver.hideKeyboard();

		WebElement continuebutton = driver.findElementByAccessibilityId("Continue");
		continuebutton.click();

	}

	@Test(priority = 3)
	public void clickOnFogotonLogin() throws InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("Forgot PIN?").click();

	}

	@Test(priority = 4, testName = "Country Code")
	public void clickOnCountryCode() throws IOException, InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("+91").click();

		driver.findElementByAccessibilityId("Argentina").click();

		driver.findElementByAccessibilityId("+54").click();

		driver.findElementByAccessibilityId("India").click();

	}

	 @Test(priority = 5)
	public void mobileemptyValidation() throws InterruptedException {

		 explicitwait1();

		WebElement sendotp = driver.findElementByAccessibilityId("Send OTP");
		sendotp.click();

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
	
	@Test(priority = 6)
	public void nonRegisterNumber() throws InterruptedException {

		explicitwait1();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(612,1297)).release().perform();
		explicitwait1();
		touch.press(PointOption.point(404,1939)).release().perform();
		touch.press(PointOption.point(151,1811)).release().perform();
		touch.press(PointOption.point(404,1939)).release().perform();
		touch.press(PointOption.point(412,1806)).release().perform();
		touch.press(PointOption.point(404,1939)).release().perform();
		touch.press(PointOption.point(151,1811)).release().perform();
		touch.press(PointOption.point(151,1811)).release().perform();
		touch.press(PointOption.point(409,1639)).release().perform();
		touch.press(PointOption.point(672,1818)).release().perform();
		touch.press(PointOption.point(665,1985)).release().perform();
		
		driver.hideKeyboard();
		
		explicitwait1();
		driver.findElementByAccessibilityId("Send OTP").click();
	}
	
	@Test(priority = 7)
	public void enterOTP() throws InterruptedException {

		explicitwait1();

		WebElement proceed = driver.findElementByAccessibilityId("Proceed");

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(303,1290)).release().perform();
		
		explicitwait1();
		for(int i=1; i<5;i++) {
			touch.press(PointOption.point(409,2167)).release().perform();
		}
		
		explicitwait1();
		driver.hideKeyboard();

		proceed.click();

	}
	
	@Test(priority = 8)
	public void clickOnPin() throws InterruptedException {
		explicitwait1();
		
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(295,1224)).release().perform();
		
		explicitwait1();
		for(int i=1; i<5;i++) {
			touch.press(PointOption.point(136,1639)).release().perform();
		}
		
		explicitwait1();
	}	
	
	@Test(priority = 9)
	public void clickOnConfirmPin() throws InterruptedException {
		
		explicitwait1();
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(303,1505)).release().perform();
		
		explicitwait1();
		for(int i=1; i<5;i++) {
			touch.press(PointOption.point(136,1639)).release().perform();
		}
		explicitwait1();
		
		driver.findElementByAccessibilityId("Next").click();
		
		Thread.sleep(10000);
		
		driver.quit();
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
