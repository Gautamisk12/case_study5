package Testcases;

import cucumber.api.java.en.Given;

public class Test3 {

	@Given("user enters valid login credentials")
	public void user_enters_valid_login_credentials() {
	    System.out.println("Login");
	}

	@Given("search for the available products")
	public void search_for_the_available_products() {
		System.out.println("Searching product");
	}

	@Given("adding product to cart")
	public void adding_product_to_cart() {
		System.out.println("Add to cart");
	}

	@Given("payment process")
	public void payment_process() {
		System.out.println("Payment");
	}

	@Given("Logout from application")
	public void logout_from_application() {
		System.out.println("Logout");
	}
}
