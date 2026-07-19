package org.testleaf.week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
    /**
     * No suchElement exception:
     * -when proper wait statements are not given
     * -locator is wrong
     * -element is present inside the frame
     */
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         //handle the frame
         driver.switchTo().frame(0);//index starts from 0
         //click the elemnt
         driver.findElement(By.id("Click")).click();

    }

}
