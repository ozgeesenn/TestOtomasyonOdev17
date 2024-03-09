Feature: ODEV 17 IKINCI SORU

  @Test
  Scenario: Odev 17 ikinci soru
    When Open the web site
    And Press : DemoQA : WebTables butonuna tiklanilir
    And Press : DemoQA : Add butonuna tiklanilir
    And Fill in : DemoQA : First Name "Özge"
    And Fill in : DemoQA : Last Name "Şen Kaya"
    And Fill in : DemoQA : Email "ozgeesenn1995@gmail.com"
    And Fill in : DemoQA : Age "28"
    And Fill in : DemoQA : Salary "7890876"
    And Fill in : DemoQA : Department "QA"
    Then Press : DemoQA : Submit butonuna tiklanilir
    And Press : DemoQA : Emaili "ozgeesenn1995@gmail.com" olan kaydin duzenle butonuna tiklanilir
    And Fill in : DemoQA : First Name "Ezgi"
    And Fill in : DemoQA : Last Name "Çelik"
    Then Press : DemoQA : Submit butonuna tiklanilir

