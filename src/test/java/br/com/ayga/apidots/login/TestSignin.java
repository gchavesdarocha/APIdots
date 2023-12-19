package br.com.ayga.apidots.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes automatizados relacionados ao login do dots")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSignin {

    private static WebDriver navegador;

    @BeforeAll
    public static void AcessoNav(){
        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
    }

    @Test
    @Order(1)
    @DisplayName("Registrar um login do usuário com dados válidos")
    public void Login(){

        navegador.get("https://dots-stg.ayga.com.br/");
        navegador.findElement(By.id("login__emailField")).sendKeys("gabriel.rocha@ayga.com.br");
        navegador.findElement(By.id("login__passwordField")).sendKeys("desde1909@");
        navegador.findElement(By.id("login__loginButton")).click();
    }

    @Test
    @Order(2)
    @DisplayName("Registrar um log out após entrar na plataforma")
    public void LoginOut(){

       //navegador.findElement(By.className()).click();
    }
}
