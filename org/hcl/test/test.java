package org.hcl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement txt = driver.findElement(By.xpath("//span[contains(text(),'Create an account')]"));
String x = txt.getText();
System.out.println(x);
WebElement usr = driver.findElement(By.id("email"));
usr.sendKeys("prembtech");	
WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys("54321");
String r = pass.getAttribute("value");
System.out.println(r);
//p
//cont.click();

}
}
