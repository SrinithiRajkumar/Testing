package com.example.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Task1 
{
    public static void main( String[] args ) throws InterruptedException 
    {

    	
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	//open the url
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	//maximize the screen
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Srinithi");
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Rajkumar") ;
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("srinithi@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sri2345");
    	JavascriptExecutor js = (JavascriptExecutor) driver ;
    	Thread.sleep(5000) ;
    	js.executeScript("window.scrollBy(0,1000)", "") ;
    	driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
    	
//    	
    	//subscribe
    	
    	
    	
    
    }
}