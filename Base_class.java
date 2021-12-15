package Org.Apache.maven.archetypes.Maven.Archetype.Quickstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	public static WebDriver sasi;
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\sasi\\chromedriver.exe");
			 sasi =new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\sasi\\gecko.exe");
			 sasi  =new FirefoxDriver();	 
		}
		sasi.manage().window().maximize();
		return sasi;	
	}
	public static void get(String url) {
		sasi.get(url);		
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void inputValues(WebElement element,String value) {
		element.sendKeys(value);
	}
	}
	


    
	
	
	
	
	
	
	


