package group_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String istenenKelime="Amazon";
        String arananKelime= driver.getTitle();

        if (arananKelime.contains(istenenKelime)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }

        // 6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        String url= "amazon";
        String sayfa=driver.getCurrentUrl();

        if (sayfa.contains(url)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        // 8. Sayfa handle degerini yazdirindin
        System.out.println(driver.getWindowHandle());
        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        String html=driver.getPageSource();
        String alisveris="alisveris";
        if (html.contains(alisveris)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
       // 10. Sayfayi kapatin
        Thread.sleep(10);
        driver.close();






    }
}
