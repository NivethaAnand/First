package org.robot;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws  InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Nivetha\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Apple iPhone XR (64GB) - (PRODUCT)RED [works exclusively with Simple Mobile]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=' a-button-close a-declarative']")).click();
		driver.findElement(By.xpath("(//a[@class='a-button-text'])[1]")).click();
		
		}
}

