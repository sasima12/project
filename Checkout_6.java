package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_6 {
	public WebDriver sasi;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement Checkout_6;
	public Checkout_6(WebDriver sasi2) {
		this.sasi=sasi2;
		PageFactory.initElements(sasi, this);
		
	}
	public WebElement getCheckout_6() {
		return Checkout_6;
	}
	

}
