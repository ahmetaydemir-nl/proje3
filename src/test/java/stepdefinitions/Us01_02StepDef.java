package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Us01_02Page;
import utilities.Driver;

public class Us01_02StepDef {

    Us01_02Page us001Page = new Us01_02Page();

    @Given("kullanici gmibank sayfasina {string} gider")
    public void kullanici_gmibank_sayfasina_gider(String url) {
    Driver.getDriver().get(url);
    }

    @Given("kullanici login linkine tiklar")
    public void login_linkine_tiklar() {
    Driver.waitAndClick(us001Page.loginLink,5);
    }

    @Given("kayit linkine tiklar")
    public void kayit_linkine_tiklar() {
    Driver.waitAndClick(us001Page.registrationLink,5);
    }

    @Given("ssn numarasini {string} girer")
    public void kullanici_ssn_numarasini_girer(String ssn) {
    Driver.waitAndSendText(us001Page.snnTextBox, ssn,3);
    }

    @Given("firstname {string} ve lastname {string} girer")
    public void kullanici_firstname_ve_lastname_girer(String firstname, String lastname) {
    Driver.waitAndSendText(us001Page.firstnameTextBox, firstname, 3);
    Driver.waitAndSendText(us001Page.lastnameTextBox, lastname, 3);
    }

    @Given("address {string} girer")
    public void kullanici_address_girer(String adress) {
    Driver.waitAndSendText(us001Page.addressTextBox, adress, 3);
    }

    @Given("mobile phone number {string} girer")
    public void kullanici_mobile_phone_number_girer(String telnumber) {
    Driver.waitAndSendText(us001Page.mobilephoneTextBox, telnumber, 3);
    }

    @Given("username {string} girer")
    public void kullanici_username_girer(String username) {
    Driver.waitAndSendText(us001Page.usernameTextBox, username, 3);
    }

    @Given("email {string} girer")
    public void kullanici_email_girer(String email) {
    Driver.waitAndSendText(us001Page.emailTextBox, email, 3);
    }

    @Given("new password {string} girer")
    public void kullanici_new_password_girer(String password) {
    Driver.waitAndSendText(us001Page.firstPasswordTextBox, password, 3);
    }

    @Given("new password confirmation {string} girer")
    public void kullanici_new_password_confirmation_girer(String password2) {
    Driver.waitAndSendText(us001Page.secondPasswordTextBox, password2, 3);
    }

    @Given("register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
    Driver.waitAndClick(us001Page.registerSubmitTextBox, 3);
    }

    @Then("hata mesajini gorur")
    public void kullanici_hata_mesajini_gorur() {
    Driver.verifyElementDisplayed(us001Page.hataMesaji);
    }
}
