package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Us0015Page {



    public Us0015Page() { PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//li[@id=\"account-menu\"]")
    public WebElement accountMenu;

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement getSignIn;

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperationsLink;

    @FindBy(linkText = "My Accounts")
    public WebElement myAccountsLink;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> accountType;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> accountBalance;

    @FindBy(xpath = "//tbody/tr/td/button")
    public List<WebElement> transactionbuton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[2]")
    public WebElement transaction;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[2]/div")
    public WebElement transnotfound;

    @FindBy(xpath = "//*[.='Sign out']")
    public WebElement signOut;


}
