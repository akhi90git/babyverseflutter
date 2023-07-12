package homeScreen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class HomeScreen extends NoResetCapabalities {

	@Test(priority = 2, testName = "Screen 1")
	public void walkthroughscreen1() throws InterruptedException {

		explicitwait1();

		try {
			String gettext = driver.findElementByXPath("//android.view.View[@index='2']").getAttribute("content-desc");

			System.out.println(gettext);

			if (gettext.equals("Welcome")) {
				implicitwait();

				driver.findElementByXPath("//android.widget.Button[@index='5']").click();

				implicitwait();

				driver.findElementByXPath("//android.widget.Button[@index='4']").click();

				implicitwait();

				driver.findElementByXPath("//android.widget.Button[@index='4']").click();

				Thread.sleep(20000);
			} 
			else {

				implicitwait();

				driver.findElementByXPath("//android.widget.Button[@index='5']").click();

				Thread.sleep(7000);
			}
		} catch (Exception e) {
			System.out.println("Walk Through not found");
		}

		// driver.quit();

		implicitwait();

	}

	@Test(priority = 3)
	public void clickOnHomeTab() throws InterruptedException {

		explicitwait1();

		driver.findElementByAccessibilityId("Home").click();

	}

	@Test(priority = 4)
	public void clickOnExpert() throws InterruptedException {
		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='1']").click();

		explicitwait();

		driver.navigate().back();

		// driver.quit();
	}

	@Test(priority = 5)
	public void clickOnSetting() throws InterruptedException {
		explicitwait1();

		driver.findElementByXPath("//android.widget.ImageView[@index='2']").click();

		explicitwait();

		driver.navigate().back();

	}

//	@Test(priority = 5)
	public void scrollCarousal() throws InterruptedException {

		explicitwait1();

		scrollLeft();
	}

	@Test(priority = 6)
	public void clickonActvityonCarousel() throws InterruptedException {
		explicitwait1();

		driver.findElementByAccessibilityId("Start").click();

		// explicitwait();
		Thread.sleep(8000);

		driver.navigate().back();

		scrollScreenUp10();

	}

	@Test(priority = 7)
	public void layoutEverythingButtonClick() throws InterruptedException {
		explicitwait1();

		List<WebElement> names = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		int sizecheck = names.size() - 1;
		System.out.println(sizecheck);

		for (int i = 2; i < sizecheck; i++) {
			System.out.println(names.get(i).getAttribute("content-desc"));
			names.get(i).click();
			Thread.sleep(8000);
			driver.navigate().back();
		}

	}

	@Test(priority = 8)
	public void layoutSpeciallyButtonClick() throws InterruptedException {

//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Specially Curated For You!\").instance(0))");

		explicitwait();
		scrollScreenUp80();

		List<WebElement> names2 = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		int sizecheck2 = names2.size() - 1;
		System.out.println(sizecheck2);

		for (int i = 2; i < sizecheck2; i++) {
			System.out.println(names2.get(i).getAttribute("content-desc"));
			names2.get(i).click();
			Thread.sleep(8000);
			driver.navigate().back();
		}
	}

	@Test(priority = 9)
	public void layoutParentsButtonClick() throws InterruptedException {
		explicitwait();
		scrollScreenUp80();
		// scrollScreenUp80();

		List<WebElement> names3 = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		int sizecheck3 = names3.size() - 1;
		System.out.println(sizecheck3);

		for (int i = 8; i < sizecheck3; i++) {
			System.out.println(names3.get(i).getAttribute("content-desc"));
			names3.get(i).click();
			Thread.sleep(8000);
			driver.navigate().back();
		}

		explicitwait();
		driver.quit();

	}

	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void explicitwait() throws InterruptedException {

		Thread.sleep(5000);

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

		explicitwait();

	}

	public void explicitwait1() throws InterruptedException {

		Thread.sleep(3000);

	}
}
