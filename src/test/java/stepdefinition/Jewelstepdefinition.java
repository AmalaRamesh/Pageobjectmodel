package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.PageObject;
import pojoclass.JewelPojo;

public class Jewelstepdefinition extends JewelPojo{
	WebDriver diver;
	
	
	@Given("user have click the jewelry")
	public void user_have_click_the_jewelry() {
		buttonClick(PageObject.getinJewelPojo().getJewel());
     	}

	@Given("user have  click the BLACK & WHITE DIAMOND HEART")
	public void user_have_click_the_black_white_diamond_heart() {
		buttonClick(PageObject.getinJewelPojo().getPictureofBlack());
	}

	@Given("user have to click the addtocart button")
	public void user_have_to_click_the_addtocart_button() {
		buttonClick(PageObject.getinJewelPojo().getAddtocart());
	}

	@Then("user select  the shoppingcard button")
	public void user_select_the_shoppingcard_button() {
		buttonClick(PageObject.getinJewelPojo().getShopping());
	}

	@Then("user have click the termsofshopping")
	public void user_have_click_the_termsofshopping() {
		buttonClick(PageObject.getinJewelPojo().getTermsofshopping());
	}

	@Then("user click the checkoutbutton")
	public void user_click_the_checkoutbutton() {
		buttonClick(PageObject.getinJewelPojo().getCheckout());
	}

	@Then("user click the billingcontinue")
	public void user_click_the_billingcontinue() {
		buttonClick(PageObject.getinJewelPojo().getBillingcontinue());
	}

	@Then("user have click the shippingcontinue")
	public void user_have_click_the_shippingcontinue() {
		buttonClick(PageObject.getinJewelPojo().getShippingcontinue());
	}

	@Then("user have click the groundbutton")
	public void user_have_click_the_groundbutton() {
		buttonClick(PageObject.getinJewelPojo().getGroundbutton());
	}

	@Then("user have click the methodcontinue")
	public void user_have_click_the_methodcontinue() {
		buttonClick(PageObject.getinJewelPojo().getMethodcontinue());
	}

	@Then("user have click thecash")
	public void user_have_click_thecash() {
		buttonClick(PageObject.getinJewelPojo().getCash());
	}

	@Then("user have click the deliverycontinue")
	public void user_have_click_the_deliverycontinue() {
		buttonClick(PageObject.getinJewelPojo().getDeliverycontinue());
	}

	@Then("user have click theuserfinal")
	public void user_have_click_theuserfinal()  {
		buttonClick(PageObject.getinJewelPojo().getUserfinal());
		driver.quit();
		}
	
}
