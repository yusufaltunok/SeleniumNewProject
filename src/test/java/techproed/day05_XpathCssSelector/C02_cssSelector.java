package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        /*
            cssSelector ile xpath arasındaki farklar;
        1- cssSelector de @ işareti kullanılmaz.
        1- xpath ile index alabiliriz ama cssSelector iile index alamatız.
        3- xpath ile text olarak locate edebiliriz ama cssSelector ile bunu yapamayız.
        4- cssSelector xpath' gore daha hızlı çalışır.

         */
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //  https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

      //   Add Element butonuna basin
        WebElement addElementButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        Thread.sleep(2000);
        addElementButton.click();

      //  Delete butonu’nun gorunur oldugunu test edin.

        //WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));

        if (deleteButton.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

       // System.out.println(deleteButton.isDisplayed());

        //  Delete tusuna basin
        deleteButton.click();
        Thread.sleep(2000);

      //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));

        if (addRemoveElement.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //System.out.println(addRemoveElement.isDisplayed());

        // Sayfayı kapatınız.
        driver.close();


    }
}
