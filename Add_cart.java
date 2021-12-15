package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_cart {
	public WebDriver sasi;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button")
	private WebElement addtocart;
	public Add_cart(WebDriver sasi2) {
this.sasi=sasi2;
PageFactory.initElements(sasi, this);


	

	
	
	
 
}
	public WebElement getAddtocart() {
		return addtocart;
	}

}
