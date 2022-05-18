package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	@Given("^navigates to Orangehrm$")
	public void navigates_to_Orangehrm() throws Throwable {
	   driver=new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("http://orangehrm.qedgetech.com/");
	}

	@When("^user logs in using username as \"([^\"]*)\"$")
	public void user_logs_in_using_username_as(String username) throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys(username);
	}

	@When("^password logs in using password as \"([^\"]*)\"$")
	public void password_logs_in_using_password_as(String password) throws Throwable {
		 driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^user click LogIn button$")
	public void user_click_LogIn_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user should validate url text$")
	public void user_should_validate_url_text() throws Throwable {
	    String expectedurl="Dashboard";
	    String actualurl=driver.getCurrentUrl();
	    if(actualurl.toLowerCase().contains(expectedurl.toLowerCase()))
	    {
	    	System.out.println("login success");
	    }
	    else
	    {
	    	System.out.println("login fail");
	    }
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	   driver.close();
	}


}
