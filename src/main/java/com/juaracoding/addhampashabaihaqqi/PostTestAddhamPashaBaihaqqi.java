package com.juaracoding.addhampashabaihaqqi;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PostTestAddhamPashaBaihaqqi {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);

        int detik = 1;
        WebElement titleMenu = driver.findElement(By.xpath("/html/body/div/h1"));
        System.out.println("Title Menu: "+ titleMenu.getText());

        delay(detik);
        System.out.println("input Addham Pasha");
        driver.findElement(By.id("first-name")).sendKeys("Addham Pasha");
        delay(detik);
        System.out.println("input Baihaqqi");
        driver.findElement(By.id("last-name")).sendKeys("Baihaqqi");
        delay(detik);
        System.out.println("input SQA Batch 6");
        driver.findElement(By.id("job-title")).sendKeys("SQA Batch 6");
        delay(detik);
        driver.findElement(By.id("radio-button-2")).click();
        System.out.println("College");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        delay(detik);
        driver.findElement(By.id("checkbox-1")).click();
        System.out.println("Male");
        delay(detik);
        Select dropdown = new Select(driver.findElement(By.id("select-menu")));
        dropdown.selectByValue("1");
        System.out.println("0 - 1");
        delay(detik);
        driver.findElement(By.id("datepicker")).sendKeys("09/20/1998");
        System.out.println("09/20/1998");
        delay(detik);
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

        WebElement titleHasil = driver.findElement(By.xpath("/html/body/div/h1"));
        System.out.println("Title Hasil: "+ titleHasil.getText());

    }

    static void delay(int detik){
        // delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}