package com.viji;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractise01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
//		 move to the Accounts and List
		a.moveToElement(move).build().perform();

//		 Enter element in the search text box in capital letter
		WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("toys").doubleClick().build().perform();

	}

}
