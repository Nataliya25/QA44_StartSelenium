package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {

    WebDriver driver = new ChromeDriver();

    @Test
    public void cssSelectors(){
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();

        WebElement elementH3 = driver.findElement(By.cssSelector("h3"));
        System.out.println(elementH3.getText());

        WebElement elementAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        pause(5);
        elementAbout.click();

        WebElement btnLogin = driver.findElement(By.cssSelector("*[href='/login']"));
        pause(5);
        btnLogin.click();

        WebElement inputEm = driver.findElement(By.cssSelector("input[name='email']" ));
        pause(2);
        inputEm.sendKeys("my_email@gmail.com");

        
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
