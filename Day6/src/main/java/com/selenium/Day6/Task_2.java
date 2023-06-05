package com.selenium.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_2 {
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver() ;
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Srinithi");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Rajkumar");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("sri@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("082003");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("8/11/2003");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian") ;
		driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]")).sendKeys("060922");
		driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("8838859927");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]")).sendKeys("12.10.23");
		driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("402,2");
		driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("Manager") ;
		driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665628131_Vegetarian\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"select_1665628361\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
	}

}