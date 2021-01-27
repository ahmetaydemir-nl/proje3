@US15Test @SmokeTest
Feature: US15 Test

  Background: Gmibank sitesine customer olarak giriş yapma.
    Given ana sayfa "http://www.gmibank.com/" adresine gidiniz
    And   menu butonuna tıklayınız
    And   sign in tıklayınız
    And   username "osmntest" giriniz
    And   password "Osman2015" giriniz
    Then  sign in butonuna tıklayınız
    Then  My Operations butonuna tıklayınız

  @TC15_01
  Scenario: TC15_01 Kullanıcı hesap türlerini ve bilancolarını görebilmeli
    Given My Account dropdown'ı seçip tıklayınız
    Then  Kullanıcı hesap tablosunda hesap türleri görünür olmalı.
    Then  Kullanıcı hesap tablosunda hesap bilancoları görünür olmalı.
    And   menu butonuna tıklayınız
    Then  Sign Out butonuna tıklayınız.

  @TC15_02
  Scenario: TC15_02 Kullanıcı hesap tablosunda geçmiş yapılan işlemler görünür olmalı.
    Given My Account dropdown'ı seçip tıklayınız
    Then  Kullanıcı View Transaction butonuna tıklayınca hesap tablosunda geçmiş yapılan işlemleri görebilmeli.
    And   menu butonuna tıklayınız
    Then  Sign Out butonuna tıklayınız.




