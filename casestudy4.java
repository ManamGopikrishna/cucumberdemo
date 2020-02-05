package Cucumbercassestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy4 {
	 WebDriver driver;
		@Given("user has registered into testme app")
		public void user_has_registered_into_testme_app() {
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

		@When("user search a particular product like headphones")
		public void user_search_a_particular_product_like_headphones() {
			 WebElement search=driver.findElement(By.xpath("//div[@class='autocomplete']/input"));
			 search.click();
			 search.sendKeys("headphone");
			 WebElement find=driver.findElement(By.xpath("//form/input"));
			 find.click();
		}

		@When("try to proceed to payment without adding any item to the cart")
		public void try_to_proceed_to_payment_without_adding_any_item_to_the_cart() {
			
			driver.get("http://10.232.237.143:443/TestMeApp/removeCartItem.htm?prodId=1");
		}
		
		@Then("testme app does not display the cart icon")
		public void testme_app_does_not_display_the_cart_icon() {
			driver.get("http://10.232.237.143:443/TestMeApp/removeCartItem.htm?prodId=1");
		}
		
}
		    

