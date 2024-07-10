package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		staticDropdown.click();
		Select dropdown = new Select(staticDropdown);

		List<WebElement> options = dropdown.getOptions();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (WebElement option : options) {
			// Scroll to the option to make it visible
			js.executeScript("arguments[0].scrollIntoView(true);", option);
			Thread.sleep(1000);
		}

		dropdown.selectByIndex(3);
		System.out.println("Selected option: " + dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.tagName("body")).click();

		// click dropdown

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2100);

		for (int i = 0; i < 4; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();

			driver.findElement(By.id("hrefIncChd")).click();

			driver.findElement(By.id("hrefIncInf")).click();
			Thread.sleep(1000);
		}

		driver.findElement(By.id("btnclosepaxoption"));
		Thread.sleep(1000);

		driver.close();
	}

}
