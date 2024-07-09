package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practiseLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// locate website
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.xpath("//form[@class='form']/input[1]")).sendKeys("kaustubh.singh@xcelore.com");
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys("rahulshettyacademy");

		// Locate the checkbox using its ID
		WebElement checkboxOne = driver.findElement(By.id("chkboxOne"));

		// Use JavaScriptExecutor to click the checkbox
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkboxOne);

		// Locate the second checkbox using its name
		WebElement checkboxTwo = driver.findElement(By.name("chkboxTwo"));
		js.executeScript("arguments[0].click();", checkboxTwo);

		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		// driver.close();

	}

}
