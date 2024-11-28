package jat_task_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Page Title is :: " + driver.getTitle());
		if(title.equals("STORE")) {
			System.out.println("Page landed on correct website");
		}else {
			System.out.println("Page landed on Wrong website");
		}
		
	
	}

}
