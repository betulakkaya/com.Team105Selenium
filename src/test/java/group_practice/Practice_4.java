package group_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice_4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


       // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
       // (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
       // yazdirin.

        driver.get("https:www.facebook.com");
        String expectedKelime= "facebook";
        String actualKelime=driver.getTitle();

        if (actualKelime.contains(expectedKelime)){
            System.out.println("tittle facebook iceriyor");
        }else{
            System.out.println("doğru baslik"+ actualKelime);
        }

       // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
       // “actual” URL’i yazdirin.

        String Url= "facebook";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(Url)){
            System.out.println("url facebook iceriyor");
        }else{
            System.out.println("doğru url"+ actualUrl);
        }
       // 4.https://www.walmart.com/ sayfasina gidin.
        Thread.sleep(3000);
        driver.get("https://www.walmart.com/");
       // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String baslik="Walmart.com";
        String Title= driver.getTitle();

        if (Title.contains(baslik)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
       // 6. Tekrar “facebook” sayfasina donun
        Thread.sleep(3000);
        driver.navigate().back();
       // 7. Sayfayi yenileyin
        driver.navigate().refresh();
       // 8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
       // 9.Browser’i kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
