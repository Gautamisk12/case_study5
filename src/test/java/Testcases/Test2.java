package Testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2 {
	WebDriver driver;
	@Given("user open application")
	public void user_open_application() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	   
	}

	@When("user enter username as {string} in userName field")
	public void user_enter_username_as_in_userName_field(String uname) {
		driver.findElement(By.name("userName")).sendKeys(uname);
	   
	}

	@When("user enters password as {string} in password field")
	public void user_enters_password_as_in_password_field(String pwd) {
	   driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("click signin")
	public void click_signin() {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("validates login success")
	public void validates_login_success() {
		Assert.assertTrue(driver.getTitle().contains("Find a Flight: Mercury Tours:"));
		driver.close();
	}

}
