package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame {
	public WebDriver sasi;

	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement switchto;


	public Frame(WebDriver sasi2) {
		this.sasi=sasi2;
		PageFactory.initElements(sasi, this);
				
	}


	public WebElement getSwitchto() {
		return switchto;
	}
	}
	
	
	
	

	



