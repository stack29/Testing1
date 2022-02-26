package com.AW.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.AW.Utils.WebDriverUtils;


public class HomePage  {
	
	public WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Sign up']")
	WebElement button_signUp;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up']"));
	
	

	public void clickSignup()
	{
		WebDriverUtils.func_click(button_signUp);
	}
	
}
