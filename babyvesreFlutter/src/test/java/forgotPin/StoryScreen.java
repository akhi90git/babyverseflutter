package forgotPin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StoryScreen extends Capabalities {

	@Test(priority = 2)
	public void clickAlreadyaccount() throws InterruptedException {

		implicitwait();
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login or Sign Up']")).click();
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
