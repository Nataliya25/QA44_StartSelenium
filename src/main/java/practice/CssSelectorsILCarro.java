package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsILCarro {

    WebDriver driver = new ChromeDriver();


    @Test
    public void cssSel(){

        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();

        WebElement elementSearch = driver.findElement(By.cssSelector("a[href='/search']"));
        pause(2);
        System.out.println(elementSearch.getText());
        //elementSearch.click();
        //pause(2);


        WebElement elementLet = driver.findElement(By.cssSelector("div[class='header']>a:nth-child(2)"));
        pause(2);
        elementLet.click();
        pause(2);

        WebElement elementTerms = driver.findElement(By.cssSelector("a[href='/terms-of-use']"));
        pause(2);
        elementTerms.click();
        pause(2);

        WebElement elementLogo = driver.findElement(By.cssSelector("a[href='/']"));
        pause(2);
        elementLogo.click();
        pause(2);


        WebElement inputCity = driver.findElement(By.cssSelector("input[id='city']"));
        pause(3);
        inputCity.sendKeys("Tel-Av");



        //WebElement inputDate = driver.findElement(By.cssSelector("input [id='dates']"));
        //inputDate.click();
        //WebElement day15 = driver.findElement(By.cssSelector(".ui-datepicker-calendar td[data-year='2024'][data-month='9'] a.ui-state-default"));
        //day15.click();
        //pause(2);




        //WebElement btnYalla = driver.findElement(By.cssSelector("button[type='submit']"));
       // btnYalla.click();



        WebElement elementJoin = driver.findElement(By.cssSelector("a[href='login']"));
        pause(2);
        elementJoin.click();



        pause(5);
        driver.quit();
    }



    private void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
