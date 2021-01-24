package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us009Page {
    public Us009Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "search-ssn")
    public WebElement ssnSearchKutusu;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButonu;

    @FindBy(id = "tp-customer-email")
    public WebElement emailKutusu;

    @FindBy(id = "username")
    public WebElement signInUserNameKutusu;

    @FindBy(id = "password")
    public WebElement signInPasswordKutusu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu;

    @FindBy(id = "account-menu")
    public WebElement sayfadanCikis;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//svg[@class='svg-inline--fa fa-sort fa-w-10 ']")
    public WebElement dateButonu;

    @FindBy (xpath = "//a[@aria-label='Next']")
    public WebElement nextButonu;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement ilkButon;

    @FindBy(xpath ="//span[@class='d-none d-md-inline']")
    public WebElement customerEditButon;

}
