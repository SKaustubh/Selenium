package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseLOCATORS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// login entry
		WebElement emailEnter = driver.findElement(By.id("inputUsername"));
		emailEnter.sendKeys("kashish@gmail.com");
		WebElement Password = driver.findElement(By.name("inputPassword"));
		Password.sendKeys("7hf8dhj4ft8i");

		WebElement logIn = driver.findElement(By.xpath("//button[@class='submit signInBtn']"));
		logIn.click();

		WebElement errorMsg = driver.findElement(By.cssSelector("p.error"));

		System.out.println(errorMsg.getText());

		// forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("tuitui hdjn");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tuitui@hdjn.in");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9346778991");
		driver.findElement(By.className("reset-pwd-btn")).click();
		WebElement resetMsg = driver.findElement(By.cssSelector("p.infoMsg"));
		System.out.println(resetMsg.getText());
		driver.findElement(By.xpath("//form[@action='#']//button[1]")).click();

		// login by correct id & password
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
		// driver.close();

	}

}
