package com.epam.training.student_artem_rzakuleev.webdriver.page;

import com.epam.training.student_artem_rzakuleev.webdriver.test.Pastebin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastebinPage {
    private static final String PASTEBIN_PAGE_URL="https://pastebin.com/";
    private WebDriver webDriver;

    @FindBy(id="postform-text")
    private WebElement codeTextArea;

    @FindBy(id="select2-postform-expiration-container")
    private WebElement PasteExperationSelect;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    private WebElement selectExperation10Minutes;

    @FindBy(id="postform-name")
    private WebElement postFormName;

    @FindBy(xpath = "//button[text()='Create New Paste']")
    private WebElement submitPaste;

    public PastebinPage(WebDriver webDriver)    {
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public PastebinPage openPage()  {
        webDriver.get(PASTEBIN_PAGE_URL);
        return this;
    }

    public PastebinPage enterCode(String code)  {
        codeTextArea.sendKeys(code);
        return this;
    }

    public PastebinPage selectExperation()   {
        PasteExperationSelect.click();
        selectExperation10Minutes.click();
        return this;
    }

    public PastebinPage enterPasteName(String pasteName)    {
        postFormName.sendKeys(pasteName);
        return this;
    }

    public PastebinPage createNewPaste()    {
        submitPaste.click();
        return this;
    }




}
