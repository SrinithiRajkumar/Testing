package com.selenium.p1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_3 {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru00.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement value=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		value.sendKeys("401");
		WebElement value1=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		WebElement clicksubmit = null;
		clicksubmit.click();
		
		Alert a=driver.switchTo().alert();
		a.dismiss();
		value1.clear();
		value1.sendKeys("402");
		clicksubmit.click();
		
		a.accept();
		
		Alert b=driver.switchTo().alert();
		String text=b.getText();
		b.accept();
		System.out.println(text);
		driver.quit();
	}

}
