package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CheckoutErrorPage extends Base {

	public void errormessagedisplayed() {
		WebElement Errormessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		Errormessage.click();
	}

	public void errormessagetext(String message) {

		WebElement Message = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));

		String messageText = Message.getText();
		Assert.assertEquals(messageText, message);

	}

	public void cancelButtonOnChecoutpage() {
		WebElement CancelButton = driver
				.findElement(By.xpath("(//button[@class='btn btn_secondary back btn_medium cart_cancel_link'])"));

		CancelButton.click();
	}

	public boolean validatecartpage() {
		return driver.findElement(By.xpath("(//span[@class='title'])")).isDisplayed();
	}

	public void menuoption() {
		WebElement menu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menu.click();
	}

	public void logoutbutton() {
		WebElement Logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		Logout.click();
	}

	public boolean validateloginpage() {
		return driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
	}

	public void removeproduct() {
		WebElement Removebutton = driver
				.findElement(By.xpath("(//button[@class='btn btn_secondary btn_small cart_button'])"));
		Removebutton.click();
	}

   public void displayerrormessage(String message1,  String message2, String message3) {
	WebElement  messagetext= driver.findElement(By.xpath("//h3[@data-test='error']"));
	String Message=       messagetext.getText();
	Assert.assertEquals(Message, message1);
   }
}
