package Javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingMovingElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:/Testing\\Automation/OopsJava.Practice/Drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		
		
		driver.get("https://wondros.com/");
		
		Thread.sleep(5000);  
		
		
		// Assume "driver" is your Selenium WebDriver instance
  WebElement moving_element = driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/div[1]/div[10]/span[1]/span[1]"));
  
    if( moving_element.isDisplayed()) {
    	System.out.println("Checkbox is displayed");
    } else {
    	System.out.println("Checkbox is not displayed");
    } 
      
      
        //ExplicityWait for the click on the Webelement
    
    
    
	// Move the mouse to the element using ActionChains 
	Actions  action = new Actions(driver); 
  action.moveToElement(moving_element).click().build().perform();  
		
		System.out.println("Output is done ");  
  		
		
	}

	

}
