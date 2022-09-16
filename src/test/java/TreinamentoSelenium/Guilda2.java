package TreinamentoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;

public class Guilda2 {

    /*
    -Guilda 2 Interação com Browser
    Apresentação sobre ações do navegador
    navigate.to, forward, back, refresh e quit
    getTitle, getCurrentURL, getPageSource e asserts
     */

    @Test
    public void instanceDriver()
    {
        //Abre o browser com sucesso
        WebDriver driver = new ChromeDriver();
    }
    @Test
    public void abrirGoogle()
    {
        //Abre o browser e navega até a página do google
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
    }

    @Test
    public void atualizarPaginaGoogle()
    {
        //Abre o browser e navega até a página do google
        //realizar um refrash na pagina
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().refresh();
    }

    @Test
    public void retornaParaPaginaGoogle()
    {
        //Abre o browser e navega até a página do google
        //até a pagina do gmail
        //e volta para o google
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.gmail.com/");
        driver.navigate().back();
    }

    @Test
    public void retornaParaPaginaGmail()
    {
        //Abre o browser e navega até a página do google
        //até a pagina do gmail
        //e volta para o google
        //e retorna para o gmail
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.gmail.com/");
        driver.navigate().back();
        driver.navigate().forward();
    }
    @Test
    public void fechaBrowser()
    {
        //Abre o browser e navega até a página do google
        //fecha o browser
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.quit();
    }
    @Test
    public void obtemTituloPagina()
    {
        //Abre o browser e navega até a página do google
        //obterm o título
        //realizar asserção
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        String titulo = driver.getTitle();

        Assert.assertEquals(titulo, "Google");
    }
    @Test
    public void obtemTituloPaginaFails()
    {
        //Abre o browser e navega até a página do google
        //obterm o título
        //realizar asserção com G minúsculo
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        String titulo = driver.getTitle();
        driver.quit();

        Assert.assertEquals(titulo, "google");
    }

    @Test
    public void obtemURLPagina()
    {
        //Abre o browser e navega até a página do google
        //obterm a url atual
        //realizar asserção
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        String url = driver.getCurrentUrl();
        driver.quit();

        Assert.assertEquals(url, "https://www.google.com/");
    }
    @Test
    public void obtemURLPaginaFails()
    {
        //Abre o browser e navega até a página do google
        //obterm a url atual
        //realizar asserção com .com.br
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        String url = driver.getCurrentUrl();
        driver.quit();

        Assert.assertEquals(url, "https://www.google.com.br/");
    }
    @Test
    public void obtemPageSourceDaPagina()
    {
        //Abre o browser e navega até a página do google
        //obterm a url atual
        //realizar asserção com .com.br
        //copiar o conteúdo e mostrar no formatador de html
        //mostrar que as tags html estão no texto
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

}
