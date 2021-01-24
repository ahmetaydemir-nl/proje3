package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us17_18_19_Page {

    public Us17_18_19_Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //================================Ortak Web Elementler================================

    @FindBy (id="account-menu")
    public WebElement profilLogosu;

    @FindBy (xpath = "(//*[.='Sign in'])[1]")
    public WebElement signInLinki;

    @FindBy(id = "username")
    public WebElement usernameKutusu;

    @FindBy(id = "password")
    public WebElement paswordKutusu;

    @FindBy(xpath = "(//*[.='Sign in'])[6]")
    public WebElement signInButonu;

    @FindBy (xpath = "//span[.='Administration']")
    public WebElement administrationDropdown;

    @FindBy (xpath = "//span[.='User management']")
    public WebElement userManagementLinki;

    @FindBy (xpath = "//span[.='Created date']")
    public WebElement tarihSiralama;

    @FindBy (id="activated")
    public WebElement aktifKutusu;

    @FindBy (xpath = "//*[.='Save']")
    public WebElement saveButonu;

    @FindBy (xpath = "(//a[@href='/admin/user-management'])[2]")
    public WebElement backButonu;

    @FindBy (xpath ="(//*[.='Sil'])[41]")
    public WebElement alertDeleteButonu;

    @FindBy (xpath = "//span[.='Varlıklar']")
    public WebElement manageCustomerDropdown;

    @FindBy (xpath = "//span[.='TP Customer']")
    public WebElement manageCustomer;

    @FindBy(xpath = "//tbody/tr/td[10]/div/a[2]")
    public WebElement ilkmusterieditbutonu;

    @FindBy(xpath = "//span[.='team20admin team20admin']")
    public WebElement menuButonu;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOutButonu;

    //================================User Heikki Kolmanen================================

    @FindBy (xpath ="//*[@href='/admin/user-management/heikkikolmanen/edit']")
    public WebElement userHeikkiKolmanenEdit;

    @FindBy (xpath = "//a[@href='/admin/user-management/heikkikolmanen']")
    public WebElement userHeikkiKolmanenView;

    @FindBy (xpath ="//*[@href='/admin/user-management/heikkikolmanen/delete']")
    public WebElement userHeikkiKolmanenDelete;

    @FindBy (xpath = "//option[@value='ROLE_USER']")
    public WebElement roleUser;

    /*@FindBy (id = "login")
    public WebElement roleUserLogin;*/

    @FindBy (id = "firstName")
    public WebElement roleUserFirsName;

    @FindBy (xpath = "//*[@id=heikkikolmanen]/td[4]/button")
    public WebElement userHeikkiKolmanenAktifButonu;


    //================================Employee Jooni Kevanen================================

    @FindBy (xpath ="//*[@href='/admin/user-management/joonikevanen/edit']")
    public WebElement employeJooniKevanenEdit;

    @FindBy (xpath = "//a[@href='/admin/user-management/joonikevanen']")
    public WebElement employeJooniKevanenView;

    @FindBy (xpath ="//*[@href='/admin/user-management/joonikevanen/delete']")
    public WebElement employeJooniKevanenDelete;

    @FindBy (xpath = "//option[@value='ROLE_EMPLOYEE']")
    public WebElement roleEmployee;

    /*@FindBy (id = "login")
    public WebElement roleEmployeLogin;*/

    @FindBy (id = "firstName")
    public WebElement roleEmployeeFirsName;

    //================================Manager Saara Seppala================================

    @FindBy (xpath ="//*[@href='/admin/user-management/saaraseppala/edit']")
    public WebElement managerSaaraSeppalaEdit;

    @FindBy (xpath = "//a[@href='/admin/user-management/saaraseppala']")
    public WebElement managerSaaraSeppalaView;

    @FindBy (xpath ="//*[@href='/admin/user-management/saaraseppala/delete']")
    public WebElement managerSaaraSeppalaDelete;

    @FindBy (xpath = "//option[@value='ROLE_MANAGER']")
    public WebElement roleManager;

    /*@FindBy (id = "login")
    public WebElement roleManagerLogin;*/

    @FindBy (id = "firstName")
    public WebElement roleManagerFirsName;

    //================================Admin Niina Vertanen================================

    @FindBy (xpath ="//*[@href='/admin/user-management/niinavertanen/edit']")
    public WebElement adminNiinaVertanenEdit;

    @FindBy (xpath = "//a[@href='/admin/user-management/niinavertanen']")
    public WebElement adminNiinaVertanenView;

    @FindBy (xpath ="//*[@href='/admin/user-management/niinavertanen/delete']")
    public WebElement adminNiinaVertanenDelete;

    @FindBy (xpath = "//option[@value='ROLE_ADMIN']")
    public WebElement roleAdmin;

    /*@FindBy (id = "login")
    public WebElement roleAdminLogin;*/

    @FindBy (id = "firstName")
    public WebElement roleAdminFirsName;

    //================================Customer Meira Raikonen================================

    @FindBy (xpath ="//*[@href='/admin/user-management/meiraraikonen/edit']")
    public WebElement customerMeiraRaikonenEdit;

    @FindBy (xpath = "//a[@href='/admin/user-management/meiraraikonen']")
    public WebElement customerMeiraRaikonenView;

    /*@FindBy (id = "login")
    public WebElement roleCustomerLogin;*/

    @FindBy (id = "firstName")
    public WebElement roleCustomerFirsName;

    @FindBy (xpath = "//option[@value='ROLE_CUSTOMER']")
    public WebElement roleCustomer;

    @FindBy (xpath ="//*[@href='/admin/user-management/example2ekasaba/delete']")
    public WebElement customerExample2ekasabaDelete;








}
