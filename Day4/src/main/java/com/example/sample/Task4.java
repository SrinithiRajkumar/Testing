package com.example.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb" ;
    	driver.manage().window().maximize();
    	
//    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Srinithi");
    	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("sri");
    	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("082003");
    	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("nithi");
//    	JavascriptExecutor js = (JavacriptExecutor) driver ;
    	JavascriptExecutor js = (JavascriptExecutor) driver ;
    	js.executeScript("window.scrollBy(0,1000)", "") ;
    	
    	
	}

}