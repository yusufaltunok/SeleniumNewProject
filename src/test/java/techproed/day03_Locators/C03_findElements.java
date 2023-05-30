package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_findElements {
    public static void main(String[] args) {

        System.setProperty("web driver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
         driver.get("https://www.amazon.com/");

        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın

        /*
        findelement ile bir webelemente ulaşabilirken, birden fazla webelement için findelements() methodunu kullanırız.
        Bu webelementlerin sayısına ulaşmak için ya da bu web elementlerin yazısını konsola yazdırabilmek için
        List<Webelement> linklerLlistesi=driver.findelements(By.locator("locator değeri")) olarak kullanırız.
        Oluşturmuş olduğumuz List'i loop ile konsola yazdırabiliriz
     */
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayısı : " + linklerListesi.size());
/*
        // Linkleri konsolda yazdırın
        for (WebElement w : linklerListesi) {
            if (!w.getText().isEmpty()){ // boş olan linkleri yazdırma
                System.out.println(w.getText()); // getText() String'e dönüştürür
            }
        }
 */
        // Lambda ile yazdıralım
        linklerListesi.forEach(w -> {if (!w.getText().isEmpty())
                                    {System.out.println(w.getText());}});


        //Hello Sign in webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());



        // sayfayı kapatın

        driver.close();


    }



}
