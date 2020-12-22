package com.selBasics;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://automationpractice.com/index.php");
		chromeDriver.findElement(By.linkText("Sign in")).click();
		Random rand1 = new Random();
		int num = rand1.nextInt(1000);
		String email = "abcd"+num+"@gmail.com";
		chromeDriver.findElement(By.id("email_create")).sendKeys(email);
		chromeDriver.findElement(By.id("SubmitCreate")).click();
		//chromeDriver.findElement(By.id("id_gender1")).click();
		WebElement radio1 = chromeDriver.findElement(By.id("id_gender1"));
		radio1.click();
		chromeDriver.findElement(By.id("customer_firstname")).sendKeys("Amit");
		chromeDriver.findElement(By.id("customer_lastname")).sendKeys("Yadav");
		chromeDriver.findElement(By.id("passwd")).sendKeys("123456abc");
		WebElement day = chromeDriver.findElement(By.id("days"));
		WebElement month = chromeDriver.findElement(By.id("months"));
		WebElement year = chromeDriver.findElement(By.id("years"));
		Select selDay = new Select(day);
		selDay.selectByValue("1");
		Select selMonth = new Select(month);
		selMonth.selectByValue("Septembar");
		Select selYear = new Select(year);
		selYear.selectByValue("1991");
		chromeDriver.findElement(By.id("newsletter")).click();
		chromeDriver.findElement(By.id("optin")).click();
		chromeDriver.findElement(By.id("company")).sendKeys("HDFC Bank");
		chromeDriver.findElement(By.id("address1")).sendKeys("Mumbai Kanjurmarg");
		chromeDriver.findElement(By.id("city")).sendKeys("Mumbai");
		WebElement state = chromeDriver.findElement(By.id("uniform-id_state"));
		Select selState = new Select(state);
		selState.selectByIndex(3);
		chromeDriver.findElement(By.id("postcode")).sendKeys("421306");
		WebElement country = chromeDriver.findElement(By.id("id_country"));
		Select selCountry = new Select(country);
		selCountry.selectByIndex(1);
		chromeDriver.findElement(By.id("other")).sendKeys("421306 other information");
		chromeDriver.findElement(By.id("phone")).sendKeys("022 3075 1771");
		chromeDriver.findElement(By.id("phone_mobile")).sendKeys("9022469317");
		chromeDriver.findElement(By.id("alias")).sendKeys("No address");
		chromeDriver.findElement(By.id("submitAccount")).click();
	}

}
