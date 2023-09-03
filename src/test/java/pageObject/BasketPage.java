package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class BasketPage extends Base {

	public void Addtocart() {
		WebElement addaproductincart = driver
				.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[1]"));
		try {
			addaproductincart.click();
		} catch (Exception e) {
    javaScriptclcik();
		}

	}

	private void javaScriptclcik() {
		// TODO Auto-generated method stub
		
	

	}

	public void validatecartcount(String count) {

		WebElement Cartcount = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));

		String cartcountText = Cartcount.getText();
		Assert.assertEquals(count, cartcountText);
	}

}
