package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web driver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com/");

    // aramakutusunu locate ediniz ve iphone aratınız
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("iphone");

        Thread.sleep(2000);
        aramaKutusu.submit(); //  Keys.ENTER yerine submit() kullanabiliriz.

        // geri gidip 2. kez arama yaptırdık
        driver.navigate().back();
        aramaKutusu.sendKeys("samsung");
        aramaKutusu.submit(); // StaleElementReferenceException --> bir variale'a atadığımız elementi
                             // geri gidip tekrar kullanmaya çalıştığımız için reference bayat Exception'ı veriyor.

    // sayfayı kapatınız

       // driver.close();



    }
}
