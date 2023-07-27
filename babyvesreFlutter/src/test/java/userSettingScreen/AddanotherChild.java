package userSettingScreen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AddanotherChild extends CapabalitiesDirect {

//	@Test(priority = 18)
	public void clickOnAddanotherChild() throws InterruptedException {
		explicitwait1();
		driver.findElementByAccessibilityId("Add another baby").click();
	}

//	@Test(priority = 19, testName = "Click on Yes, my baby is here")
	public void clickonBabyHere() throws InterruptedException {

		explicitwait1();

		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Yes, my baby is here.']")).click();

	}

	@Test(priority = 20, testName = "Click on Gender")
	public void clickonGender() throws InterruptedException {

		explicitwait1();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();

	}

//	@Test(priority = 21, testName = "Child Name")
	public void childName() throws InterruptedException {

		explicitwait1();

		WebElement nametext = driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));

		nametext.click();

		nametext.sendKeys("Aaryaman");

		implicitwait();

		driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();

	}

	@Test(priority = 22, testName = "Click on Hint")
	public void clickonHint() throws InterruptedException {

		explicitwait1();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();

		explicitwait();
		System.out.println("Yaha tak aaya");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes! Got it.']")).click();

	}

/*	@Test(priority = 23, testName = "Date of Birth")
	public void dateOfBirth() throws InterruptedException {

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

	}

	@Test(priority = 24, testName = "Premature Date of Birth")
	public void prematureDOB() throws InterruptedException {

		explicitwait1();

		AndroidTouchAction touch = new AndroidTouchAction(driver);
		touch.press(PointOption.point(837, 1692)).release().perform();

		driver.findElementByXPath("//android.widget.ImageView[@index='2']").click();

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

		for (int i = 0; i <= 0; i++) {
			touchAction2.longPress(PointOption.point(startdatex, startdatey))
					.moveTo(PointOption.point(startdatex, enddatey)).release().perform();
		}

		implicitwait();
		driver.findElementByAccessibilityId("Select").click();

		driver.findElementByAccessibilityId("Continue").click();
	}

	@Test(priority = 25, testName = "Click on Relation")
	public void clickOnRelation() throws InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("Father").click();

	}

	@Test(priority = 26, testName = "Click on Profile Next")
	public void clickonProfileNext() throws InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("Next").click();

	}

	@Test(priority = 27)
	public void clickOnLogout() throws InterruptedException {
		explicitwait1();
		driver.findElementByAccessibilityId("Log Out").click();
		
		driver.findElementByAccessibilityId("Yes").click();
		
		explicitwait1();
		driver.quit();
	}
	
	*/
//------------------------------------------------------------------------------------------------------	
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
