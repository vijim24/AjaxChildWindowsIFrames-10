package com.viji;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssessmentWindow01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Multiple Windows"))).click().build().perform();
		a.moveToElement(driver.findElement(By.xpath("(//a[@target='_blank'])[1]"))).click().build().perform();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		String parentWindow = it.next();
		String childWindow =it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		
		
		
	}

}
