package stepdefinitions;

import io.cucumber.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.Us009Page;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Us009StepDef {
    Us009Page page=new Us009Page();
    SoftAssert softAssert=new SoftAssert();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici SSN kutusuna {string} numarasini yazar")
    public void kullanici_SSN_kutusuna_numarasini_yazar(String string) {
        page.ssnSearchKutusu.sendKeys(string);
        Driver.wait(1);
    }

    @Given("kullanici  search  butonuna tiklar")
    public void kullanici_search_butonuna_tiklar() {
        page.searchButonu.click();
        Driver.wait(1);
    }

    @Given("kullanici {string} islemi assert  eder")
    public void kullanici_islemi_assert_eder(String string) {
       page.emailKutusu.click();
        System.out.println(page.emailKutusu.getAttribute("value"));
        softAssert.assertEquals(page.emailKutusu.getAttribute("value"),"team27admin@gmail.com");
        Assert.assertEquals(page.emailKutusu.getAttribute("value"),"team27admin@gmail.com");

    }





}
