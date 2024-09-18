package com.Pom;
import com.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage extends BaseClass {
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@type='text']")
	WebElement emailaddress;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//input[@type='password']")
	WebElement loginbutton;
	
	public void inputemail(String email) {
		emailaddress.sendKeys(email);
	}
	public void inputpassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickloginbtn() {
		 loginbutton.click();
	}

}
