package happyFlow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class HappyFlow extends CapabalitiesDirect {

//	@Test(priority = 2)
	public void clickExistingUserLogin() throws InterruptedException {
		implicitwait1();
		
	driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();
		
	driver.navigate().back();
	
	explicitwait1();
	
	driver.navigate().back();
		
	}
	
	@Test(priority = 3)
	public void NewUser_Try() throws InterruptedException {

		explicitwait1();

		driver.findElement(By.xpath("//android.widget.Button[@index='4']")).click();
		

	}
	
	@Test(priority = 4)
	public void selectMobileNumberfromPopup() throws InterruptedException {
		
		implicitwait();
		
		//Back story screen
	//	driver.navigate().back();
		
//		explicitwait1();
//		driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();

		//Select mobile number form mobile picker
		explicitwait1();
		try {
			if(driver.findElementById("com.google.android.gms:id/credential_picker_layout").isDisplayed()) {
				driver.findElementById("com.google.android.gms:id/credential_primary_label").click();
			}
		} catch (Exception e) {
			System.out.println("Popup Not Found");
		}
		
		explicitwait1();
		
		driver.findElementByXPath("//android.widget.Button[@index='5']").click();

	}
	
	@Test(priority = 5)
	public void clickandEnterOTP() throws InterruptedException {

		explicitwait1();
		
		//Enter otp
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(298, 1360)).release().perform();
		//explicitwait1();
		
		click_Zero();

		driver.hideKeyboard();		
		
		implicitwait1();
		driver.findElementByXPath("//android.widget.Button[@index='7']").click();

		// driver.quit();
	}
	
	@Test(priority = 6)
	public void enterPin() throws InterruptedException {

		explicitwait();

		//Enter Pin in first block
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		
	//	touch.press(PointOption.point(298, 1335)).release().perform();
		click_One();
		explicitwait1();
		driver.hideKeyboard();	
		
		explicitwait1();
		
		//Enter Pin in second block
//		touch.press(PointOption.point(303, 1618)).release().perform();
//		click_Zero();
//		explicitwait1();
		
		//Click on Continue
	//	driver.findElementByXPath("//android.widget.Button[@index='7']").click();

		explicitwait1();
		
		//Match the validation message
//		String validation = driver.findElementByAccessibilityId("Oh, the pins dont match up! Can you enter the pin once again?")
//				.getAttribute("content-desc");
//		// System.out.println(validation);
//
//		if (validation.equals(" Oh, the pins dont match up! Can you enter the pin once again?")) {
//			System.out.println("Oh, the pins dont match up! Can you enter the pin once again? Matched");
//		} else {
//			System.out.println("Oh, the pins dont match up! Can you enter the pin once again? not Matched");
//		}
//		
//		Assert.assertEquals(validation, "Oh, the pins dont match up! Can you enter the pin once again?");
	}
	
	@Test(priority = 7)
	public void enterConfirmPin() throws InterruptedException {
		explicitwait1();
		
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		
		// Clear confirm pin block
//		touch.press(PointOption.point(817, 1636)).release().perform();
//		for (int i = 0; i <= 3; i++) {
//			Thread.sleep(500);
//			touch.press(PointOption.point(948, 1621)).release().perform();
//		}

		
		
		//Enter pin in second block again
		
		touch.press(PointOption.point(303, 1618)).release().perform();
		click_One();
		
		//Click on Continue button again
		driver.findElementByXPath("//android.widget.Button[@index='7']").click();
		
	}
	
	@Test(priority = 8)
	public void addUserName() throws InterruptedException {
		explicitwait1();

		List<WebElement> textfiled = driver.findElementsByXPath("//android.widget.EditText[@index='0']");
	//	System.out.println(textfiled.size());
		textfiled.get(0).click();
		textfiled.get(0).sendKeys("bv_Akhilesh");

		driver.hideKeyboard();
	}
	
	@Test(priority = 9)
	public void addEmailId() throws InterruptedException {
		explicitwait1();

		List<WebElement> textfiled = driver.findElementsByXPath("//android.widget.EditText[@index='0']");
	//	System.out.println(textfiled.size());
		textfiled.get(1).click();
		textfiled.get(1).sendKeys("bv_a@g.c");

		driver.hideKeyboard();

		// Click on Next button
		driver.findElementByXPath("//android.widget.Button[@index='10']").click();

		explicitwait1();

	}
	
	@Test(priority = 10)
	public void clickonBabyHere() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='3']").click();
		// driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Yes,
		// my baby is here.']")).click();

	}

	@Test(priority = 11)
	public void clickonGender() throws InterruptedException {

		explicitwait1();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();

	}
	
	@Test(priority = 12)
	public void addchildName() throws InterruptedException {

		explicitwait1();

		List<WebElement> textfiled = driver.findElementsByXPath("//android.widget.EditText[@index='3']");
		System.out.println(textfiled.size());
		textfiled.get(0).click();
		textfiled.get(0).sendKeys("bv_Sonny");

		driver.hideKeyboard();

		implicitwait();

		driver.findElementByXPath("//android.widget.Button[@index='5']").click();

	}
	
	@Test(priority = 13)
	public void selectdateOfBirth() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='3']").click();

		implicitwait();

		// ************* Select Year************************
		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int startyeary = (int) (size.height * 0.50);
		// Ending y location set to 80% of the height (near top)
		int endyeary = (int) (size.height * 0.55);
		// x position set to mid-screen horizontally
		int startyearx = (int) (size.width / 3.5);

		TouchAction touchAction = new TouchAction(driver);

//		for (int i = 0; i <= 0; i++) {
//			touchAction.longPress(PointOption.point(startyearx, startyeary))
//					.moveTo(PointOption.point(startyearx, endyeary)).release().perform();
//		}

		// ************* Select Month************************
		implicitwait();
		// The viewing size of the device
		org.openqa.selenium.Dimension size1 = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int startmonthy = (int) (size1.height * 0.50);
		// Ending y location set to 80% of the height (near top)
		int endmonthy = (int) (size1.height * 0.55);
		// x position set to mid-screen horizontally
		int startmonthx = size1.width / 2;

		TouchAction touchAction1 = new TouchAction(driver);

		for (int i = 0; i <= 1; i++) {
			touchAction1.longPress(PointOption.point(startmonthx, startmonthy))
					.moveTo(PointOption.point(startmonthx, endmonthy)).release().perform();
		}

		// ************* Select Date************************
		implicitwait();
		// The viewing size of the device
		org.openqa.selenium.Dimension size2 = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int startdatey = (int) (size2.height * 0.50);
		// Ending y location set to 80% of the height (near top)
		int enddatey = (int) (size2.height * 0.55);
		// x position set to mid-screen horizontally
		int startdatex = (int) (size2.width / 1.5);

		TouchAction touchAction2 = new TouchAction(driver);

		for (int i = 0; i <= 1; i++) {
			touchAction2.longPress(PointOption.point(startdatex, startdatey))
					.moveTo(PointOption.point(startdatex, enddatey)).release().perform();
		}

		implicitwait();
		driver.findElementByAccessibilityId("Select").click();
		
		driver.findElementByAccessibilityId("Continue").click();

	}
	
	@Test(priority = 14)
	public void clickOnRelation() throws InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("Mother").click();

	}
	
	@Test(priority = 15)
	public void neverMissaMilestone() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.Button[@index='5']").click();

	}
	
	@Test(priority = 16)
	public void planScreen() throws InterruptedException {
		explicitwait1();
		
		driver.findElementByXPath("//android.widget.Button[@index='6']").click();
		
		explicitwait();
		
		driver.navigate().back();
		
		implicitwait();
		
		driver.findElementByXPath("//android.view.View[@index='7']").click();
			
	}

	@Test(priority = 17)
	public void notificationReminder() throws InterruptedException {
		explicitwait();
		try {
			
			if(driver.findElementByAccessibilityId("Get timely reminders").isDisplayed()) {
				explicitwait1();
			//	System.out.println("Yaha tak aaya");
				driver.findElementByAccessibilityId("Yes, Notify me").click();
				explicitwait1();
				driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
				
			}
			
		} catch (Exception e) {
			System.out.println("Notification Reminder screen not found");
		}
	}
	
	@Test(priority = 18)
	public void clickonDisclaimer() throws InterruptedException {

		explicitwait();

		driver.findElementByAccessibilityId("Proceed").click();

		explicitwait1();
		
		driver.findElementByXPath("//android.widget.ImageView[@index='2']").click();
		

		driver.findElementByAccessibilityId("Proceed").click();
		
	}

	
	
	//---------------------------------------------------------------------------------------------------------------------------------------	
	
		public void implicitwait1() {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		public void explicitwait() throws InterruptedException {

			Thread.sleep(5000);

		}

		public void explicitwait1() throws InterruptedException {

			Thread.sleep(3000);

		}	
		
		public void click_One() throws InterruptedException {
			AndroidTouchAction touch = new AndroidTouchAction(driver);

			for (int i = 0; i <=3; i++) {
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

		public void clear_pin() {
			AndroidTouchAction touch = new AndroidTouchAction(driver);
			for (int i = 1; i <= 4; i++) {
				touch.press(PointOption.point(943, 1634)).release().perform();
			}
		}

		public void implicitwait() {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

	
}
