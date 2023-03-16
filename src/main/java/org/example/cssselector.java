package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        //driver.findElement(By.id("nav_cs_customerservice")).click();
        driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_custo merservice']")).click();
    }
}
