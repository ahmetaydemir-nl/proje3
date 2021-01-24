package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Us003Page;
import utilities.Driver;

import java.util.Locale;

public class Us003StepDef {

    Us003Page us003Page = new Us003Page();

    @Given("kullanici anasayfaya gider {string}")
    public void kullanici_anasayfaya_gider(String gmi_Url) {
        Driver.getDriver().get(gmi_Url);

    }

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        us003Page.loginLink.click();
    }

    @Given("register linkine tiklar")
    public void register_linkine_tiklar() {
        us003Page.registrationLink.click();

    }

    @Given("kullanici ssn numarasini ssn girer")
    public void kullanici_ssn_numarasini_ssn_girer() {
        Faker faker=new Faker();
        String snn =faker.number().digits(3)+"-"+faker.number().digits(2)+"-"+faker.number().digits(4);
        Driver.waitAndSendText(us003Page.snnTextBox,snn,2);
        System.out.println(snn);

    }

    @Given("kullanici firstname ve lastname girer")
    public void kullanici_firstname_ve_lastname_girer() {
        Faker faker=new Faker();
        String firstName=faker.name().firstName();
        String lastName=faker.name().lastName();
        Driver.waitAndSendText(us003Page.firstnameTextBox,firstName,2);
        Driver.waitAndSendText(us003Page.lastnameTextBox,lastName,2);
        System.out.println(firstName+ " "+lastName);
    }

    @Given("kullanici address girer")
    public void kullanici_address_girer() {
        Faker faker=new Faker();
        String address=faker.address().fullAddress();
        Driver.waitAndSendText(us003Page.addressTextBox,address,2);
        System.out.println(address);

    }

    @Given("kullanici mobile phone number girer")
    public void kullanici_mobile_phone_number_girer() {
        Faker faker=new Faker();
        String mobilePhone =faker.number().digits(3)+"-"+faker.number().digits(3)+"-"+faker.number().digits(4);
        Driver.waitAndSendText(us003Page.mobilephoneTextBox,mobilePhone,2);
        System.out.println(mobilePhone);


    }

    @Given("kullanici username  girer")
    public void kullanici_username_girer() {
        Faker faker=new Faker();
        String userName=faker.name().username();
        Driver.waitAndSendText(us003Page.usernameTextBox,userName,2);
        System.out.println(userName);



    }

    @Given("kullanici email girer")
    public void kullanici_email_girer() {
        Faker faker=new Faker();
        String email=faker.name().firstName()+"@gmail.com";
        Driver.waitAndSendText(us003Page.emailTextBox,email,2);



    }

    String passWord; //iki yerde kullanacagim instance variable yaptim

    @Given("kullanici new password girer")
    public void kullanici_new_password_girer() {
        Faker faker=new Faker();
        //passWord=faker.number().digits(2)+faker.name().name().toLowerCase()+faker.name().name().toUpperCase();
        passWord=faker.internet().password(7,10,true,true,true);
        Driver.waitAndSendText(us003Page.firstPasswordTextBox,passWord,2);

    }

    @Given("kullanici new password confirmation girer")
    public void kullanici_new_password_confirmation_girer() {

        Driver.waitAndSendText(us003Page.secondPasswordTextBox,passWord,2);
        System.out.println(passWord);

    }

    @Given("kullanici register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
    Driver.waitAndClick(us003Page.registerSubmitTextBox,2);
    }

    @Then("kullanici kayit mesajini gorur")
    public void kullanici_kayit_mesajini_gorur() {
        Driver.wait(1);
        Assert.assertTrue(us003Page.kayitMesaji.isDisplayed());
        System.out.println("kayit basarili");
    }
}
