package userSettingScreen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Add_Diff_Child extends CapabalitiesDirect {

	@Test(priority = 2)
	public void sixMonthBaby() throws InterruptedException {
		clickOnAddanotherChild();
		clickonBabyHere();
		clickonGender();
		childName("bv_M6");
		dateOfBirth(5,"month");
		clickOnRelation();
		
	}
	
	@Test(priority = 3)
	public void twelveMonthBaby() throws InterruptedException {
		clickOnAddanotherChild();
		clickonBabyHere();
		clickonGender();
		childName("bv_M12");
		dateOfBirth(1,"year");
		clickOnRelation();
		
	}
	

	
	
	//-------------------------------------------------------------------------------------------------------------
	
	public void clickOnAddanotherChild() throws InterruptedException {
		explicitwait1();
		driver.findElementByAccessibilityId("Add another baby").click();
	}
	
	public void clickonBabyHere() throws InterruptedException {

		explicitwait1();

		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Yes, my baby is here.']")).click();

	}
	
	public void clickonGender() throws InterruptedException {

		explicitwait1();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();

	}
	
	public void childName(String x) throws InterruptedException {

		explicitwait1();

		WebElement nametext = driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));

		nametext.click();

		nametext.sendKeys(x);
		driver.hideKeyboard();
		explicitwait1();

		driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();

	}
	
	public void dateOfBirth(int x,String y) throws InterruptedException {

		explicitwait1();

		if(y == "year") {
			
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

		for (int i = 0; i <= x; i++) {
			touchAction.longPress(PointOption.point(startyearx, startyeary))
					.moveTo(PointOption.point(startyearx, endyeary)).release().perform();
			}

		}
		
		if(y=="month") {
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

		for (int i = 1; i <= x; i++) {
			touchAction1.longPress(PointOption.point(startmonthx, startmonthy))
					.moveTo(PointOption.point(startmonthx, endmonthy)).release().perform();
			}

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

//		for (int i = 0; i <= 1; i++) {
//			touchAction2.longPress(PointOption.point(startdatex, startdatey))
//					.moveTo(PointOption.point(startdatex, enddatey)).release().perform();
//		}

		implicitwait();
		driver.findElementByAccessibilityId("Select").click();
		
		driver.findElementByAccessibilityId("Continue").click();

	}


	public void clickOnRelation() throws InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("Father").click();

	}
	
	public void clickonProfileNext() throws InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("Next").click();

	}
	
	

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
