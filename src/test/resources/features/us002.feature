@login
Feature: kullanici registration'dan kayit yapar
  Background: kullanici login sayfasina gider


    Given kullanici gmibank sayfasina "https://gmibank.com" gider
    And login linkine tiklar

@registrationnegative
Scenario Outline: kullanici kayit olur
And kayit linkine tiklar
And ssn numarasini "<ssn>" girer
And firstname "<firstname>" ve lastname "<lastname>" girer
And  address "<address>" girer
And  mobile phone number "<mobile phone number>" girer
And  username "<username>" girer
And  email "<email>" girer
And  new password "<new password>" girer
And  new password confirmation "<new password confirmation>" girer
And kullanici register butonuna tiklar
Then  hata mesajini gorur

Examples: Registration info
| ssn       | firstname | lastname | address    | mobile phone number | username | email           | new password | new password confirmation |
|923-12-1234| team27    | team27   | yokus sok | 123-123-1234        | team27   | team27@gmail.com| Team-27      | Team-27                   |
|           | team27    | team27   | yokus sok | 123-123-1234        | team27   | team27@gmail.com| Team-27      | Team-27                   |
|123-12-1234|           | team27   | yokus sok | 123-123-1234        | team27   | team27@gmail.com| Team-27      | Team-27                   |
|123-12-1234| team27    |          | yokus sok | 123-123-1234        | team27   | team27@gmail.com| Team-27      | Team-27                   |
|123-12-1234| team27    | team27   | yokus sok | 123-123-1234        |          | team27@gmail.com| Team-27      | Team-27                   |
|123-12-1234| team27    | team27   | yokus sok | 123-123-1234        | team27   |                 | Team-27      | Team-27                   |
|123-12-1234| team27    | team27   | yokus sok | 123-123-1234        | team27   | team27@gmail.com|              | Team-27                   |
|123-12-1234| team27    | team27   | yokus sok | 123-123-1234        | team27   | team27@gmail.com| Team-27      |                           |
