Feature: Uçtan Uca Ödeme Test

  Scenario:Kadın Dizaltı Siyah Çorap Satın Alınması

    Given Web sitesine gidilir
    And Cerezleri kabul edilir
    And Giyim-Aksesuar butonuna tıklanır
    And Kadın İç Giyim kategorisine tıklanır
    And Dizaltı Çorap Kategorisini Seçilir
    And Renklerden Siyah Rengi seçilir
    And İçinde Siyah geçen bir ürünü seçilir
    Then ürünün siyah olduğunu doğrulanır
    And Sepete Ekle butonuna basılır
    And Sepeti Görüntüle butonuna basılır
    And Sepeti Onayla butonuna basılır
    And Üye olmadan devam et butonuna basılır
    And Mail adresi yazılır
    And Devam Et butonuna basılır
    And Yeni Adres Oluştur linkine basılır
    And "<adresassign>" adres başlığı yazılır.
    And "<ad>" isim yazılır.
    And "<soyad>" soyadı yazılır
    And <cepTelefonu> cep telefonu yazılır.
    And "<adres>" adres yazılır.
    And "<il>" şehir seçilir
    And "<ilce>" ilçe seçilir
    And "<mahalle>" mahalle seçilir
    And Kaydet butonuna basılır.
    And Kargo firması seçilir
    And Kaydet ve Devam Et butonuna basılır.
    And Siparişi Tamamla butonuna basılır
    Then "Kart ile ödeme" mesajının geldiği görülür.