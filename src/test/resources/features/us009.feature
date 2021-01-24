Feature: us009

  Background: employee olarak giris yapmak
    Given kullanici employee olarak giris yapar

    @us009
  Scenario: kayitli kullanicinin ssn ile cagrilmasi
    Given kullanici "http://www.gmibank.com/tp-customer/new" sayfasina gider
    Given kullanici SSN kutusuna "291-34-8310" numarasini yazar
    And kullanici  search  butonuna tiklar
    And kullanici "team27admin@gmail.com" islemi assert  eder
    Given kullanici teamtrycatch butonuna tiklar
    Then kullanici  cikis  yapar


