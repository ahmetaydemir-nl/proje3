package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Us0016Page {


    public Us0016Page() { PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(linkText = "Transfer Money")
    public WebElement transferMoney;

    @FindBy(xpath = "//*[@id='fromAccountId']/option")
    public List<WebElement> accountId;

    @FindBy(id = "fromAccountId")
    public WebElement from;

    @FindBy(id = "toAccountId")
    public WebElement to;

    @FindBy(id = "balance")
    public WebElement balance;

    @FindBy(id = "make-transfer")
    public WebElement makeTransfer;

    @FindBy(xpath = "//*[.='This field is required.']")
    public WebElement fieldRequired;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement transfersSuccesfull;

    @FindBy(xpath = "/html/body")
    public WebElement transferError;











}
