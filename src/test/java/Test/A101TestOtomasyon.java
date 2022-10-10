package Test;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A101TestOtomasyon {
    @Test

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/siriden/selenium/driver2/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.a101.com.tr");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("div>ul[class=desktop-menu]>:nth-child(4)")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.categories > ul > li:nth-child(6) > a")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("div.categories > ul > li:nth-child(4) > a")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("img[alt=\"Penti Kadın 50 Denye Pantolon Çorabı Siyah\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(" div.product-buy-info.js-product-buy-info > button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(" a.go-to-shop")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(" div.col-sm-3 > div > a")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("  div.auth__form__proceed__wrapper > a")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name=\"user_email\"]")).sendKeys("edakarahankurt@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(" div.row.js-block-email > div > div > form > button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(" div.addresses > div.list > ul:nth-child(3) > li > a")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name=title]")).sendKeys("ev");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name=first_name]")).sendKeys("Eda");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name=last_name]")).sendKeys("Kurt");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name=phone_number]")).sendKeys("5558698973");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select[name=city]>option[value=\"40\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select[name=township]>option[value=\"474\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select[name=district]>option[value=\"36005\"]")).click();
        Thread.sleep(1000);
        DateTimeFormatter cem = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime siri = LocalDateTime.now();
        driver.findElement(By.cssSelector("textarea[name=line]")).sendKeys("inonu cad. eksioglu apartmani no/16 " + cem.format(siri) );
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.js-post-code")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.js-post-code")).sendKeys("34000");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.button.green.js-set-country.js-prevent-emoji")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.cargo > button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("span.order-complete")).click();
        Thread.sleep(1000);
        driver.quit();




    }
}
