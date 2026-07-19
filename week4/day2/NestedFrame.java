package org.testleaf.week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         //handle the outerframe
         WebElement outerFrame = driver.findElement(By.xpath("//h5[contains (text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
         driver.switchTo().frame(outerFrame);
         //inner frame
        // driver.switchTo().frame(1);//no such frame exception
         driver.switchTo().frame("frame2");
         //click
         driver.findElement(By.id("Click")).click();
         driver.switchTo().defaultContent();//come out  of all the frames and switch to the main page
         driver.switchTo().parentFrame();//switch back to the imediate parent frame
    }

}
