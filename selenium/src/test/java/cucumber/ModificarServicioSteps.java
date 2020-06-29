package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pe.edu.upc.selenium.MyWebDriver;

public class ModificarServicioSteps {

    public static WebDriver webDriver;

    public ModificarServicioSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @And("Hace click en Modificar un servicio")
    public void haceClickEnModificarUnServicio() {
        webDriver.get("http://localhost:8080/modificarServicio/1/10");
    }

    @And("Edita el servicio")
    public void editaElServicio() {

        Select sltCategoria = new Select(webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[4]/select")));
        sltCategoria.selectByIndex(1);

        webDriver.findElement(By.xpath("//*[@id=\"lbl1\"]")).clear();
        webDriver.findElement(By.xpath("//*[@id=\"lbl1\"]")).sendKeys("Mecanica");
        webDriver.findElement(By.xpath("//*[@id=\"lbl2\"]")).clear();
        webDriver.findElement(By.xpath("//*[@id=\"lbl2\"]")).sendKeys("Servicio de mecanica");
        webDriver.findElement(By.xpath("//*[@id=\"lbl3\"]")).clear();
        webDriver.findElement(By.xpath("//*[@id=\"lbl3\"]")).sendKeys("100");

    }

    @And("Hace click en Editar")
    public void haceClickEnEditar() {
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/button")).submit();
    }

    @Then("El usuario podra visualizar la modificacion del servicio")
    public void elUsuarioPodraVisualizarLaModificacionDelServicio() {

    }
}
