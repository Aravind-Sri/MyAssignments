package myAssignments.week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("democsr");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Create Lead")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("QQQ");

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("zzzzz");

		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(5000);

		WebElement verifyTitle = driver.findElement(By.xpath("//*[text()='zzzzz']"));

		String text = verifyTitle.getText();

		System.out.println(text);
		
		boolean displayed = verifyTitle.isDisplayed();
		
		System.out.println("Title verified" +displayed);

		driver.close();

	}

}
