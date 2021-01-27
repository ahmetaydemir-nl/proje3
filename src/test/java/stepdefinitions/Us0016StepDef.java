package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Us0016Page;
import utilities.Driver;
import utilities.MyMethods;

public class Us0016StepDef {

    Us0016Page us16Page = new Us0016Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Transfer Money butonunu tıklayınız")
    public void transfer_Money_butonunu_tıklayınız() {

        Driver.waitAndClick(us16Page.transferMoney,2);
    }

    @Then("From dropdownda en az iki hesap gözüküyormu kontrol et.")
    public void from_dropdownda_en_az_iki_hesap_gözüküyormu_kontrol_et() {

        Driver.wait(1);
        int hesapSayisi = us16Page.accountId.size()-1;
        System.out.println("Hesap sayisi : " + hesapSayisi);
        Boolean ikiHesapOlmali = hesapSayisi>=2 ? true : false;
        Assert.assertTrue(ikiHesapOlmali);
    }

    @Then("From butonunu tıkla rastgele bir hesap sec.")
    public void from_butonunu_tıkla_rastgele_bir_hesap_sec() {

        Driver.wait(1);
        Select select = new Select(us16Page.from);
        Driver.selectRandomTextFromDropdown(select);
        Driver.wait(1);
        String hesapId = us16Page.from.getAttribute("value");
        System.out.println("Hesap From id : " + hesapId);
    }


    @Then("To butonunu tıkla rastgele bir hesap sec.")
    public void to_butonunu_tıkla_rastgele_bir_hesap_sec() {

        Driver.wait(1);
        Select select1 = new Select(us16Page.to);
        Driver.selectRandomTextFromDropdown(select1);
        Driver.wait(1);
        String hesapIdTo = us16Page.to.getAttribute("value");
        System.out.println("Hesap To id : " + hesapIdTo);
    }

    @Given("Balance kutucuğunu tıkla")
    public void balance_kutucuğunu_tıkla() {

        Driver.waitAndClick(us16Page.balance,1);
    }

    @Given("Balance kutucuğuna {string} yaz")
    public void balance_kutucuğuna_yaz(String string) {

        us16Page.balance.sendKeys(string);
    }

    @Given("Make Transfer butonunu tıkla")
    public void make_Transfer_butonunu_tıkla() {

        Driver.waitAndClick(us16Page.makeTransfer,1);
    }

    @Then("Description kutucuğunun kırmızı olduğunu doğrula.")
    public void description_kutucuğunun_kırmızı_olduğunu_doğrula() {

        Assert.assertTrue(us16Page.fieldRequired.isDisplayed());
    }

    @Given("From dropdonda seçilen hesaptaki bakiye miktarına eşit veya daha düşük bir meblağ gir.")
    public void from_dropdonda_seçilen_hesaptaki_bakiye_miktarına_eşit_veya_daha_düşük_bir_meblağ_gir() {

        Select select = new Select(us16Page.from);
        String FromBakiye = select.getFirstSelectedOption().getText();
        System.out.println(FromBakiye);
        int ilkIndex = FromBakiye.lastIndexOf("-")+ 1 ;
        int sonIndex = (FromBakiye.length())-1;
        String BalanceBakiye = FromBakiye.substring(ilkIndex,sonIndex);
        int Bakiye = Integer.valueOf(BalanceBakiye);

        int transferMiktari = Bakiye>10 ? 10 : 1;
        us16Page.balance.sendKeys(String.valueOf(transferMiktari));
    }

    @Given("Description kutucuğunu tıkla.")
    public void description_kutucuğunu_tıkla() {

        Driver.waitAndClick(us16Page.description,1);
    }

    @Given("Bir açıklama yaz.")
    public void bir_açıklama_yaz() {
        us16Page.description.sendKeys("Havale");

    }
    @Then("ekranda {string} mesajı görünmeli.")
    public void ekranda_mesajı_görünmeli(String string) {

        Assert.assertTrue(us16Page.transfersSuccesfull.isDisplayed());
    }

    @Given("From dropdownda seçilen hesaptaki bakiye miktarından daha büyük bir meblağ gir.")
    public void from_dropdownda_seçilen_hesaptaki_bakiye_miktarından_daha_büyük_bir_meblağ_gir() {

        Select select = new Select(us16Page.from);
        String FromBakiye = select.getFirstSelectedOption().getText();
        System.out.println(FromBakiye);
        int ilkIndex = FromBakiye.lastIndexOf("-")+ 1 ;
        int sonIndex = (FromBakiye.length())-1;
        String BalanceBakiye = FromBakiye.substring(ilkIndex,sonIndex);
        int transferMiktari = ((Integer.valueOf(BalanceBakiye)) + 10);
        System.out.println(BalanceBakiye);
        System.out.println(transferMiktari);
        Driver.wait(1);
        us16Page.balance.sendKeys(String.valueOf(transferMiktari));
        System.out.println(transferMiktari);

    }

    @Then("{int}-Ekranda {string} hata mesajı görünmeli.")
    public void ekranda_hata_mesajı_görünmeli(Integer int1, String string) {

        Driver.wait(1);
        Assert.assertTrue(us16Page.transferError.isDisplayed());
    }
}
