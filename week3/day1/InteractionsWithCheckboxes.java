package myAssignments.week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//		driver.findElement(By.cssSelector("div.ui-chkbox-box")).click();
//		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[1]")).click();
		
		driver.findElement(By.xpath("//*[text()='Basic']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[2]")).click();

		String ajaxText = driver.findElement(By.xpath("//*[text()='Checked']")).getText();

		System.out.println("Verified:" + ajaxText);

		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[3]")).click();

		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[8]")).click();

		String triText = driver.findElement(By.xpath("//*[text()='State = 1']")).getText();

		System.out.println("State changed: " + triText);

		Thread.sleep(3000);

		driver.findElement(By.className("ui-toggleswitch-slider")).click();

		String toggleSwitchText = driver.findElement(By.xpath("//*[text()='Checked']")).getText();

		System.out.println("Verified:" + toggleSwitchText);

		boolean isSelected = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[9]")).isSelected();

		System.out.println("isSelected: " + isSelected);

		driver.findElement(By.xpath("//*[contains(@data-label,'Cities')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[11]")).click();

		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[12]")).click();

		driver.close();

	}

}
