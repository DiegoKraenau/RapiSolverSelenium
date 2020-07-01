package cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

import java.util.concurrent.TimeUnit;

public class DetalleSteps {

    public static WebDriver webDriver;

    public DetalleSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("El usuario hace click en Buscar servicio y selecciona servicio de gasfiteria")
    public void elUsuarioHaceClickEnBuscarServicioYSeleccionaServicioDeGasfiteria() {
        webDriver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[3]/a")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/html/body/div/div/div[4]/a[1]/div[3]/a")).click();
    }

    @Then("El usuario podra visualizar los detalles del servicio")
    public void elUsuarioPodraVisualizarLosDetallesDelServicio() {
        webDriver.get("http://localhost:8080/detalle/17/1");
    }

}
