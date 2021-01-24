package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.Us17_18_19_Page;
import utilities.Driver;

public class Us17_18_19_StepDef {

    Us17_18_19_Page page =new Us17_18_19_Page();
    SoftAssert softAssert = new SoftAssert();

    @Given("{string} adresine gider ve admin olarak giris yapar")
    public void adresine_gider_ve_admin_olarak_giris_yapar(String string) {
        Driver.adminSingIn();
    }

    @Then("Administratorion droppdownundan User management linkine tiklar")
    public void administratorion_droppdownundan_User_management_linkine_tiklar() {
        Driver.waitAndClick(page.administrationDropdown,1);
        Driver.waitAndClick(page.userManagementLinki,1);
        Driver.waitAndClick(page.tarihSiralama,1);

    }

    @Given("user icin kayit bulur ve edit butonuna tiklar")
    public void user_icin_kayit_bulur_ve_edit_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=3&sort=createdDate,desc");
        Driver.waitAndClick(page.userHeikkiKolmanenEdit,1);
    }

    @Given("Acilan sayfada Actived kutusunu tiklar ve profilden ROLE_USER atamasi yapar")
    public void acilan_sayfada_Actived_kutusunu_tiklar_ve_profilden_ROLE_USER_atamasi_yapar() {
        Driver.waitAndClick(page.aktifKutusu,1);
        Driver.waitAndClick(page.roleCustomer,1);
        Driver.waitAndClick(page.roleUser,1);
    }

    @Given("Save butonuna tiklar")
    public void save_butonuna_tiklar() {
        Driver.waitAndClick(page.saveButonu,1);
        Driver.wait(1);

    }

    @Then("user icin assert eder")
    public void user_icin_assert_eder() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=3&sort=createdDate,desc");
        Driver.waitAndClick(page.userHeikkiKolmanenEdit, 5);
        Assert.assertTrue(page.aktifKutusu.isSelected());
    }

    @Given("employee icin kayit bulur ve edit butonuna tiklar")
    public void employee_icin_kayit_bulur_ve_edit_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.employeJooniKevanenEdit,1);
    }

    @Given("Acilan sayfada Actived kutusunu tiklar ve profilden ROLE_EMPLOYEE atamasi yapar")
    public void acilan_sayfada_Actived_kutusunu_tiklar_ve_profilden_ROLE_EMPLOYEE_atamasi_yapar() {
        Driver.waitAndClick(page.aktifKutusu,1);
        Driver.waitAndClick(page.roleCustomer,1);
        Driver.waitAndClick(page.roleEmployee,1);
    }

    @Then("employee icin assert eder")
    public void employee_icin_assert_eder() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.employeJooniKevanenEdit, 5);
        softAssert.assertTrue(page.aktifKutusu.isSelected());
    }

    @Given("manager icin kayit bulur ve edit butonuna tiklar")
    public void manager_icin_kayit_bulur_ve_edit_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.managerSaaraSeppalaEdit,1);
    }

    @Given("Acilan sayfada Actived kutusunu tiklar ve profilden ROLE_MANAGER atamasi yapar")
    public void acilan_sayfada_Actived_kutusunu_tiklar_ve_profilden_ROLE_MANAGER_atamasi_yapar() {
        Driver.waitAndClick(page.aktifKutusu,1);
        Driver.waitAndClick(page.roleCustomer,1);
        Driver.waitAndClick(page.roleManager,1);
    }

    @Then("manager icin assert eder")
    public void manager_icin_assert_eder() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.managerSaaraSeppalaEdit, 5);
        softAssert.assertTrue(page.aktifKutusu.isSelected());
    }

    @Given("admin icin kayit bulur ve edit butonuna tiklar")
    public void admin_icin_kayit_bulur_ve_edit_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.adminNiinaVertanenEdit,1);
    }

    @Given("Acilan sayfada Actived kutusunu tiklar ve profilden ROLE_ADMIN atamasi yapar")
    public void acilan_sayfada_Actived_kutusunu_tiklar_ve_profilden_ROLE_ADMIN_atamasi_yapar() {
        Driver.waitAndClick(page.aktifKutusu,1);
        Driver.waitAndClick(page.roleCustomer,1);
        Driver.waitAndClick(page.roleAdmin,1);
    }

    @Then("admin icin assert eder")
    public void admin_icin_assert_eder() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.adminNiinaVertanenEdit, 5);
        softAssert.assertTrue(page.aktifKutusu.isSelected());
    }

    @Given("user icin kayit bularak view butonuna tiklar ve geri gelir")
    public void user_icin_kayit_bularak_view_butonuna_tiklar_ve_geri_gelir() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=1&sort=createdDate,desc");
        Driver.waitAndClick(page.userHeikkiKolmanenView,1);
        Driver.waitAndClick(page.backButonu,1);
    }

    @Given("employee icin kayit bularak view butonuna tiklar ve geri gelir")
    public void employee_icin_kayit_bularak_view_butonuna_tiklar_ve_geri_gelir() {
       Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
       Driver.waitAndClick(page.employeJooniKevanenView,1);
       Driver.waitAndClick(page.backButonu,1);
    }

    @Given("manager icin kayit bularak view butonuna tiklar ve geri gelir")
    public void manager_icin_kayit_bularak_view_butonuna_tiklar_ve_geri_gelir() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.managerSaaraSeppalaView,1);
        Driver.waitAndClick(page.backButonu,1);
    }

    @Given("admin icin kayit bularak view butonuna tiklar ve geri gelir")
    public void admin_icin_kayit_bularak_view_butonuna_tiklar_ve_geri_gelir() {
       Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
       Driver.waitAndClick(page.adminNiinaVertanenView,1);
       Driver.waitAndClick(page.backButonu,1);
    }

    @Given("user icin kayit bularak edit butonuna tiklar ve logini {string} edit eder")
    public void user_icin_kayit_bularak_edit_butonuna_tiklar_ve_logini_edit_eder(String string) {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=1&sort=createdDate,desc");
        Driver.waitAndClick(page.userHeikkiKolmanenEdit,1);
        Driver.waitAndSendText(page.roleUserFirsName,string,1);
        Driver.waitAndClick(page.saveButonu,1);
    }

    @Given("employee icin kayit bularak edit butonuna tiklar ve logini {string} edit eder")
    public void employee_icin_kayit_bularak_edit_butonuna_tiklar_ve_logini_edit_eder(String string) {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.employeJooniKevanenEdit,1);
        Driver.waitAndSendText(page.roleEmployeeFirsName,string,1);
        Driver.waitAndClick(page.saveButonu,1);
    }

    @Given("manager icin kayit bularak edit butonuna tiklar ve logini {string} edit eder")
    public void manager_icin_kayit_bularak_edit_butonuna_tiklar_ve_logini_edit_eder(String string) {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.managerSaaraSeppalaEdit,1);
        Driver.waitAndSendText(page.roleManagerFirsName,string,1);
        Driver.waitAndClick(page.saveButonu,1);
    }

    @Given("admin icin kayit bularak edit butonuna tiklar ve logini {string} edit eder")
    public void admin_icin_kayit_bularak_edit_butonuna_tiklar_ve_logini_edit_eder(String string) {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.adminNiinaVertanenEdit,1);
        Driver.waitAndSendText(page.roleAdminFirsName,string,1);
        Driver.waitAndClick(page.saveButonu,1);
    }

    @Given("user icin kayit bularak delete butonuna tiklar")
    public void user_icin_kayit_bularak_delete_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.userHeikkiKolmanenDelete,1);
        Driver.waitAndClick(page.saveButonu,1);
        Driver.waitAndClick(page.alertDeleteButonu,1);
    }

    @Given("employee icin kayit bularak delete butonuna tiklar")
    public void employee_icin_kayit_bularak_delete_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.employeJooniKevanenDelete,1);
        Driver.waitAndClick(page.saveButonu,1);
        Driver.waitAndClick(page.alertDeleteButonu,1);
    }

    @Given("manager icin kayit bularak delete butonuna tiklar")
    public void manager_icin_kayit_bularak_delete_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.managerSaaraSeppalaDelete,1);
        Driver.waitAndClick(page.saveButonu,1);
        Driver.waitAndClick(page.alertDeleteButonu,1);
    }

    @Given("admin icin kayit bularak delete butonuna tiklar")
    public void admin_icin_kayit_bularak_delete_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=2&sort=createdDate,desc");
        Driver.waitAndClick(page.adminNiinaVertanenDelete,1);
        Driver.waitAndClick(page.saveButonu,1);
        Driver.waitAndClick(page.alertDeleteButonu,1);
    }

    @Given("My Operations droppdownundan Manage Customers linkine tiklar")
    public void my_Operations_droppdownundan_Manage_Customers_linkine_tiklar() {
        Driver.waitAndClick(page.manageCustomerDropdown,1);
        Driver.waitAndClick(page.manageCustomer,1);
    }

    @Given("customer icin kayit bularak view butonunu assert eder")
    public void customer_icin_kayit_bularak_view_butonunu_assert_eder() {
        softAssert.assertTrue(page.customerMeiraRaikonenView.isDisplayed());

    }

    @Given("customer icin kayit bularak edit butonunu assert eder")
    public void customer_icin_kayit_bularak_edit_butonunu_assert_eder() {
        softAssert.assertTrue(page.customerMeiraRaikonenEdit.isDisplayed());
    }

    @Given("customer icin kayit bularak edit butonuna tiklar ve logini {string} edit eder")
    public void customer_icin_kayit_bularak_edit_butonuna_tiklar_ve_logini_edit_eder(String string) {
        //Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=1&sort=createdDate,desc");
        Driver.waitAndClick(page.customerMeiraRaikonenEdit,1);
        Driver.waitAndSendText(page.roleCustomerFirsName,string,1);
    }

    @Given("Acilan sayfada Actived kutusunu tiklar")
    public void acilan_sayfada_Actived_kutusunu_tiklar() {
        Driver.waitAndClick(page.aktifKutusu,1);
    }

    @Given("customer icin kayit bularak delete butonuna tiklar")
    public void customer_icin_kayit_bularak_delete_butonuna_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=78&sort=createdDate,desc");
        Driver.waitAndClick(page.customerExample2ekasabaDelete,1);
        Driver.waitAndClick(page.alertDeleteButonu,1);
    }

    @Given("Olusturulan Musteri bulunur Edite tiklanir")
    public void olusturulan_Musteri_bulunur_Edite_tiklanir() {
        Driver.waitAndClick(page.ilkmusterieditbutonu,1);
    }

    @Given("musteri Active edilir")
    public void musteri_Active_edilir() {
        Driver.waitAndClick(page.aktifKutusu,1);

    }

    @Then("save butonuna tiklanir ve cikis yapilir")
    public void save_butonuna_tiklanir_ve_cikis_yapilir() {
        Driver.waitAndClick(page.saveButonu,1);
        Driver.waitAndClick(page.menuButonu,1);
        Driver.waitAndClick(page.signOutButonu,1);

    }





}

