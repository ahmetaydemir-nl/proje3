@AdminGiris

  @giris
  Feature: Admin Kullanici rolunu etkinlestirir,edit eder ve siler
    Background:Kullanici Admin olarak giris yapar ve user management sayfasina gider
      Given "https://gmibank.com/" adresine gider ve admin olarak giris yapar
      Then Administratorion droppdownundan User management linkine tiklar

  @UserRolEtkilestirmesi
    Scenario: Admin user rolunu etkinlestirir
      Given user icin kayit bulur ve edit butonuna tiklar
      And Acilan sayfada Actived kutusunu tiklar ve profilden ROLE_USER atamasi yapar
      And Save butonuna tiklar
      Then user icin assert eder

  @EmployeeRolEtkinlestirmesi
  Scenario: Admin employee rolunu etkinlestirir
    Given employee icin kayit bulur ve edit butonuna tiklar
    And Acilan sayfada Actived kutusunu tiklar ve profilden ROLE_EMPLOYEE atamasi yapar
    And Save butonuna tiklar
    Then employee icin assert eder

  @ManegerRolEtkinlestirmesi
  Scenario: Admin manager rolunu etkinlestirir
    Given manager icin kayit bulur ve edit butonuna tiklar
    And Acilan sayfada Actived kutusunu tiklar ve profilden ROLE_MANAGER atamasi yapar
    And Save butonuna tiklar
    Then manager icin assert eder

  @AdminRolEtkinlestirmesi
  Scenario: Admin admin rolunu etkinlestirir
    Given admin icin kayit bulur ve edit butonuna tiklar
    And Acilan sayfada Actived kutusunu tiklar ve profilden ROLE_ADMIN atamasi yapar
    And Save butonuna tiklar
    Then admin icin assert eder

  @ViewButonu
  Scenario: admin kullanici bilgilerini göruntuler
    Given user icin kayit bularak view butonuna tiklar ve geri gelir
    And employee icin kayit bularak view butonuna tiklar ve geri gelir
    And manager icin kayit bularak view butonuna tiklar ve geri gelir
    Then admin icin kayit bularak view butonuna tiklar ve geri gelir

  @EditButonu
  Scenario: admin kullanici bilgilerini edit eder
    Given user icin kayit bularak edit butonuna tiklar ve logini "-hk" edit eder
    And employee icin kayit bularak edit butonuna tiklar ve logini "-jk" edit eder
    And manager icin kayit bularak edit butonuna tiklar ve logini "-ss" edit eder
    And admin icin kayit bularak edit butonuna tiklar ve logini "-nv" edit eder
    Then Save butonuna tiklar

  @DeleteButonu
  Scenario: admin kullanici bilgilerini siler
    Given user icin kayit bularak delete butonuna tiklar
    And employee icin kayit bularak delete butonuna tiklar
    And manager icin kayit bularak delete butonuna tiklar
    And admin icin kayit bularak delete butonuna tiklar
    Then Save butonuna tiklar

  @CustomerRolEtkilestirmesi
  Scenario: Admin user rolunu etkinlestirir
    Given My Operations droppdownundan Manage Customers linkine tiklar
    Given customer icin kayit bulur ve edit butonuna tiklar
    And Acilan sayfada Actived kutusunu tiklar
    Then Save butonuna tiklar

  @CustomerViewButonu
  Scenario: admin custumer view butununu göruntuler
    Given customer icin kayit bularak view butonunu assert eder

  @CustomerEditButonu
  Scenario: admin custumer edit butununu göruntuler
    Given customer icin kayit bularak edit butonunu assert eder

  @CustomerinEditEdilmesi
  Scenario: admin customer bilgilerini edit eder
    Given customer icin kayit bularak edit butonuna tiklar ve logini "-mr" edit eder
    And  Acilan sayfada Actived kutusunu tiklar
    Then Save butonuna tiklar

  @CustomerDeleteButonu
  Scenario: admin customer bilgilerini siler
    Given customer icin kayit bularak delete butonuna tiklar
    Then Save butonuna tiklar

    @SmokeTest
    Scenario: Admin yeni kayidi etkinlestirir
      Given Olusturulan Musteri bulunur Edite tiklanir
      And musteri Active edilir
      Then save butonuna tiklanir ve cikis yapilir