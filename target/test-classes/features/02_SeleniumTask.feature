Feature: Google search test
  Scenario: Google da bir kelime arandiginda ilgili kelimeyi barindiran sonuclar goruntulenmelidir
    Given kullanici google sayfasina gider
    When kullanici samsung kelimesini arar
    Then kullanici sayfada samsung kelimesi gectigini dogrular