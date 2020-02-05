package Cucumbercassestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy3 {
	WebDriver driver;
	@Given("USER LOGGING INTO HIS TESTME APP")
	public void USER_LOGGING_INTO_HIS_TESTME_APP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\chromedriv\\chromedriver.exe");
	    driver=new ChromeDriver();

	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	WebElement uname=driver.findElement(By.name("userName"));
	uname.click();
	uname.sendKeys("lalitha");
	WebElement password=driver.findElement(By.name("password"));
	password.click();
	password.sendKeys("Password123");
	 WebElement login=driver.findElement(By.name("Login"));
	 login.click();
		
	  
	}

	@When("SEARCH FOR THE HEADPHONE AND TO CART")
	public void SEARCH_FOR_THE_HEADPHONE_AND_TO_CART() {
		 WebElement search=driver.findElement(By.xpath("//div[@class='autocomplete']/input"));
		 search.click();
		 search.sendKeys("head");
		 WebElement find=driver.findElement(By.xpath("//form/input"));
		 find.click();
		 WebElement addtocart=driver.findElement(By.linkText("Add to cart"));
		 addtocart.click();
		 WebElement cart=driver.findElement(By.linkText("Cart 1"));
		 cart.click();
		 WebElement  checkout= driver.findElement(By.linkText("Checkout"));
		 checkout.click();
		 WebElement  payment= driver.findElement(By.xpath("//div/form[2]/input"));
			payment.click();
			driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
			driver.get("http://10.232.237.143:443/PaymentGateway/loginhere.htm?radio=Andhra%20Bank");
			WebElement UserName = driver.findElement(By.name("username"));
			UserName.sendKeys("123456");
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("Pass@456");
			driver.get("http://10.232.237.143:443/PaymentGateway/login.htm?username=123456&password=Pass%40456&radio=Andhra+Bank");
			WebElement transpwd=driver.findElement(By.name("transpwd"));
			transpwd.sendKeys("Trans@456");		
	}

	@Then("USER PLACED ORDER SUCCESSFULLY")
	public void USER_PLACED_ORDER_SUCCESSFULLY() {
		driver.get("http://10.232.237.143:443/TestMeApp/fromPayment.htm?custid=11105");
		
	    
	}



}
