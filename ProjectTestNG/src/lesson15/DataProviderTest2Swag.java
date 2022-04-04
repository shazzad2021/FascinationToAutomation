package lesson15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2Swag {
	
	@Test(dataProvider = "dataSet1")
	public void loginTest(String user, String pass) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\automation\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.saucedemo.com/");
		 
		 driver.findElement(By.name("user-name")).sendKeys(user);
		 driver.findElement(By.name("password")).sendKeys(pass);
		 driver.findElement(By.name("login-button")).click();
		 Thread.sleep(2000);
		 driver.close();
		 

				
	}
	
	
	@DataProvider
	public Object[][] dataSet1(){
		return new Object[][]{
		{"standard_user", "secret_sauce"},
		{"locked_out_user", "secret_sauce"},
		{"problem_user", "secret_sauce"},
		{"performance_glitch_user", "secret_sauce"}
		};
	}

	
		
	}
	



	
