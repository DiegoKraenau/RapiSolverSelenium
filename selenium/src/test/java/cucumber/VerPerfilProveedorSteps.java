package cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pe.edu.upc.selenium.MyWebDriver;

public class VerPerfilProveedorSteps {

    public static WebDriver webDriver;

    public VerPerfilProveedorSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }


    @And("Hace click en Buscar Proveedor")
    public void haceClickEnBuscarProveedor() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[4]/a")).click();
    }

    @And("Ingresa el nombre del Proveedor")
    public void ingresaElNombreDelProveedor() {
        webDriver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Guillermo");
    }

    @When("Selecciona el boton Ver Perfil")
    public void seleccionaElBotonVerPerfil() {
        webDriver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[3]/td[6]/a")).click();
    }

    @And("Se posiciona el puntero en la foto del Proveedor")
    public void sePosicionaElPunteroEnLaFotoDelProveedor() {

        Actions action = new Actions(webDriver);

        WebElement slider = webDriver.findElement(By.xpath("//*[@id=\"app\"]/html/body/div[2]/div/div[1]"));
        //Move mouse to x offset 50 i.e. in horizontal direction
        action.moveToElement(slider,50,0).perform();
        slider.click();
    }

    @Then("Se Muestra los datos del proveedor")
    public void seMuestraLosDatosDelProveedor() {
    }


    }
    
