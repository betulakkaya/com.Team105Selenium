package group_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice_9 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
      // 3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
      // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
      // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedKelime="Spend less";
        String aactualKelime=driver.getTitle();
        if (aactualKelime.contains(expectedKelime)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
      // 6- Gift Cards sekmesine basin
        Thread.sleep(3000);
        driver.findElement(By.linkText("Gift Cards")).click();
      // 7- Birthday butonuna basin
        Thread.sleep(3000);
       driver.findElement(By.linkText("Birthday")).click();
      // 8- Best Seller bolumunden ilk urunu tiklayin
        Thread.sleep(3000);
       driver.findElement(By.linkText("Amazon.com eGift Card")).click();
      // 9- Gift card details’den 25 $’i secin
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();
      // 10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucret= driver.findElement(By.cssSelector("(//span[text()=‘$25.00’])[1]"));

        String expectedUcret="$25.00";
        String actualUcret=ucret.getText();

        if (expectedUcret.contains(actualUcret)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

      // 11-Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
