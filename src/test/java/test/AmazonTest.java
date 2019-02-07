package test;



import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonLoginPage;
import utilities.TestBase;

public class AmazonTest extends TestBase {

    @Test
     public void test1(){
        driver.get("https://www.amazon.com/");
        AmazonLoginPage alp=new AmazonLoginPage(driver);
        alp.searchBox.sendKeys("camera"+ Keys.ENTER);
        System.out.println(driver.getTitle());
        String expectedTitle="Amazon.com: camera - Camera & Photo: Electronics";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    @Test
    public void test2(){
        driver.get("https://www.amazon.com/");
        AmazonLoginPage alp=new AmazonLoginPage(driver);
        alp.cart.click();

    }
    //I believe I will do xoxo Merve

}
