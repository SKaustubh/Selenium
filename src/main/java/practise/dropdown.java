package practise;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		for (int i = 1; i <= 3; i++) {
			WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkBoxOption" + i + "']"));
			checkbox.click();
			assertTrue(checkbox.isSelected());

			if (checkbox.isSelected() == true) {
				checkbox.click();
				assertFalse(checkbox.isSelected());
			} else
				System.out.println("false");

		}

		int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);

		driver.close();
	}

}
