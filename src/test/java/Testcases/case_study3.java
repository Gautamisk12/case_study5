package Testcases;

import javax.swing.Action;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;

public class case_study3 {
	WebDriver driver;
 
@Given("user open TestMe app")
public void user_open_TestMe_app() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438DIRNP6_TRNG\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://localhost:8083/TestMeApp");
	   driver.manage().window().maximize();
}

@Given("user click signin button")
public void user_click_signin_button() {
	 driver.findElement(By.linkText("SignIn")).click();
}

@Given("user enter username")
public void user_enter_username() {
	driver.findElement(By.name("userName")).sendKeys("ruchitaa");
}

@Given("user enter password")
public void user_enter_password() {
	driver.findElement(By.name("password")).sendKeys("123456");
}

@Given("user click the Login button")
public void user_click_the_Login_button() {
	  driver.findElement(By.name("Login")).click();
}

@Given("validate login success")
public void validate_login_success() {
	 Assert.assertTrue(driver.getTitle().contains("Home"));
}

@Given("user clicks on categories button")
public void user_clicks_on_categories_button() {
    driver.findElement(By.linkText("All Categories")).click();
}

@Given("user click electronics button")
public void user_click_electronics_button() {
  driver.findElement(By.linkText("Electronics")).click();
}

@Given("user selects headphone option")
public void user_selects_headphone_option() {
   driver.findElement(By.linkText("Head Phone")).click();
}

@Given("user clicks on search bar")
public void user_clicks_on_search_bar() {
    driver.findElement(By.id("pname")).sendKeys("Head Phone");
}

@Given("user clicks on search button")
public void user_clicks_on_search_button() {
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
}
@Given("user selects the product")
public void user_selects_the_product() {
   driver.findElement(By.linkText("Add to cart")).click();
}

@Given("user clicks on cart")
public void user_clicks_on_cart() {
    driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
}

@Given("user clicks processed to pay button")
public void user_clicks_processed_to_pay_button() {
   driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
   driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
}

}
