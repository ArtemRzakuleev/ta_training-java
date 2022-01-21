package com.epam.training.student_artem_rzakuleev.webdriver.test;

import com.epam.training.student_artem_rzakuleev.webdriver.page.PastebinPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pastebin {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup()  {
        driver =new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test(description = "test of creating new paste")
    public void createNewPaste(){
        PastebinPage pastebinPage=new PastebinPage(driver).
                openPage().
                enterCode("Hello from WebDriver").
                selectExperation().
                enterPasteName("helloweb").
                createNewPaste();
        Assert.assertTrue(true);

    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown()   {
        driver.quit();
        driver =null;
    }



}
