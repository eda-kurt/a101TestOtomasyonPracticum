package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class a101tests extends abstractClass {
    private WebDriver driver;

    public a101tests()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }
    @FindBy(xpath = "//div[@class='closePopupPersona']")
    private WebElement closePopupElement;
    public void closePopUp(){
        clickFunction(closePopupElement);
    }

    @FindBy(xpath = "//a[contains(text(),'Giyim & aksesuar')]")
    private WebElement giyimaksesuarElement;
    public void clickGiyimAksesuarButton(){
        clickFunction(giyimaksesuarElement);}
    @FindBy(linkText = "Kadın İç Giyim")
    private WebElement KadinIcgiyim;
    public void KadinicgiyimButton(){clickFunction(KadinIcgiyim);
    }
    @FindBy(xpath = "//a[@data-value='1567']")
    private WebElement dizAltiCorapElement;

    public void clickDizaltiCorap() {
        clickFunction(dizAltiCorapElement);
    }

    @FindBy(xpath ="/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[2]/ul[3]/li[2]/label")
    private WebElement siyahElement;
    public void clickSiyahCheckBox() throws InterruptedException {
        Thread.sleep(5000);
        clickFunction(siyahElement);}

    @FindBy(xpath = "//img[@alt='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    private WebElement siyahUrunElement;
    public void siyahUrunSecim()throws InterruptedException{
        Thread.sleep(2000);
        clickFunction(siyahUrunElement);
    }
    @FindBy(xpath = "//div[@class='selected-variant-text']")
    private WebElement siyahText;
    public void siyatTextVerify()throws InterruptedException{
        Thread.sleep(2000);
        Assertion(siyahText.getText(), "Seçılen Renk: SİYAH");
        System.out.println("Siyah urun secildi");
    }
    @FindBy(xpath = "//button[@data-pk=\"18864\"]")
    private WebElement sepetEkleElement;
    public void sepeteEkleButonu()throws InterruptedException{
        Thread.sleep(2000);
        clickFunction(sepetEkleElement);
    }
    @FindBy(xpath = "//a[@class='go-to-shop']")
    private WebElement sepetGoruntuElement;
    public void sepetigoruntuleme()throws InterruptedException{
        Thread.sleep(2000);
        clickFunction(sepetGoruntuElement);
    }
    @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    private WebElement sepetOnayElement;
    public void sepetOnayButon()throws InterruptedException{
        Thread.sleep(2000);
        clickFunction(sepetOnayElement);
    }
    @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    private WebElement uyeOlmadanDevamElement;
    public void uyeOlmadanDevamButon()throws InterruptedException{
        Thread.sleep(2000);
        clickFunction(uyeOlmadanDevamElement);
    }
    @FindBy(name = "user_email")
    private WebElement mail;
    public void mailAdresi(String maill)throws InterruptedException{
        Thread.sleep(2000);
    sendKeysFunction(mail,maill);
    }
    @FindBy(xpath = "//button[@class='button block green']")
    private WebElement devametElement;
    public void devamEtButon(){
        clickFunction(devametElement);

    }
    @FindBy(xpath = "/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a/em")
    private WebElement adresOlusturElement;
    public void yeniAdresbuton(){
        clickFunction(adresOlusturElement);

    }
    @FindBy(name = "title")
    private WebElement adresBasligi;
    public void adresbasligiIsmi(String adress)throws InterruptedException{
        Thread.sleep(2000);
        sendKeysFunction(adresBasligi,adress);

    }
    @FindBy(name = "first_name")
    private WebElement isim;
    public void isimYazimi(String isimm)throws InterruptedException{
        Thread.sleep(2000);
        sendKeysFunction(isim,isimm);
    }
    @FindBy(name = "last_name")
    private WebElement soyad;
    public void soyadYazimi(String soyadd)throws InterruptedException{
        Thread.sleep(2000);
        sendKeysFunction(soyad,soyadd);
    }
    @FindBy(name = "phone_number")
    private WebElement cepTelefonu;
    public void CepTelefonuYazimi(String ceptelefonu)throws InterruptedException{
        Thread.sleep(2000);
        sendKeysFunction(cepTelefonu,ceptelefonu);
    }
    @FindBy(name = "line")
    private WebElement adres;
    public void adresYazimi(String adresss)throws InterruptedException{
        Thread.sleep(2000);
        sendKeysFunction(adres,adresss);
    }
    @FindBy(name = "city")
    private WebElement sehir;
    public void sehirYazimi(String sehirr)throws InterruptedException{
        Thread.sleep(2000);
        sendKeysFunction(sehir,sehirr);
    }
    @FindBy(name = "township")
    private WebElement ilce;
    public void ilceYazimi(String ilcee)throws InterruptedException{
        Thread.sleep(2000);
        sendKeysFunction(ilce,ilcee);
    }
    @FindBy(name = "district")
    private WebElement mahalle;
    public void mahalleYazimi(String mahallee)throws InterruptedException{
        Thread.sleep(2000);
        sendKeysFunction(mahalle,mahallee);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/form/button[1]")
    private WebElement kaydetElement;

    public void clickSaveButton() throws InterruptedException {
        Thread.sleep(1000);
        clickFunction(kaydetElement);
    }

    @FindBy(css = "label[class='js-checkout-cargo-item'] div[class='radio']")
    private List<WebElement> element;

    public void clickCargoCompany() {
        element = driver.findElements(By.cssSelector("label[class='js-checkout-cargo-item'] div[class='radio']"));
        element.get(0).click();
    }

    @FindBy(xpath = "//body[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")
    private WebElement saveAndContinueElement;

    public void clickSaveAndContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickFunction(saveAndContinueElement);
    }

    @FindBy(xpath = "/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button")
    private WebElement completeOrderElement;

    public void clickCompleteOrder() {
        clickFunction(completeOrderElement);
    }

    @FindBy(xpath = "//div[contains(text(),'Kart ile ödeme')]")
    private WebElement successMessage;

    public void assertMyMessage() {
        Assertion(successMessage,"Kart ile ödeme");
    }
}








