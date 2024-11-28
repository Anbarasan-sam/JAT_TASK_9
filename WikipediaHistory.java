package jat_task_9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikipediaHistory {
	static WebDriver driver;
	
	public static void main (String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		WebElement wikipediaElement =driver.findElement(By.id("searchInput"));
		wikipediaElement.click();
		wikipediaElement.sendKeys("Artificial intelligence");
		wikipediaElement.sendKeys(Keys.ENTER);
		WebElement historylinktext = driver.findElement(By.linkText("History of artificial intelligence"));
		historylinktext.click();
		driver.getTitle();
		System.out.println("The title of the session is :: " + driver.getTitle());
	
	}

}
