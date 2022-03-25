package com.mindtree.assessment;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {

	public static void main(String[] args) throws InterruptedException {
<<<<<<< HEAD
		
		//driver setup
		System.setProperty("webdriver.chrome.driver", "C:\\Sel_Drivers\\chromedriver.exe");
=======
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sel_Drivers\\\\chromedriver.exe");
>>>>>>> 9fd6377f46c51fb70323b4b8b20fed069c56176d
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.nobroker.in/");
	    WebElement dropdown=driver.findElement(By.xpath("//div[contains(@class,'_value-container--has-value')]"));
	    dropdown.click();
	   
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //Getting dropdown list items
	    List<WebElement> items= driver.findElements(By.xpath("//div[@class='css-q4imyt nb-select__menu-list']//div[@class='css-mdf5j6-option nb-select__option']"));
	    for(WebElement it : items) {
	    	if("Bangalore".equals(it.getText())) {
	    		it.click();
	    		break;
	    	}
	    }
	    
	    //Entering city name
	    driver.findElement(By.id("listPageSearchLocality")).click();
	    driver.findElement(By.id("listPageSearchLocality")).sendKeys("mallesh");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //Selecting item from dropdown suggested by city
	    List<WebElement> suggest_item= driver.findElements(By.xpath("//div[@class='suggestion-item']"));
	    for(WebElement suggest : suggest_item) {
	    	if(suggest.getText().contains("malleshwaram"));
	    	{
	    		suggest.click();
	    		break;
	    	}
	    }
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //Search button click
	    driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
	    
	    //Quit
	    driver.quit();
	}

}
