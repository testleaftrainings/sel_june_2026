package org.testleaf.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        //LaunchBrowser
        ChromeDriver driver=new ChromeDriver();
        //FirefoxDriver driver1=new FirefoxDriver();
        //load the url
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();
        //title of the page
       String title= driver.getTitle();//ctrl+.--assigning to local variable
       System.out.println(title);
        
    }

}
