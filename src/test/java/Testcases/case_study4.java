package Testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class case_study4 {
	WebDriver driver;
	@Given("user login in TestMe App")
	public void user_login_in_TestMe_App() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438DIRNP6_TRNG\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://localhost:8083/TestMeApp");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignIn")).click();
		   driver.findElement(By.name("userName")).sendKeys("ruchitaa");
		   driver.findElement(By.name("password")).sendKeys("123456");
		   driver.findElement(By.name("Login")).click();
	}

	@Then("user search for headphones")
	public void user_search_for_headphones() {
		driver.findElement(By.linkText("All Categories")).click();
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.linkText("Head Phone")).click();
		 driver.findElement(By.id("pname")).sendKeys("Head Phone");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("try to procced to payment without adding product to cart")
	public void try_to_procced_to_payment_without_adding_product_to_cart() {
		
	Assert.assertFalse(driver.getTitle().contains("View Cart"));
	}

	@Then("TestMe App dosent show cart icon")
	public void testme_App_dosent_show_cart_icon() {
	    //System.out.println("App dosent show cart icon");
	}
}
