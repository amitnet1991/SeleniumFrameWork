package com.selBasics;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserThroughXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\BrowserDrivers\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://automationpractice.com/index.php");
		WebElement signIn= chromeDriver.findElement(By.xpath("//a[@class='login' and @href='http://automationpractice.com/index.php?controller=my-account']"));
		signIn.click();
		Random rand1 = new Random();
		int num = rand1.nextInt(1000);
		String email = "abcd"+num+"@gmail.com";
		chromeDriver.findElement(By.xpath("//input[@type='text' and @class='is_required validate account_input form-control']")).sendKeys(email);
		chromeDriver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);
		WebElement radio1 = chromeDriver.findElement(By.id("id_gender1"));
		radio1.click();
		chromeDriver.findElement(By.xpath("//input[@class='is_required validate form-control' and id='customer_firstname']")).sendKeys("Amit");
		chromeDriver.findElement(By.xpath("//input[@class='is_required validate form-control' and id='customer_lastname']")).sendKeys("Yadav");
		chromeDriver.findElement(By.xpath("//input[@class='is_required validate form-control' and id='passwd']")).sendKeys("123456abc");
		
		WebElement day = chromeDriver.findElement(By.xpath("//select[@id='days' and name='days']"));
		WebElement month = chromeDriver.findElement(By.xpath("//select[@id='months' and name='months']"));
		WebElement year = chromeDriver.findElement(By.id("days"));		
		
		Select selDay = new Select(day);
		selDay.selectByValue("5");
		Select selMonth = new Select(month);
		selMonth.selectByValue("9");
		Select selYear = new Select(year);
		selYear.selectByValue("2002");
		
		chromeDriver.findElement(By.id("newsletter")).click();
		chromeDriver.findElement(By.id("optin")).click();
		chromeDriver.findElement(By.id("company")).sendKeys("HDFC Bank");
		chromeDriver.findElement(By.id("address1")).sendKeys("Mumbai Kanjurmarg");
		chromeDriver.findElement(By.id("city")).sendKeys("Mumbai");
		
		WebElement state = chromeDriver.findElement(By.id("id_state"));
		Select selState = new Select(state);
		selState.selectByIndex(3);
		
		chromeDriver.findElement(By.id("postcode")).sendKeys("42306");
		
		WebElement country = chromeDriver.findElement(By.id("id_country"));
		Select selCountry = new Select(country);
		selCountry.selectByIndex(1);
		
		chromeDriver.findElement(By.id("other")).sendKeys("421306 other information");
		chromeDriver.findElement(By.id("phone")).sendKeys("022 3075 1771");
		chromeDriver.findElement(By.id("phone_mobile")).sendKeys("9022469317");
		
		WebElement add = chromeDriver.findElement(By.id("alias"));
		
		add.clear();
		add.sendKeys("No address");
		
		Thread.sleep(5000);
		chromeDriver.findElement(By.id("submitAccount")).click();
	}

}
