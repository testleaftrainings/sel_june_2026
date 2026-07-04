package org.testleaf.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLocators {
    /*
    steps to locate webelement:
    1)inspect the particular field and locate the elemnt with the locators
    2)use findelement()--->to locate it
    3)sendKeys()--->passing the input
    4)click()-->clickable actions

     */

    public static void main(String[] args){

        //EdgeDriver driver=new EdgeDriver();
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
         driver.manage().window().maximize();
         //locate username
         driver.findElement(By.id("username")).sendKeys("democsr2");
         //locate password
         driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
         //click login
         driver.findElement(By.className("decorativeSubmit")).click();
         //click crm/sfa
         driver.findElement(By.partialLinkText("CRM")).click();

    }

}
