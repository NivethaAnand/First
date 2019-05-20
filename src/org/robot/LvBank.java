package org.robot;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvBank {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Nivetha\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		driver.findElement(By.xpath("//input[@id='fldLoginUserId']")).sendKeys("nivetha");
		driver.findElement(By.xpath("//input[@id='fldPassword']")).sendKeys("hst");
		driver.findElement(By.xpath("(//input[@name='imageField'])[1]")).click();
		String pwind = driver.getWindowHandle();
		System.out.println(pwind);
		Set<String> allwind = driver.getWindowHandles();
		System.out.println(allwind);
		for (String cwind : allwind) {
			if (!(pwind.equals(cwind))) {
				driver.switchTo().window(cwind);
				driver.findElement(By.xpath("//a[@onclick='CloseAll()']")).click();
			}
		}
	}
}
