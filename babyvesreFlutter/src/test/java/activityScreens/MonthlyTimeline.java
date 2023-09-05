package activityScreens;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class MonthlyTimeline extends ActivityHomeScreens {

	@Test(priority = 8)
	public void clickonDatesMonthlyActivity() throws InterruptedException {
		explicitwait1();

		List<WebElement> dates = driver.findElementsByXPath("//android.view.View[@index='0']//*");
		// System.out.println(dates.size());
		for (int i = 8; i < 11; i++) {
			// System.out.println(dates.get(i).getAttribute("content-desc"));
			explicitwait1();
			dates.get(i).click();
		}
	}

	@Test(priority = 9)
	public void clickOnPrevMonthlyActivity() throws InterruptedException {
		explicitwait1();

		// Click on Preview
		List<WebElement> previousbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='2']");
		// System.out.println(previousbutton.size());
		for (int i = 0; i < 1; i++) {
			previousbutton.get(0).click();
			explicitwait1();
		}

//		for(int i=0;i<previousbutton.size();i++) {
//		System.out.println(previousbutton.get(i).getAttribute("content-desc"));
//		explicitwait1();
//		previousbutton.get(i).click();
//	}

	}

	@Test(priority = 10)
	public void clickOnNextMonthlyActivity() throws InterruptedException {
		explicitwait1();
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		// Click on Next
//		for (int i = 0; i < 2; i++) {
//			touch.press(PointOption.point(1004, 298)).release().perform();
//			explicitwait1();
//		}

		List<WebElement> nextbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='4']");
		// System.out.println(nextbutton.size());

		for (int i = 0; i < 1; i++) {
			nextbutton.get(0).click();
			explicitwait1();
		}

	}

	@Test(priority = 11)
	public void clickOnFacultyOnMonthlyActivity() throws InterruptedException {
		explicitwait1();

		clickonFaculty();

		List<WebElement> faculty = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		System.out.println(faculty.size());
		explicitwait1();
		if (faculty.size() > 4) {
			scrollScreenDown75();
		}

		explicitwait1();
		clickonFaculty2();

		explicitwait1();
	
		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1000)"));

	
	}

	@Test(priority = 12)
	public void clickOnFacultyMA() throws InterruptedException {
		explicitwait1();

		List<WebElement> faculty = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		faculty.get(1).click();

	}

	@Test(priority = 13)
	public void clickonDatesActivityTimeline() throws InterruptedException {
		explicitwait1();

		List<WebElement> dates = driver.findElementsByXPath("//android.view.View[@index='0']");
		System.out.println(dates.size());
		// dates.get(5).click();

//				for (int i = 0; i < dates.size(); i++) {
//					System.out.println(dates.get(i).getAttribute("content-desc"));
//					explicitwait1();
//					// faculty.get(i).click();
//				}

		explicitwait1();
		dates.get(5).click();

		explicitwait1();
		List<WebElement> datess = driver.findElementsByXPath("//android.view.View[@index='1']");
		// System.out.println(datess.size());
		datess.get(1).click();
//		for (int i = 0; i < datess.size(); i++) {
//			System.out.println(datess.get(i).getAttribute("content-desc"));
//			explicitwait1();
//			// faculty.get(i).click();
//		}
		explicitwait1();
		driver.findElementByXPath("//android.view.View[@index='2']").click();
		// driver.findElementByXPath("//android.view.View[@index='1']").click();

	}

	@Test(priority = 14)
	public void clickOnPrevActivityTimeline() throws InterruptedException {
		explicitwait1();

		List<WebElement> previousbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='2']");
		System.out.println(previousbutton.size());
		for (int i = 0; i < 1; i++) {
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
	public void clickOnNextActivityTimeline() throws InterruptedException {
		explicitwait1();

		List<WebElement> nextbutton = driver.findElementsByXPath("//android.widget.ImageView[@index='4']");
		// System.out.println(nextbutton.size());

		for (int i = 0; i < 1; i++) {
			nextbutton.get(0).click();
			explicitwait1();
		}

	}

//	@Test(priority = 16)
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
//		for (int i = 0; i < card.size(); i++) {
//			System.out.println(card.get(i).getAttribute("content-desc"));
//			explicitwait1();
//		//	 faculty.get(i).click();
//		}
//		
		card.get(4).click();

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
			System.out.println("Article Found");
		}

		driver.navigate().back();

		driver.quit();
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
//					for (int i = 0; i < mileque.size(); i++) {
//						System.out.println(mileque.get(i).getAttribute("content-desc"));
//						// mileque.get(i).click();
//					}

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

		// Save and Share with Growth Expert
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(159, 1312)).release().perform();

		// Click on Ok
		driver.findElementByAccessibilityId("Ok").click();

		Thread.sleep(10000);

	}

//-------------------------------------------------------------------------------------------------------	

	public void clickonFaculty() throws InterruptedException {

		List<WebElement> faculty = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");

		for (int i = 1; i < faculty.size(); i++) {
			System.out.println(faculty.get(i).getAttribute("content-desc"));
			faculty.get(i).click();
			explicitwait1();
			driver.navigate().back();
			explicitwait();
		}

	}

	public void clickonFaculty2() throws InterruptedException {

		List<WebElement> faculty = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");

		for (int i = 3; i < faculty.size(); i++) {
			System.out.println(faculty.get(i).getAttribute("content-desc"));
			faculty.get(i).click();
			explicitwait1();
			driver.navigate().back();
			explicitwait();
		}

	}

	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void explicitwait() throws InterruptedException {

		Thread.sleep(5000);

	}

	public void explicitwait1() throws InterruptedException {

		Thread.sleep(3000);

	}

	public void scrollScreenDown75() throws InterruptedException {

		explicitwait();

		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 80% of the height (near bottom)
		int starty = (int) (size.height * 0.90);
		// Ending y location set to 20% of the height (near top)
		int endy = (int) (size.height * 0.30);
		// x position set to mid-screen horizontally
		int startx = (int) size.width / 2;

		TouchAction touchAction = new TouchAction(driver);

		touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
				.perform();

	}

	public void scrollUp() throws InterruptedException {

		explicitwait1();

		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int starty = (int) (size.height * 0.40);
		// Ending y location set to 80% of the height (near top)
		int endy = (int) (size.height * 0.80);
		// x position set to mid-screen horizontally
		int startx = size.width / 2;

		TouchAction touchAction = new TouchAction(driver);

		touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
				.perform();

		explicitwait();

	}

}
