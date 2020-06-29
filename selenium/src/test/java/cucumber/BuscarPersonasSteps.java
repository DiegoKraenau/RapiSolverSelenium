package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class BuscarPersonasSteps {

    public static WebDriver webDriver;

    public BuscarPersonasSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("El usuario hace click en Buscar Proveedor")
    public void elUsuarioHaceClickEnBuscarProveedor() {
        webDriver.get("http://localhost:8080/buscarPersonas/1");
    }

    @And("Ingresa el nombre del proveedor")
    public void ingresaElNombreDelProveedor() {
        webDriver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Miguel");
    }

    @Then("El usuario podra visualizar el perfil del proveedor")
    public void elUsuarioPodraVisualizarElPerfilDelProveedor() {
        webDriver.get("http://localhost:8080/perfil/5/1");
    }
}
