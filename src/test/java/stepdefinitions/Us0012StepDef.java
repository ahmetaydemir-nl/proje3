package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.Us0012Page;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Us0012StepDef {

    Us0012Page page=new Us0012Page();
    SoftAssert softAssert=new SoftAssert();

    @Given("kullanici employee olarak giris yapar")
    public void kullanici_employee_olarak_giris_yapar() {
        Driver.getDriver().get("http://www.gmibank.com/login");
        Driver.employeeLogin(page.signInUserNameKutusu,page.signInPasswordKutusu,page.signInButonu);
        Driver.wait(1);
    }

    @Given("kullanici employee goruntule {string} sayfasina gider")
    public void kullanici_employee_goruntule_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
        Driver.wait(1);
    }

    @Given("kullanici view butonuna tiklar")
    public void kullanici_view_butonuna_tiklar() {
        page.employeeViewButonu.click();
        Driver.wait(1);
    }

    @Given("kullanici view butonunu assert yapar")
    public void kullanici_view_butonunu_assert_yapar() {
       softAssert.assertEquals("Customer",page.employeeViewCustomerYazisi);
    }

    @Given("kullanici teamtrycatch butonuna tiklar")
    public void kullanici_teamtrycatch_butonuna_tiklar() {
        page.sayfadanCikis.click();
        Driver.wait(1);
    }

    @Then("kullanici  cikis  yapar")
    public void kullanici_cikis_yapar() {
        page.signOut.click();
    }

    @Given("kullanici kullanicinin bilgilerini liste alir")
    public void kullanici_kullanicinin_bilgilerini_liste_alir() {
        System.out.println(page.ilkSatir.getText());

    }

    @Given("kullanici musterinin isim,email ve adress bilgilerini  assert eder")
    public void kullanici_musterinin_isim_email_ve_adress_bilgilerini_assert_eder() {
        List<WebElement> list=Driver.getDriver().findElements(By.xpath("//tbody/tr[1]"));
        List<String> musteri=new ArrayList<>();
        for (WebElement el:list) {
            musteri.add(el.getText());
        }
        softAssert.assertTrue(musteri.contains("Ally"));
        softAssert.assertTrue(musteri.contains("Wlley"));
        softAssert.assertTrue(musteri.contains("al@wl.com"));
        System.out.println("------------------------------------");
        System.out.println(musteri);
    }

    @Given("kullanici edit butonuna tiklar")
    public void kullanici_edit_butonuna_tiklar() {
        page.employeeEditButonu.click();
    }

    @Given("kullanici edit butonunu assert  yapar")
    public void kullanici_edit_butonunu_assert_yapar() {
        softAssert.assertTrue(page.employeeEditCustomerYazisi.isDisplayed());
    }

    @Given("kullanici adres bilgisini {string} ile gunceller")
    public void kullanici_adres_bilgisini_ile_gunceller(String string) {
        page.editAdressKutusu.clear();
        page.editAdressKutusu.sendKeys(string);
    }

    @Given("kullanici guncellemyi {string} assert eder")
    public void kullanici_guncellemyi_assert_eder(String string) {
        List<WebElement> list=Driver.getDriver().findElements(By.xpath("//tbody/tr[1]"));
        List<String> musteri=new ArrayList<>();
        for (WebElement el:list) {
            musteri.add(el.getText());
        }
        softAssert.assertTrue(musteri.contains(string));
    }

    @Given("kullanici delete butonuna tiklar")
    public void kullanici_delete_butonuna_tiklar() {
        page.employeeDeleteButonu.click();
    }

    @Given("kullanici delete butonunu assert eder")
    public void kullanici_delete_butonunu_assert_eder() {
       softAssert.assertTrue(page.employeeDeleteMesaj.isDisplayed());
    }

    @Given("kullanici cancel butonuna tiklar")
    public void kullanici_cancel_butonuna_tiklar() {
        page.deleteCancelButonu.click();
    }

    @Given("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        page.editSaveButonu.click();
        Driver.wait(1);
    }


}
