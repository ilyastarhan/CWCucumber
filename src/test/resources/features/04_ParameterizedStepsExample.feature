Feature: Parametreli step kullanimi

  Scenario: Cucumber Step Definition(Cucumber Edition)
    Given Ilk sayi 5
    And Ikinci sayi 3
    When Bu sayilari + operatorune sokarsam
    Then Sonuc 8 olmalidir


  Scenario: Cucumber Step Definition (RegEx Edition)
    Given Ilk sayi 5
    And Ikinci sayi 3
    When Bu sayilari + operatorune sokarsam
    Then Sonuc 8 olmalidir

  Scenario Outline:
    Given Ilk sayi <sayi1>
    And Ikinci sayi <sayi2>
    When Bu sayilari <operator> operatorune sokarsam
    Then Sonuc <result> olmalidir

    Examples:
      | sayi1 | sayi2 | operator |result|
      | 5     | 3     | +        |8     |
      | 6     | 4     | -        |2     |
      | 7     | 3     | *        |20    |
      | 10    | 2     | /        |5     |