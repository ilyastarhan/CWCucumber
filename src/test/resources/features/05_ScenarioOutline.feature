Feature: Google Arama Feature

  #Scenario Outline DDT yapma yetenegini bizlere saglar
  #Testmiz tabloda bulunna satir sayisi kadar sirasiyla her bir satirdaki verilerle calistirilir
  Scenario Outline:
    Given Kullanici google sayfasindadir
    When Kullanici "<aranacakKelime>" yazdiginda
    Then Kullanici title da "<dogrulanacakKelime>" gormelidir

    Examples:
    |aranacakKelime|dogrulanacakKelime|
    |selenium      |selenium          |
    |samsung       |samsung           |
    |cucumber      |cucumber          |