package cucumber;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class DetalleSteps {

    public static WebDriver webDriver;

    public DetalleSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Then("El usuario podra visualizar los detalles del servicio")
    public void elUsuarioPodraVisualizarLosDetallesDelServicio() {
    }
}
