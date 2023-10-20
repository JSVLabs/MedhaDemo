package com.libraries.pages;

import com.Utilities.BasePage;

import medha.MedhaLibrary.MedhaDataReader;
import medha.MedhaLibrary.MedhaReporter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePage {

    @FindBy(id="userName")
    WebElement txtUsername;

    @FindBy(id="password")
    WebElement txtPassword;

    @FindBy(id="login")
    WebElement loginButton;

    @FindBy(id="newUser")
    WebElement newUserButton;

    public Login(){
        PageFactory.initElements(driver,this);
    }
    public void enterLoginInfo()  {
        String username = MedhaDataReader.getFieldValue("username");
        String password = MedhaDataReader.getFieldValue("password");

        try {
            txtUsername.sendKeys(username);
            txtPassword.sendKeys(password);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        MedhaReporter.report("Enter Login Info", "pass","");
    }

    public void clickLogin(){
        MedhaReporter.report("Clicking login button","info","");
        loginButton.click();
    }

    public void verifyLogin(){
        MedhaReporter.report("Login successful","Pass","");
    }

    public void clickNewUser(){
        MedhaReporter.report("Clicking New user button","info","");
        newUserButton.click();
    }

}
