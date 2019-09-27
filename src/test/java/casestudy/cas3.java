package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class cas3 {
	WebDriver driver=null;
	@Given("^url page is opened$")
	public void url_page_is_opened()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\browser and drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	}

	@Given("^user logins the page$")
	public void user_logins_the_page()  {
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("password123"); 
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^search product and add four char for search and select prdct$")
	public void search_product_and_add_four_char_for_search_and_select_prdct() throws InterruptedException  {
		WebElement search =driver.findElement(By.name("products"));
		Actions act=new Actions(driver);
		act.sendKeys(search,"carp");
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	}

	@Then("^add to cart and do the payment$")
	public void add_to_cart_and_do_the_payment() throws InterruptedException  {
	    //driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	    driver.findElement(By.xpath("//a[@href='#' and @class='btn btn-success btn-product']")).click();
		  driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		  driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
		  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		  Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div")).click();
		  driver.findElement(By.id("btn")).click();
		  driver.findElement(By.name("username")).sendKeys("123456");
		  driver.findElement(By.name("password")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	}

	@Then("^logout from the page$")
	public void logout_from_the_page()  {
		driver.findElement(By.linkText("SignOut")).click();
	    
	}

}
