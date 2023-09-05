package userSettingScreen;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class ChildDetails extends CapabalitiesDirect{

	@Test()
	public void clickOnDetailsbutton() {
		implicitwait();
		
		
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
