package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_shirt {

	public WebDriver sasi;

	@FindBy(xpath= "(//a[@title='T-shirts'])[2]")
	private WebElement Tshirt;

	public T_shirt(WebDriver sasi2) {
	this.sasi= sasi2;
	PageFactory.initElements(sasi, this);
}
public WebElement getTshirt() {
	return Tshirt;
}

}
