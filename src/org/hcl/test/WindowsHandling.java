package org.hcl.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement cls = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		cls.click();
		WebElement srch = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		srch.sendKeys("real me c2");
		WebElement srclk = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		srclk.click();
		WebElement slct = driver.findElement(By.xpath("//div[text()='Realme C2 (Diamond Black, 16 GB)']"));
		slct.click();
		//parent window
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//all window
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		//find child window
		for (String v : all) {
			if(!parent.equals(all))
			{
				driver.switchTo().window(v);
			}
		}
		Thread.sleep(2000);	
		WebElement not = driver.findElement(By.xpath("//button[text()='NOTIFY ME']"));
		not.click();
	}

}

