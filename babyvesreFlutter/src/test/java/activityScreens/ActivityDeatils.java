package activityScreens;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ActivityDeatils extends ActivitiesTimeline {

	@Test(priority = 18)
	public void clickOnExpect() throws InterruptedException {
		implicitwait();

		driver.findElementByXPath("//android.widget.ImageView[@index='3']").click();

		explicitwait1();

		driver.navigate().back();
	}

	@Test(priority = 19)
	public void clickOnImage() throws InterruptedException {
		implicitwait();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(533, 553)).release().perform();

		Thread.sleep(7000);

		driver.navigate().back();

	}

	@Test(priority = 20)
	public void scrollScreen() throws InterruptedException {
		implicitwait();
		scrollScreenUp80();
	}

	@Test(priority = 21)
	public void clickOnRecord() throws InterruptedException {
//		String text = driver.findElementByXPath("//android.widget.Button[@index=['0']").getAttribute("content-desc");
//		System.out.println(text);

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
	}

	@Test(priority = 22)
	public void clickOnMilestone() {
		implicitwait();

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

	}

	@Test(priority = 23)
	public void clickOnMarkasComplete() throws InterruptedException {
		implicitwait();

		driver.findElementByAccessibilityId("Mark as complete").click();

	}

	@Test(priority = 24)
	public void clickonFeedbackpopup() {
		implicitwait();
		// Click on too difficult
		driver.findElementByAccessibilityId("Too Difficult").click();

		implicitwait();
		// Click on Submit button
		driver.findElementByAccessibilityId("Submit").click();

		driver.navigate().back();

		driver.quit();
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------	

	public void checkBoxandCamera() throws InterruptedException {
		implicitwait();

		try {
			// Click on CheckBox
			if (driver.findElementByAccessibilityId("Got it!").isDisplayed()) {
				AndroidTouchAction touch = new AndroidTouchAction(driver);
				touch.press(PointOption.point(397, 1469)).release().perform();
				implicitwait();
				driver.findElementByAccessibilityId("Got it!").click();
			}
		} catch (Exception e) {
			System.out.println("CheckBox not found");
		}

		implicitwait();

		driver.findElementByAccessibilityId("Take Photo").click();

		// Click on Capture button on Camera
		driver.findElementById("com.sec.android.app.camera:id/normal_center_button").click();

		implicitwait();

		// Click on OK on Camera
		driver.findElementById("com.sec.android.app.camera:id/okay").click();

		// Save and Share with Growth Expert
		explicitwait1();
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(159, 1312)).release().perform();

		// Click on Ok
		driver.findElementByAccessibilityId("Ok").click();

		Thread.sleep(10000);

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
