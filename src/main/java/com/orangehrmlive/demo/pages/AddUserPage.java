package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterUserName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i")
    WebElement userRoleSelect;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement selectAdmin;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div")
    WebElement statusSelect;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement selectDisable;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Enabled')]")
    WebElement selectEnable;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement clickSearch;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]")
    WebElement verifyResult;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
    WebElement clickCheckbox;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-cell-actions']/button[1]/i[1]")
    WebElement clickDelete;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]")
    WebElement popUp;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]")
    WebElement verifyMsg;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-filter-area']/form[1]/div[2]/button[2]")
    WebElement searchBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")
    WebElement verifyNoRecord;

    public void enterUser() {
        sendTextToElement(enterUserName, "AjitPatel");
    }

    public void SelectUserRole() throws InterruptedException {
        clickOnElement(userRoleSelect);
        Thread.sleep(1000);
        clickOnElement(selectAdmin);
    }

    public void SelectStatusDisable() throws InterruptedException {
        clickOnElement(statusSelect);
        Thread.sleep(1000);
        clickOnElement(selectDisable);
    }

    public void SelectStatusEnable() throws InterruptedException {
        clickOnElement(statusSelect);
        Thread.sleep(1000);
        clickOnElement(selectEnable);
    }

    public void ClickSearchButton() {
        clickOnElement(clickSearch);
    }

    public String VerifyResultList() {
        return getTextFromElement(verifyResult);
    }

    public void clickOnCheckbox() {
        clickOnElement(clickCheckbox);
    }

    public void ClickDeleteButton() throws InterruptedException {
        clickOnElement(clickDelete);
        Thread.sleep(1000);
    }

    public void PopUpClick() throws InterruptedException {
        clickOnElement(popUp);
        Thread.sleep(1000);
    }

    public String VerifyMsgCheck() {
        return getTextFromElement(verifyMsg);
    }

    public void SearchButtonDelete() {
        clickOnElement(searchBtn);
    }

    public String VerifyNoRecordFound() {
        return getTextFromElement(verifyNoRecord);
    }
}
