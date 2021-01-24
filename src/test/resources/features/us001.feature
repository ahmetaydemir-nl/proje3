@login
Feature: kullanici registration'dan kayit yapar
  Background: kullanici login sayfasina gider


    Given kullanici gmibank sayfasina "https://gmibank.com" gider
    And login linkine tiklar

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

    Examples: Kayit verileri
      | ssn       | firstname | lastname | address    | mobile phone number | username | email                | new password | new password confirmation |
      |123-12-1964| team27    | team27   | yokus sok | 123-123-1264        | team27   | team27@gmail.com| Team-27      | Team-27                   |
      #|123-12-1964| team27    | team27   | yokus sok | 123-123-1264        | 12       | team27@gmail.com| Team-27      | Team-27                   |

