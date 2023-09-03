package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pageObject.CheckoutErrorPage;

public class CheckoutErrorSteps {

	CheckoutErrorPage checkouterror = new CheckoutErrorPage();

	@Then("validate error messsage displayed")
	public void validate_error_messsage_displayed() {
		checkouterror.errormessagedisplayed();
	}

	@Then("validate error messsage displayed {string}")
	public void validate_error_messsage_displayed(String string) {
		checkouterror.errormessagedisplayed();
	}

	@Then("user click on Cancel button")
	public void user_click_on_cancel_button() {
		checkouterror.cancelButtonOnChecoutpage();

	}

	@Then("validate cart page open")
	public void validate_cart_page_open() {
		Assert.assertTrue(checkouterror.validatecartpage());

	}

	@Then("click on three line menu button")
	public void click_on_three_line_menu_button() {
		checkouterror.menuoption();

	}

	@Then("click on logout button")
	public void click_on_logout_button() {
		checkouterror.logoutbutton();
	}

	@Then("validate user successfully logout")
	public void validate_user_successfully_logout() {
		Assert.assertTrue(checkouterror.validateloginpage());

	}

	@Then("remove product in cart page")
	public void remove_product_in_cart_page() {
		checkouterror.removeproduct();

	}

	


}
