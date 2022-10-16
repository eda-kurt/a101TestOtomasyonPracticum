package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjectModel.a101tests;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
   a101tests a101tests=new a101tests();
    private WebDriver driver;
    @Given("Web sitesine gidilir")
    public void webSitesineGidilir() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
    public void içindeSiyahGeçenBirÜrünüSeçilir() {
    }

    @Then("ürünün siyah olduğunu doğrulanır")
    public void ürününSiyahOlduğunuDoğrulanır() {
    }

    @And("Sepete Ekle butonuna basılır")
    public void sepeteEkleButonunaBasılır() {
    }

    @And("Sepeti Görüntüle butonuna basılır")
    public void sepetiGörüntüleButonunaBasılır() {
    }

    @And("Sepeti Onayla butonuna basılır")
    public void sepetiOnaylaButonunaBasılır() {
    }

    @And("Üye olmadan devam et butonuna basılır")
    public void üyeOlmadanDevamEtButonunaBasılır() {
    }

    @And("Mail adresi yazılır")
    public void mailAdresiYazılır() {
    }

    @And("Devam Et butonuna basılır")
    public void devamEtButonunaBasılır() {
    }

    @And("Yeni Adres Oluştur linkine basılır")
    public void yeniAdresOluşturLinkineBasılır() {
    }

    @And("{string} adres başlığı yazılır.")
    public void adresBaşlığıYazılır(String arg0) {
    }

    @And("{string} isim yazılır.")
    public void isimYazılır(String arg0) {
    }

    @And("{string} soyadı yazılır")
    public void soyadıYazılır(String arg0) {
    }

    @And("<cepTelefonu> cep telefonu yazılır.")
    public void ceptelefonuCepTelefonuYazılır() {
    }

    @And("{string} adres yazılır.")
    public void adresYazılır(String arg0) {
    }

    @And("{string} şehir seçilir")
    public void şehirSeçilir(String arg0) {
    }

    @And("{string} ilçe seçilir")
    public void ilçeSeçilir(String arg0) {
    }

    @And("{string} mahalle seçilir")
    public void mahalleSeçilir(String arg0) {
    }

    @And("Kaydet butonuna basılır.")
    public void kaydetButonunaBasılır() {
    }

    @And("Kargo firması seçilir")
    public void kargoFirmasıSeçilir() {
    }

    @And("Kaydet ve Devam Et butonuna basılır.")
    public void kaydetVeDevamEtButonunaBasılır() {
    }

    @And("Siparişi Tamamla butonuna basılır")
    public void siparişiTamamlaButonunaBasılır() {
    }

    @Then("{string} mesajının geldiği görülür.")
    public void mesajınınGeldiğiGörülür(String arg0) {
    }
}
