package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Us006_007Page {

    public Us006_007Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement account;
    @FindBy(linkText = "Sign in")
    public WebElement giris;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement id;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signbutton;
    @FindBy(xpath = "//*[@id='app-header']")
    public WebElement anaSayfa;
    @FindBy(xpath = "//span[.='team27 ali']")
    public WebElement girisYapildi;
    @FindBy(xpath = "//span[.='User Info']")
    public WebElement settings;
    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement ayarlar;
    @FindBy(id = "lastName")
    public WebElement lastname;
    @FindBy(id = "firstName")
    public WebElement name;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement kullaniciSekmesi;
    @FindBy(id = "langKey")
    public WebElement language;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement kaydetbutton;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement success;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidmessage;
    @FindBy(xpath = "//span[.='Ayarlar kaydedildi']")
    public WebElement testpass;
    @FindBy(id = "settings-title")
    public WebElement ayarlarBaslik;
    @FindBy(xpath = "//div[@class='view-routes']")
    public WebElement ayarlarBilgileri;
    @FindBy(id = "langKey")
    public List<WebElement> Diller;
    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement logout;

    @FindBy(xpath = " //label[@for='firstName']")
    public WebElement isimtext;


}
