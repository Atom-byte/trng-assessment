package com.mindtree.assessment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Printing alert text
		String alert = driver.findElement(By.xpath("//div[@id='alertMessageBox']")).getText();
		System.out.println(alert);
		
		//Quit
	    driver.quit();
	}
}