package homeScreen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class HomeScreen extends CapabalitiesDirect {

//	@Test(priority = 2)
	public void clickOnHomeTab() throws InterruptedException {

		explicitwait1();

		// driver.findElementByAccessibilityId("Home").click();

		List<WebElement> data = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
//		 System.out.println(names.size());
//		for (int i = 0; i < data.size(); i++) {
//			System.out.println(data.get(i).getAttribute("content-desc"));
//			//Thread.sleep(8000);
//			//driver.navigate().back();
//		}

		// click on last index home button is there
		int x = data.size() - 1;
		data.get(x).click();
	}

//	@Test(priority = 3)
	public void clickOnFreetrialPopup() throws InterruptedException {
		explicitwait1();

		List<WebElement> data = driver.findElementsByXPath("//android.widget.ImageView[@index='1']");
		System.out.println(data.size());
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).getAttribute("content-desc"));
		}

		explicitwait1();

		try {
			if (data.get(3).getAttribute("content-desc").contains("Your Free trial")
					|| data.get(3).getAttribute("content-desc").contains("Your free trial")) {
				data.get(3).click();
			}
		} catch (Exception e) {
			System.out.println("Not found");
		}

		explicitwait();

		// driver.navigate().back();

	}

//	@Test(priority = 4)
	public void clickOnUpgrade() throws InterruptedException {
		explicitwait1();

		// Will found upgrade button and check that redirect to paywall
		try {

			// Find Upgrade button on home screen
			List<WebElement> data = driver.findElementsByXPath("//android.widget.ImageView[@index='1']");
//			System.out.println(data.size());
//			for (int i = 0; i < data.size(); i++) {
//				System.out.println(data.get(i).getAttribute("content-desc"));
//			}
			data.get(0).click();
			explicitwait1();
									try {
										List<WebElement> data2 = driver.findElementsByXPath("//android.view.View[@index='2']");
						//						System.out.println(data2.size());
						//						for (int i = 0; i < data2.size(); i++) {
						//							System.out.println(data2.get(i).getAttribute("content-desc"));
						//						}
						
										Assert.assertEquals(data2.get(0).getAttribute("content-desc"), "Upgrade to Premium");
										explicitwait1();
										driver.navigate().back();
									} catch (Exception e) {
										System.out.println("Paywall not found");
										driver.navigate().back();
									}

		} catch (Exception e) {
			System.out.println("Upgrade button not found");
		}

		try {

			List<WebElement> data = driver.findElementsByXPath("//android.widget.ImageView[@index='2']");
			System.out.println(data.size());
			for (int i = 0; i < data.size(); i++) {
				System.out.println(data.get(i).getAttribute("content-desc"));
			}

		} catch (Exception e) {
			System.out.println("Upgrade button not found");
		}

		explicitwait1();

//		try {
//			
//			//Check redirected to paywall
//			List<WebElement> data2 =  driver.findElementsByXPath("//android.view.View[@index='2']");
//			 System.out.println(data2.size());
//			for (int i = 0; i < data2.size(); i++) {
//				System.out.println(data2.get(i).getAttribute("content-desc"));
//			}
//			
//			Assert.assertEquals(data2.get(0).getAttribute("content-desc"), "Upgrade to Premium");
//			
//		}catch (Exception e) {
//			System.out.println("Not found");
//		}

	}

//	@Test(priority = 4)
	public void clickOnSetting() throws InterruptedException {
		explicitwait1();

		List<WebElement> data = driver.findElementsByXPath("//android.widget.ImageView[@index='2']");
		System.out.println(data.size());
//		for (int i = 0; i < data.size(); i++) {
//			System.out.println(names.get(i).getAttribute("content-desc"));
//			//Thread.sleep(8000);
//			//driver.navigate().back();
//		}
		data.get(1).click();

//		try {
//			if(driver.findElementByXPath("//android.widget.ImageView[@index='2']").isDisplayed()) {
//				driver.findElementByXPath("//android.widget.ImageView[@index='2']").click();
//			}
//		} catch (Exception e) {
//			System.out.println("Not found");
//		}

		// explicitwait();

		// driver.navigate().back();

	}

//	@Test(priority = 5)
	public void scrollCarousal() throws InterruptedException {

		explicitwait1();

		scrollLeft();
	}

//	@Test(priority = 6)
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
		System.out.println(names.size());
		
		for (int i = 2; i < sizecheck; i++) {
			System.out.println(names.get(i).getAttribute("content-desc"));
			names.get(i).click();
			explicitwait();
			driver.navigate().back();
		}

//		for (int i = 2; i < sizecheck; i++) {
//			System.out.println(names.get(i).getAttribute("content-desc"));
//			names.get(i).click();
//			Thread.sleep(8000);
//			driver.navigate().back();
//		}

	}

	@Test(priority = 8)
	public void layoutSpeciallyButtonClick() throws InterruptedException {

//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Specially Curated For You!\").instance(0))");

		explicitwait();
		scrollScreenUp80();

		List<WebElement> names2 = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		int sizecheck2 = names2.size()-1;
		System.out.println(sizecheck2);

		for (int i = 2; i < sizecheck2; i++) {
			System.out.println(names2.get(i).getAttribute("content-desc"));
						if(names2.get(i).getAttribute("content-desc").equals("Join the community"))
						{
							names2.get(i).click();
							Thread.sleep(10000);
							driver.navigate().back();
							explicitwait1();
							driver.navigate().back();
						}
						else {
						names2.get(i).click();
						explicitwait();
						driver.navigate().back();
						}
			
		}
	}

	@Test(priority = 9)
	public void layoutParentsButtonClick() throws InterruptedException {
		explicitwait();
		scrollScreenUp80();
		// scrollScreenUp80();

		List<WebElement> names3 = driver.findElementsByXPath("//android.widget.ImageView[@index='0']");
		int sizecheck3 = names3.size()-1;
		System.out.println(sizecheck3);

		for (int i = 6; i < sizecheck3; i++) {
			System.out.println(names3.get(i).getAttribute("content-desc"));
			names3.get(i).click();
			explicitwait();
			driver.navigate().back();
		}

		explicitwait();
	//	driver.quit();

	}

//------------------------------------------------------------------------------------------------------------------------------------	

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
