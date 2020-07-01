package cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class ListarServiciosStep {

    public static WebDriver webDriver;

    public ListarServiciosStep() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("El usuario hace click en Buscar Servicio")
    public void elUsuarioHaceClickEnBuscarServicio() {
        webDriver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[3]/a")).click();
    }

    @Then("El usuario podrá visualizar todos los servicios disponibles")
    public void elUsuarioPodraVisualizarTodosLosServiciosDisponibles() {
        webDriver.get("http://localhost:8080/listarServicios/1");
    }
}
