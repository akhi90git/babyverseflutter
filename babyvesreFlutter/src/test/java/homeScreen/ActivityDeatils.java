package homeScreen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ActivityDeatils extends HomeScreen {

//	@Test(priority = 7)
	public void clickOnExpect() throws InterruptedException {
		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='3']").click();

		explicitwait1();

		driver.navigate().back();
	}

//	@Test(priority = 8)
	public void clickOnImage() throws InterruptedException {
		explicitwait1();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(533, 553)).release().perform();

		Thread.sleep(7000);

		driver.navigate().back();

	}
	
	@Test(priority = 9)
	public void scrollScreen() throws InterruptedException {
		implicitwait();
		scrollScreenUp80();
	}

//	@Test(priority = 10)
	public void clickOnRecord() throws InterruptedException {
//		String text = driver.findElementByXPath("//android.widget.Button[@index=['0']").getAttribute("content-desc");
//		System.out.println(text);
		
		try {
			if (driver.findElementByAccessibilityId("Record").isDisplayed()) {
				driver.findElementByAccessibilityId("Record").click();
				implicitwait();
				checkBoxandCamera();
			}
		} catch (Exception e) {
			if(driver.findElementByAccessibilityId("Record Again").isDisplayed()) {
				driver.findElementByAccessibilityId("Record Again").click();
				implicitwait();
				checkBoxandCamera();
			}
		}
	}

	@Test(priority = 11)
	public void clickOnMilestone() {
		implicitwait();
		
		String text = driver.findElementByXPath("//android.view.View[@index='3']").getAttribute("content-desc");
		System.out.println(text);
		
		if(text.equals("Milestones to look for")) {
			List<WebElement> intext = driver.findElementsByXPath("//android.widget.Button[@index='0']");
			System.out.println(intext.size());
			
			for(int i=0;i<intext.size();i++) {
				System.out.println(intext.get(i).getAttribute("content-desc"));
			}
			
			intext.get(1).click();
		}
		
		
	//	driver.quit();
		
	}
	
	@Test(priority = 12)
	public void clickOnMarkasComplete() throws InterruptedException {
		implicitwait();
		
		driver.findElementByAccessibilityId("Mark as complete").click();
		
		
		
	}
	
	@Test(priority = 13)
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

		//Click on CheckBox
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
