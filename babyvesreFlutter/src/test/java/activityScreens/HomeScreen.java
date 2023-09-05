package activityScreens;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class HomeScreen extends NoResetCapabalities {

	@Test(priority = 2)
	public void clickOnHomeTab() throws InterruptedException {

		explicitwait();

		try {

			driver.findElementByAccessibilityId("Home").click();

//			List<WebElement> data = driver.findElementsByXPath("//android.widget.ImageView[@index='0'][2]");
//			 System.out.println(data.size());
//			for (int i = 0; i < data.size(); i++) {
//				System.out.println(data.get(i).getAttribute("content-desc"));
//				//Thread.sleep(8000);
//				//driver.navigate().back();
//			}

			// click on last index home button is there
//			int x = data.size() - 1;
//			data.get(x).click();

		} catch (Exception e) {
			System.out.println("Not Found");
		}

	}


	@Test(priority = 10)
	public void layoutEverythingButtonClickDeom() throws InterruptedException {

		scrollScreenUp40();
		explicitwait();

		int loop = 1;
		outerloop:
		do {

			try {
				List<WebElement> block = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
				System.out.println(block.size());

				explicitwait1();
				for (int i = 1; i < block.size() - 1; i++) {
					System.out.println(block.get(i).getAttribute("content-desc"));
					explicitwait1();

					if (block.get(i).getAttribute("content-desc").equals("Activity Centre")) {
						block.get(i).click();
						ActivitiesTimeline activitiesTimeline = new ActivitiesTimeline();
						activitiesTimeline.clickOnFacultyMA();
						break outerloop;
					}
					
				}
				scrollScreenUp80();

				loop++;

			} catch (Exception e) {
				System.out.println("Not found");
			}
		} while (loop <= 3);

		driver.quit();
	}

	
	public void activityScreen() throws InterruptedException {
		System.out.println("On Activity Screen");
		explicitwait();
		
		
	}
	
	
//-----------------------------------------------------------------------------------------------------------------------------------------

	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void explicitwait() throws InterruptedException {

		Thread.sleep(7000);

	}

	public void scrollScreenUp40() throws InterruptedException {

		explicitwait();

		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 80% of the height (near bottom)
		int starty = (int) (size.height * 0.40);
		// Ending y location set to 20% of the height (near top)
		int endy = (int) (size.height * 0.10);
		// x position set to mid-screen horizontally
		int startx = (int) size.width / 2;

		TouchAction touchAction = new TouchAction(driver);

		touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
				.perform();

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

	public void scrollScreenUp10() throws InterruptedException {

		explicitwait();

		// The viewing size of the device
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		// Starting y location set to 80% of the height (near bottom)
		int starty = (int) (size.height * 0.50);
		// Ending y location set to 20% of the height (near top)
		int endy = (int) (size.height * 0.40);
		// x position set to mid-screen horizontally
		int startx = (int) size.width / 2;

		TouchAction touchAction = new TouchAction(driver);

		touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release()
				.perform();

	}

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

		explicitwait1();

	}

	public void explicitwait1() throws InterruptedException {

		Thread.sleep(3000);

	}
}
