package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class a101tests extends abstractClass {
    private WebDriver driver;

    public a101tests() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }


    @FindBy(xpath = "//a[contains(text(),'Giyim & aksesuar')]")
    private WebElement giyimaksesuarElement;
    public void clickGiyimAksesuarButton(){
        clickFunction(giyimaksesuarElement);}
    @FindBy(linkText = "Kadın İç Giyim")
    private WebElement KadinIcgiyim;
    public void KadinicgiyimButton(){clickFunction(KadinIcgiyim);
    }
    @FindBy(xpath = "//body/section[1]/section[4]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement dizAltiCorapElement;

    public void clickDizaltiCorap() {
        clickFunction(dizAltiCorapElement);
    }

    @FindBy(xpath = "/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[2]/ul[3]/li[2]/label")

    private WebElement siyahElement;

    public void clickSiyahCheckBox() throws InterruptedException {
        Thread.sleep(2000);
        clickFunction(siyahElement);}






}
