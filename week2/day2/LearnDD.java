package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnDD {
    public static void main(String[] args) {
        /*Steps for DD:
        1)inspect the DD whether it is present inside the select tag<select>
        2)if its is present in the select tag,locate the element nd store in a local varaiable
        3)instantiate the select class and pass the webelement as an argument
        4)select any strategy to locate the option in the DD
         */
        ChromeDriver driver=new ChromeDriver();
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
         //click leads
         driver.findElement(By.linkText("Leads")).click();
         //createLead
         driver.findElement(By.linkText("Create Lead")).click();
         //companyNmae
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
         //FirstName
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
         //Lastname
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
         //DD-->locate the element and store in the varaible
         WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
         //instantiate the select class
         Select sel=new Select(sourceDD);
         sel.selectByIndex(3);
         //marketingCampaign DD
         WebElement mcDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
         Select sel1=new Select(mcDD);
         sel1.selectByValue("CATRQ_ROADNTRACK");
         //click createLead
         driver.findElement(By.className("smallSubmit")).click();

    }

}
