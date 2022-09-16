package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Mapping
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//*[@class='fa fa-2x fa-sign-in']");
    By mensagemField = By.className("subheader");

    //actions

    public void digitarUsuario(String usuario)
    {
        driver.findElement(usernameField).sendKeys(usuario);
    }

    public void digitarSenha(String senha)
    {
        driver.findElement(passwordField).sendKeys(senha);
    }
    public void clicarLogin()
    {
        driver.findElement(loginButton).click();
    }
    public String retornaMensagem()
    {
        return driver.findElement(mensagemField).getText();
    }
}
