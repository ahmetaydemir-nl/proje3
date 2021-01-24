@us12
Feature: Us0012

  Background: employee olarak giris yapmak
    Given kullanici employee olarak giris yapar

    @tc001
    Scenario: Tc_001 kullanici  bilgileri isim_email_tel_adres  dogrulama
      Given kullanici employee goruntule "http://www.gmibank.com/tp-customer?page=1&sort=id,asc" sayfasina gider
      Given kullanici kullanicinin bilgilerini liste alir
      Given kullanici musterinin isim,email ve adress bilgilerini  assert eder
      Given kullanici teamtrycatch butonuna tiklar
      Then kullanici  cikis  yapar

  @tc002
    Scenario: Tc_002  kullanici  view butonu  dogrulama
      Given kullanici employee goruntule "http://www.gmibank.com/tp-customer?page=1&sort=id,asc" sayfasina gider
      Given kullanici view butonuna tiklar
      Given kullanici view butonunu assert yapar
      Given kullanici teamtrycatch butonuna tiklar
      Then kullanici  cikis  yapar

  @tc003
    Scenario: Tc_003 kullanici edit butonu dogrulama
        Given kullanici employee goruntule "http://www.gmibank.com/tp-customer?page=1&sort=id,asc" sayfasina gider
        Given kullanici edit butonuna tiklar
        Given kullanici edit butonunu assert  yapar
        Given kullanici teamtrycatch butonuna tiklar
        Then kullanici  cikis  yapar

  @tc004
    Scenario: Tc_004 kullanici musterinin  bilgilerini gunceller
      Given kullanici employee goruntule "http://www.gmibank.com/tp-customer?page=1&sort=id,asc" sayfasina gider
      Given kullanici edit butonuna tiklar
      Given kullanici adres bilgisini "USAA" ile gunceller
      Given kullanici save butonuna tiklar
      Given kullanici guncellemyi "USAA" assert eder
      Given kullanici teamtrycatch butonuna tiklar
      Then kullanici  cikis  yapar

  @tc005
    Scenario: Tc_005 kullanici delete butonunu  dogrular
      Given kullanici employee goruntule "http://www.gmibank.com/tp-customer?page=1&sort=id,asc" sayfasina gider
      Given kullanici delete butonuna tiklar
      Given kullanici delete butonunu assert eder
      Given kullanici cancel butonuna tiklar
      Given kullanici teamtrycatch butonuna tiklar
      Then kullanici  cikis  yapar









