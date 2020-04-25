package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialSelenium {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.google.com/");
				
				driver.close();
				
				System.out.println("data");

	}

}
