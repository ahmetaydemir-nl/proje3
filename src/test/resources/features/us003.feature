@login
Feature: kullanici registration'dan kayit yapar
  Background: kullanici login sayfasina gider

  @registration
  Scenario Outline: kullanici kayit olur
    And register linkine tiklar
    And kullanici ssn numarasini "<ssn>" girer
    And kullanici firstname "<firstname>" ve lastname "<lastname>" girer
    And kullanici address "<address>" girer
    And kullanici mobile phone number "<mobile phone number>" girer
    And kullanici username "<username>" girer
    And kullanici email "<email>" girer
    And kullanici new password "<new password>" girer
    And kullanici new password confirmation "<new password confirmation>" girer
    Then kullanici register butonuna tiklar
    # user name sadece rakam olamazdı ama rakam yazdığımızda kayıt yapıyor
    Examples: Registration info
      | ssn       | firstname | lastname | address    | mobile phone number | username | email                | new password | new password confirmation |
      |123-12-1934| team17    | team17   | cikmaz sok | 123-123-1234        | team17   | rumeysa2903@gmail.com| Team-17      | Team-17                   |
      #|123-12-1934| team17    | team17   | cikmaz sok | 123-123-1234        | 12       | rumeysa2903@gmail.com| Team-17      | Team-17                   |


    Given kullanici gmibank sayfasina "https://gmibank.com" gider
    And login linkine tiklar

@registrationpasswordyesilrenk
Scenario Outline: kullanici paswordun 1.dereceden guclulugunu test eder
And register linkine tiklar
And kullanici gecerli newpassword "<new password>" girer
Examples: sifre kontrol
|new password|
|AAAAAAA  |


@registrationpasswordturuncurenk
Scenario Outline: kullanici paswordun 2.dereceden guclulugunu test eder
And register linkine tiklar
And kullanici gecerli new password "<new password>" girer
Examples: sifre kontrol
|new password|
|12a4567   |



@registrationpasswordkirmizirenk
Scenario Outline: kullanici paswordun 1.dereceden guclulugunu test eder
And register linkine tiklar
And kullanici gecerli newpassword "<new password>" girer
Examples: sifre kontrol
|new password|
|AAAAAAA  |
