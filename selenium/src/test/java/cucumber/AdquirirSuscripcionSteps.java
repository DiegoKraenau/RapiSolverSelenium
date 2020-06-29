package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pe.edu.upc.selenium.MyWebDriver;

import java.util.concurrent.TimeUnit;

public class AdquirirSuscripcionSteps {

    public static WebDriver webDriver;

    public AdquirirSuscripcionSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }


    @And("Hace click en Mi Perfil")
    public void haceClickEnMiPerfil() {
        webDriver.get("http://localhost:8080/miPerfil/1");

    }

    @When("Hace click en Comprar suscripcion")
    public void haceClickEnComprarSuscripcion() {
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/html/body/div[3]/aside/div/a")).click();
    }

    @And("Hace click en Comprar ahora de cualquier opcion")
    public void haceClickEnComprarAhoraDeCualquierOpcion() {
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/html/body/div[5]/ul/center/form/input[3]")).click();

    }

    @And("Se rellena el campo de validacion de pago")
    public void seRellenaElCampoDeValidacionDePago() {
        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("956477231");

    }
    @And("Hace click en Siguiente")
    public void haceClickEnSiguiente() {
        webDriver.get("http://localhost:8080/miPerfil/1");
    }
    @Then("Se Muestra el perfil la duracion de la suscripcion")
    public void seMuestraElPerfilLaDuracionDeLaSuscripcion() {
    }


}
    
