package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CheckoutPage extends Base {

	public void clickoncartbutton() {
		WebElement cartbutton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		try {
			cartbutton.click();
		} catch (Exception e) {
javaScriptclick();
		}

	}

	private void javaScriptclick() {
		// TODO Auto-generated method stub
		
	}

	public void clickoncheckoutbutton() {
		WebElement checkoutbutton = driver
				.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
		try {
			checkoutbutton.click();
		} catch (Exception e) {

		}
	}

	public void checkoutyourinfomation(String firstname, String lastname, String zipcode) {
		WebElement Firstname = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		Firstname.sendKeys(firstname);

		WebElement Lastname = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));

		Lastname.sendKeys(lastname);
		WebElement Zipcode = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]"));
		Zipcode.sendKeys(zipcode);

	}

	public void clickonContinue() {
		WebElement Continuebutton = driver
				.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']"));
		try {
			Continuebutton.click();
		} catch (Exception e) {

		}

	}

	public void clickonFinishbutton() {
		WebElement Finishbutton = driver
				.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
		try {
			Finishbutton.click();
		} catch (Exception e) {

		}

	}

	public boolean validateordersucessmessage() {
		return driver.findElement(By.xpath("//h2[@class='complete-header']")).isDisplayed();
	}

}
