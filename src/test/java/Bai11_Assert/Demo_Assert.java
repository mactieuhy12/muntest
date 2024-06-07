package Bai11_Assert;


import Common.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo_Assert extends Base {
    @Test
    public void testloginCMR(){
        driver.get("https://crm.anhtester.com/admin/authentication");
        //Khai báo đối tượng SoftAssert
        //SoftAssert softAssert = new SoftAssert();


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

    }
}
