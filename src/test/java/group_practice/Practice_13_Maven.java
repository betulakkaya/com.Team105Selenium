package group_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practice_13_Maven {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
       // 3- cookies uyarisini kabul ederek kapatin
       // 4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expectedKelime="Google";
        String actualKelime= driver.getTitle();

        if (actualKelime.contains(expectedKelime)){
            System.out.println("passed");
        }else{
            System.out.println("FAILED");
        }

       // 5- Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Nutella"+ Keys.ENTER);
       // 6- Bulunan sonuc sayisini yazdirin
        List<WebElement> sonuc= driver.findElements(By.xpath("//div[text()='Yaklaşık 150.000.000 sonuç bulundu']"));

        for (WebElement each:sonuc
             ) {
            System.out.println(each.getText());
        }

       // 7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin



       // 8- Sayfayi kapatin

    }
}
