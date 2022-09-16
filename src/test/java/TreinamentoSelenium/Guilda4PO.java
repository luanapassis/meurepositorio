package TreinamentoSelenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class Guilda4PO {

    public  WebDriver driver;

    @Before
    public void beforeTest()
    {
        String url = "https://the-internet.herokuapp.com/login";
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }
    @After
    public void afterTest()
    {
        driver.quit();
    }

    @Test
    public void refatorandoTestLoginPageObject()
    {
        LoginPage loginPage = new LoginPage(driver);

        String usuario = "tomsmith";
        String senha = "SuperSecretPassword!";
        String mensagemEsperada = "Welcome to the Secure Area. When you are done click logout below.";

        loginPage.digitarUsuario(usuario);
        loginPage.digitarSenha(senha);
        loginPage.clicarLogin();
        String mensagemRecebida = loginPage.retornaMensagem();

        Assert.assertEquals(mensagemRecebida, mensagemEsperada);
    }
}
