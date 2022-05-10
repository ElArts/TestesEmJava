package gamemania;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Teste1 {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Arquivos de Programas\\selenium-java-4.1.4\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegador () {
		driver.get("https://sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.id("oqEstabuscando")).sendKeys("gestão");
		driver.findElement(By.className("btnBuscaJavaScript")).click();
	}
}
