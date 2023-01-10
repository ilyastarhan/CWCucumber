Feature: Google Arama Feature
  Background:
    Given Kullanici google sayfasindadir


    Scenario: cucumber search
      When Kullanici "cucumber" yazdiginda
      Then Kullanici title da "cucumber" gormelidir



