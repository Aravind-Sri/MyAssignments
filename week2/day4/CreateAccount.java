package myAssignments.week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.linkText("Create Account")).click();

		driver.findElement(By.id("accountName")).sendKeys("AravindTester");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement ind = driver.findElement(By.name("industryEnumId"));

		Select indSc = new Select(ind);

		indSc.selectByVisibleText("Computer Software");
		
		WebElement own = driver.findElement(By.name("ownershipEnumId"));

		Select ownSc = new Select(own);

		ownSc.selectByVisibleText("S-Corporation");
		
		WebElement sou = driver.findElement(By.name("dataSourceId"));

		Select souSc = new Select(sou);

		souSc.selectByValue("LEAD_EMPLOYEE");
		
		WebElement market = driver.findElement(By.name("marketingCampaignId"));

		Select marketSc = new Select(market);

		marketSc.selectByIndex(6);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
