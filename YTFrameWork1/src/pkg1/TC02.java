package pkg1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02 {
	ChromeDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	@Test
   public void sybsceiption() throws InterruptedException
   {
	   WebElement Signin=driver.findElementByXPath("//paper-button[@aria-label='Sign in']");
  	 Signin.click();
  	 Thread.sleep(1000);
  	 WebElement Username=driver.findElementByXPath("//input[@id='identifierId' or @aria-label='Email or phone']");
  	 Username.sendKeys("nishugupta0045@gmail.com");
  	 WebElement nextbutton1=driver.findElementByXPath("//span[text()='Next']");
  	 nextbutton1.click();
  	 Thread.sleep(2000);
  	 WebElement password=driver.findElementByXPath("//input[@name='password']");
  	 password.sendKeys("Test@123");
  	 WebElement nextbutton2=driver.findElementByXPath("//span[text()='Next']");
  	 nextbutton2.click();
  	 Thread.sleep(8000);
  	 WebElement subscription=driver.findElementByXPath("//yt-formatted-string[text()='Subscriptions']");
  	 subscription.click();
  	 Thread.sleep(5000);
  	 WebElement account=driver.findElementByXPath("//button[@id='avatar-btn']");
  	 account.click();
  	 Thread.sleep(3000);
  	 WebElement signout=driver.findElementByXPath("//yt-formatted-string[text()='Sign out']");
  	 signout.click();
   }

   @AfterMethod
   public void browserclose() throws InterruptedException
   {
	   driver.close();
	   Thread.sleep(5000);
   }
   
}
