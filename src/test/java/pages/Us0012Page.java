package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us0012Page {

    public Us0012Page (){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(id = "username")
    public WebElement signInUserNameKutusu;

    @FindBy(id = "password")
    public WebElement signInPasswordKutusu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    public WebElement employeeViewButonu;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement employeeEditButonu;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement employeeDeleteButonu;

    @FindBy(xpath = "//span[.='Customer']")
    public WebElement employeeViewCustomerYazisi;

    @FindBy(xpath = "//span[.='Create or edit a Customer']")
    public WebElement employeeEditCustomerYazisi;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement employeeEditMiddleInitialKutusu;

    @FindBy(id = "tp-customer-state")
    public WebElement employeeEditStateKutusu;

    @FindBy(id = "save-entity")
    public WebElement employeeEditSaveButonu;

    @FindBy(id ="gmibankfrontendApp.tPCustomer.delete.question")
    public WebElement  employeeDeleteMesaj;

    @FindBy(id ="jhi-confirm-delete-")
    public WebElement  employeeDeleteButonuOnaylama;

    @FindBy(id = "account-menu")
    public WebElement sayfadanCikis;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(id = "save-entity")
    public WebElement editSaveButonu;

    @FindBy(id = "tp-customer-address")
    public WebElement editAdressKutusu;

    @FindBy (xpath = "//tbody/tr[1]")
    public WebElement ilkSatir;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement deleteCancelButonu;















}
