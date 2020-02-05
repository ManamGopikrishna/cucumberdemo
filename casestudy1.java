package Cucumbercassestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy1 {
	 WebDriver driver;
	
	
	@Given("User is on the signup page")
	public void user_is_on_the_signup_page() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\training_C2d.02.11\\Firefox\\geckodriver.exe");
	      driver=new FirefoxDriver();

		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   WebElement signup=driver.findElement(By.linkText("SignUp"));
			signup.click();
	}
	
	

	@When("User enters {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and <{string} and {string} click on submit button")
	public void user_enters_and_and_and_and_and_and_and_and_and_and_and_click_on_submit_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
		WebElement uname=driver.findElement(By.name("userName"));
		uname.click();
		uname.sendKeys("Gopi");
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.click();
		firstname.sendKeys("Billga");
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.click();
		lastname.sendKeys("Lgates");
		WebElement password=driver.findElement(By.name("password"));
		password.click();
		password.sendKeys("password123");
		WebElement cpassword=driver.findElement(By.name("confirmPassword"));
		cpassword.click();
		cpassword.sendKeys("password123");
		WebElement gender=driver.findElement(By.xpath("//label[contains(@class,'form-control')]/input[1]"));
		gender.click();
		WebElement email=driver.findElement(By.name("emailAddress"));
		email.click();
		email.sendKeys("bill@microsoft.com");
		WebElement number=driver.findElement(By.name("mobileNumber"));
		number.click();
		number.sendKeys("7895641230");
		WebElement Dob=driver.findElement(By.name("dob"));
		Dob.click();
		Dob.sendKeys("12/12/1979");
		WebElement address=driver.findElement(By.name("address"));
		address.click();
		address.sendKeys("United states");
		//WebElement question=driver.selectByVisibleText("");
		//question.click();
		WebElement answer=driver.findElement(By.name("answer"));
		answer.click();
		answer.sendKeys("Unitedstates");
		 WebElement register=driver.findElement(By.name("Submit"));
		 register.click();
	}
	

	@Then("User  successfully registered")
	public void user_successfully_registered() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}
