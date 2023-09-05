package userSettingScreen;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class UserProfile extends NoResetCapabalities {

	@Test(priority = 2)
	public void toSettingScreen() throws InterruptedException {
		explicitwait();
		
		
		try {
			
			driver.findElementByAccessibilityId("Home").click();
			
			explicitwait1();
			List<WebElement> data1 = driver.findElementsByXPath("//android.widget.ImageView[@index='2']");
			System.out.println(data1.size());
			data1.get(1).click();
			
			
//			for(int i=1;i<data1.size();i++) {
//				System.out.println(data1.get(i).getAttribute("class"));
//				explicitwait();
//			//	data1.get(i).click();
//			}
			
		} catch (Exception e) {
			System.out.println("Not found");
		}
		
		
	/*	try {
			explicitwait1();
			List<WebElement> data = driver.findElementsByXPath("//android.widget.ImageView[@index='2']");
			System.out.println(data.size());
			for (int i = 0	; i < data.size(); i++) {
				System.out.println(data.get(i).getAttribute("class"));
//				data.get(i).click();
//				Thread.sleep(5000);
//				//driver.navigate().back();
		}
			
		//	data.get(0).click();
			explicitwait();
			
		} catch (Exception e) {
			System.out.println("Elements not found");
		}*/
		
		
		
	//	List<WebElement> data2 = driver.findElementsByXPath("//android.view.View[@index='2']");
//		System.out.println(data2.size());
//		for (int i = 0; i < data2.size(); i++) {
//		System.out.println(data2.get(i).getAttribute("content-desc"));
//	}

	//	Assert.assertEquals(data2.get(0).getAttribute("content-desc"), "Profile");
		}

	@Test(priority = 3)
	public void editName() throws InterruptedException {
		scrollScreenUp80();
		
		explicitwait1();
		WebElement name = driver.findElementByXPath("//android.widget.EditText[@index='4']");
		name.click();
		explicitwait1();
		name.clear();
		explicitwait1();
		name.sendKeys("bv_Rohit");
		driver.hideKeyboard();

	}

	@Test(priority = 4)
	public void editEmail() throws InterruptedException {
		explicitwait1();
		
//		AndroidTouchAction touch = new AndroidTouchAction(driver);
//		touch.press(PointOption.point(383, 1643)).release().perform();
		WebElement email = driver.findElementByXPath("//android.widget.EditText[@index='11']");
		email.click();
		explicitwait1();
		email.clear();
		explicitwait1();
		email.sendKeys("bv_s@g.com");
		explicitwait1();
		driver.hideKeyboard();

	}

	@Test(priority = 5)
	public void changePin() throws InterruptedException {
		explicitwait1();
		driver.findElementByAccessibilityId("Tap to change PIN").click();
		
//		driver.findElementByXPath("//android.view.View[@clickable='true' and @index='2'] ").click();
	
		explicitwait();
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		//explicitwait();
		touch.press(PointOption.point(303, 1041)).release().perform();
		for (int i = 1; i <=4; i++) {
			Thread.sleep(1000);
			touch.press(PointOption.point(158, 1632)).release().perform();
		}

		explicitwait1();
		touch.press(PointOption.point(303, 1393)).release().perform();
		for (int i = 1; i <=4; i++) {
			Thread.sleep(1000);
			touch.press(PointOption.point(158, 1632)).release().perform();
		}

		explicitwait1();
		// Click on Confirm button
		driver.findElementByAccessibilityId("Confirm").click();

		explicitwait();
		// Click on Done on Confirmation popup
		driver.findElementByAccessibilityId("Done").click();

	//	explicitwait1();
		driver.hideKeyboard();
	}

	@Test(priority = 6)
	public void saveUserProfile() throws InterruptedException {
		explicitwait1();
		
		// Click on Save button
		driver.findElementByAccessibilityId("Save Changes").click();

		explicitwait();
		// Click on Don on Popup
		driver.findElementByAccessibilityId("Done").click();

		explicitwait1();
		
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1000)"));
	
	}

//---------------------------------------------------------------------------------------------------------------------------
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void explicitwait() throws InterruptedException {
		Thread.sleep(6000);
	}

	public void explicitwait1() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void scrollScreenUp80() throws InterruptedException {

		explicitwait();

		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 80% of the height (near bottom)
		int starty = (int) (size.height * 0.83);
		// Ending y location set to 20% of the height (near top)
		int endy = (int) (size.height * 0.17);
		// x position set to mid-screen horizontally
		int startx = (int) size.width / 2;

		TouchAction touchAction = new TouchAction(driver);

		touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
				.perform();

	}
	
}
