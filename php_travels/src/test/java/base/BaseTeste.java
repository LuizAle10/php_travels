package base;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BaseTeste {
	
	private static WebDriver driver;
	protected HomePage homePage; 
	
	
	
	@BeforeAll
    public static void inicializar() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\Chromedriver\\Versao 83\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	
	@BeforeEach
	public void carregarPaginaInicial() {
		driver.get("https://www.phptravels.net/home");
		homePage = new HomePage(driver);
		driver.manage().window().maximize();		
	}
	
	
	@AfterAll
	public static void finalizar() {
		driver.quit();	
}

}
