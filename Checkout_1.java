package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_1 {
	public Checkout_1(WebDriver sasi2) {
		this.sasi=sasi2;
		PageFactory.initElements(sasi, this);
	}
	public WebDriver sasi;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement Checkout_1;
	public WebElement getCheckout_1() {
		return Checkout_1;
	}
	
	
	
	

}
