package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Us0015Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Us0015StepDef {

    Us0015Page us15Page = new Us0015Page();

    @Given("ana sayfa {string} adresine gidiniz")
    public void ana_sayfa_adresine_gidiniz(String string) {
        Driver.getDriver().get(string); // feature daki bu adrese gidip "" içindekini string olarak alır.

    }

    @Given("menu butonuna tıklayınız")
    public void menu_butonuna_tıklayınız() {
        Driver.waitAndClick(us15Page.accountMenu,2);

    }
    @Given("sign in tıklayınız")
    public void sign_in_tıklayınız() {
        Driver.waitAndClick(us15Page.signIn,1);

    }
    @Given("username {string} giriniz")
    public void username_giriniz(String string) {
        us15Page.username.sendKeys(string);

    }
    @Given("password {string} giriniz")
    public void password_giriniz(String string) {
        us15Page.password.sendKeys(string);

    }
    @Then("sign in butonuna tıklayınız")
    public void sign_in_butonuna_tıklayınız() {
        Driver.waitAndClick(us15Page.getSignIn,2);

    }
    @Then("My Operations butonuna tıklayınız")
    public void my_Operations_butonuna_tıklayınız() {
        Driver.waitAndClick(us15Page.myOperationsLink,1);

    }
    @Then("My Account dropdown'ı seçip tıklayınız")
    public void my_Account_dropdown_ı_seçip_tıklayınız() {
        Driver.waitAndClick(us15Page.myAccountsLink,1);

    }
    @Then("Kullanıcı hesap tablosunda hesap türleri görünür olmalı.")
    public void kullanıcı_hesap_tablosunda_hesap_türleri_görünür_olmalı() {
        for (WebElement w:us15Page.accountType)
            System.out.println(w.getText());
        Assert.assertFalse(us15Page.accountType.isEmpty());
        }

    @Then("Kullanıcı hesap tablosunda hesap bilancoları görünür olmalı.")
    public void kullanıcı_hesap_tablosunda_hesap_bilancoları_görünür_olmalı() {
        System.out.println();
        for (WebElement w:us15Page.accountBalance)
            System.out.println(w.getText());
        Assert.assertFalse(us15Page.accountBalance.isEmpty());

    }

    @Then("Kullanıcı View Transaction butonuna tıklayınca hesap tablosunda geçmiş yapılan işlemleri görebilmeli.")
    public void kullanıcı_View_Transaction_butonuna_tıklar() {

        for (WebElement w:us15Page.transactionbuton)
        Driver.waitAndClick(w,2);
        System.out.println("Hesap sayısı :" + us15Page.transactionbuton.size());
        Boolean islemliHes = us15Page.transaction.isDisplayed();
        Boolean islemsizHes = us15Page.transnotfound.isDisplayed();
        if (islemliHes == false & islemsizHes == false ) {
            Assert.assertTrue(false);
        }else{
            Assert.assertTrue(true);
        }
    }

    @Then("Sign Out butonuna tıklayınız.")
    public void sign_Out_butonuna_tıklayınız() {

        Driver.waitAndClick(us15Page.signOut,1);
    }



}
