@login
Feature: Login page
  Scenario: kullanici birinci derece password olusturur
    Given kullanici anasayfaya gider "http://www.gmibank.com/"
    And login linkine tiklar
    And register linkine tiklar
    And kullanici ssn numarasini ssn girer
    And kullanici firstname ve lastname girer
    And kullanici address girer
    And kullanici mobile phone number girer
    And kullanici username  girer
    And kullanici email girer
    And kullanici new password girer
    And kullanici new password confirmation girer
    And kullanici register butonuna tiklar
    Then kullanici kayit mesajini gorur