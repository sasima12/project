package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed_ck {
	public WebDriver sasi;

	@FindBy(xpath="(//i[@class = 'icon-chevron-right right'])[2]")
	private WebElement proceed_ck;
	public proceed_ck(WebDriver sasi2) {
		this.sasi= sasi2;
		PageFactory.initElements(sasi, this);
	}
	public WebElement getProceed_ck() {
		return proceed_ck;
	}
	
	}
	
 

