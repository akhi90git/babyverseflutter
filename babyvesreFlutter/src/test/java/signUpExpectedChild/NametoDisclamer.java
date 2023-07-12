package signUpExpectedChild;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class NametoDisclamer extends MobileAndPin {

	@Test(priority = 17)
	public void emptyNameValidation() throws InterruptedException {

		explicitwait1();

		// Click on Next button
		driver.findElementByXPath("//android.widget.Button[@index='10']").click();

		String validation = driver.findElementByAccessibilityId(" Enter your first name.")
				.getAttribute("content-desc");
		
		// Check validation
		Assert.assertEquals(validation, " Enter your first name.");
	}

	@Test(priority = 18)
	public void addUserName() throws InterruptedException {
		explicitwait1();

		List<WebElement> textfiled = driver.findElementsByXPath("//android.widget.EditText[@index='0']");
		// System.out.println(textfiled.size());
		textfiled.get(0).click();
		textfiled.get(0).sendKeys("Akhilesh");

		driver.hideKeyboard();
	}

	@Test(priority = 19)
	public void emptyEmailValidation() throws InterruptedException {
		explicitwait1();

		// Click on Next button
		driver.findElementByXPath("//android.widget.Button[@index='10']").click();

		// Check validation

		String validation = driver.findElementByAccessibilityId("Please Enter Valid Email")
				.getAttribute("content-desc");
		
		Assert.assertEquals(validation, "Please Enter Valid Email");
	}

	@Test(priority = 20)
	public void addEmailId() throws InterruptedException {
		explicitwait1();

		List<WebElement> textfiled = driver.findElementsByXPath("//android.widget.EditText[@index='0']");
		// System.out.println(textfiled.size());
		textfiled.get(1).click();
		textfiled.get(1).sendKeys("a@g.c");

		driver.hideKeyboard();

		// Click on Next button
		driver.findElementByXPath("//android.widget.Button[@index='10']").click();

		explicitwait1();

	}

	@Test(priority = 21)
	public void clickonBabyontheWay() throws InterruptedException {

		explicitwait1();
		// Select my baby is on the way
		driver.findElementByXPath("//android.widget.ImageView[@index='4']").click();

	}

//	@Test(priority = 22)
	public void clickonHint() throws InterruptedException {

		explicitwait1();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();

		implicitwait();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes! Got it.']")).click();

	}

	@Test(priority = 23)
	public void selectdateOfBirth() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='4']").click();


		// ************* Select Year************************
		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int startyeary = (int) (size.height * 0.55);
		// Ending y location set to 80% of the height (near top)
		int endyeary = (int) (size.height * 0.50);
		// x position set to mid-screen horizontally
		int startyearx = (int) (size.width / 3.5);

		TouchAction touchAction = new TouchAction(driver);

		explicitwait1();
		
		for (int i = 0; i <= 0; i++) {
			touchAction.longPress(PointOption.point(startyearx, startyeary))
					.moveTo(PointOption.point(startyearx, endyeary)).release().perform();
		}

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

		explicitwait1();
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

		explicitwait1();
		for (int i = 0; i <= 1; i++) {
			touchAction2.longPress(PointOption.point(startdatex, startdatey))
					.moveTo(PointOption.point(startdatex, enddatey)).release().perform();
		}

		implicitwait();
		driver.findElementByAccessibilityId("Select").click();

		driver.findElementByXPath("//android.widget.Button[@index='5']").click();
	}

	@Test(priority = 24)
	public void clickOnRelation() throws InterruptedException {

		explicitwait1();

		// driver.findElementByAccessibilityId("Mother").click();
		driver.findElementByXPath("//android.widget.ImageView[@index='1']").click();

	}

	@Test(priority = 25)
	public void neverMissaMilestone() throws InterruptedException {

		explicitwait1();

		driver.findElementByXPath("//android.widget.Button[@index='5']").click();

	}
	
	@Test(priority = 26)
	public void planScreen() throws InterruptedException {
		explicitwait1();

		driver.findElementByXPath("//android.widget.Button[@index='6']").click();

		explicitwait();

		driver.navigate().back();

		implicitwait();

		driver.findElementByXPath("//android.view.View[@index='7']").click();

	}

	@Test(priority = 27)
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
	
	@Test(priority = 28)
	public void clickonDisclaimer() throws InterruptedException {

		explicitwait();

		driver.findElementByAccessibilityId("Proceed").click();

		
//		String validation= driver.findElementByAccessibilityId("Hi\r\n"
//				+ "Please accept terms and conditions.").getAttribute("content-desc");
//		
//		Assert.assertEquals(validation, "HiPlease accept terms and conditions.");
		
		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='2']").click();

		driver.findElementByAccessibilityId("Proceed").click();
		
		explicitwait1();
		
		driver.quit();

	}

//-----------------------------------------------------------------------------------------------------------------------	

	public void implicitwait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void explicitwait() throws InterruptedException {

		Thread.sleep(3000);

	}

	public void sleep_method() throws InterruptedException {

		Thread.sleep(5000);

	}

	public void explicitwait1() throws InterruptedException {

		Thread.sleep(2000);

	}

}
