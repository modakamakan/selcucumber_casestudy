package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cas1 {
	WebDriver driver=null;
	@Given("^page is opened$")
	public void page_is_opened()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\browser and drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\browser and drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	    
	}

	@When("^user clicks on signup button$")
	public void user_clicks_on_signup_button() {
	    driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^user enters \"([^\"]*)\"$")
	public void user_enters(String arg1)  {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	    
	}

	@Then("^user enters firstname as \"([^\"]*)\" and lastname \"([^\"]*)\"$")
	public void user_enters_firstname_as_and_lastname(String arg1, String arg2)  {
	    driver.findElement(By.name("firstName")).sendKeys(arg1);
	    driver.findElement(By.name("lastName")).sendKeys(arg2);
	}

	@Then("^user enters password as \"([^\"]*)\" and confirmed password as \"([^\"]*)\"$")
	public void user_enters_password_as_and_confirmed_password_as(String arg1, String arg2)  {
	    driver.findElement(By.name("password")).sendKeys(arg1);
	    driver.findElement(By.name("confirmPassword")).sendKeys(arg2);
	}

	@Then("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1)  {
	  driver.findElement(By.xpath(arg1)).click();
	}
	//input[@value= arg1']
	@Then("^user enters mail as \"([^\"]*)\" and mobile as \"([^\"]*)\"$")
	public void user_enters_mail_as_and_mobile_as(String arg1, String arg2){
	   driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	   driver.findElement(By.name("mobileNumber")).sendKeys(arg2);
	   
	}

	@Then("^user enters dob as \"([^\"]*)\"$")
	public void user_enters_dob_as(String arg1) throws Throwable {
		  driver.findElement(By.name("dob")).sendKeys(arg1);
		  driver.findElement(By.name("address")).sendKeys("bngmnglore");
	}

	@Then("^user enters security question by index value (\\d+) and answers security qst as \"([^\"]*)\"$")
	public void user_enters_security_question_by_index_value_and_answers_security_qst_as(int arg1, String arg2) {
		Select pc =new Select(driver.findElement(By.name("securityQuestion")));
		pc.selectByIndex(arg1);
	   driver.findElement(By.name("answer")).sendKeys(arg2);
	   driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("^message displayed signup successful$")
	public void message_displayed_signup_successful()  {
	   System.out.println("success");
	}
}
