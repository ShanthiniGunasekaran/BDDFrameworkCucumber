package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepsTest {
	
	public LoginStepsTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b7c.06.13\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		Thread.sleep(5000);
	}
	
	WebDriver driver;
	
	@Given("^Admin is on login page$")
	public void admin_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("a[href*='login.htm']")).click();
	}

	@When("^Admin enters valid email$")
	public void admin_enters_valid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("admin");
	}

	@When("^Admin enters valid password$")
	public void admin_enters_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys("Password456");
	}

	@Then("^Login is successful$")
	public void login_is_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("a[href*='logout']")).isDisplayed());
		driver.quit();
	}
}