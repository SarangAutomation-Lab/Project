package Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Filpkart {

	public static void main(String[] args) throws Exception {
		
        String driverPath= System.getProperty("user.dir")+".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		WebElement crossButtom= driver.findElement(By.cssSelector("._2KpZ6l._2doB4z"));    //._2KpZ6l._2doB4z
        crossButtom.click();
        
        WebElement searchBox =driver.findElement(By.cssSelector("._3704LK"));
        searchBox.sendKeys("iPhone mobile");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
        driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']")).click();
        
        driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("444601");
        
       // WebElement check= driver.findElement(By.cssSelector("._2P_LDn"));
      //  check.click();
        
        
        
        WebElement addTocart= driver.findElement(By.cssSelector("._2KpZ6l._2U9uOA._3v1-ww"));
        WebDriverWait wait= new WebDriverWait(driver,20);
    //    wait.until(ExpectedCondition.elementToBeClickable("._2KpZ6l._2U9uOA._3v1-ww"));
        addTocart.click();
      
	}
}
