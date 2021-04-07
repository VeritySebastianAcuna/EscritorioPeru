package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Configuration;
import common.LeerExcel;
import pages.PageDatosEmision;
import pages.PageDetalle;
import pages.PageFooter;
import pages.PageLogin;
import pages.PageReceptor;
import pages.PageSeleccionCpe;

public class Tests_FacturaAfectaInafecta {
	private WebDriver driver;
	String datapool = Configuration.ROOT_DIR+"DataPool_v2.xlsx";
	LeerExcel leerExcel = new LeerExcel();
	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException {
//		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://escritorio-qa.acepta.pe/");// Aqu� se ingresa la URL para hacer las pruebas.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void Script_0023() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0023
		String cp = "EAP_0023";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);
		
		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivTreintayUno(cp);
		pageDetalle.itemNoAfecto(cp);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivTreintayUno(cp);
		
		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0024() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0024
		String cp = "EAP_0024";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);
		
		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.itemconIcbper(cp);
		pageDetalle.botonAgregarProductosdivTreintayCinco(cp);
		
		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0025() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0025
		String cp = "EAP_0025";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);
		
		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.itemNoAfecto(cp);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.isc(cp);
		pageDetalle.botonAgregarProductosdivTreintaySiete(cp);
		
		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@AfterMethod
	public void FinEjecucion() {
		driver.close();
	}
}
