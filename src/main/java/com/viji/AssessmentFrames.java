package com.viji;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssessmentFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
//		Scroll down the page and click the Nested Frames[ Scrolling down can be done using ACTIONS]
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.linkText("Nested Frames"))).click().build().perform();
//		a.moveToElement(driver.findElement(By.xpath("(//div /ul /li)[34]"))).click().build().perform();
//		Getting the windows inorder to move to the next window
//		Set<String> windowsHandler =driver.getWindowHandles();
////		Gets the ID of the windows
//		Iterator<String> iterator01 = windowsHandler.iterator();
//		String parentWindow = iterator01.next();
//		String childWindow = iterator01.next();
////		Switching to the next window
//		
//		driver.switchTo().window(childWindow);
		driver.findElement(By.linkText("Nested Frames")).click();
//		Getting the webelement of the Frame to move inside the frame
//		WebElement framesTop = driver.findElement(By.cssSelector("frame[name='frame-top']"));
//		WebElement framesTop = driver.findElement(By.name("frame-top"));
//		WebElement framesMiddle = driver.findElement(By.name("frame-middle"));
//		WebElement framesMiddle = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
//		Getting the MIDDLE text from the middle frame
		
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
//		driver.switchTo().window(parentWindow);
		

	}

}
