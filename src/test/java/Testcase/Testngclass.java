package Testcase;

import org.testng.annotations.Test;

import Loginpage.cheapflightdatas;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Testngclass {
	WebDriver driver;
	cheapflightdatas datas;
  @Test
  public void ValidInput() {
	  datas=PageFactory.initElements(driver,cheapflightdatas.class);
	  datas.Login();
	  
  }
  @BeforeMethod
  public void BeforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.justfly.com/");
	  driver.manage().window().maximize();
	  
  }
  @AfterMethod
  public void Aftermethod() {
	  driver.close();
  }
}
