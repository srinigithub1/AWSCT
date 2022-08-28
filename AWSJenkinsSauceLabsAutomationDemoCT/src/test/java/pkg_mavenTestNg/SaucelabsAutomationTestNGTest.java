// Generated by Selenium IDE
package pkg_mavenTestNg;
import java.lang.*;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.*;
public class SaucelabsAutomationTestNGTest {
	public static String url_app="https://www.saucedemo.com/";
    public static WebDriver driver;
  
  
  @BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver101\\chromedriver.exe");
    driver = new ChromeDriver();

  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void Login() throws InterruptedException {
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.id("user-name")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("user-name"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    {
      List<WebElement> elements = driver.findElements(By.id("password"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys("secret_sauce");
    {
      List<WebElement> elements = driver.findElements(By.id("login-button"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.xpath("//input[@id=\'login-button\']")).click();
  }
    @Test(priority=1)
    public void checkout() throws InterruptedException {
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    driver.findElement(By.linkText("2")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("checkout"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("checkout")).click();
    
    }
    
    @Test(priority=2)
    public void CustormerDetails() throws InterruptedException {
    driver.findElement(By.name("firstName")).click();
    driver.findElement(By.name("firstName")).sendKeys("vaasu");
    driver.findElement(By.id("last-name")).sendKeys("rama");
    driver.findElement(By.name("postalCode")).click();
    driver.findElement(By.id("postal-code")).sendKeys("7363537");
    {
      List<WebElement> elements = driver.findElements(By.id("continue"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.xpath("//div[@id=\'checkout_summary_container\']/div/div[2]")).click();
    
    driver.findElement(By.id("finish")).click();
    driver.findElement(By.id("back-to-products")).click();
//    driver.findElement(By.id("react-burger-menu-btn")).click();
    
	
	// Handling context object or hidden object using actions class
	
    }
    
    @Test(priority=3)
    public void Logout() throws InterruptedException {
	WebElement logout_button=driver.findElement(By.id("react-burger-menu-btn"));
	logout_button.click();
	
	
	WebElement objlogout=driver.findElement(By.id("logout_sidebar_link"));
	
	Actions action=new Actions(driver);
	
	Thread.sleep(5000);
	
	action.moveToElement(objlogout).build();
	//Assert.assertTrue(false);
//	Assert.assertEquals(true, false);
	

	
	// Approach :1 - Handling Dynamic Elements
	
//	WebDriverWait wait=new WebDriverWait(driver, 20);
//	
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
//	objlogout.click();
	
	// Approach : 2 
	
	if(objlogout.isDisplayed()){
		objlogout.click();
	} else{
		Thread.sleep(5000);
		
		System.out.println("we are in else section");
		
		WebDriverWait wait1=new WebDriverWait(driver, 20);
		
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
		objlogout.click();
		
	}
  }
}