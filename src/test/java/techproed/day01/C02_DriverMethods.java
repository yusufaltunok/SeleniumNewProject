package techproed.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com"); // getTitle() metodu sayfa başlığını verir

        // getTitle() sayfa başlığını verir
        System.out.println("Amazon Actual Titlle " + driver.getTitle());
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println(" Amazon Window Handle Değeri "+amazonWindowHandle); // 86CCFF6B494257EA400CECCFF02FDC98

        driver.get("https://techproeducation.com");
        System.out.println("techproeducation Actual Titlle " + driver.getTitle());// getTitle() metodu sayfa başlığını verir

        // getCurrentUrl() Gidilen sayfanın url'ini verir
        System.out.println("Techproeducation Actual Url : "+driver.getCurrentUrl());

        // getPageSource() Açılan sayfanın kaynak kodlarını verir.
        //System.out.println(driver.getPageSource()); her çalıştırdığımızda bütün kaynak kodları vereceği için yoruma alındı

        //driver.getWindowHandle() Gidilen sayfanın handle (hashKod) değerini verir. Bu handle değerini sayfalar arası geçiş için kullanırız.
        System.out.println(" Techproed Window Handle Değeri "+driver.getWindowHandle()); //0F83D843BE66FC73C6DA885552770FA2


    }

}
