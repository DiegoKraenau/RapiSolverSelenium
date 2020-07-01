package cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pe.edu.upc.selenium.MyWebDriver;

public class RegistrarServicioSteps {

	   public static WebDriver webDriver;

	    public RegistrarServicioSteps() {
	        webDriver = MyWebDriver.getWebDriver();
	    }

	    @Given("El usuario ingresa sus credenciales de acceso")
	    public void ElUsuarioIngresaSusCredencialesDeAcceso() {
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/div[2]/div/div/div/div/form/div[1]/input")).sendKeys("diegokraenau@gmail.com");
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/div[2]/div/div/div/div/form/div[2]/input")).sendKeys("diego2009");
	    	
	    }
	    
	    @And("Hace click en Sing In")
	    public void HackeClickEnSingIn() {

			webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/div[2]/div/div/div/div/form/button[1]")).click();
	    }
	    
	    @And("Hace click en Publicar Servicio")
	    public void HaceClickEnPublicarServicio() {

	    	webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/nav/div/ul[1]/li[2]/a")).click();
	    }
	    
	    @And("Ingresa el nombre del servicio")
	    public void IngresaElNombreDelServicio() {
	    	webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[1]/input")).sendKeys("Gasfiteria");
	    	
	    }
	    
	    @And("Ingresa la descripcion del servicio")
	    public void IngresaLaDescripcionDelServicio() {

	    	
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[2]/textarea")).sendKeys("Servicios de Gasfiteria");
	    }
	    
	    @And("Ingresa el costo del servicio")
	    public void IngresaElDelServicio() {
	    	webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[3]/input")).sendKeys("50");
	
	    }
	    
	    @And("Selecciona la categoria del servicio")
	    public void SeleccionaLaCategoriaDelServicio() {

	    	Select slt = new Select( webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[4]/select") ));
	    	slt.selectByIndex(1);
	    
	    }
	    
	    
	    @When("Se presiona el boton Agregar")
	    public void SePresionaElBotonAgregar() {
	    	try {
				TimeUnit.SECONDS.sleep(5);
				webDriver.findElement(By.xpath("/html/body/div/html/body/form/button")).click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
	    
	    @Then("El servicio fue registrado en el sistema")
	    public void ElServicioFueRegistradoEnElSistema() {

	    	
	    }
	    
	 
	    
	    

	    
   
}
