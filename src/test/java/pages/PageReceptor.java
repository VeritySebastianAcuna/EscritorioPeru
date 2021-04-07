package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import common.CapturaPantalla;
import common.CrearDocEvidencia;

public class PageReceptor {
	private WebDriver driver;
	CapturaPantalla capturaPantalla = new CapturaPantalla();
	CrearDocEvidencia crearDocEvidencia = new CrearDocEvidencia();
	public PageReceptor(WebDriver driver) {
		this.driver=driver;
	}
	PageAlerta pageAlerta = new PageAlerta(driver);
	
	public void completarReceptor (String caso) throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
		int i=0;
		int j=0;
		do {
			try {
				String rucEmisor;
				rucEmisor=driver.findElement(By.xpath("//*[@id=\"form_params\"]/div[5]/h4")).getText();
				rucEmisor=rucEmisor.substring(12,rucEmisor.length());
				driver.findElement(By.name("ruc_dni")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("ruc_dni")).sendKeys(rucEmisor);
				Thread.sleep(1000);
				driver.findElement(By.name("ruc_dni")).sendKeys(Keys.TAB);
				Thread.sleep(5000);
				driver.findElement(By.name("lista_correos_receptor_agregar")).click();
				Thread.sleep(2000);
				crearDocEvidencia.modificarArchivoEvidencia(caso, "Datos de Receptor");
				capturaPantalla.takeScreenShotTest(driver, "Datos_Receptor",caso);
				i=1;
			} catch(Exception e) {
				pageAlerta.alertaManejoError();
				j++;
				if(j==3) {
					System.out.println("No se puede agregar datos de receptor");
					i=1;
				}
			}
		}while(i==0);
	}
	
	public void completarRazonSocial(String razonSocial, String caso) throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
		int i=0;
		int j=0;
		do {
			try {
				driver.findElement(By.name("razon_social")).click();
				driver.findElement(By.name("razon_social")).sendKeys(razonSocial);
				Thread.sleep(2000);
				crearDocEvidencia.modificarArchivoEvidencia(caso, "Datos de Receptor");
				capturaPantalla.takeScreenShotTest(driver, "Datos_Receptor", caso);
				i=1;
			} catch(Exception e) {
				pageAlerta.alertaManejoError();
				j++;
				if(j==3) {
					System.out.println("No se puede agregar datos de receptor");
					i=1;
				}
			}
		}while(i==0);
	}
	
	public void completarReceptorBoleta(String razonSocial, String caso) throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
		int i=0;
		int j=0;
		do {
			try {
				Select tipoDocumento = new Select (driver.findElement(By.id("tipo_documento")));
				tipoDocumento.selectByValue("1");
				Thread.sleep(2000);
				driver.findElement(By.name("ruc_dni")).click();
				driver.findElement(By.name("ruc_dni")).sendKeys("12345678");
				Thread.sleep(2000);
				driver.findElement(By.name("ruc_dni")).sendKeys(Keys.TAB);
				Thread.sleep(2000);
				driver.findElement(By.name("razon_social")).sendKeys(razonSocial);
				Thread.sleep(2000);
				driver.findElement(By.name("lista_correos_receptor_agregar")).click();
				PageAlerta pageAlerta = new PageAlerta(driver);
				pageAlerta.alertaManejoError();
				Thread.sleep(2000);
				crearDocEvidencia.modificarArchivoEvidencia(caso, "Datos de Receptor");
				capturaPantalla.takeScreenShotTest(driver, "Datos_Receptor", caso);
				i=1;
			} catch(Exception e) {
				pageAlerta.alertaManejoError();
				j++;
				if(j==3) {
					System.out.println("No fue posible completar los datos del receptor");
					i=1;
				}
			}
		}while(i==0);
	}
}
