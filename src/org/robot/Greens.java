package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Nivetha\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement f = driver.findElement(By.xpath("//a[@href='contact.php']"));
Actions a= new Actions(driver);

a.contextClick(f).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
	 String pwind = driver.getWindowHandle();
	 System.out.println(pwind);
	 Set<String> allwind = driver.getWindowHandles();
	 System.out.println(allwind);
	 for (String cwind : allwind) {
		if(!(pwind.equals(cwind)))
		{
			driver.switchTo().window(cwind);
			 driver.findElement(By.xpath("(//div[@class='address-block address-border'])[2]")).click();
		    r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_P);
		    r.keyRelease(KeyEvent.VK_CONTROL);
		    r.keyRelease(KeyEvent.VK_P);
		}
	}
}
}

