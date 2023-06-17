package com.selenium.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_1 {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement des=driver.findElement(By.id("droppable"));
		Actions ac=new Actions(driver);
		ac.clickAndHold(src).release(des).build().perform();
		Thread.sleep(5000);
	}

}
