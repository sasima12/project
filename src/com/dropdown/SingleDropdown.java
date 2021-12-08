package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NEW\\eclipse-workspace\\selenium_purple\\sasi\\chromedriver.exe" );
		
		WebDriver sasi=new ChromeDriver();
		sasi.manage().window().maximize();
		sasi.get("https://www.facebook.com/");
		sasi.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		sasi.findElement(By.name("firstname")).sendKeys("prasanth");
		sasi.findElement(By.name("lastname")).sendKeys("sasi");
		sasi.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("twinkle0112@");
		sasi.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("011296");
		WebElement date = sasi.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByValue("12");
		WebElement month = sasi.findElement(By.id("month"));
		Select p=new Select(month);
		p.selectByIndex(8);
		WebElement year = sasi.findElement(By.id("year"));
		Select ps=new Select(year);
		ps.selectByVisibleText("1999");
		boolean multiple = s.isMultiple();
		System.out.println("Is Multiple or not:" +multiple);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
