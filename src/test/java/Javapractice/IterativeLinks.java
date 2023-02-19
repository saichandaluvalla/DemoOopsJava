package Javapractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IterativeLinks {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver;      
		System.setProperty("webdriver.chrome.driver", "C:/Testing/Automation/OopsJava.Practice/Drivers/chromedriver.exe");
		driver=new ChromeDriver(); 
		
		 
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		//driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]")).click(); 
		 
		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElements(By.tagName("a")); 
		//System.out.println("Total links in a webpage is : " +links.size());
		
		Thread.sleep(3000);

		  //Iterative the links 
		for (WebElement link : links) {
			Thread.sleep(2000);  

			link.click(); 
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			Thread.sleep(2000); 
		}
	}

}
