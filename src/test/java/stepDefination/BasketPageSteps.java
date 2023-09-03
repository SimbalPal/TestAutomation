package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.BasketPage;

public class BasketPageSteps {
	
	
	
BasketPage Basket=new BasketPage();

	@When("user add a product in cart")
	public void user_add_a_product_in_cart() {
	   Basket.Addtocart();
	}
	@Then("validate cart count is {string}")
	public void validate_cart_count_is(String count) {
	    Basket.validatecartcount(count);
	}
	
	
	
	
	
	
}
