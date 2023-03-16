package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        List<WebElement> footer = driver.findElements(By.xpath("//a[@class=\"nav_a\""));
        WebElement element = driver.findElement(By.xpath("//div[@class=\"navFooterVerticalColumn"));
        System.out.println(element.getText());

        for(WebElement a : footer){
            System.out.println(a.getText());
        }

        for(int i = 0; i < footer.size(); i++){
            System.out.println(footer.get(i).getText());
        }

    }
}
