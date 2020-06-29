package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pe.edu.upc.selenium.MyWebDriver;

public class EditarPerfilSteps {

    public static WebDriver webDriver;

    public EditarPerfilSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @And("Hace click en Editar contacto")
    public void haceClickEnEditarContacto() {
        webDriver.get("http://localhost:8080/editarPerfil/1");
    }

    @And("Ingresa sus nuevos datos")
    public void ingresaSusNuevosDatos() {
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[1]/input")).sendKeys("Diego");
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[2]/input")).sendKeys("Kraenau");
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[3]/input")).sendKeys("diego2009@hotmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[4]/input")).sendKeys("12345");
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[5]/input")).sendKeys("940242283");
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[6]/input")).sendKeys("21");
        Select sltSexo = new Select(webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[7]/select")));
        sltSexo.selectByValue("Masculino");
        Select sltPais = new Select(webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[8]/select")));
        sltPais.selectByValue("Perú");
        Select sltDepartamento = new Select(webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[9]/select")));
        sltDepartamento.selectByValue("Lima");
        Select sltDistrito = new Select(webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[10]/select")));
        sltDistrito.selectByValue("Lima");
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/div[11]/input")).sendKeys("Mz p lote 3");
    }

    @And("Hace click en Guardar Cambios")
    public void haceClickEnGuardarCambios() {
        webDriver.findElement(By.xpath("//*[@id=\"formulario\"]/button")).click();
    }

    @Then("El usuario podra visualizar la edicion de su perfil")
    public void elUsuarioPodraVisualizarLaEdicionDeSuPerfil() {

    }
}
