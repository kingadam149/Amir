package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonFooter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        WebElement amazonDevices = driver.findElement(By.xpath(""));
        Actions actions = new Actions(driver);
        actions.moveToElement(amazonDevices).perform();
        String text = amazonDevices.getText();
        System.out.println(text);
    }
}
