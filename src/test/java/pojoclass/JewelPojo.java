package pojoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class JewelPojo extends BaseClass {
	public JewelPojo() {
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath="//a[@href='/jewelry']")
	private WebElement jewel;
	
	@FindBy(xpath="(//h2[@class='product-title']//a)[2]")
	private WebElement PictureofBlack;
	// add to cart button
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	private WebElement addtocart;
	@FindBy(xpath="(//*[text()='Shopping cart'])[1]")
	private WebElement shopping;
	
	@FindBy(xpath ="//input[contains (@name,'termsofservice')]")
	private WebElement termsofshopping;
	
	@FindBy(xpath = "//*[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(xpath ="//*[@id=\"billing-buttons-container\"]/input")
	private WebElement billingcontinue;
	
	@FindBy(xpath="//*[@id=\"shipping-buttons-container\"]/input")
	private WebElement shippingcontinue;
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/input")
	private WebElement groundbutton;
	
	@FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/input")
	private WebElement methodcontinue;
    
	@FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/input")
	private WebElement cash;
	
	@FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/input")
	private WebElement deliverycontinue;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
	private WebElement userfinal ;
	
	
	
	public WebElement getJewel()  {
		return jewel;
		
	}
	public WebElement getPictureofBlack()  {
		return PictureofBlack;
		
	}
	
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getShopping() {
		return shopping;
	}
	public WebElement getTermsofshopping() {
		return termsofshopping;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getBillingcontinue() {
		return billingcontinue;
	}
	public WebElement getShippingcontinue() {
		return shippingcontinue;
	}
	
	public WebElement getMethodcontinue() {
		return methodcontinue;
	}
	public WebElement getGroundbutton() {
		return groundbutton;
	}
	public WebElement getCash() {
		return cash;
	}

	public WebElement getDeliverycontinue() {
		return deliverycontinue;
				
	}
	public WebElement getUserfinal() {
		return userfinal;
		
	}
	
}

