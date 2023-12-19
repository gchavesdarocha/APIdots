package br.com.ayga.apidots.login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@DisplayName("Teste automatizado para password recovery")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestPasswordRecovery {

    private static WebDriver navegador1;

    @BeforeAll
    public static void SetUp(){

        WebDriverManager.chromedriver().setup();
        navegador1 = new ChromeDriver();
    }

    @Test
    @Order(1)
    @DisplayName("Password recovery")
    public void PasswordRecovey(){

        navegador1.get("https://dots-stg.ayga.com.br/");
        navegador1.findElement(By.id("login__emailField")).sendKeys("gabriel.rocha@ayga.com.br");
        navegador1.findElement(By.id("login__passwordField")).sendKeys("desde1909@");
        navegador1.findElement(By.id("login__lostPasswordButton")).click();
        navegador1.findElement(By.id("login__lostPasswordRequestButton")).click();

      /*  WebElement lostPasswordRequestButton = new WebDriverWait(navegador1, 10);

         .until(ExpectedConditions.elementToBeClickable(By.id("login__lostPasswordRequestButton")));

        lostPasswordRequestButton.click();
*/

    }
}
