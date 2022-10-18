package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.a101tests;
import utilities.Driver;

import java.time.Duration;

public class MyStepdefsA101 {

    pageObjectModel.a101tests a101tests=new a101tests();
    private WebDriver driver;


    @Given("Web sitesine gidilir")
    public void webSitesineGidilir() {
        driver=Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr");
    }

    @And("Cerezleri kabul edilir")
    public void cerezleriKabulEdilir() {

    }

    @And("Giyim-Aksesuar butonuna tıklanır")
    public void giyimAksesuarButonunaTıklanır() {
        a101tests.clickGiyimAksesuarButton();
    }

    @And("Kadın İç Giyim kategorisine tıklanır")
    public void kadınİçGiyimKategorisineTıklanır() {
        a101tests.KadinicgiyimButton();
    }

    @And("Dizaltı Çorap Kategorisini Seçilir")
    public void dizaltıÇorapKategorisiniSeçilir() {
        a101tests.clickDizaltiCorap();
    }

    @And("Renklerden Siyah Rengi seçilir")
    public void renklerdenSiyahRengiSeçilir() throws InterruptedException {
        a101tests.clickSiyahCheckBox();
    }

    @And("İçinde Siyah geçen bir ürünü seçilir")
    public void içindeSiyahGeçenBirÜrünüSeçilir() throws InterruptedException {
      a101tests.siyahUrunSecim();
    }

    @Then("ürünün siyah olduğunu doğrulanır")
    public void ürününSiyahOlduğunuDoğrulanır() throws InterruptedException {
        a101tests.siyatTextVerify();
    }

    @And("Sepete Ekle butonuna basılır")
    public void sepeteEkleButonunaBasılır() throws InterruptedException {
        a101tests.sepeteEkleButonu();
    }

    @And("Sepeti Görüntüle butonuna basılır")
    public void sepetiGörüntüleButonunaBasılır() throws InterruptedException {
        a101tests.sepetigoruntuleme();
    }

    @And("Sepeti Onayla butonuna basılır")
    public void sepetiOnaylaButonunaBasılır() throws InterruptedException {
        a101tests.sepetOnayButon();
    }

    @And("Üye olmadan devam et butonuna basılır")
    public void üyeOlmadanDevamEtButonunaBasılır() throws InterruptedException {
        a101tests.uyeOlmadanDevamButon();
    }

    @And("{string} mail adresi yazılır")
    public void mailAdresiYazılır(String mail) throws InterruptedException {
        a101tests.mailAdresi(mail);
    }

    @And("Devam Et butonuna basılır")
    public void devamEtButonunaBasılır() {
        a101tests.devamEtButon();
    }

    @And("Yeni Adres Oluştur linkine basılır")
    public void yeniAdresOluşturLinkineBasılır() {
        a101tests.yeniAdresbuton();
    }

    @And("{string} adres başlığı yazılır.")
    public void adresBaşlığıYazılır(String adresBasligi) throws InterruptedException {
        a101tests.adresbasligiIsmi(adresBasligi);
    }

    @And("{string} isim yazılır.")
    public void isimYazılır(String isim) throws InterruptedException {
        a101tests.isimYazimi(isim);
    }

    @And("{string} soyadı yazılır")
    public void soyadıYazılır(String soyad) throws InterruptedException {
        a101tests.soyadYazimi(soyad);
    }

    @And("{string} cep telefonu yazılır.")
    public void cepTelefonuYazılır(String cepTelefonu) throws InterruptedException {
        a101tests.CepTelefonuYazimi(cepTelefonu);
    }

    @And("{string} adres yazılır.")
    public void adresYazılır(String adres) throws InterruptedException {
        a101tests.adresYazimi(adres);
    }

    @And("{string} şehir seçilir")
    public void şehirSeçilir(String sehir) throws InterruptedException {
        a101tests.sehirYazimi(sehir);
    }

    @And("{string} ilçe seçilir")
    public void ilçeSeçilir(String ilce) throws InterruptedException {
        a101tests.ilceYazimi(ilce);
    }

    @And("{string} mahalle seçilir")
    public void mahalleSeçilir(String mahalle) throws InterruptedException {
        a101tests.mahalleYazimi(mahalle);
    }

    @And("Kaydet butonuna basılır.")
    public void kaydetButonunaBasılır() throws InterruptedException {
        a101tests.clickSaveButton();
    }

    @And("Kargo firması seçilir")
    public void kargoFirmasıSeçilir() {
        a101tests.clickCargoCompany();
    }

    @And("Kaydet ve Devam Et butonuna basılır.")
    public void kaydetVeDevamEtButonunaBasılır() throws InterruptedException {
        a101tests.clickSaveAndContinue();
    }

    @And("Siparişi Tamamla butonuna basılır")
    public void siparişiTamamlaButonunaBasılır() {
        a101tests.clickCompleteOrder();
    }

    @Then("Kart ile ödeme mesajının geldiği görülür.")
    public void kartIleÖdemeMesajınınGeldiğiGörülür() {
        a101tests.assertMyMessage();
        Driver.tearDown();
    }
    }
