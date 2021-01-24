package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us003Page {


    public Us003Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="//a[@class='d-flex align-items-center dropdown-toggle nav-link']" )
    public WebElement loginLink;
    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]")
    public WebElement registrationLink;
    @FindBy(id = "ssn")
    public WebElement snnTextBox;
    @FindBy(id ="firstname")
    public WebElement firstnameTextBox;
    @FindBy(id="lastname")
    public WebElement lastnameTextBox;
    @FindBy(id="address")
    public WebElement addressTextBox;
    @FindBy(id="mobilephone")
    public WebElement mobilephoneTextBox;
    @FindBy(id="username")
    public WebElement usernameTextBox;
    @FindBy(id="email")
    public WebElement emailTextBox;
    @FindBy(id="firstPassword")
    public WebElement firstPasswordTextBox;
    @FindBy(id="secondPassword")
    public WebElement secondPasswordTextBox;
    @FindBy(id="register-submit")
    public WebElement registerSubmitTextBox;
    @FindBy(xpath="/html/body/div/div/div/div[1]/div/div/div[1]")
    public WebElement kayitMesaji;
    //==================negatif senaryo===========================
    @FindBy(className = "invalid-feedback")
    public WebElement hataMesaji;
    //==============================================================

    @FindBy(id="strengthBar")
    public WebElement strengthBar;
}

