package Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facegenie_ams_school {

	public static void main(String[] args) {
		String driverPath= System.getProperty("user.dir")+".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://facegenie-ams-school.web.app/");
		
		
		WebElement emailaddress =driver.findElement(By.id("email"));
		     System.out.println("\nEmailaddress input field visibility status is :"+ emailaddress.isDisplayed());
		     System.out.println("Emailaddress input field editable status is :"+ emailaddress.isEnabled());
		
		emailaddress.sendKeys("testbams@gmail.com");
		
		
		WebElement passwordInput =driver.findElement(By.id("password"));
		passwordInput.sendKeys("facegenie");
		     System.out.println("\npassword input field visibilty status is :"+passwordInput.isDisplayed());
		     System.out.println("password input field editable status is :"+passwordInput.isEnabled()); 
		   
		
		
		WebElement logIn =driver.findElement(By.cssSelector("button[Type='submit']"));
		logIn.click();  
		     System.out.println("\nlogInButton input field visibility status is :"+logIn.isDisplayed());
		     System.out.println("logInButton input field Enabled status is :"+logIn.isEnabled());
		     
		   
		WebElement LogOut =driver.findElement(By.xpath("//nav[@class='MuiList-root MuiList-padding css-1ontqvh']/div[8]"));
		JavascriptExecutor executer= (JavascriptExecutor)driver;
		executer.executeScript("arguments[0].click();",LogOut);
		     
		
		WebElement OkButton = driver.findElement(By.xpath("(//button[@type='button'])[38]"));
		JavascriptExecutor executer1= (JavascriptExecutor)driver;
		executer1.executeScript("arguments[0].click();",OkButton);
		    
	} 

}
