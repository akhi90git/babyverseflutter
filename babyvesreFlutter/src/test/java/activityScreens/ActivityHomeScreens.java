package activityScreens;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ActivityHomeScreens extends NoResetCapabalities {

	@Test(priority = 2, testName = "Screen 1")
	public void walkthroughscreen1() throws InterruptedException {

		explicitwait1();

		try {
			String gettext = driver.findElementByXPath("//android.view.View[@index='2']").getAttribute("content-desc");

			System.out.println(gettext);

			if (gettext.equals("Welcome")) {
				implicitwait();

				driver.findElementByXPath("//android.widget.Button[@index='5']").click();

				implicitwait();

				driver.findElementByXPath("//android.widget.Button[@index='4']").click();

				implicitwait();

				driver.findElementByXPath("//android.widget.Button[@index='4']").click();

				Thread.sleep(20000);
			} else {

				implicitwait();

				driver.findElementByXPath("//android.widget.Button[@index='5']").click();

				Thread.sleep(7000);
			}
		} catch (Exception e) {
			System.out.println("Walk Through not found");
		}

		// driver.quit();

		explicitwait1();

		driver.findElementByAccessibilityId("Activities").click();

	}

//	@Test(priority = 3)
	public void clickOnDatesActivityHome() throws InterruptedException {
		explicitwait1();

		List<WebElement> dates = driver.findElementsByXPath("//android.view.View[@index='0']//*");
		// System.out.println(dates.size());
		for (int i = 7; i < 10; i++) {
			// System.out.println(dates.get(i).getAttribute("content-desc"));
			explicitwait1();
			dates.get(i).click();
		}

	}

//	@Test(priority = 4)
	public void clickOnPrevActivityHome() throws InterruptedException {
		explicitwait1();

		// Click on Preview
		List<WebElement> previousbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='1']");
		// System.out.println(previousbutton.size());
		for (int i = 0; i < 1; i++) {
			previousbutton.get(0).click();
			explicitwait1();
		}

//		for(int i=0;i<elements.size();i++) {
//			System.out.println(elements.get(i).getAttribute("content-desc"));
//			explicitwait1();
//			elements.get(i).click();
//		}

		// explicitwait1();
	}

//	@Test(priority = 5)
	public void clickOnNextActivityHome() throws InterruptedException {
		explicitwait1();
		// Click on Next

		List<WebElement> nextbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='3']");
		// System.out.println(nextbutton.size());

		for (int i = 0; i < 1; i++) {
			nextbutton.get(i).click();
			explicitwait1();
		}
	}

	@Test(priority = 6)
	public void clickOnArticlesOrActivityActivityHome() throws InterruptedException {
		explicitwait1();
//		AndroidTouchAction touch = new AndroidTouchAction(driver);
//		touch.press(PointOption.point(376, 546)).release().perform();

		List<WebElement> elements = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
//		// System.out.println(elements.size());
//		elements.get(1).click();
//
//		activity();

		for (int i = 0; i < elements.size() - 2; i++) {
			// System.out.println(elements.get(i).getAttribute("content-desc"));
			explicitwait1();
			elements.get(i).click();
			explicitwait1();
			try {
				if (driver.findElementByAccessibilityId("Mark as complete").isDisplayed()) {
					System.out.println("Activity Found");
				}
			} catch (Exception e) {
				if (driver.findElementByAccessibilityId("Mark as complete").isDisplayed()) {
					System.out.println("Activity Found");
				}
				System.out.println("Article Found");

			}
			
			driver.navigate().back();
		}

	}

//	@Test(priority = 7)
	public void clickOnMonthlyActivityOnActivityHome() throws InterruptedException {
		explicitwait1();

		List<WebElement> monthtimebutton = driver.findElementsByXPath("//android.view.View[@index='0']");
		// System.out.println(monthtimebutton.size());
		monthtimebutton.get(9).click();
//		for(int i=0;i<monthtimebutton.size();i++) {
//		System.out.println(monthtimebutton.get(i).getAttribute("content-desc"));
//		explicitwait1();
//		elements.get(i).click();
//	}

	}

//  Article Method
	public void articles() throws InterruptedException {
		explicitwait1();

		// Click On Image
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(546, 1077)).release().perform();

		explicitwait1();
		driver.navigate().back();

		explicitwait1();
		// Click on Like
		driver.findElementByXPath("//android.widget.ImageView[@index='3']").click();

		// Click on Bookmark
		driver.findElementByXPath("//android.widget.ImageView[@index='7']").click();

		explicitwait1();
		// Scroll up to Was this helpful
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));

		implicitwait();
		// Click on yes on Was this Helpful
		driver.findElementByAccessibilityId("Yes").click();

		explicitwait1();
		// Click on related Articles
		touch.press(PointOption.point(268, 2053)).release().perform();

		explicitwait1();
		driver.navigate().back();

	}

	// Activity Method
	public void activity() throws InterruptedException {
		explicitwait1();

		// Click on Expert
		driver.findElementByXPath("//android.widget.ImageView[@index='4']").click();
		explicitwait();
		driver.navigate().back();

		// Click on Share
		driver.findElementByXPath("//android.widget.ImageView[@index='3']").click();
		explicitwait1();
		driver.navigate().back();

		explicitwait1();
		// Click on Image
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(533, 553)).release().perform();
		explicitwait1();
		driver.navigate().back();

		// Scroll screen
		scrollScreenUp80();

		// Record and save
		explicitwait1();

		try {
			if (driver.findElementByAccessibilityId("Record").isDisplayed()) {
				driver.findElementByAccessibilityId("Record").click();
				implicitwait();
				checkBoxandCamera();
			}
		} catch (Exception e) {
			if (driver.findElementByAccessibilityId("Record Again").isDisplayed()) {
				driver.findElementByAccessibilityId("Record Again").click();
				implicitwait();
				checkBoxandCamera();
			}
		}

		// Scroll to bottom
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));

		explicitwait1();

		// Click Milestone
		try {

			if (driver.findElementByAccessibilityId("Milestones to look for").isDisplayed()) {
				System.out.println("Mile found");
				List<WebElement> mileque = driver.findElementsByXPath("//android.widget.Button[@index='0']");
				System.out.println(mileque.size());
				int buttons = mileque.size();
//				for (int i = 0; i < mileque.size(); i++) {
//					System.out.println(mileque.get(i).getAttribute("content-desc"));
//					// mileque.get(i).click();
//				}

				if (buttons == 4) {
					mileque.get(1).click();
					explicitwait1();
				}

				if (buttons == 7) {
					mileque.get(1).click();
					explicitwait1();
					mileque.get(5).click();
				}

				if (buttons == 9) {
					mileque.get(0).click();
					explicitwait1();
					mileque.get(4).click();
					explicitwait1();
					mileque.get(8).click();
				}

			}

		} catch (Exception e) {
			System.out.println("Milestone Not found");
		}

		// Click on Submit
		explicitwait1();
		try {
			if (driver.findElementByAccessibilityId("Mark as complete").isDisplayed()) {
				driver.findElementByAccessibilityId("Mark as complete").click();
			}
		} catch (Exception e) {
			explicitwait1();
			List<WebElement> options = driver.findElementsByXPath("//android.widget.ImageView[@index='7']");
			System.out.println(options.get(0).getAttribute("content-desc"));
			if (options.get(0).getAttribute("content-desc").equals("Too Easy")) {
				options.get(0).click();
			} else if (options.get(0).getAttribute("content-desc").equals("Just Right")) {
				options.get(0).click();
			} else if (options.get(0).getAttribute("content-desc").equals("Too Difficult")) {
				options.get(0).click();
			}
		}

		// Feedback popup
		explicitwait1();
		// Click on too difficult
		driver.findElementByAccessibilityId("Too Difficult").click();
		explicitwait1();
		// Click on Submit button
		driver.findElementByAccessibilityId("Submit").click();

	}

	public void checkBoxandCamera() throws InterruptedException {
		implicitwait();

		// Click on CheckBox
		for (int i = 0; i <= 1; i++) {
			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.press(PointOption.point(397, 1469)).release().perform();
		}

		implicitwait();

		driver.findElementByAccessibilityId("Got it!").click();

		implicitwait();

		driver.findElementByAccessibilityId("Take Photo").click();

		// Click on Capture button on Camera
		driver.findElementById("com.sec.android.app.camera:id/normal_center_button").click();

		implicitwait();

		// Click on OK on Camera
		driver.findElementById("com.sec.android.app.camera:id/okay").click();

		explicitwait1();
		// Save and Share with Growth Expert
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(159, 1312)).release().perform();

		// Click on Ok
		driver.findElementByAccessibilityId("Ok").click();

		Thread.sleep(10000);

	}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void explicitwait() throws InterruptedException {

		Thread.sleep(5000);

	}

	public void explicitwait1() throws InterruptedException {

		Thread.sleep(2000);

	}

	public void scrollScreenUp80() throws InterruptedException {

		explicitwait();

		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 80% of the height (near bottom)
		int starty = (int) (size.height * 0.80);
		// Ending y location set to 20% of the height (near top)
		int endy = (int) (size.height * 0.20);
		// x position set to mid-screen horizontally
		int startx = (int) size.width / 2;

		TouchAction touchAction = new TouchAction(driver);

		touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
				.perform();

	}
}
