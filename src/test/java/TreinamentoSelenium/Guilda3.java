package TreinamentoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import org.junit.Test;

public class Guilda3 {

    /*
    https://rahulshettyacademy.com/AutomationPractice/
    -Guilda 3 Interagindo com elementos web
    Find Elements
    */

    @Test
    public void instanceDriver()
    {
        //Abrir o browser com sucesso
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void testeId()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("teste");
    }
    @Test
    public void testeIdFails()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete99"));
    }

    @Test
    public void testeName()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.name("checkBoxOption2")).click();
    }

    @Test
    public void testeTagName()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.tagName("select")).click();
    }

    @Test
    public void testeLinkText()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
    }

    @Test
    public void testeParcialLinkText()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.partialLinkText("Free Access")).click();
    }

    @Test
    public void testClassName()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.className("ui-autocomplete-input")).sendKeys("aaa");
    }

    @Test
    public void testXpath()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[@class='inputs ui-autocomplete-input']")).sendKeys("aaa");
    }

    @Test
    public void testCssSelector()
    {
        //https://www.w3schools.com/cssref/css_selectors.asp
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("aaa");
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("bbb");
        driver.findElement(By.cssSelector("[id=autocomplete]")).sendKeys("ccc");
    }

    @Test
    public void testeCombobox()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement element = driver.findElement(By.id("dropdown-class-example"));
        Select combobox = new Select(element);

        combobox.selectByValue("option2");
    }

    @Test
    public void loginComSucesso()
    {

        String url = "https://the-internet.herokuapp.com/login";
        String usuario = "tomsmith";
        String senha = "SuperSecretPassword!";
        String mensagemEsperada = "Welcome to the Secure Area. When you are done click logout below.";
        String parteAlertaEsperado = "logged";

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.findElement(By.id("username")).sendKeys(usuario);
        driver.findElement(By.id("password")).sendKeys(senha);
        driver.findElement(By.xpath("//*[@class='fa fa-2x fa-sign-in']")).click();
        String mensagemRecebida = driver.findElement(By.className("subheader")).getText();
        //ou
        String alertaRecebido = driver.findElement(By.id("flash")).getText();
        driver.quit();

        Assert.assertEquals(mensagemRecebida, mensagemEsperada);
        //ou
        Assert.assertTrue(alertaRecebido.contains(parteAlertaEsperado));
    }

    //desafio
    /*
    Realizar um caso de teste que valide um login realizaod com credencias erradas

    Realizar interações com dropbox
    https://the-internet.herokuapp.com/dropdown
    Realizar interações com checkbox
    https://the-internet.herokuapp.com/checkboxes
     */


}
