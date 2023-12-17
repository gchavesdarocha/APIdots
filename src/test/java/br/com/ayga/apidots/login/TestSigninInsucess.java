package br.com.ayga.apidots.login;

import org.junit.jupiter.api.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes automatizados relacionados ao login do dots")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestSigninInsucess {
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
        navegador.get("https://dots.ayga.com.br/");
        navegador.findElement(By.id("input-36")).sendKeys("gabriel.rocha@ayga.com");
        navegador.findElement(By.id("password")).sendKeys("desde1909@");
    }

    @Test
    @Order(2)
    @DisplayName("Acessar o login com a senha errada")
    public void LoginErrorPassword(){
        navegador.get("https://dots.ayga.com.br/");
        navegador.findElement(By.id("input-36")).sendKeys("gabriel.rocha@ayga.com.br");
        navegador.findElement(By.id("password")).sendKeys("12343");
    }

    @Test
    @Order(3)
    @DisplayName("Acessar o login com a senha errada")
    public void LoginNotEmail(){
        navegador.get("https://dots.ayga.com.br/");
        navegador.findElement(By.id("input-36")).sendKeys("");
        navegador.findElement(By.id("password")).sendKeys("Desde1909@");
    }
}
