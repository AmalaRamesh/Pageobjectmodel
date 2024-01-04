package pageobject;

import pojoclass.JewelPojo;
import pojoclass.LoginPojo;

public class PageObject {
	private static JewelPojo jewel; 
	private static LoginPojo login;

	public static LoginPojo getInstanceLoginPojo() {

		return (login == null) ? login = new LoginPojo() : login;
	}
	public static JewelPojo getinJewelPojo() {
		return (jewel == null) ? jewel=new JewelPojo():jewel;
		
	}
	
}
