package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seLLIntro {
	public static void main(String[] args) {

		// Chrome - ChromeDriver -> Methods
		// firefox -fire fox driver -> methods
		// WebDriver is a interface
		// webDriver + class methods

		// chrome Driver .exe ->Chrome browser

		// step to invoke chrome driver//
		// Selenium manager

		// Correct the path to the ChromeDriver executable
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\bhara\\chromedriver\\win64\\chromedriver\\drive.exe");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// webdriver for edge microsoft
//		WebDriver driver2 = new EdgeDriver();

		// Example of opening a website
		driver.get("https://www.instagram.com/");
//		driver2.get("https://www.instagram.com/");

		System.out.println(driver.getTitle());

		// close driver
		driver.close();

	}
}
