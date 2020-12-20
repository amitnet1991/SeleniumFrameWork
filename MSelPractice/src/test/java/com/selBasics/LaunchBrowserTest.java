package com.selBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Study\\BrowserDrivers\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		//find by id
		WebElement searchTextBox = driver.findElement(By.id("search_query_top"));
		searchTextBox.sendKeys("ABCD");
		
		//findbylinktext
		//WebElement searchTextBox = driver.findElement(By.id("search_query_top"));
		//searchTextBox.sendKeys("ABCD");
		
		driver.close();
		
	}

}
