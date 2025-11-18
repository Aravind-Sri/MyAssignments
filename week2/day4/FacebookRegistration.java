package myAssignments.week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//*[text()='Create new account']")).click();

		driver.findElement(By.name("firstname")).sendKeys("Aravind");

		driver.findElement(By.name("lastname")).sendKeys("Sri");

		WebElement birthdayDay = driver.findElement(By.name("birthday_day"));

		birthdayDay.click();

		Select scbirthdayDay = new Select(birthdayDay);

		scbirthdayDay.selectByIndex(9);

		WebElement birthdayMonth = driver.findElement(By.name("birthday_month"));

		birthdayDay.click();

		Select scbirthdayMonth = new Select(birthdayMonth);

		scbirthdayMonth.selectByValue("5");

		WebElement birthdayYear = driver.findElement(By.name("birthday_year"));

		birthdayYear.click();

		Select scbirthdayYear = new Select(birthdayYear);

		scbirthdayYear.selectByVisibleText("1905");
		
		driver.findElement(By.name("reg_email__")).sendKeys("xyz@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("xyzzz");
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']/input")).click();
		
		driver.close();
	}

}
