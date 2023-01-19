package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        //Biz browserlari olusturdugumuz driver sayesinde otomate edebiliyoruz
        //bunun icin her testin basinda mutlaka driver objesi olusturacagiz

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");
        // acilan sayfanin baslıgının amazon icerdigini test edin

        String expectedKelime= "amazon";
        String actualResult= driver.getTitle();

        if (actualResult.contains(expectedKelime)){
            System.out.println("Title testi passed");
        }else{
            System.out.println("Title amazon icermiyor,test failed");
            System.out.println(driver.getTitle());
        }

        //gittigimiz sayfanin URL'inin https://www.amazon.com/ oldugunu test edin

        String expectedUrl="https://www.amazon.com/";
        String actualUrl= driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi passed");
        }else{
            System.out.println("Url istediginiz degerde degil");
            System.out.println(driver.getCurrentUrl());
        }

        Thread.sleep(5000);
        driver.close();



    }
}
