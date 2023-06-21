package com.viji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPractise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
//		Getting the count of Frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		Making selenium understand about the Frame
		WebElement frameOne = driver.findElement(By.className("demo-frame"));
//      Switching to the Frames
		driver.switchTo().frame(frameOne);
//		Drag me to the Target Frame
		WebElement sourceFrame = driver.findElement(By.id("draggable"));
//		Droppable Frame
		WebElement targetFrame = driver.findElement(By.id("droppable"));
//		Dragging and Dropping operation performed through the action class
		Actions a = new Actions(driver);
		a.dragAndDrop(sourceFrame, targetFrame).build().perform();
//		Switching from the frame to the web pages contents
		driver.switchTo().defaultContent();
		
	}

}
