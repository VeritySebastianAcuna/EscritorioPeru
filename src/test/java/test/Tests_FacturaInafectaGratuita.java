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

public class Tests_FacturaInafectaGratuita {
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
	public void Script_0033() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0033
		String cp = "EAP_0033";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		pageSeleccionCpe.seleccionTipoOperacionSunat(datos[5],cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);

		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivVeintiNueve(cp);

		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0034() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0034
		String cp = "EAP_0034";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		pageSeleccionCpe.seleccionTipoOperacionSunat(datos[5],cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);

		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivVeintiNueve(cp);

		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0035() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0035
		String cp = "EAP_0035";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		pageSeleccionCpe.seleccionTipoOperacionSunat(datos[5],cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);

		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivVeintiNueve(cp);

		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0036() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0036
		String cp = "EAP_0036";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		pageSeleccionCpe.seleccionTipoOperacionSunat(datos[5],cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);

		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivVeintiNueve(cp);

		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0037() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0037
		String cp = "EAP_0037";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		pageSeleccionCpe.seleccionTipoOperacionSunat(datos[5],cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);

		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivVeintiNueve(cp);

		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0038() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0038
		String cp = "EAP_0038";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		pageSeleccionCpe.seleccionTipoOperacionSunat(datos[5],cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);

		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivVeintiNueve(cp);

		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0039() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0039
		String cp = "EAP_0039";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		pageSeleccionCpe.seleccionTipoOperacionSunat(datos[5],cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);

		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.botonAgregarProductosdivVeintiNueve(cp);

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
