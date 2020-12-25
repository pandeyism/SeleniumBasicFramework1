package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC05 {
	
	ChromeDriver driver;
	@BeforeMethod
	public void browserlaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
 @Test
 
 public void history() throws InterruptedException
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
  	
  	WebElement search=driver.findElementByXPath("//input[@id='search' or @name='search_query']");//video search
  	Thread.sleep(3000);
  	search.sendKeys("sachin a billion dreams");
  	Thread.sleep(6000);
  	
  	WebElement searchclick=driver.findElementByXPath("//button[@id='search-icon-legacy']");
  	searchclick.click();
  	Thread.sleep(3000);
  	WebElement video=driver.findElementByXPath("//a[@id='video-title']");
  	video.click();
  	Thread.sleep(10000);
  	
  	WebElement like=driver.findElementByXPath("//div[@id='top-level-buttons']/ytd-toggle-button-renderer[1]/a/yt-icon-button/button[contains(@aria-label,'like this video along with')]");
  	like.click();
  	
  	Thread.sleep(5000);
  	
 }
 
 @AfterMethod
 public void browserclose() throws InterruptedException
 {
	 driver.close();
	 Thread.sleep(5000);
 }
 
 
 
 
 
 
 
}
