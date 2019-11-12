package Testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case_study1 {
	WebDriver driver;

@Given("user open TestMe application")
public void user_open_TestMe_application() {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438DIRNP6_TRNG\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://localhost:8083/TestMeApp");
   driver.manage().window().maximize();
}

@Then("Click on signup button")
public void click_on_signup_button() {
    driver.findElement(By.linkText("SignUp")).click();
}

@Then("user  validates registration page")
public void user_validates_registration_page() {
	Assert.assertTrue(driver.getTitle().contains("Sign Up"));
}

@When("user enters username")
public void user_enters_username() {
   driver.findElement(By.name("userName")).sendKeys("Ruchitaa");
}

@Then("user enters firstname")
public void user_enters_firstname() {
	driver.findElement(By.name("firstName")).sendKeys("gautami");
}

@Then("user enters lastname")
public void user_enters_lastname() {
   driver.findElement(By.name("lastName")).sendKeys("keskar");
}

@Then("user enters password")
public void user_enters_password() {
   driver.findElement(By.name("password")).sendKeys("123456");
}

@Then("user enters confirm password")
public void user_enters_confirm_password() {
   driver.findElement(By.name("confirmPassword")).sendKeys("123456");
}

@Then("user clicks on gender")
public void user_clicks_on_gender() {
   driver.findElement(By.xpath("//input[@value='Female']")).click();
}

@Then("user enters email address")
public void user_enters_email_address() {
   driver.findElement(By.name("emailAddress")).sendKeys("abc@gamil.com");
}

@Then("user enters mobile number")
public void user_enters_mobile_number() {
   driver.findElement(By.name("mobileNumber")).sendKeys("9876543265");
}

@Then("user enters DOB")
public void user_enters_DOB() {
    driver.findElement(By.name("dob")).sendKeys("12/09/1997");
}

@Then("user enters Address")
public void user_enters_Address() {
    driver.findElement(By.name("address")).sendKeys("Pune India");
}

@Then("user selects security question")
public void user_selects_security_question() {
   driver.findElement(By.xpath("//option[@value='411011']"));
}

@Then("user enters the answer of security quesion")
public void user_enters_the_answer_of_security_quesion() {
    driver.findElement(By.name("answer")).sendKeys("Black");
}

@Then("user click on registration button")
public void user_click_on_registration_button() {
   driver.findElement(By.name("Submit")).click();
}

@Then("user registration success")
public void user_registration_success() {
   Assert.assertTrue(driver.getTitle().contains("Login"));
   driver.close();
}

}
