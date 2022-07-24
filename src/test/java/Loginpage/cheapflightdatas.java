package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class cheapflightdatas {
	WebDriver driver;
	public void Tesngcheapflight() {
		this.driver=driver;
	}
	@FindBy(id="seg0_from")
	WebElement textbox1;
	@FindBy(id="seg0_to")
	WebElement textbox2;
	@FindBy(xpath="//*[@id=\"toggle-roundtrip\"]")
	WebElement roundtripbutton;
	
	
 
  public void Login() {
	  textbox1.sendKeys("Columbus");
	  textbox2.sendKeys("Chicago");
	  roundtripbutton.click();
	  System.out.println("passed");
	  
  }
}
