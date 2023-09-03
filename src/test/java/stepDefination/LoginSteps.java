package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginSteps {

	LoginPage login=new LoginPage();

	
	@When("user enter {string} and {string}")
	public void user_enter_and(String Username, String password) {
		
		login.userenterusernameandpassword(Username, password);
	}   
	
	


@When("click on Login Button")
public void click_on_login_button() {
login.clickonLoginbutton();
}

@Then("Validate Successfull login")
public void validate_successfull_login() {
   Assert.assertTrue( login.validatesuccessfullLogin());
}	
@Then("Validate error message")	
public void validate_error_message() {
	
	Assert.assertTrue(login.validateerrormessage());
	
}
}
