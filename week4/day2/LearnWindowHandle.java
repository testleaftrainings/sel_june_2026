package org.testleaf.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         //get the address of the currentwindow
         String parentWindow = driver.getWindowHandle();
         System.out.println(parentWindow);//A0036DC58BC25F5DF021B6F356F30377,05181C5AA81EE4101DA16531B09778CE
         System.out.println(driver.getTitle());
         //click open
         driver.findElement(By.xpath("//span[text()='Open']")).click();
         //get all the windows
         Set<String> windowHandles = driver.getWindowHandles();
         //convert set into list
         List <String> listWindow=new ArrayList<String>(windowHandles);
         //navigate to childwindow
         driver.switchTo().window(listWindow.get(1));
         //retreive the address of the current window
         String childWindow = driver.getWindowHandle();
         System.out.println(childWindow);
          System.out.println(driver.getTitle());
          driver.close();//close the current window which is in open
         // driver.switchTo().window(listWindow.get(1));//NoSuchWindowException
         driver.quit();//close all the windows
    }

}
