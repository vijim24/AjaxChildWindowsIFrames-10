package com.viji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingChildWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		childWindow(driver);
	}

	public static void childWindow(WebDriver driver) {
//	Click the Free Access using the ACTION

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.cssSelector(".blinkingText"))).click().build().perform();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator(); // O/P : [ ParentID , Child ID]
		String parentId = it.next(); // Will move inside the parent ID
		String childId = it.next(); // Will move inside the Child ID
		driver.switchTo().window(childId);
//	String redText=a.moveToElement(driver.findElement(By.className("im-para.red"))).doubleClick().toString();
//	System.out.println(redText);
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys();
		
		
	}
}
