package Cucumbercassestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy2 {
	WebDriver driver;
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\chromedriv\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters {string} and {string} credentials and clicks submit")
	public void user_enters_and_credentials_and_clicks_submit(String string, String string2) {
		WebElement button=driver.findElement(By.linkText("SignIn"));
		button.click();
		WebElement uname=driver.findElement(By.name("userName"));
		  uname.click();
		  uname.sendKeys(string);
		  WebElement pwd=driver.findElement(By.name("password"));
		  pwd.click();
		  pwd.sendKeys(string2);
		  WebElement button1=driver.findElement(By.name("Login"));
		  button1.click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user login should be successful")
	public void user_login_should_be_successful() {
		String text=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).getText();
		Assert.assertTrue(text.contains("Hi, lalitha"));
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}



}
