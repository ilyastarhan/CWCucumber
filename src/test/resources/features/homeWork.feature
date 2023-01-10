Feature: homeWork
  Background: ortak stepler
    Given Kullanici google sayfasindadir
  Scenario: Cucumber
    When kulanici cucumber icin arama yapar
    Then sayfa basliginin cucumber kelimesi icerdigini test eder
    And sayfayi kapatir
  Scenario: Selenium
    When kulanici selenium icin arama yapar
    Then sayfa basliginin selenium kelimesi icerdigini test eder
    And sayfayi kapatir

  Scenario: Samsung
    When kulanici samsung icin arama yapar
    Then sayfa basliginin samsung kelimesi icerdigini test eder
    And sayfayi kapatir