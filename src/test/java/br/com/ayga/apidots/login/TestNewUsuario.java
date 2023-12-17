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

public class TestNewUsuario {

    private static WebDriver navegador;

    @BeforeAll
    public static void SetUp(){

        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
    }

    @Test
    @Order(1)
    @DisplayName("Cadastrar um novo usuário")
    public void Cadastro(){
        navegador.get("https://dots.ayga.com.br/");
        navegador.findElement(By.className("v-chip__content")).click();

    }
}
