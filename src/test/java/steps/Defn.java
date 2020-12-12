package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defn
{
	WebDriver driver;
	@Given("I am able to navigate onto magento home page")
	public void i_am_able_to_navigate_onto_magento_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http:magento.com");
		
	}

	@Given("I am able to click on the user icon")
	public void i_am_able_to_click_on_the_user_icon() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
	}

	@When("I update the username as {string}")
	public void i_update_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(string);
		}

	@When("I update the password as {string}")
	public void i_update_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys(string);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("send2")).click();
	}

	@Then("I should see the error message as {string}")
	public void i_should_see_the_error_message_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String error=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")).getText();
		Assert.assertEquals(string, error);
		driver.quit();
	
	
	}
	@Then("I should see the Logout link")
	public void i_should_see_the_logout_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Log Out")).click();
	    driver.quit();
	
	}



}

