package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class servicesPageTest {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaservicesect.ccbp.tech/");
        WebElement title1 = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor::div/div/div[position() = 2]/div/h1"));
        String titleOfSecondSectionCard = title1.getText();
        String expectedtitleOfSecondSectionCard = "Fast and Free Delivery";
        WebElement title2 = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/preceding::div[1]/h1"));
        String titleOfFirstSectionCard = title2.getText();
        String expectedtitleOfFirstSectionCard = "100% Money back guarantee";
        if (titleOfSecondSectionCard.equals(expectedtitleOfSecondSectionCard) && titleOfFirstSectionCard.equals(expectedtitleOfFirstSectionCard)){
            System.out.println("Titles checked");
        }else {
            System.out.println("Mismatch Found in Titles");
        }
        WebElement descriptionSecondCard = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor::div/div/div[position() = 2]/div/p"));
        String currentdescriptionSecondCard = descriptionSecondCard.getText();
        String excepteddescriptionSecondCard = "Fast, free, and convenient delivery choices on millions of items.";
        WebElement descriptionFirstCard = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/preceding::div[2]/div/p"));
        String currentdescriptionFirstCard = descriptionFirstCard.getText();
        String excepteddescriptionFirstCard = "This is probably the most popular guarantee in the world.";
        if (currentdescriptionSecondCard.equals(excepteddescriptionSecondCard) && currentdescriptionFirstCard.equals(excepteddescriptionFirstCard)){
            System.out.println("Descriptions Checked");
        }else {
             System.out.println("Mismatch Found in Descriptions");
        }
        WebElement heading = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor::div/div[1]/div[1]/h1"));
        String currentHeading = heading.getText();
        String exceptedHeading = "Our Services";
        WebElement description = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor::div/div[1]/div[1]/p"));
        String currentDescription = description.getText();
        String exceptedDescription = "Most online stores offer lower prices. Online shopping makes price comparison simpler and quicker. It is very convenient to shop from where you are located. It saves you the cost of driving to stores, as well as parking fees.";
        if (currentHeading.equals(exceptedHeading) && currentDescription.equals(exceptedDescription)){
            System.out.println("Section Header Checked");
        }else {
            System.out.println("Mismatch Found in Section Header");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
