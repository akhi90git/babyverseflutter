package forgotPin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ForgotPin extends CapabalitiesDirect {

//	@Test(priority = 2)
	public void selectMobileNumberfromPopup() throws InterruptedException {

		explicitwait1();
	
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


//	@Test(priority = 3)
	public void clickOnFogotonLogin() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.view.View[@index='8']").click();

	}
	
//	@Test(priority = 4)
	public void selectMobileNumberfromPopup2() throws InterruptedException {

		explicitwait1();
	
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

		driver.findElementByXPath("//android.widget.Button[@index='1']").click();

	}


//	@Test(priority = 5, testName = "Country Code")
	public void clickOnCountryCode() throws IOException, InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("+91").click();

		driver.findElementByAccessibilityId("Argentina").click();

		driver.findElementByAccessibilityId("+54").click();

		driver.findElementByAccessibilityId("India").click();

	}

//	 @Test(priority = 6)
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
	
//	@Test(priority = 7)
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
	
	@Test(priority = 8)
	public void clickandEnterOTP() throws InterruptedException {

		explicitwait1();

		// Enter otp
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(303, 1309)).release().perform();
		 explicitwait1();


		driver.hideKeyboard();

		implicitwait();
	//	driver.findElementByXPath("//android.widget.Button[@index='7']").click();

		// driver.quit();
	}	
//	@Test(priority = 9)
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
//	@Test(priority = 10)
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

	public void click_Zero() throws InterruptedException {
		AndroidTouchAction touch = new AndroidTouchAction(driver);

		for (int i = 0; i <= 3; i++) {
			Thread.sleep(500);
			touch.press(PointOption.point(409, 2175)).release().perform();
		}

	}
}
