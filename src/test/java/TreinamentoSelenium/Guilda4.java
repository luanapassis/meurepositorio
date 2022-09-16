package TreinamentoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;

public class Guilda4 {

    //esperas
    //page object


    @Test
    public void testeSemWait()
    {
        //rodar debugando
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//*[text()='Start']")).click();

        By localizador =  By.xpath("//*[text()='Hello World!']");
        String resultado = driver.findElement(localizador).getText();
        System.out.println(">>>resultado aqui> "+resultado);
    }

    @Test
    public void testeWait()
    {
        //rodar debugando
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//*[text()='Start']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By localizador =  By.xpath("//*[text()='Hello World!']");
        String resultado = wait.until(ExpectedConditions.visibilityOfElementLocated(localizador)).getText();
        System.out.println(">>>resultado aqui> "+resultado);
    }
}
