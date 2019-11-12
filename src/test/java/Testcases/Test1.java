package Testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
	WebDriver driver;
	@Given("user open application newtours.demoaut.com")
	public void user_open_application_newtours_demoaut_com() {
	   //System.out.println("Launch ie browser and newtours application");
		 
		 System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		  driver.get("http://www.newtours.demoaut.com/");
		  driver.manage().window().maximize();
	}

	@When("user clicks registration")
	public void user_clicks_registration() {
	   // System.out.println("Open registration page");
		 driver.findElement(By.partialLinkText("REGISTER")).click();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Then("users validates registration page")
	public void users_validates_registration_page() {
	    //System.out.println("registration page opens");
		Assert.assertTrue(driver.getTitle().contains("Register: Mercury Tours"));
	}


   @When("user enter firstname as {string} in firstname field")
   public void user_enter_firstname_as_in_firstname_field(String uname) {
      driver.findElement(By.name("firstName")).sendKeys(uname);
   }
   
  @When("user enter lastname as {string} in lastname field")
  public void user_enter_lastname_as_in_lastname_field(String lname) {
   driver.findElement(By.name("lastName")).sendKeys(lname);
  }
  @When("user enters pssword as {string} in password field")
  public void user_enters_pssword_as_in_password_field(String pwd) {
     driver.findElement(By.name("password")).sendKeys(pwd);
  }
  @When("user enters confirm password as {string} in confirm password field")
  public void user_enters_confirm_password_as_in_confirm_password_field(String cpwd) {
      driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
  }

	@When("user click on register button")
	public void user_click_on_register_button() {
	    //System.out.println("Registration");
		driver.findElement(By.name("register")).click();
	}

	@Then("user validates registration success")
	public void user_validates_registration_success() {
	    //System.out.println("registration completed");
		Assert.assertTrue(driver.getTitle().contains("Register: Mercury Tours"));
	    //driver.close();
	}

}
