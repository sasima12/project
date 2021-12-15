package Org.Apache.maven.archetypes.Maven.Archetype.Quickstart;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Com.pom.Add_cart;
import Com.pom.Checkout_1;
import Com.pom.Checkout_2;
import Com.pom.Checkout_3;
import Com.pom.Checkout_5;
import Com.pom.Checkout_6;
import Com.pom.Frame;
import Com.pom.Home_page;
import Com.pom.Login_page;
import Com.pom.T_shirt;
import Com.pom.Tshirt_img;
import Com.pom.proceed_ck;

public class Runner_cls extends Base_class {
public static WebDriver sasi=getBrowser("chrome");
public static Home_page hp=new Home_page(sasi);
public static Login_page lp=new Login_page(sasi);
public static T_shirt ts=new T_shirt(sasi);
public static Tshirt_img Tm=new Tshirt_img(sasi);
public static Frame f=new Frame(sasi);
public static Add_cart ac=new Add_cart(sasi);
public static proceed_ck pc=new proceed_ck(sasi);
public static Checkout_1 pc1=new Checkout_1(sasi);
public static Checkout_2 pc2=new Checkout_2(sasi);
public static Checkout_3 pc3=new Checkout_3(sasi);
public static Checkout_5 pc5=new Checkout_5(sasi);
public static Checkout_6 pc6=new Checkout_6(sasi);

static public void main(String[] args) throws InterruptedException, IOException {
		get("http://automationpractice.com/");
		clickOnElement(hp.getSignin_bt());
		inputValues(lp.getEmail(),"sweetysasi2100@gmail.com");
		inputValues(lp.getPassword(),"sasi@123");
		clickOnElement(lp.getLogin());
		clickOnElement(ts.getTshirt());
		clickOnElement(Tm.getTshirt_img());
		Thread.sleep(3000);
	    sasi.switchTo().frame(f.getSwitchto());
	    Thread.sleep(3000);
	    clickOnElement(ac.getAddtocart());
	    sasi.switchTo().defaultContent();
	    Thread.sleep(5000);
        clickOnElement(pc.getProceed_ck());
		clickOnElement(pc1.getCheckout_1()); 
		JavascriptExecutor js =(JavascriptExecutor) sasi;
		js.executeScript("window.scrollBy(0,850);");
		clickOnElement(pc2.getCheckout_2());
		clickOnElement(pc3.getCheckout_3());
		Thread.sleep(3000);
		clickOnElement(pc3.getCheckout_11());
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,550);");
		clickOnElement(pc5.getCheckout_5());
		js.executeScript("window.scrollBy(0,850);");
		Thread.sleep(3000);
		clickOnElement(pc6.getCheckout_6());
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350);");
		TakesScreenshot ts=(TakesScreenshot) sasi;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\NEW\\eclipse-workspace\\selenium_purple\\screenshort\\pic3.png");
		FileUtils.copyFile(source, destination);
		}
		
	}
		
	
		
	
		
	
		
	
		
	
		
	
	

	
		

		
		
		
		
		
		
		
		
		
		
        
        
        
        
	   
	   
	    
	    
        
        
        
        
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		

