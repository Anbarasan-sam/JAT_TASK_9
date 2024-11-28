package jat_task_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumScriptsForFireFoxBrowser {
	
	static WebDriver driver;
	public static void main(String[] args) {
		FireFoxOpensGoogle();

	}
	
	public static void FireFoxOpensGoogle() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		System.out.println("Current Page URL is :: " + driver.getCurrentUrl());

		WebElement myElement = driver.findElement(By.id("APjFqb"));
		myElement.click();
		myElement.sendKeys("BGMI");
		
		driver.navigate().refresh();
	
		
		
		driver.close();

	}

}
