@Us006007
Feature: Kullanıcı bilgisi bölümü (Kullanıcı Ayarları) Ana Sayfada düzenlenebilir olmalıdır



  @Tc001
    Scenario: Tc001 Kullanıcı giris yapar
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And Kullanici anasayfada oldugunu Assert eder
    Then Kullanici cikis yapar

  @Tc002
    Scenario: Tc002 Kullanici User Info(Ayarlara) sayfasina gider
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Ayarlar sayfasinda oldugunu Assert eder
    Then Kullanici cikis yapar


  @Tc003
    Scenario: Tc003 Kullanici ayarlar sayfasindan duzenlebilir bilgileri alir
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Ayarlar sayfasindaki duzenlenbilir sekmeleri assert eder
    Then Kullanici cikis yapar

   @Tc004
   Scenario: Tc004 Ayarlar sayfasinda Dil dropdownunda iki dil secenegi olmali
     Given kullanici "http://gmibank.com" sayfasina gider
     And kullanici gercek verilerle giris yapar
     And kullanici hesap dropdowna tiklar
     And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
     And kullanici Ayarlar sayfasindaki dil dropdownda iki dil oldugunu assert eder
     Then Kullanici cikis yapar


  @Tc005
  Scenario: Tc005 Kullanici Ayarlar sayfasinda Isim kutusundaki bilgiyi guncellenebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Isim kutusunu temizler
    And kullanici Isim kutusuna "ibrahim" girer
    And kullanici save butonunu tiklar
    And kullanici Isim kutusundaki bilginin guncellendigini assert eder
    Then Kullanici cikis yapar

  @Tc006
  Scenario: Tc006 Kullanici Ayarlar sayfasinda Soyisim kutusundaki bilgiyi guncellenebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Soyisim kutusunu temizler
    And kullanici Soyisim kutusuna "Ozturk" girer
    And kullanici save butonunu tiklar
    And kullanici Soyisim kutusundaki bilginin guncellendigini assert eder
    Then Kullanici cikis yapar

  @Tc007
  Scenario: Tc007 Kullanici Ayarlar sayfasinda Email kutusundaki bilgiyi guncellenebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Email kutusunu temizler
    And kullanici Email kutusuna "nexima00@gmail.com" girer
    And kullanici save butonunu tiklar
    And kullanici Email kutusundaki bilginin guncellendigini assert eder
    Then Kullanici cikis yapar

  @Tc008
  Scenario: Tc008 Kullanici Ayarlar sayfasinda dil secenegini "English" yapabilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Dil DropDowndan "English" secer
    And kullanici save butonunu tiklar
    And kullanici Dil DropDown bilginin English oldugunu assert eder
    Then Kullanici cikis yapar

  @Tc009
  Scenario: Tc009 Kullanici Ayarlar sayfasinda dil secenegini "Turkce" yapabilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Dil DropDowndan "Türkçe" secer
    And kullanici save butonunu tiklar
    And kullanici Dil DropDown bilginin English oldugunu assert eder
    Then Kullanici cikis yapar

  @Tc010
  Scenario: Tc010 Kullanici Ayarlar sayfasinda "English ve Türkçe" disinda dil secenegi goruntuleyememeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Ayarlar sayfasindaki dil dropdownda iki dil oldugunu goruntuler
    And kullanici Fransizca dil secenegi olmadigini assert eder.
    Then Kullanici cikis yapar


  @Tc011
  Scenario Outline: Tc011 Kullanici Ayarlar sayfasinda mail bilgisine invalid degerler girip hata mesaji alir
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici gercek verilerle giris yapar
    And kullanici hesap dropdowna tiklar
    And kullanici hesap menuden dropdown  Ayarlar sekmesine tiklar
    And kullanici Email kutusunu tiklar
    And kullanici Email kutusnu temizler
    And kullanici Email kutusna "<email>" girer
    And kullaniciEmail kutusunun altinda hata mesajini assert eder
    Then Kullanici cikis yapar

    Examples: Test data
      | email |
      |abc@.com|
      |abggmail.com|
      |abc@gmailcom|




