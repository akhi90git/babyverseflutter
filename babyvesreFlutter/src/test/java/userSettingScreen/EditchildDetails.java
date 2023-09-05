package userSettingScreen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class EditchildDetails extends UserProfile {

	@Test(priority = 7)
	public void clickOnDeatilsbutton() throws InterruptedException {
		explicitwait1();
		List<WebElement> details = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		details.get(3).click();

	}

	@Test(priority = 8)
	public void clickOnExpectingbaby() throws InterruptedException {
		explicitwait1();
		for (int i = 0; i <= 1; i++) {
			driver.findElementByXPath("//android.widget.Switch[@index='3']").click();
			explicitwait();
		}

	}

	@Test(priority = 9)
	public void selectGender() throws InterruptedException {
		explicitwait1();
		driver.findElementByAccessibilityId("Girl").click();

	}

	@Test(priority = 10)
	public void selectRelation() throws InterruptedException {
		explicitwait1();
		driver.findElementByXPath("//android.widget.Button[@index='2']").click();

		explicitwait1();
		// Select Relation
		driver.findElementByAccessibilityId("Guardian").click();
	}

	@Test(priority = 11)
	public void editChildName() throws InterruptedException {
		explicitwait1();
		WebElement babyname = driver.findElementByXPath("//android.widget.EditText[@index='4']");
		babyname.click();
		babyname.clear();
		babyname.sendKeys("bv_Rinna");
		driver.hideKeyboard();
	}

	@Test(priority = 12)
	public void clickOnHint() throws InterruptedException {
		explicitwait1();
		driver.findElementByXPath("//android.widget.ImageView[@index='6']").click();
		explicitwait1();
		driver.findElementByAccessibilityId("Yes! Got it.").click();
		driver.hideKeyboard();

	}

	@Test(priority = 13)
	public void clickOnCalender() throws InterruptedException {
		explicitwait1();
		driver.findElementByXPath("//android.widget.ImageView[@index='7']").click();

		scrollScreenUpYear();
		scrollScreenUpMonth();
		scrollScreenUpDate();

		implicitwait();
		driver.findElementByAccessibilityId("Select").click();
		
		driver.hideKeyboard();
	}

	public void scrollScreenUpYear() throws InterruptedException {
		implicitwait();
		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int starty = (int) (size.height * 0.50);
		// Ending y location set to 80% of the height (near top)
		int endy = (int) (size.height * 0.55);
		// x position set to mid-screen horizontally
		int startx = (int) (size.width / 3.5);

		TouchAction touchAction = new TouchAction(driver);

		for (int i = 0; i < 1; i++) {
			touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
					.perform();
		}
	}

	public void scrollScreenUpMonth() throws InterruptedException {
		implicitwait();
		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int starty = (int) (size.height * 0.50);
		// Ending y location set to 80% of the height (near top)
		int endy = (int) (size.height * 0.55);
		// x position set to mid-screen horizontally
		int startx = size.width / 2;

		TouchAction touchAction = new TouchAction(driver);

		for (int i = 0; i <= 1; i++) {
			touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
					.perform();
		}
	}

	public void scrollScreenUpDate() throws InterruptedException {
		explicitwait1();
		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int starty = (int) (size.height * 0.50);
		// Ending y location set to 80% of the height (near top)
		int endy = (int) (size.height * 0.55);
		// x position set to mid-screen horizontally
		int startx = (int) (size.width / 1.5);

		TouchAction touchAction = new TouchAction(driver);

		for (int i = 0; i <= 1; i++) {
			touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
					.perform();
		}
	}

	@Test(priority = 14)
	public void clickOnPrematureToggle() throws InterruptedException {
		explicitwait1();
		
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
		
		explicitwait1();
		for(int i=0;i<=1;i++) {
			driver.findElementByXPath("//android.widget.Switch[@index='8']").click();
			explicitwait1();
		}
		
	}
	
	@Test(priority = 15)
	public void clickOnWeight() throws InterruptedException {
		explicitwait1();
//		AndroidTouchAction touch = new AndroidTouchAction(driver);
//		touch.press(PointOption.point(436, 1542)).release().perform();
		WebElement weight = driver.findElementByXPath("//android.widget.EditText[@index='9']");
		weight.click();
		weight.clear();
	//	weight.click();
		weight.sendKeys("4.50");
		driver.hideKeyboard();
		
	}
	
	@Test(priority = 16)
	public void clickOnFeedingManner() throws InterruptedException {
		explicitwait1();
		driver.findElementByAccessibilityId("Weaning Food").click();
		
	}
	
	@Test(priority = 17)
	public void clickOnSaveChanges() throws InterruptedException {
		explicitwait();
		driver.findElementByAccessibilityId("Save Changes").click();
		
		explicitwait();
		//Click on Done 
		driver.findElementByAccessibilityId("Go to Home").click();
		
	//	driver.navigate().back();
		
	}

	

	//--------------------------------------------------------------------------------------------------------------------------------------
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void explicitwait() throws InterruptedException {
		Thread.sleep(5000);
	}

	public void explicitwait1() throws InterruptedException {
		Thread.sleep(3000);
	}
}
