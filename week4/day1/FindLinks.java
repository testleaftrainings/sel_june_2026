package org.testleaf.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {
    public static void main(String[] args) {
         ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         //retrieve the a tag
         List<WebElement> allLinks = driver.findElements(By.tagName("a"));
         //size
         int size = allLinks.size();
         System.out.println(size);
         //retreive any particular link
         WebElement name = allLinks.get(4);
         String text = name.getText();
         System.out.println(text);
        //Retrieve all the links
        //cretae alist
        List<String> list=new ArrayList<String>();
        for (WebElement each : allLinks) {
            String text2 = each.getText();
           // System.out.println(text2);
           list.add(text2);
        }
        Collections.sort(list);
        System.out.println(list);

        
    }

}
