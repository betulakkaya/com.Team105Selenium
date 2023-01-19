package group_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practice_5 {
    public static void main(String[] args) throws InterruptedException {

       // 1- Bir test class’i olusturun ilgili ayarlari yapin

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

       // 3- Category bolumundeki elementleri locate edin

       WebElement kategori= driver.findElement(By.id("accordian"));
        List<WebElement> element= driver.findElements(By.className("panel-heading"));

       // 4- Category bolumunde 3 element oldugunu test edin

       if (element.size()==3){
           System.out.println("3 element bulunuyor");
       }else{
           System.out.println("3 element yok");
       }
       // 5- Category isimlerini yazdirin
        for (WebElement each:element
        ) {
            System.out.println(each.getText());

        }

       // 6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
