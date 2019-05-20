package org.robot;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FlipCart {
	public static void main(String[] args) throws AWTException, InterruptedException   {

		System.setProperty("webdriver.chrome.driver", "D:\\Nivetha\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Black, 64 GB)']//parent::div[@class='col col-7-12']")).click();

		String pwind = driver.getWindowHandle();
		System.out.println(pwind);
		Set<String> allwind = driver.getWindowHandles();
		for (String cwind : allwind) {
			if(!(pwind.equals(cwind)))
			{
				System.out.println(cwind);
			
				Thread.sleep(3000);
				driver.switchTo().window(cwind);
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				Thread.sleep(3000);
				driver.switchTo().window(cwind);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_P);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_P);
				
			}
			
		}
	
			}
		

	}

