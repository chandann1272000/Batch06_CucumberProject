package StepDefinations;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginSteps {

	@Given("Navigate to Facebook login page")
	public void navigate_to_facebook_login_page() {
		System.out.println();
	}

	@When("Enter Username and Password {string},{string}")
	public void enter_username_and_password(String Username, String Password) {
		System.out.println(Username);
		System.out.println(Password);

	}
	@When ("Enter username and password {string},{string}")
	public void enter_Details(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}

	@Then("Validate the login Function")
	public void validate_the_login_function() {
		System.out.println("Passed");
	}
	
	

	@When("Enter username and password")
	public void enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   for(Map<String , String> testdata : dataTable.asMaps()) {
		   System.out.println("Username " +testdata.get("Username"));
		   System.out.println("Password " +testdata.get("Password"));
	   }
	}

}
