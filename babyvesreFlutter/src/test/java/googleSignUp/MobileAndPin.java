package googleSignUp;

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
	public void clickonGoogle() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='7']").click();

		explicitwait1();

		driver.findElementById("com.google.android.gms:id/account_display_name").click();

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
