package com.mindtree.assessment;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoBrokerEmail {

	public static void main(String[] args) throws InterruptedException {
<<<<<<< HEAD
		//driver setup
=======
		// TODO Auto-generated method stub
>>>>>>> 9fd6377f46c51fb70323b4b8b20fed069c56176d
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sel_Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nobroker.in/");
		driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]/div")).click();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
<<<<<<< HEAD
		
		String number = "9110813270";
		String password = "Adam123";
		//sending phone number
		driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys(number);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//sending password
=======
		driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("9110813270");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
>>>>>>> 9fd6377f46c51fb70323b4b8b20fed069c56176d
		driver.findElement(By.xpath("//input[@value='password']")).click();
		driver.findElement(By.id("login-signup-form__password-input")).sendKeys(password);
		driver.findElement(By.id("login-signup-form__password-input")).sendKeys(Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[3]/div[1]/div/span")).click();
		
		//Choosing Main Menu
		Actions a = new Actions(driver);
		By hover =(By.xpath("//span[@class='nb__3-MNF']"));
		a.moveToElement(driver.findElement(hover)).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//Choosing Profile
		Actions b = new Actions(driver);
		By profile = (By.xpath("//div[@class='nb__qiCij'] //a[@class='nb__3Tx_U']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(profile));
		b.moveToElement(driver.findElement(profile)).click().build().perform();
		
		//Giving email and entering
		String adam = "bytea06@gmail.com";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.cssSelector("span[class='nb__wUGea']")).click();
		driver.findElement(By.id("emailText")).clear();
		
		driver.findElement(By.id("emailText")).sendKeys(adam);
		
		driver.findElement(By.cssSelector("span[class='nb__wUGea']")).click();
		
		//Printing alert text
		try {
		String alert = driver.findElement(By.xpath("//div[@id='alertMessageBox']")).getText();
		System.out.println(alert);
		} catch(org.openqa.selenium.StaleElementReferenceException e){
			
		} 
		
		//Quit
	    driver.quit();
	}

}