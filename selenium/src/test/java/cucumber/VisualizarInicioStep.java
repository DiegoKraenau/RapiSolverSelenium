package cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class VisualizarInicioStep {
    public static WebDriver webDriver;

    public VisualizarInicioStep() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("Presiona en Sing In")
    public void presionaEnSingIn() {
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/html/body/div[2]/div/div/div/div/form/button[1]")).click();
    }
    @Then("El usuario podra visualizar la pagina principal de la aplicacion")
    public void elUsuarioPodraVisualizarLaPaginaPrincipalDeLaAplicacion() {
        webDriver.get("http://localhost:8080/Principal/1");
    }
}
