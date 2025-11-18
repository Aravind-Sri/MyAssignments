package myAssignments.week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstratingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("(//*[text()='Chrome'])[1]")).click();

		WebElement radioElement = driver.findElement(By.xpath("(//*[text()='Chennai'])"));

		radioElement.click();

		Thread.sleep(3000);

		radioElement.click();

		Thread.sleep(3000);

		boolean isSelectedChennai = radioElement.isSelected();

		System.out.println("Is Selected: " + isSelectedChennai);

		boolean isEnabled = driver.findElement(By.xpath("(//*[text()='Safari'])[2]")).isEnabled();

		System.out.println("Is Selected by default: " + isEnabled);

		boolean isEnabledAgeGroup = driver.findElement(By.xpath("//*[text()='21-40 Years']")).isEnabled();

		System.out.println("Is Selected by default: " + isEnabledAgeGroup);

	}

}
