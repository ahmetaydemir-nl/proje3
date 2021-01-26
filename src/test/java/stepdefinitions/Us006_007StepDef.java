package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Us006_007Page;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class Us006_007StepDef {

    Us006_007Page page = new Us006_007Page();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);


    }

    @Given("kullanici gercek verilerle giris yapar")
    public void kullanici_gercek_verilerle_giris_yapar() {
        page.account.click();
        page.giris.click();
        page.id.sendKeys(ConfigurationReader.getProperty("admin_username"));
        page.password.sendKeys(ConfigurationReader.getProperty("admin_password"));
        page.signbutton.submit();

    }

    @Then("Kullanici anasayfada oldugunu Assert eder")
    public void kullanici_anasayfada_oldugunu_Assert_eder() {
        Assert.assertTrue(page.anaSayfa.isDisplayed());
    }

    @Then("Kullanici cikis yapar")
    public void kullanici_cikis_yapar() {
        Driver.waitAndClick(page.account, 2);
        Driver.waitAndClick(page.logout, 2);
    }

    @Given("kullanici hesap dropdowna tiklar")
    public void kullanici_hesap_dropdowna_tiklar() {

        Driver.waitAndClick(page.account, 2);

    }

    @Given("kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar")
    public void kullanici_hesap_menuden_dropdown_Ayarlar_sekmesine_tiklar() {

        Driver.waitAndClick(page.settings, 2);


    }

    @Then("kullanici Ayarlar sayfasinda oldugunu Assert eder")
    public void kullanici_Ayarlar_sayfasinda_oldugunu_Assert_eder() {
     System.out.println(page.ayarlarBaslik.getText());
     Driver.verifyElementDisplayed(page.ayarlarBaslik);
    }


    @Then("kullanici Ayarlar sayfasindaki duzenlenbilir sekmeleri assert eder")
    public void kullanici_Ayarlar_sayfasindaki_duzenlenbilir_sekmeleri_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.ayarlarBilgileri.getText());
        Assert.assertTrue(page.ayarlarBilgileri.isDisplayed());
    }

    @Then("kullanici Ayarlar sayfasindaki dil dropdownda iki dil oldugunu assert eder")
    public void kullanici_Ayarlar_sayfasindaki_dil_dropdownda_iki_dil_oldugunu_assert_eder() {
        int sayi = page.Diller.size();
        for (int i = 0; i < sayi; i++) {
            String option = page.Diller.get(i).getText();
            System.out.println(option);
        }
    }

    @Given("kullanici Isim kutusunu temizler")
    public void kullanici_Isim_kutusunu_temizler() {
        System.out.println(page.isimtext.getText());
       Driver.waitAndClick(page.name, 2);

        page.name.clear();
    }

    @Given("kullanici Isim kutusuna {string} girer")
    public void kullanici_Isim_kutusuna_girer(String string) {
        Driver.waitAndSendText(page.name, string, 2);
    }

    @Given("kullanici save butonunu tiklar")
    public void kullanici_save_butonunu_tiklar() {
        Driver.waitAndClick(page.kaydetbutton, 2);

    }

    @Then("kullanici Isim kutusundaki bilginin guncellendigini assert eder")
    public void kullanici_Isim_kutusundaki_bilginin_guncellendigini_assert_eder() {
        System.out.println(page.success.getText());
        Driver.verifyElementDisplayed(page.success);
    }

    @Given("kullanici Soyisim kutusunu temizler")
    public void kullanici_Soyisim_kutusunu_temizler() {
        Driver.waitAndClick(page.lastname, 2);
        page.lastname.clear();

    }

    @Given("kullanici Soyisim kutusuna {string} girer")
    public void kullanici_Soyisim_kutusuna_girer(String string) {
        Driver.waitAndSendText(page.lastname, string, 2);
    }

    @Then("kullanici Soyisim kutusundaki bilginin guncellendigini assert eder")
    public void kullanici_Soyisim_kutusundaki_bilginin_guncellendigini_assert_eder() {
        System.out.println(page.success.getText());
        Driver.verifyElementDisplayed(page.success);
    }


    @Given("kullanici Email kutusunu temizler")
    public void kullanici_Email_kutusunu_temizler() {
        Driver.waitAndClick(page.email, 2);
        page.email.clear();
    }

    @Given("kullanici Email kutusuna {string} girer")
    public void kullanici_Email_kutusuna_girer(String string) {
        Driver.waitAndSendText(page.email, string, 2);
    }

    @Then("kullanici Email kutusundaki bilginin guncellendigini assert eder")
    public void kullanici_Email_kutusundaki_bilginin_guncellendigini_assert_eder() {
        System.out.println(page.success.getText());
        Assert.assertTrue(page.success.isDisplayed());
    }

    @Given("kullanici Dil DropDowndan {string} secer")
    public void kullanici_Dil_DropDowndan_secer(String string) {
        Select option = new Select(page.language);
        option.selectByVisibleText(string);

    }

    @Then("kullanici Dil DropDown bilginin English oldugunu assert eder")
    public void kullanici_Dil_DropDown_bilginin_English_oldugunu_assert_eder() {
        System.out.println(page.success.getText());
        Driver.verifyElementDisplayed(page.success);
    }

    @Given("kullanici Ayarlar sayfasindaki dil dropdownda iki dil oldugunu goruntuler")
    public void kullanici_Ayarlar_sayfasindaki_dil_dropdownda_iki_dil_oldugunu_goruntuler() {
        int sayi = page.Diller.size();
        for (int i = 0; i < sayi; i++) {
            String option = page.Diller.get(i).getText();
            System.out.println(option);
        }
    }

    @Given("kullanici Fransizca dil secenegi olmadigini assert eder.")
    public void kullanici_Fransizca_dil_secenegi_olmadigini_assert_eder() {
        System.out.println(page.language.getText());
        Assert.assertTrue(page.language.isDisplayed());
    }

    @Given("kullanici Email kutusunu tiklar")
    public void kullanici_Email_kutusunu_tiklar() {
        Driver.waitAndClick(page.email, 2);
    }

    @Given("kullanici Email kutusnu temizler")
    public void kullanici_Email_kutusnu_temizler() {
        page.email.clear();
    }

    @Given("kullanici Email kutusna {string} girer")
    public void kullanici_Email_kutusna_girer(String string) {
        Driver.waitAndSendText(page.email, string, 2);
    }

    @Then("kullaniciEmail kutusunun altinda hata mesajini assert eder")
    public void kullaniciemail_kutusunun_altinda_hata_mesajini_assert_eder() {

        System.out.println(page.invalidmessage.getText());
        Driver.verifyElementDisplayed(page.invalidmessage);

    }


}




