package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_5 {
	public WebDriver sasi;
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement Checkout_5;
	public Checkout_5(WebDriver sasi2) {
		this.sasi=sasi2;
		PageFactory.initElements(sasi, this);
	}
	public WebElement getCheckout_5() {
		return Checkout_5;
	}
	
	
	
	
	

}
