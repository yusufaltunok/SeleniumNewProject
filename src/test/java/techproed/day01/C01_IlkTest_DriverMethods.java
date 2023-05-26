package techproed.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest_DriverMethods {


    public static void main(String[] args) {

       // System.setProperty("web driver.chrome.driver", "src/resources/driver/chromedriver.exe");
        System.setProperty("chromeDriver", "src/resources/driver/chromedriver.exe");
        // Java uygulamalarında system özelliklerini ayarlamak için setProperty() metodu ile kullanırız.
        // setProperty() metodu ile class'ımıza  driver'ın fiziki yolunu belirtiriz.

        System.out.println(System.getProperty("chromeDriver"));
        // getProperty() ile "key" değerini girerek "value" ya ulaşabilirim.

        WebDriver driver = new ChromeDriver();
        // ChromeDriver(); türünde yeni bir obje oluşturduk

        driver.get("https://www.techproeducation.com");// get() metodu ile String olarak girilen url'e gideriz.



    }
}