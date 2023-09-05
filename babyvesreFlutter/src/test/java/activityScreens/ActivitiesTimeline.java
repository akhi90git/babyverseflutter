package activityScreens;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ActivitiesTimeline extends ActivityHomeScreens {

//	@Test(priority = 18)
	public void clickOnFacultyMA() throws InterruptedException {
		explicitwait1();

//		List<WebElement> faculty = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
//		faculty.get(1).click();
		System.out.println("On Screen");

	}

	@Test(priority = 18)
	public void clickonDatesMonthlyActivity() throws InterruptedException {
		explicitwait1();

//		AndroidTouchAction touch = new AndroidTouchAction(driver);
//		// Click on First Index
//		touch.press(PointOption.point(283, 333)).release().perform();

		List<WebElement> dates = driver.findElementsByXPath("//android.view.View[@index='0']");
		System.out.println(dates.size());
		dates.get(5).click();

		driver.findElementByXPath("//android.view.View[@index='2']").click();
		// driver.findElementByXPath("//android.view.View[@index='0']").click();
		driver.findElementByXPath("//android.view.View[@index='1']").click();

	}

	@Test(priority = 14)
	public void clickOnPrevMonthlyActivity() throws InterruptedException {
		explicitwait1();

		List<WebElement> previousbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='2']");
		System.out.println(previousbutton.size());
		for (int i = 0; i < 2; i++) {
			previousbutton.get(0).click();
			explicitwait1();
		}

//		for(int i=0;i<previousbutton.size();i++) {
//		System.out.println(previousbutton.get(i).getAttribute("content-desc"));
//		explicitwait1();
//		previousbutton.get(i).click();
//	}
		explicitwait1();
	}

	@Test(priority = 15)
	public void clickOnNextMonthlyActivity() throws InterruptedException {
		explicitwait1();
		
		List<WebElement> nextbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='4']");
		// System.out.println(nextbutton.size());

		for (int i = 0; i < 2; i++) {
			nextbutton.get(0).click();
			explicitwait1();
		}

	}

	@Test(priority = 16)
	public void clickOnFacultyActivitiesTimeline() throws InterruptedException {
		explicitwait1();

//		for (int i = 0; i <= 2; i++) {
//			AndroidTouchAction touch = new AndroidTouchAction(driver);
//			touch.press(PointOption.point(774, 579)).release().perform();
//			scrollLeft();
//		}

		List<WebElement> faculty = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		System.out.println(faculty.size());
		for (int i = 1; i < 3; i++) {
			System.out.println(faculty.get(i).getAttribute("content-desc"));
			explicitwait1();
			 faculty.get(i).click();
		}
	}

	@Test(priority = 17)
	public void clickOnActivityOnActivitiesTimeline() throws InterruptedException {

		explicitwait1();

//		AndroidTouchAction touch = new AndroidTouchAction(driver);
//		touch.press(PointOption.point(480, 890)).release().perform();
//		explicitwait1();
//		
		List<WebElement> card = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		System.out.println(card.size());
//		for (int i = 3; i < 4; i++) {
//			System.out.println(card.get(i).getAttribute("content-desc"));
//			explicitwait1();
//		//	 faculty.get(i).click();
//		}
//		
		card.get(3).click();
		
		explicitwait1();
		try {
			if (driver.findElementByAccessibilityId("Mark as complete").isDisplayed()) {
				System.out.println("Activity Found");
				activity();
			}
		} catch (Exception e) {
//			if (driver.findElementByAccessibilityId("Mark as complete").isDisplayed()) {
//				System.out.println("Activity Found");
//			}
			articles();
		}

		driver.navigate().back();

		driver.quit();
	}

//  Article Method
	public void articles() throws InterruptedException {
		implicitwait();

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
		implicitwait();

		// Click on Expert
		driver.findElementByXPath("//android.widget.ImageView[@index='3']").click();
		explicitwait();
		driver.navigate().back();

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

		// Click Milestone
		try {
			String text = driver.findElementByXPath("//android.view.View[@index='3']").getAttribute("content-desc");
			System.out.println(text);

			if (text.equals("Milestones to look for")) {
				List<WebElement> intext = driver.findElementsByXPath("//android.widget.Button[@index='0']");
				System.out.println(intext.size());

				for (int i = 0; i < intext.size(); i++) {
					System.out.println(intext.get(i).getAttribute("content-desc"));
				}

				intext.get(1).click();
			}
		} catch (Exception e) {
			System.out.println("Milestone not found");
		}

		// Click on Submit
		implicitwait();
		driver.findElementByAccessibilityId("Mark as complete").click();

		// Feedback popup
		implicitwait();
		// Click on too difficult
		driver.findElementByAccessibilityId("Too Difficult").click();
		implicitwait();
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

		// Save and Share with Growth Expert
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(159, 1312)).release().perform();

		// Click on Ok
		driver.findElementByAccessibilityId("Ok").click();

		Thread.sleep(10000);

	}

//---------------------------------------------------------------------------------------------------------------------------------------------
	public void scrollLeft() throws InterruptedException {

		explicitwait1();

		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting x location set to 95% of the width (near right)
		int startx = (int) (size.width * 0.95);
		// Ending x location set to 5% of the width (near left)
		int endx = (int) (size.width * 0.05);
		// y position set to mid-screen vertically
		int starty = (int) (size.height / 3.8);
		// System.out.println(starty);

		TouchAction touchAction = new TouchAction(driver);

		touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, starty)).release()
				.perform();

		explicitwait();

	}

	public void scrollUp() throws InterruptedException {

		explicitwait1();

		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int starty = (int) (size.height * 0.20);
		// Ending y location set to 80% of the height (near top)
		int endy = (int) (size.height * 0.80);
		// x position set to mid-screen horizontally
		int startx = size.width / 2;

		TouchAction touchAction = new TouchAction(driver);

		touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(endy, starty)).release()
				.perform();

		explicitwait();

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
