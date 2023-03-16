package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://apple.com");
        driver.findElement(By.xpath("//span[@class='globalnav-link-text-container']")).click();
        driver.findElement(By.xpath("//a[@href='/shop/buy-iphone']")).click();




    }
}
