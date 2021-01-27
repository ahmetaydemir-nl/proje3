@TC_16Test @SmokeTest
  Feature: US16 TEST
    Background: Gmibank sitesine customer olarak giriş yapma.
      Given ana sayfa "http://www.gmibank.com/" adresine gidiniz
      And   menu butonuna tıklayınız
      And   sign in tıklayınız
      And   username "osmntest" giriniz
      And   password "Osman2015" giriniz
      Then  sign in butonuna tıklayınız
      Then  My Operations butonuna tıklayınız
      Then  Transfer Money butonunu tıklayınız

  @TC16_01
  Scenario: TC16_01 From butonuna tıklanınca en az iki hesap gözüküyor mu.
    Given   From dropdownda en az iki hesap gözüküyormu kontrol et.
    And     menu butonuna tıklayınız
    Then    Sign Out butonuna tıklayınız.


  @TC16_02
  Scenario: TC16_02 From butonunu tıklanınca gözüken hesaplardan istenilen birisi seçilebiliyor mu.
    Then    From butonunu tıkla rastgele bir hesap sec.
    And     menu butonuna tıklayınız
    Then    Sign Out butonuna tıklayınız.

  @TC16_03
  Scenario: TC16_03 To butonunu tıklanınca gözüken hesaplardan istenilen birisi seçilebiliyor mu.
    Given   From butonunu tıkla rastgele bir hesap sec.
    Then    To butonunu tıkla rastgele bir hesap sec.
    And     menu butonuna tıklayınız
    Then    Sign Out butonuna tıklayınız.

  @TC16_04
  Scenario: TC16_04 Description kutucuğu boş bırakılınca işlem gerçekleşmemeli.
    Given   From butonunu tıkla rastgele bir hesap sec.
    And     To butonunu tıkla rastgele bir hesap sec.
    And     Balance kutucuğunu tıkla
    And     Balance kutucuğuna "50" yaz
    And     Make Transfer butonunu tıkla
    Then    Description kutucuğunun kırmızı olduğunu doğrula.
    And     menu butonuna tıklayınız
    Then    Sign Out butonuna tıklayınız.

  @TC16_05
  Scenario: TC16_05 From üzerinden seçilen hesaptaki para miktarı kadar veya daha düşük miktarı transferi etmeyi dene.
    Given   From butonunu tıkla rastgele bir hesap sec.
    And     To butonunu tıkla rastgele bir hesap sec.
    And     Balance kutucuğunu tıkla
    And     From dropdonda seçilen hesaptaki bakiye miktarına eşit veya daha düşük bir meblağ gir.
    And     Description kutucuğunu tıkla.
    And     Bir açıklama yaz.
    And     Make Transfer butonunu tıkla
    Then    ekranda "transfer is done successfully" mesajı görünmeli.
    And     menu butonuna tıklayınız
    Then    Sign Out butonuna tıklayınız.

  @TC16_06
  Scenario: TC16_06 From üzerinden seçilen hesaptaki para miktarından daha büyük bir miktarı
  transfer etmeye çalış ve uyarı mesajı al.
    Given   From butonunu tıkla rastgele bir hesap sec.
    And     To butonunu tıkla rastgele bir hesap sec.
    And     Balance kutucuğunu tıkla
    And     From dropdownda seçilen hesaptaki bakiye miktarından daha büyük bir meblağ gir.
    And     Description kutucuğunu tıkla.
    And     Bir açıklama yaz.
    And     Make Transfer butonunu tıkla
    Then    10-Ekranda "Translation-not-" hata mesajı görünmeli.
    And     menu butonuna tıklayınız
    Then    Sign Out butonuna tıklayınız.


