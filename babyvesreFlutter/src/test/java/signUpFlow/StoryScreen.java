package signUpFlow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StoryScreen extends Capabalities {

	@Test(priority = 2)
	public void clickExistingUserLogin() throws InterruptedException {
		implicitwait();
		
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
	

//---------------------------------------------------------------------------------------------------------------------------------------	
	
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
