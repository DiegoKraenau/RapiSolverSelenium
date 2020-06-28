package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pe.edu.upc.selenium.MyWebDriver;

public class AgregarUsuarioSteps {

	 public static WebDriver webDriver;

	    public AgregarUsuarioSteps() {
	        webDriver = MyWebDriver.getWebDriver();
	    }
	 
	    @Given("Presionara el boton de Sing Up")
	    public void PresionaElBotonDeSingUp() {
	    	
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/div[2]/div/div/div/div/form/button[2]")).click();
	    	
	    }
	    
	    @And("Ingresa su nombre")
	    public void IngresaSuNombre() {

	    	webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[1]/input")).sendKeys("Anastacio");
	    	
	    }
	    @And("Ingresa su apellido")
	    public void IngresaSuApellido() {

	
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[2]/input")).sendKeys("Castilla");
	    	
	    }
	    
	    @And("Ingresa su email")
	    public void IngresaSuEmail() {

	    	
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[3]/input")).sendKeys("anastacio@gmail.com");
	    	
	    	
	    }
	    
	    @And("Ingresa la contraseña")
	    public void IngresaLaContraseña() {

	    	webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[4]/input")).sendKeys("anastacio2009");
	    	
	    }
	    
	    @When("Se presiona el boton de Agregar")
	    public void SePresionaElBotonDeAgregar() {

	    	
	    	webDriver.findElement(By.xpath("/html/body/div/html/body/form/div[5]/button")).click();
	  
	    	
	    }
	    
	 
	    
	    @Then("El usuario fue correctamente registrado en el sistema")
	    public void ElUsuarioFueCorrectamenteRegistradoEnElSistema() {


	    	
	  
	    	
	    }
	    
	    
}
