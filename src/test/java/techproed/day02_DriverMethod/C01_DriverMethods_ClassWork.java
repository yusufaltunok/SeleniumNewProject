package techproed.day02_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {

        System.setProperty("web driver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Sayfa başlığının Amazon içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Url'in https://amazon.com/ olduğunu test edelim.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED --> "+ actualUrl);

        //Sayfayı kapatalım.
        driver.close(); // Browser'ı kapatır.

        // driver.quit(); // Birden fazla Browser varsa hepsini kapatır.


/*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
                Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.


*/



    }

}
