package cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class VisualizarPerfilSteps {

    public static WebDriver webDriver;

    public VisualizarPerfilSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("El usuario hace click en Mi perfil")
    public void elUsuarioHaceClickEnMiPerfil() {
        //webDriver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[1]/a")).click();
        webDriver.get("http://localhost:8080/miPerfil/1");
    }

    @Then("El usuario podra visualizar su perfil")
    public void elUsuarioPodraVisualizarSuPerfil() {
    }
}
