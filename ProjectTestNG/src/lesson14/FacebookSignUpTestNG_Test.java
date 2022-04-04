package lesson14;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookSignUpTestNG_Test {
  WebDriver driver; 
  @BeforeTest
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\automation\\chromedriver.exe");
	  driver = new ChromeDriver();	  
  }
  @BeforeClass
  public void openURL() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.facebook.com");	  
  }
  @Test(enabled=true, priority=1, description="testing create account button", testName = "Functional")
  public void clickCreateAccount() {
	  driver.findElement(By.linkText("Create new account")).click();
	  System.out.println("User clicked on crate new account button");
  }
  @Test(enabled=true, priority=2, description="testing firstname field", testName = "Functional")
  public void setFirstName() {
	  driver.findElement(By.name("firstname")).sendKeys("Morgan");
	  System.out.println("User populated firstname field");
  }
  @Test(enabled=true, priority=3, description="testing lastname field", testName = "Functional")
  public void setLastName() {
	  driver.findElement(By.name("lastname")).sendKeys("403");
	  System.out.println("User populated lastname field");
  }
  @Test(enabled=true, priority=4, description="testing mobile number field", testName = "Functional")
  public void setMobileNumber () {
	  driver.findElement(By.name("reg_email__")).sendKeys("3473458899");
	  System.out.println("User populated mobile number field");
  }
  @Test(enabled=true, priority=5, description="testing password field", testName = "Functional")
  public void setPassword() {
	  driver.findElement(By.name("reg_passwd__")).sendKeys("abc123");
	  System.out.println("User populated password field");
  }
  @Test(enabled=true, priority=6, description="testing month field", testName = "Functional")
  public void setbirthdayMonth() {
	  Select dropdown = new Select(driver.findElement(By.id("month")));
	  dropdown.selectByVisibleText("Jan");
	  System.out.println("User populated month field");
  }
  @Test(enabled=true, priority=7, description="testing day field", testName = "Functional")
  public void setDate() {
	  Select dropdown = new Select(driver.findElement(By.id("day")));
	  dropdown.selectByVisibleText("30");
	  System.out.println("User populated day field");
  }
  @Test(enabled=true, priority=8, description="testing year field", testName = "Functional")
  public void setYear() {
	  Select dropdown = new Select(driver.findElement(By.id("year")));
	  dropdown.selectByVisibleText("1930");
	  System.out.println("User populated year field");	  
  }
  @Test(enabled=true, priority=9, description="testing gender field", testName = "Functional")
  public void setGender() {
	  driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	  System.out.println("User populated gender field");	 
  }
  @Test(enabled=true, priority=10, description="testing submit button", testName = "Functional")
  public void clickSubmitButton() {
	  driver.findElement(By.name("websubmit")).click();
	  System.out.println("User clicked on submit button");
  }
  @Test(enabled=true, priority=11, description="testing error message", testName = "Functional")
  public void verifyErrorMessage() {
	  WebElement errorField = new WebDriverWait(driver, Duration.ofSeconds(30)).until
			  (ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='reg_error_inner']")));
	  
	 String actualError = errorField.getText(); 
	 
	 System.out.println(actualError);// have a point out actual error message
	 
	 String expectedError = "Please choose a more secure password. It should be longer than 6 characters, unique to you, and difficult for others to guess.";
	 SoftAssert soft = new SoftAssert();
	 soft.assertEquals(actualError, expectedError, "Failed!! Error message did not match");
	 System.out.println("End of testing today!!");
	 
	 soft.assertAll();
  }
}
