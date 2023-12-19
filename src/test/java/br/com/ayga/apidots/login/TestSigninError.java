package br.com.ayga.apidots.login;

import org.junit.jupiter.api.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes automatizados relacionados ao login do dots")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestSigninError {
    private static  WebDriver navegador;

    @BeforeAll
    public static void AcessarNav(){

        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
    }

    @Test
    @Order(1)
    @DisplayName("Acessar o login com o e-mail errado")
    public void LoginErrorEmail(){
        navegador.get("https://dots-stg.ayga.com.br/");
        navegador.findElement(By.id("login__emailField")).sendKeys("gabriel.rocha@ayga.com");
        navegador.findElement(By.id("login__passwordField")).sendKeys("desde1909@");
        navegador.findElement(By.id("login__loginButton")).click();
    }

    @Test
    @Order(2)
    @DisplayName("Acessar o login com a senha errada")
    public void LoginErrorPassword(){
        navegador.get("https://dots-stg.ayga.com.br/");
        navegador.findElement(By.id("login__emailField")).sendKeys("gabriel.rocha@ayga.com.br");
        navegador.findElement(By.id("login__passwordField")).sendKeys("12343");
        navegador.findElement(By.id("login__loginButton")).click();
    }

    @Test
    @Order(3)
    @DisplayName("Tentar acessar com input de e-mail vazio")
    public void LoginNotEmail(){
        navegador.get("https://dots-stg.ayga.com.br/");
        navegador.findElement(By.id("login__emailField")).sendKeys("");
        navegador.findElement(By.id("login__passwordField")).sendKeys("Desde1909@");
        //navegador.findElement(By.id("login__loginButton")).click();
    }

    @Test
    @Order(4)
    @DisplayName("Tentar acessar com input de senha vazio")
    public void LoginNotPassword(){
        navegador.get("https://dots-stg.ayga.com.br/");
        navegador.findElement(By.id("login__emailField")).sendKeys("gabriel.rocha@ayga.com.br");
        navegador.findElement(By.id("login__passwordField")).sendKeys("");
        //navegador.findElement(By.id("login__loginButton")).click();
    }

    @Test
    @Order(5)
    @DisplayName("Tentar acessar o input de login e senha com os campos vazio")
    public void LoginNotEmailAndPassword(){

        navegador.get("https://dots-stg.ayga.com.br/");

        WebElement campoEmail = navegador.findElement(By.id("login__emailField"));
        campoEmail.clear();
        campoEmail.sendKeys("");

        WebElement campoSenha = navegador.findElement(By.id("login__passwordField"));
        campoEmail.clear();
        campoEmail.sendKeys("");

        /*WebElement button = navegador.findElement(By.id("login__loginButton"));
        button.clear();
        campoEmail.click();*/
    }
}
