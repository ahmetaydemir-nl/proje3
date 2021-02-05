@AllCustomerInfo
Feature: Tum musterilerin bilgilerini dogrula




  @api
  Scenario: Tum musterileri oku
    Given kullanici api end pointi "https://www.gmibank.com/api/tp-customers" kullanarak tum yanitlari set eder
    And kulllanici country verilerini json olarak java pojo ya cevirir
    Then kullanici verileri dogrular