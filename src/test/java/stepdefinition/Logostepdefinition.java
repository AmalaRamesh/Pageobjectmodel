package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageObject;
import pojoclass.LoginPojo;
//import baseclass.BaseClass;


public class Logostepdefinition extends LoginPojo{

	@Given("user should be in login page {string}")
	public void user_should_be_in_login_page(String string) {
		lanchBrowser();
		url(string);
	}
	@When("user click login option")
	public void user_click_login_option() {
		buttonClick(PageObject.getInstanceLoginPojo().getLoginButton());
	}
	@When("user have to enter username {string}")
	public void user_have_to_enter_username(String string) {
		fillTheTextBox(PageObject.getInstanceLoginPojo().getUserName(), string);
	}
	@And("user have to enter password {string}")
	public void user_have_to_enter_password(String string) {
		fillTheTextBox(PageObject.getInstanceLoginPojo().getPassWord(), string);
	}
	@When("user click login submit button")
	public void user_click_login_submit_button() {
		buttonClick(PageObject.getInstanceLoginPojo().getLogin());
	}
	@Then("user should be in home page {string}")
	public void user_should_be_in_home_page(String string) {
		PageObject.getInstanceLoginPojo().getLogOutButton().isDisplayed();
	}
}
