package pkg_mavenTestNg;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UipathRegistrationTestNGTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver101\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void uipathRegistration() {
    driver.get("https://uibank.uipath.com/");
    driver.manage().window().setSize(new Dimension(1552, 832));
    driver.findElement(By.id("username")).click();
    driver.findElement(By.cssSelector("a:nth-child(6) > #emailHelp")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).sendKeys("Jeevan");
    driver.findElement(By.id("title")).click();
    {
      WebElement dropdown = driver.findElement(By.id("title"));
      dropdown.findElement(By.xpath("//option[. = 'Mr']")).click();
    }
    driver.findElement(By.id("middleName")).click();
    driver.findElement(By.id("middleName")).sendKeys("Annand");
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).sendKeys("Rao");
    driver.findElement(By.cssSelector(".form-box")).click();
    driver.findElement(By.id("sex")).click();
    {
      WebElement dropdown = driver.findElement(By.id("sex"));
      dropdown.findElement(By.xpath("//option[. = 'Male']")).click();
    }
    driver.findElement(By.id("employmentStatus")).click();
    {
      WebElement dropdown = driver.findElement(By.id("employmentStatus"));
      dropdown.findElement(By.xpath("//option[. = 'Full-time']")).click();
    }
    driver.findElement(By.id("age")).click();
    driver.findElement(By.id("age")).sendKeys("11/11/90");
    driver.findElement(By.id("maritalStatus")).click();
    {
      WebElement dropdown = driver.findElement(By.id("maritalStatus"));
      dropdown.findElement(By.xpath("//option[. = 'Married']")).click();
    }
    driver.findElement(By.id("numberOfDependents")).click();
    driver.findElement(By.id("numberOfDependents")).sendKeys("2");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("ctrlaisoftware");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("ctrlaisoft@gmail.com");
    driver.findElement(By.cssSelector(".form-box")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Uibank@1234");
  }
}
