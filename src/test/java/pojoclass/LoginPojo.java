package pojoclass;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseclass.BaseClass;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	 // login option
	@FindBy(className = "ico-login")
	private WebElement loginButton;
	
	// username field
	@FindBy(id = "Email")
	private WebElement userName;
	
	// password field
	@FindBy(xpath ="//*[@id='Password']")
	private WebElement passWord;
	
	// login submit button
	@FindBy(xpath ="//*[@class='button-1 login-button']")
	private WebElement login;

	
	// logout button
	@FindBy(xpath="//*[text()='Log out']")
	private WebElement logOutButton;	
	
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getLogOutButton() {
		return logOutButton;
	}
	
	

}
