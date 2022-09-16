package TreinamentoSelenium;


import org.junit.Assert;
import org.junit.Test;

public class Guilda1
{
    /*
    -Guilda 1 Conceitos Básicos
    Apresentação sobre setup do ambiente
    Conceitos básicos de automação
    Criação do projeto
    Maven
    TestNG e Asserts
     */

    @Test
    public void myTest()
    {

    }
    @Test
    public void assertEqualsFails()
    {
        //teste vai falhar
        Assert.assertEquals("cachorro", "gato");
    }
    @Test
    public void assertEqualsSucces()
    {
        //teste vai passar
        Assert.assertEquals("gato", "gato");
    }
    @Test
    public void assertTrueFails()
    {
        //teste vai falhar
        Assert.assertTrue(false);
    }
    @Test
    public void assertTrueSuccess()
    {
        //teste vai passar
        Assert.assertTrue(true);
    }
    @Test
    public void assertFalseFails()
    {
        //teste vai falhar
        Assert.assertFalse(true);
    }
    @Test
    public void assertFalseSuccess()
    {
        //teste vai passar
        Assert.assertFalse(false);
    }
}
