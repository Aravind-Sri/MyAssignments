package myAssignments.week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//*[text()='Click']")).click();

		Thread.sleep(2000);

		String title = driver.getTitle();

		if (title.contains("Dashboard")) {
			System.out.println("Title Verified");
		} else {
			System.out.println("Title mismatch");
		}

		driver.navigate().back();

		boolean buttonEnabled = driver.findElement(By.xpath("//*[text()='Disabled']")).isEnabled();

		System.out.println(buttonEnabled);

		Point submitLocation = driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).getLocation();

		System.out.println("Location of button:" + submitLocation);

		WebElement saveButtonColor = driver.findElement(By.xpath("//*[text()='Save']"));

		String cssValue1 = saveButtonColor.getCssValue("background-color");

		System.out.println("Color of Save button:" + cssValue1);

		String cssValue2 = saveButtonColor.getCssValue("color");

		System.out.println("Color of Save button:" + cssValue2);

		Dimension submitSize = driver.findElement(By.xpath("(//*[text()='Submit'])[2]")).getSize();

		System.out.println("Size of button:" + submitSize);

		driver.close();

	}

}
