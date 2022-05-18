package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeStepDefination {
	WebDriver driver;
	@Given("^run url to the browser$")
	public void run_url_to_the_browser() throws Throwable {
	    driver=new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://orangehrm.qedgetech.com/");
	}

	@When("^Enter username as \"([^\"]*)\"$")
	public void enter_username_as(String username) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	}

	@When("^password as \"([^\"]*)\"$")
	public void password_as(String password) throws Throwable {
		 driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^Click on Pim$")
	public void click_on_Pim() throws Throwable {
	    driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	}

	@When("^Click on add btn$")
	public void click_on_add_btn() throws Throwable {
	    driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
	}

	@When("^I give \"([^\"]*)\" in fname$")
	public void i_give_in_fname(String fname) throws Throwable {
	    driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@When("^I give \"([^\"]*)\" in mname$")
	public void i_give_in_mname(String mname) throws Throwable {
	    driver.findElement(By.name("middleName")).sendKeys(mname);
	}

	@When("^I give \"([^\"]*)\" in lname$")
	public void i_give_in_lname(String lname) throws Throwable {
	    driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@When("^Click on save btn$")
	public void click_on_save_btn() throws Throwable {
	    driver.findElement(By.id("btnSave")).click();
	}

	@Then("^Validate url$")
	public void validate_url() throws Throwable {
	    String expectedurl="empNumber/461";
	    String actualurl=driver.getCurrentUrl();
	    if(actualurl.contains(expectedurl))
	    {
	    	System.out.println("Add Employee created");
	    }
	    else
	    {
	    	System.out.println("Employee creation failed");
	    }
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    driver.close();
	}


}
