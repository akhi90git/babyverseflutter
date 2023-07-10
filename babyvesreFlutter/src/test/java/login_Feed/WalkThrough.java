package login_Feed;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class WalkThrough extends LoginScreen {

	@Test(priority = 10, testName = "Screen 1")
	public void walkthroughscreen() throws InterruptedException {

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
		} else {
			
			implicitwait();
			
			driver.findElementByXPath("//android.widget.Button[@index='5']").click();

			Thread.sleep(7000);
		}
		}catch(Exception e) {
			System.out.println("Walk through not found");
		}

		driver.quit();
		
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
