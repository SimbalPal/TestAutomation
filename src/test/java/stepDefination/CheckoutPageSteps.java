package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pageObject.CheckoutPage;

public class CheckoutPageSteps {

	CheckoutPage checkout = new CheckoutPage();

	@Then("click on cart button")
	public void click_on_cart_button() {
		checkout.clickoncartbutton();

	}

	@Then("user click on Checkout button")
	public void user_click_on_checkout_button() {
		checkout.clickoncheckoutbutton();

	}

	@Then("user enter {string} {string} {string}")
	public void user_enter(String firstname, String lastname, String zipcode) {
		checkout.checkoutyourinfomation(firstname, lastname, zipcode);

	}

	@Then("user click on Continue button")
	public void user_click_on_continue_button() {
		checkout.clickonContinue();

	}

	@Then("user click on Finish button")
	public void user_click_on_finish_button() {
		checkout.clickonFinishbutton();

	}

	@Then("validate order success message")
	public void validate_order_success_message() {
		Assert.assertTrue(checkout.validateordersucessmessage());
	}
}
