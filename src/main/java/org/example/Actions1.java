package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Actions1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        WebElement jewelry = driver.findElement(By.xpath("//ul[@class=\"hl-cat-nav__container\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(jewelry).perform();
        actions.contextClick();

    }
}
