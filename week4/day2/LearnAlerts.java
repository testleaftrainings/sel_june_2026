package org.testleaf.week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
    public static void main(String[] args) {
        /**
         * No Alert present Exception
         * unhandled alert exception
         */
         ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         //click show
         driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
         //handle the alert
         Alert alert = driver.switchTo().alert();
         System.out.println(alert.getText());
         alert.accept();
         //result after handling the alert
         String text = driver.findElement(By.id("simple_result")).getText();
        System.out.println(text);
        //ConfirmationAlert
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        //handle alert

        //Alert alert2 = driver.switchTo().alert();
        //alert2.dismiss();
        alert.dismiss();
        //promptAlert
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        alert.sendKeys("Saranya");
        alert.accept();
        //sweetAlerts
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
         //alert handling
         driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
         
    }

}
