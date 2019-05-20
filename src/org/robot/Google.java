package org.robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Nivetha\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/webhp");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@title='Google apps']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@pid='8']")).click();
}
}
