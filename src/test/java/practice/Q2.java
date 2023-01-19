package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class Q2 {
    /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize(); //maximize ile fullscreen arasında piksel farkı var
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // "https://www.otto.de" adresine gidelim

        driver.get("https://www.otto.de");
        //  Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim

        String tittle= driver.getTitle();
        String url= driver.getCurrentUrl();

        //  Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim

        String expectedData= "OTTO";
        if (tittle.contains(expectedData)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("OTTO title test FAILED");
        }
        if (url.contains(expectedData)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("OTTO url test FAILED");
        }

        //  Ardindan "https://wisequarter.com/" adresine gidelim

        driver.navigate().to("https://wisequarter.com/");

        //  Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini kontrol edelim

        String titleQuarter= driver.getTitle();
        String urlQuarter=driver.getCurrentUrl();
        String expectedQuarter= "OTTO";

        if (titleQuarter.contains(expectedQuarter)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Quarter title test FAILED");
        }
        if (urlQuarter.contains(expectedQuarter)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Quarter url test FAILED");
        }

        //  Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        //  Sayfayi yenileyelim
        driver.navigate().refresh();
        //  Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
        //  En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();







    }
}
