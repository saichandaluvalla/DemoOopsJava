package Javapractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collections {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; 

		System.setProperty("webdriver.chrome.driver", "C:/Testing/Automation/OopsJava.Practice/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		  
		
		driver.get("https://testproject.io/");
		
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		//links in a webpage using Collections
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total links in a webpage is : " +links.size());  
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		//Print out all the linktext  using collections
		 
//		for(WebElement linkcheck:links) 
//		{
//			System.out.println(linkcheck.getText());
//		}
		
		 
		 //Print out all the linktexts using Lambda expression 
		 
			/*
			 * links.forEach(link->System.out.println(link.getText()));
			 * 
			 * Thread.sleep(5000);
			 * 
			 * //Count howmany working links in a webpage using **Stream filter*** long
			 * workinglinks=links.stream().filter(link->link.getAttribute("href")!=null).
			 * count(); System.out.println("Working links (href links) : " +workinglinks);
			 * 
			 * 
			 * //Count howmany nonworking links in a webpage long
			 * Nonworkinglinks=links.stream().filter(link->link.getAttribute("href")==null).
			 * count(); System.out.println("NonWorking links (Not href links) : "
			 * +Nonworkinglinks);
			 * 
			 */
		Thread.sleep(5000);  
		
		
		//Print out broken links
		
		for (WebElement link:links) {
			String href=link.getAttribute("href");
			
			try {
				URL url=new URL(href);
				HttpURLConnection connection=(HttpURLConnection) url.openConnection(); 
				connection.connect(); 
				
				int responsecode=connection.getResponseCode();  
				
				if(responsecode !=200) {   
					System.out.println("Broken Link : " +href+ "-ResponseCode : " +responsecode);
				}}
				catch(Exception e) {
					System.out.println("Error found : " +e.getMessage());
				}
			}
		
		
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	  
	  try {   
	 WebElement linkedIn= driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	if( linkedIn.isEnabled()) {
		linkedIn.click();  
		System.out.println("LinkedIN link is clickable");
	}
	  }
	
	   
	  catch (Exception e){
		  System.out.println("Error found ==== " +e.getMessage());
		  
	  }
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit(); 
	}

}
