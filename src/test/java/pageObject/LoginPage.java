package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {

	public void userenterusernameandpassword(String use, String pass) {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(use);

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		password.sendKeys(pass);
	}

	public void clickonLoginbutton() {

		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));

		loginbutton.click();
	}

	public boolean validatesuccessfullLogin() {

		return driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();

	}
  public boolean validateerrormessage() {
	return  driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();
  }
}
