package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class makeMYtrip_dynamicDropdown_Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//li[@data-cy='mulitiCityTrip']")).click();

		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//input[@id='fromAnotherCity" + i + "']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][" + (i + 1) + "]")).click();

			driver.findElement(By.xpath("//input[@id='toAnotherCity" + i + "']"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][" + (i + 1) + "]")).click();

			// date click
			Thread.sleep(2000);
			// driver.findElement(By.xpath("//label[@for='anotherDeparture " + i +
			// "']")).click();
			for (int j = 1; j < 31; j++) {

				WebElement dat = driver.findElement(By.xpath("(//p[text()='" + (j) + "'])[1]"));

				if (ExpectedConditions.elementToBeClickable(dat) != null)
					dat.click();
			}
			Thread.sleep(2000);
			for (int j = 1; j <= 30; j++) {

				WebElement dat = driver.findElement(By.xpath("(//p[text()='" + (j) + "'])[1]"));

				if (ExpectedConditions.elementToBeClickable(dat) != null)
					dat.click();
			}
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		// driver.findElement(By.className("css-76zvg2 r-12rm3iy r-ubezar")).click();
		// driver.close();
	}

}
